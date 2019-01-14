<!-- 

    Table Finder

        등록된 Class의 DB Table이 존재하지 않는 경우 MethodServer가 실행되지 않습니다.

        이 경우 어떤 Table이 없는지 찾아주는 프로그램입니다.

        DB의 사용자,비밀번호,URL을 지정한 후 MethodServer.log에서 오류난 SQL를 복사해 넣고

        샐행버튼을누르면 아래에 필요한 Table만 추려서 보여줍니다.

        의문 사항은 노상민에게 문의 하세요. snoh@ptc.com  

-->



<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<%@ page import="java.sql.*" %>



<%

/* 자신의 시스템에 맞게 수정하세요 */

String dbUserDefault = "wcadmin";

String dbPassDefault = "wcadmin";

String dbUrlDefault = "jdbc:oracle:thin:@smnoh:1521:wind";



String sqlStmt = request.getParameter("sqlStmt");

String dbUser = request.getParameter("dbUser");

String dbPass = request.getParameter("dbPass");

String dbUrl = request.getParameter("dbUrl");

String outputType = request.getParameter("outputType");

if(sqlStmt == null)        sqlStmt = "";

if(dbUser == null || dbUser.equals(""))        dbUser = dbUserDefault;

if(dbPass == null || dbPass.equals(""))        dbPass = dbPassDefault;

if(dbUrl == null || dbUrl.equals(""))        dbUrl = dbUrlDefault;

if(outputType == null || outputType.equals(""))        outputType = "Table";

        

String msg="";

%>

                                                                                                                                                                                        

<html>

<head>

<title>Table Finder</title>

</head>



<BODY oncontextmenu="return false" bgcolor='beige'>

<style type='text/css'>

<!--

  td {font-family:Arial,Helvetica,Geneva,굴림; font-size:10pt}

-->

</style>

<form action="tableFinder.jsp" method="post" name="table_finder" id="table_finder">



<table>

<td>



<table cellpadding=5>

<tr>

  <td align=left nowrap><b>DB User</b></td>    <td align=left><input type="text" name="dbUser" value="<%=dbUser%>" size=15></td>

  <td align=left nowrap><b>DB Password</b></td><td align=left><input type="text" name="dbPass" value="<%=dbPass%>" size=15></td>

</tr>

<tr> 

  <td align=left nowrap><b>DB URL</b></td>           <td align=left colspan=3><input type="text" name="dbUrl" value="<%=dbUrl%>" size=50></td>

</tr> 

<tr>

  <td align=left nowrap><b>출력 Type</b></td>           <td align=left colspan=3><input type="radio" name="outputType" value="Table" <%if(outputType.equals("Table")){%>checked<%}%>>Table Name <input type="radio" name="outputType" value="Package" <%if(!outputType.equals("Table")){%>checked<%}%>>Package Path</td>

</tr>

</table> 



<p>



<table>

<tr>

<td valign=top>

        <strong>오류 SQL 문장</strong><br>

        <textarea name="sqlStmt" style="width: 600; height: 250;"><%=sqlStmt%></textarea><p>

</td>

</tr>

<tr>

</tr>

<td align='center'>

         <input type="submit" name="submit" value="     필요한 Table 찾기     ">

</td>

<tr>

<td valign=top>

        <strong>필요한 Table</strong><br>

        <textarea name="tableLsit" style="width: 600; height: 150;"><%



        int curIndex = -1;

        int tmpIndex = 0;

        int spaceIndex = 0;

        int count = 0;

        String tablePath = null;

        

        Connection db_con = null ;

        Statement _query = null ;

        String _driver = "oracle.jdbc.driver.OracleDriver";

        

        try{

                Class.forName(_driver);

                db_con = DriverManager.getConnection(dbUrl, dbUser, dbPass) ;

                _query = db_con.createStatement() ;        

                                        

                while(tmpIndex > -1){

                        if(!outputType.equals("Table")){

                                tmpIndex = sqlStmt.indexOf("COUNT(A0.classnameA2A2)", curIndex);

                                if(tmpIndex > curIndex){

                                        tmpIndex += 25;

                                        spaceIndex = sqlStmt.indexOf("'", tmpIndex);

                                        tablePath = sqlStmt.substring(tmpIndex,spaceIndex);

                                        curIndex = tmpIndex;



                                }

                        }        

                

                    tmpIndex = sqlStmt.indexOf("FROM ", curIndex);

                        if(tmpIndex > curIndex){

                                tmpIndex += 5;

                                spaceIndex = sqlStmt.indexOf(" ", tmpIndex);

                                String tableName = sqlStmt.substring(tmpIndex,spaceIndex).toUpperCase();

                                curIndex = tmpIndex;

                        

                                StringBuffer sql = new StringBuffer("SELECT TNAME FROM TAB WHERE TNAME='" + tableName + "'");

                         

                         				if(!tableName.trim().equals("DUAL") && !tableName.trim().equals("(SELECT")){

	                         				ResultSet rs = _query.executeQuery(sql.toString()) ;

	                                

	                                if(!rs.next()){

	                                  count++;

	                                  if(outputType.equals("Table")){

	                                    out.println(tableName);

	                                  }

	                                  else{

	                                    if(tablePath == null){

	                                            out.println("(Unknown package)." + tableName);

	                                    }

	                                    else{

	                                            out.println(tablePath);

	                                    }

	                                  }

	                                }  

                         				}

                                

                        }

                }

                _query.close() ;                

                _query = null ;

                db_con.close() ;

                db_con = null ;

        }

        catch (Exception e) {

                msg = e.toString() ;

        }

%>

        </textarea>

</td>

</tr>

</table>

<p>

</form>



<font color='blue' size=2><b>

총 <%= count %> 개의 필요한 Table을 찾았습니다.

</b></font>

<br>

<font color='red' size=2><b>

<%= msg %>

</b></font>



</td>

</table>



</center>

</body>

</html>


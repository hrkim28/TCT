/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : lcp.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2017. 2. 20.  seongmo1.kim   Initial
 * ===========================================
 */
package lge.prm.rest.global.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lcp {




    public static void main(String[] args) {
        List<List<String>> strListList = new ArrayList<List<String>>();
        //Group 1
        strListList.add(makeStrList("table01", "table02", "table03"));//String의 갯수는 n개
        //Group 2
        strListList.add(makeStrList("table11", "table12"));
        //Group 3
        strListList.add(makeStrList("table21", "table22", "table23", "table24"));

        //Group의 갯수도 n개임
        /*Display되어야 하는 것
    table01.table11.table21
    table01.table11.table22
    table01.table11.table23
    table01.table11.table24
    table01.table12.table21
    table01.table12.table22
    table01.table12.table23
    table01.table12.table24
    table02.table11.table21
    table02.table11.table22
    table02.table11.table23
    table02.table11.table24
    table02.table12.table21
    table02.table12.table22
    table02.table12.table23
    table02.table12.table24
    table03.table11.table21
    table03.table11.table22
    table03.table11.table23
    table03.table11.table24
    table03.table12.table21
    table03.table12.table22
    table03.table12.table23
    table03.table12.table24
         */
    }
    private static List<String> makeStrList(String... values) {
        return(Arrays.asList(values));
    }

    private static void retrieveCombi(ArrayList<List<String>> inputList){

    }
}

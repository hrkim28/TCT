
package lge.prm.rest.spec.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class score {

    //0~29 0등급 30~59 1등급 60~79 2등급 80~100 3등급
    public static void main(String[] args){
        ArrayList<HashMap<String, String>> member = new ArrayList<HashMap<String,String>>();
        setMember("소지섭","강서빌딩","65","70",member);
        setMember("강동원","강서빌딩","55","45",member);
        setMember("송혜교","강서빌딩","70","63",member);
        setMember("전지현","강서빌딩","45","90",member);
        setMember("이영애","트윈","65","85",member);
        setMember("박보검","트윈","54","78",member);
        setMember("이상윤","트윈","85","98",member);
        setMember("김태희","트윈","90","75",member);
        setMember("박서준","트윈","55","45",member);
        setMember("최시원","가산","35","40",member);
        setMember("에릭","가산","60","90",member);
        setMember("박형식","서초","95","40",member);

        //java 등급 기준
        System.out.println("java 등급 기준");
        sort(member,"java");
        printArray(member);

        //ba 등급 기준
        System.out.println("\nBA 등급 기준");
        sort(member,"ba");
        printArray(member);

        //사이트별 평균구하기
        System.out.println();
        groupBySite(member);
    }

    public static void setMember(String name, String site, String java, String ba, ArrayList<HashMap<String, String>> member){
        HashMap<String, String> newMem = new HashMap<String, String>();
        newMem.put("name", name);
        newMem.put("site", site);
        newMem.put("java", java);
        newMem.put("ba", ba);
        newMem.put("gJava", getGrade(Integer.parseInt(java)));
        newMem.put("gBa", getGrade(Integer.parseInt(ba)));

        member.add(newMem);
    }

    public static String getGrade(int score){
        String grade = "";
        if(score < 30){
            grade = "0";
        }else if(score < 60){
            grade = "1";
        }else if(score < 80){
            grade = "2";
        }else{
            grade = "3";
        }
        return grade;
    }

    public static void printArray(ArrayList<HashMap<String, String>> member){
        for(int inx = 0; inx < member.size(); inx++){
            System.out.print(member.get(inx).get("name")+" >> ");
            System.out.print("Java 점수 : "+member.get(inx).get("java")+", ");
            System.out.print("BA 점수 : "+member.get(inx).get("ba")+", ");
            System.out.print("Java 등급 : "+member.get(inx).get("gJava")+", ");
            System.out.println("BA 등급 : "+member.get(inx).get("gBa"));
        }
    }

    public static void sort(ArrayList<HashMap<String, String>> member, String gijun){
        for(int inx = 0; inx < member.size(); inx++){
            for(int jnx = inx+1; jnx < member.size(); jnx++){
                int javaG1 = Integer.parseInt(member.get(inx).get("gJava"));
                int baG1 = Integer.parseInt(member.get(inx).get("gBa"));
                int javaS1 = Integer.parseInt(member.get(inx).get("java"));
                int baS1 = Integer.parseInt(member.get(inx).get("ba"));
                int javaG2 = Integer.parseInt(member.get(jnx).get("gJava"));
                int baG2 = Integer.parseInt(member.get(jnx).get("gBa"));
                int javaS2 = Integer.parseInt(member.get(jnx).get("java"));
                int baS2 = Integer.parseInt(member.get(jnx).get("ba"));
                int indi1 = 0;
                int indi2 = 0;

                if("ba".equals(gijun)){
                    indi1 = baG1;
                    indi2 = baG2;
                }else{
                    indi1 = javaG1;
                    indi2 = javaG2;
                }

                if(indi1 < indi2){
                    HashMap<String, String> temp = member.get(inx);
                    member.set(inx, member.get(jnx));
                    member.set(jnx, temp);
                }else if(indi1 == indi2 && baS1 < baS2){
                    HashMap<String, String> temp = member.get(inx);
                    member.set(inx, member.get(jnx));
                    member.set(jnx, temp);
                }else if(indi1 == indi2 && baS1 == baS2 && javaS1 < javaS2){
                    HashMap<String, String> temp = member.get(inx);
                    member.set(inx, member.get(jnx));
                    member.set(jnx, temp);
                }
            }
        }
    }

    public static void groupBySite(ArrayList<HashMap<String, String>> member){
        HashSet<String> siteList = new HashSet<String>();
        for(int inx = 0; inx < member.size(); inx++){
            siteList.add(member.get(inx).get("site"));
        }

        for(String site : siteList){
            int sumJava = 0;
            int sumBa = 0;
            int sumJavaG = 0;
            int sumBaG = 0;
            int cnt = 0;
            for(int inx = 0; inx < member.size(); inx++){
                if(site.equals(member.get(inx).get("site"))){
                    sumJava+=Integer.parseInt(member.get(inx).get("java"));
                    sumBa+=Integer.parseInt(member.get(inx).get("ba"));
                    sumJavaG+=Integer.parseInt(member.get(inx).get("gJava"));
                    sumBaG+=Integer.parseInt(member.get(inx).get("gBa"));
                    cnt++;
                }
            }
            if(cnt == 0) continue;
            System.out.println(">> "+site+"의 평균 점수, 평균등급");
            System.out.println("Java 점수 평균 : "+((double)sumJava/cnt));
            System.out.println("BA 점수 평균 : "+((double)sumBa/cnt));
            System.out.println("java 등급 평균 : "+((double)sumJavaG/cnt));
            System.out.println("BA 등급 평균 : "+((double)sumBaG/cnt));
            System.out.println();
        }
    }
}

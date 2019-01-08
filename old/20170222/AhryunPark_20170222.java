import java.io.IOException;
import java.util.ArrayList;


/**
2017년 상반기 LCP 시험결과가 나왔습니다.
전체 인원에 대한 JAVA 등급, BA 모델링 등급 산정하여 등급 기준으로 Sort하세요
(등급이 같은 경우 BA 모델링 점수, BA 모델링 점수가 같은 경우 Java 점수)
개별 등급 기준 : 0~29 0등급, 30~59 1등급,  60~79 2등급, 80~100 3등급

사이트 별 평균 점수, 평균 등급 출력하세요.

•강서빌딩
소지섭 65  70
강동원 55  45
송혜교 70  63
전지현 45  90

•트윈
이영애 65  85
박보검 54  78
이상윤 85  98
김태희 90  75
박서준 55  45

•가산
최시원 35  40
에릭   60  90

•서초
박형식 95  40


*/

public class AhryunPark_20170222 {

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws  
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<AhryunPark_Grade> gradeList = new ArrayList<AhryunPark_Grade>();
		
		AhryunPark_Grade grade = new AhryunPark_Grade("강서빌딩", "소지섭", 65, 70);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("강서빌딩", "강동원", 55, 45);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("강서빌딩", "송혜교", 70, 63);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("강서빌딩", "전지현", 45, 90);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("트윈", "이영애", 65, 85);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("트윈", "박보검", 54, 78);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("트윈", "이상윤", 85, 98);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("트윈", "김태희", 90, 75);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("트윈", "박서준", 55, 45);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("가산", "최시원", 35, 40);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("가산", "에릭", 60, 90);
		gradeList.add(grade);
		grade = new AhryunPark_Grade("서초", "박형식", 95, 40);
		gradeList.add(grade);
		
		//Java 등급 Sorting
		System.out.println("JAVA 등급 Sorint 결과");
		sortingJavaGrade(gradeList);
		
		//BA 등급 Sorting
		System.out.println("BA 등급 Sorint 결과");
		sortingBAGrade(gradeList);
		
		System.out.println("사이트 별 평균 점수, 평균 등급 출력");
		String[] siteList = {"강서빌딩" , "트윈", "가산", "서초" };
		for(int i = 0 ; i < siteList.length; i++){
			String site = siteList[i];
			System.out.println();
			ArrayList<Double> resultList = getAverage(gradeList,site);
			System.out.println("Site : " + site+" Java 평균 " +  resultList.get(0) + " Java 등급 평균 : " +  resultList.get(1) + 
					" BA 모델링 평균 : " +   resultList.get(2)  + " BA 모델링 등급 평균 : " + resultList.get(3));
		}
	}
	
	public static void sortingJavaGrade(ArrayList<AhryunPark_Grade> gradeList){
		
		for(int i = 0 ; i < gradeList.size(); i++){
			for( int j = i; j < gradeList.size(); j++){
				
				AhryunPark_Grade currentGrade = gradeList.get(i);
				AhryunPark_Grade nextGrade = gradeList.get(j);
				
				if(currentGrade.getJavaGrade() < nextGrade.getJavaGrade()){
					gradeList.set(i, nextGrade);
					gradeList.set(j, currentGrade);
				}
				else if(currentGrade.getJavaGrade() == nextGrade.getJavaGrade()){
					
					if(currentGrade.getBaScore() < nextGrade.getBaScore()){
						gradeList.set(i, nextGrade);
						gradeList.set(j, currentGrade);
					}
				}
			}
		}
		
		
		for(AhryunPark_Grade grade : gradeList){
			System.out.println("이름 : " + grade.getName() + ", Java 등급 : " + grade.getJavaGrade() +", BA 점수 : " + grade.getBaScore());
		}
		
	}
	
	
	
	public static void sortingBAGrade(ArrayList<AhryunPark_Grade> gradeList){
		
		for(int i = 0 ; i < gradeList.size(); i++){
			for( int j = i; j < gradeList.size(); j++){
				
				AhryunPark_Grade currentGrade = gradeList.get(i);
				AhryunPark_Grade nextGrade = gradeList.get(j);
				
				if(currentGrade.getBaGrade() < nextGrade.getBaGrade()){
					gradeList.set(i, nextGrade);
					gradeList.set(j, currentGrade);
				}
				else if(currentGrade.getBaGrade() == nextGrade.getBaGrade()){
					
					if(currentGrade.getJavaScore() < nextGrade.getJavaScore()){
						gradeList.set(i, nextGrade);
						gradeList.set(j, currentGrade);
					}
				}
			}
		}
		
		for(AhryunPark_Grade grade : gradeList){
			System.out.println("이름 : " + grade.getName() + ", BA 등급 : " + grade.getBaGrade() +", Java 점수 : " + grade.getJavaScore());
		}
	}
	
	public static ArrayList<Double> getAverage(ArrayList<AhryunPark_Grade> gradeList, String site){
		
		
		ArrayList<Double> avgList = new ArrayList<Double>();
		
		int totalJavaScoreSum = 0;
		int totalJavaGradeSum = 0;
		int totalBaScoreSum = 0;
		int totalBaGradeSum = 0;
		int cnt = 0;
		
		for(AhryunPark_Grade grade : gradeList){
			if(grade.getSite().equals(site)){
				totalJavaScoreSum += grade.getJavaScore();
				totalJavaGradeSum += grade.getJavaGrade();
				totalBaScoreSum += grade.getBaScore();
				totalBaGradeSum += grade.getBaGrade();
				cnt++;
			}
		}
		
		avgList.add((double)totalJavaScoreSum/cnt);
		avgList.add((double)totalJavaGradeSum/cnt);
		avgList.add((double)totalBaScoreSum/cnt);
		avgList.add((double)totalBaGradeSum/cnt);
		
		
		return avgList;
		
		
	}
	
	
	
}


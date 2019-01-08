

public class AhryunPark_Grade {
	
	
	private String site ;
	private String name ;
	private int javaScore;
	private int baScore;
	private int javaGrade;
	private int baGrade;
	
	
	public AhryunPark_Grade(String site, String name, int javaScore, int baScore){
		this.site = site;
		this.name = name;
		this.javaScore = javaScore;
		this.baScore = baScore;
		
		this.javaGrade = this.getGrade(this.javaScore);
		this.baGrade = this.getGrade(this.baScore);
			
	}
	
	
	/**
	 * 개별 등급 기준 : 0~29 0등급, 30~59 1등급,  60~79 2등급, 80~100 3등급
	 * @param score
	 * @return
	 */
	public int  getGrade(int score){
		
		int grade = 0;
		if(score >= 30 &&  score < 60){
			grade = 1;
		}
		else if(score >= 60 &&  score < 80){
			grade = 2;
		}else if(score >= 80 &&  score <= 100){
			grade = 3;
		}
		
		return grade;
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSite() {
		return site;
	}


	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public int getBaScore() {
		return baScore;
	}
	public void setBaScore(int baScore) {
		this.baScore = baScore;
	}
	public int getJavaGrade() {
		return javaGrade;
	}
	public void setJavaGrade(int javaGrade) {
		this.javaGrade = javaGrade;
	}
	public int getBaGrade() {
		return baGrade;
	}
	public void setBaGrade(int baGrade) {
		this.baGrade = baGrade;
	}
	
	
	
	
	
	
	
	
	
	
}


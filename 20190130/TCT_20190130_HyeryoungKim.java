public class TCT_20190130_HyeryoungKim {

	public static void main(String[] args) {
		int[] firstGrades = {1,2,3,4,5,6};
		int[] secondGrades = {1,2,4,8,16};
		
		int[] firstRewards = {500,300,200,50,30,10};
		int[] secondRewards = {512,256,128,64,32};
		
		int[][] myGrades = {{8,4},{13,19},{8,10},{18,18},{8,25},{13,16}};
		int reward = 0;
		for ( int idx = 0 ; idx < myGrades.length ; idx++ ) {
			reward = 0;
			reward = getReward(firstGrades, firstRewards, myGrades[idx][0]) + getReward(secondGrades, secondRewards, myGrades[idx][1]);
			System.out.println(String.valueOf(reward).concat("0000"));
		}
	}

	private static int getReward(int[] grades, int[] rewards, int myGrade) {
		int prevGradeSum = 0;
		int gradeSum = 0;
		int reward = 0;

		for ( int idx = 0 ; idx < grades.length ; idx++ ) {
			prevGradeSum = gradeSum;
			gradeSum += grades[idx];
	   		if (  myGrade <= gradeSum && prevGradeSum < myGrade ) {
				reward = rewards[idx];
			}
		}

		return reward;
	}
}

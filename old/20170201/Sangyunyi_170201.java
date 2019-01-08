
public class Sangyunyi_170201 {
	   static int DiceGame() {
           int dice1 = (int) (Math.random() * 6 + 1);
           int dice2 = (int) (Math.random() * 6 + 1);
           int total = dice1 + dice2;
           System.out.println(dice1 + " " + dice2);
           if (dice1 == dice2) return total + DiceGame();
           else return total;
 }

	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DiceGame());
	}

}

package studio7;

public class Die {

	private int	sides;
	
	public Die(int realsides) {
		sides = realsides;
	}
	
	public void DiceRoll(int realsides) {
		sides = realsides;
	}
	
	public double Roller(int sides) {
		return Math.round(Math.random()* sides + 1);
	}
	
	
	public static void main(String[] args) {
		Die d2 = new Die(2);
		System.out.println(d2);
	}

}

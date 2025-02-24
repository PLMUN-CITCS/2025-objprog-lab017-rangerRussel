import java.util.Scanner;
	public class GradeCalculator {
		public static String calculateGrade(float score) {

		if (score >= 90) {
		return "A";
		}
		
		else if (score >= 80) {
		return "B";
		}
		
		else if (score >= 70) {
		return "C";
		} 
		
		else if (score >=60) {
	   	return "D";
		} 
		
		else{
		return "F";
		}
}

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your grade: ");
	float getStudentScore = scanner.nextFloat();

	String result = calculateGrade(getStudentScore);

	System.out.println("Your Grade is: " + result);
scanner.close();
	}
}

import java.util.Scanner;
public class Main{
        public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
			
		System.out.print("Height:");
    		double height = stdIn.nextDouble();
    		System.out.print("Weight:");
    		double weight = stdIn.nextDouble();
				
		double bmi = weight / Math.pow(height, 2);
		System.out.println(bmi);
        }
}


import java.util.Scanner;
public class Rectangle {
	public static void main(String [] args){
		System.out.println("Enter the length and width of a rectangle and I will calculate the perimiter and area");
		double l, w, perimiter,area;
		Scanner keyboard = new Scanner(System.in);
		l = keyboard.nextInt();
		w = keyboard.nextInt();
		perimiter = 2 * (l+w);
		area = w*l;
		System.out.println("The perimter of the rectangle is " + perimiter + "\n" + "The area of the rectangle is " + area);
		
	
	}

}

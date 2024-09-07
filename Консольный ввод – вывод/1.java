import java.util.Scanner;

class Main{
	public static void main (String [] args ){      
        	Scanner scan = new Scanner(System.in, "Cp866");
        	String inputName = scan.next();
        	scan.close();
       		System.out.println("Привет, " + inputName);
	}
}

import java.util.Scanner;
public class Leap {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		if(a%4==0){
			System.out.println("a is a leap year");
		}
		else{
			System.out.println("a is not a leap year");
		}
		
	}

}

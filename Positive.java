import java.util.*;
public class Positive {
	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n==0){
			System.out.println("Zero");
		}else if(n>0){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
	}
}

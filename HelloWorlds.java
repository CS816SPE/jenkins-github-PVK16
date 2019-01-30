import java.util.*;
class HelloWorlds{
	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times do you want to print Hello World : ");
		int n = scan.nextInt();
		for (i=0;i<n ;i++ ) {
			System.out.println("Hello World!");	
		}
	}
	
}

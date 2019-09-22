import java.util.Scanner;

public class encryption {
	
	public static String encrypt(int num) {
		String result = "";
		
		while(num != 0) {
			result = ((num%10)+7)%10 + result;
			num /= 10;
		}
		
		result = result.substring(2,3) + result.substring(3,4) + result.substring(0,1) + result.substring(1,2);
		return result;
	}
	
	public static String decrypt(int num) {
		String result = "";
		
		while(num != 0) {
			result = (((num*10) + num%10)-7)%10 + result;
			num /= 10;
		}
		
		result = result.substring(2,3) + result.substring(3,4) + result.substring(0,1) + result.substring(1,2);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a 4-digit you would like to encrypt: ");
		int num = scan.nextInt();
		
		System.out.println("The encrypted number is: " + encrypt(num));
		
		System.out.println("Please enter a 4-digit you would like to decrypt: ");
		num = scan.nextInt();
		
		System.out.println("The decrypted number is: " + decrypt(num));
		
		scan.close();
		}

}

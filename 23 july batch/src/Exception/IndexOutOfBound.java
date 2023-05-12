package Exception;


	


	
	//ArrayIndxOutOfBound

	

	import java.util.Arrays;

	import java.util.Scanner;

	public class IndexOutOfBound {

	public static void main(String args[]) {

	int Array []= {(int) 10.0,(int) 20.0,(int) 30.0,(int) 40.0,(int) 50.0};

	System.out.println("The array elemens are as follows: \n");

	System.out.println(Arrays.toString(Array));

	Scanner scan = new Scanner(System.in);

	System.out.println("Please provide the address of the required element:\n");

	float numbers = scan.nextFloat();

	System.out.println("Number at your selected address is "+Array[(int) numbers]);

	}

	}

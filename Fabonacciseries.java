package week1.day1;

public class Fabonacciseries {
	
	public static void main(String[] args) {
		int range =8;
		int firstNum =0;
		int secNum =1;
		System.out.println("Fabonacci series of" + " " + range + "numbers:");
		for(int i=1; i<=range; ++i)  
		{
			System.out.print(firstNum + ",");
			int sum = firstNum+secNum;
			firstNum=secNum;
		    secNum=sum;
					
	}		
}
	
}
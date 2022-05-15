package week1.day1;

public class Twowheeler {
	
	int noOfMirrors = 5;
	short noOfWheels = 4;
	long chassisNumber = 234567991L;
	boolean isPunctured = true;
	String bikeName = "Duke";
	double runningKM = 200038.22;
	
	
public static void main(String[] args) {
	
	Twowheeler tw=new Twowheeler();
	System.out.println(tw.noOfMirrors);
	System.out.println(tw.noOfWheels);
	System.out.println(tw.chassisNumber);
	System.out.println(tw.isPunctured);
	System.out.println(tw.bikeName);
	System.out.println(tw.runningKM);
		
}
}


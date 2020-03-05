package pages;

public class Utilities {
	
	public void compareTwoValues (int amazonPrice , int flipkartPrice) {
		
		int result = (Integer.compare(amazonPrice, flipkartPrice));
		
		if(result==0) {
			System.out.println("Both Amazon and Flipkart prices are same");
		}
		
		else if(result==-1) {
			System.out.println("On Amazon price is lesser");
		}
		
		else if(result==1) {
			System.out.println("On Flipkart price is lesser");
		}
	}
}

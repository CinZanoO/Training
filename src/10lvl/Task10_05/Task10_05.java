
public class Task10_05 {

	   	public static void main(String[] args) {
	        int decimalNumber = 21;
	        System.out.println("ƒес€тичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
	        int octalNumber = 25;
	        System.out.println("¬осьмеричное число " + octalNumber + " равно дес€тичному числу " + toDecimal(octalNumber));
	    }

	    public static int toOctal(int decimalNumber) {
	        int toOctal = 0;
	        if (decimalNumber > 0)
	        {
	           for (int i = 0;decimalNumber != 0; i++)
	            {
	             toOctal = toOctal + (decimalNumber % 8) * (int) Math.pow(10,i);
	             decimalNumber = decimalNumber / 8;
	            }
	            return toOctal;
	        }
	        else return 0;
	    }

	    public static int toDecimal(int octalNumber) {
	        int toDecimal = 0;
	        if (octalNumber > 0)
	        {
	           for (int i = 0;octalNumber != 0; i++) 
	           {
	            toDecimal = toDecimal + (octalNumber % 10) * (int) Math.pow(8,i);
	            octalNumber = octalNumber / 10;
	           }
	           return toDecimal;
	        }
	        else return 0;
	    }
	}

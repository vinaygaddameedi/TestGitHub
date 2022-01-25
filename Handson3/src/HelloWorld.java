import static java.lang.Math.toIntExact;

public class HelloWorld {
	 public static void main(String[] args) {
	        Long maths = 50L;
	        Double English = 60.5;

	        compareMarks(maths,English);
	    
	    }
	    static void compareMarks(Long M, Double E)
	    {
	        int Mathsmarks = toIntExact(M); //  Converting Long to int.
	        int Englishmarks = (int) Math.round(E); // Converting Double to int.
	        if(Mathsmarks > 0 && Englishmarks > 0)
	        {
	            if(Englishmarks > Mathsmarks)
	            {
	            System.out.println("English mark is higher than Maths");
	            } 
	            else if(Mathsmarks > Englishmarks)
	            {
	            System.out.println("Maths mark is higher than English");
	            } 
	            else if(Mathsmarks == Englishmarks)
	            {
	            System.out.println("Equal");
	            }
	        } 
	        else {
	            System.out.println("Enter marks are less than Zero");
	        }
	        
	    }

}

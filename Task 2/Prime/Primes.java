package Prime;

public class Primes {
	
	    public static void main(String[] args) {
	        int nValues = 50; 
	        System.out.println("Prime numbers up to " + nValues + ":");

	        outer:
	        for (int i = 2; i <= nValues; i++) {
	            int limit = (int) Math.sqrt(i);

	            for (int j = 2; j <= limit; j++) {
	                if (i % j == 0) {
	                    continue outer;
	                }
	            }
	            System.out.print(i + " ");
	        }
	        System.out.println(); 
	    }
	}



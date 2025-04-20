package operadoresAritimeticos;

public class auala0908 {
	
		  public static void fizzBuzz(int n) {
		 for(int i = n; i > 0; i --){
		        if (n % 5 == 1 && n % 3 == 1){
		            System.out.println("Fizz Buzz");
		        } else if (n % 5 == 1){
		            System.out.println("Buzz");
		        }else if (n % 3 == 1){
		            System.out.println("Fizz");
		        }
		        else{
		            System.out.println(i);
		        }
		    
		 }  }
		  
		  public static void main(String[] args) {
			   fizzBuzz(15);
		  }
	
		  }


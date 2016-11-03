
public class Cars {

//Data
	
	/**Chevy or Nissan**/
	String make;
	
	/**In mph**/
	double speed=10;
	
	static int number_of_cars=0;
	
//Constructors
	
	public Cars(){
		
		number_of_cars+=1;
		
		/*You could also say:
		  
		  number_of_cars=number_of_cars+1;
		  number_of_cars++;
		  
		  They all increment by 1*/
	}
	
	
//Functions
	public int drive(){
		System.out.println("Drive Happened!");
		return 0;
	}
			
	public static void function2(){
		System.out.println("Function2 Happened!");
	}
	
	public static void main(String[] args){
		
		System.out.println("So far we have "+Cars.number_of_cars+" car(s).");
		
		Cars chevy= new Cars();
		
		System.out.println("We made a Chevy? So we have "+Cars.number_of_cars+" car(s).");
		
		int result= chevy.drive();
		function2();
	}
}

package instanceAndStaticVariables;

public class HorseTestDrive {

	public static void main(String[] args) {
		
		
		 
	    Horse whiteHorse = new Horse();
	    whiteHorse.shoesize = 40;
	    whiteHorse.height = 3;
	    whiteHorse.mass = 1700;
	    Horse.breed = "Aussie";
	    
	    Horse blackHorse = new Horse();
		blackHorse.shoesize = 30;
		blackHorse.height = 2;
		blackHorse.mass = 1500;
		Horse.breed = "Swiss";
	    
	    
	    System.out.println("Black horse shoesize: " + blackHorse.shoesize);
	    System.out.println("Black horse height: " + blackHorse.height);
	    System.out.println("Black horse mass: " + blackHorse.mass);
	    System.out.println("Black horse breed: " + Horse.breed);
	    System.out.println();
	    System.out.println("White horse shoesize: " + whiteHorse.shoesize);
	    System.out.println("White horse height: " + whiteHorse.height);
	    System.out.println("White horse mass: " + whiteHorse.mass);
	    System.out.println("White horse breed: " + Horse.breed);
	}
}

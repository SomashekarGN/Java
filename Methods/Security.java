//Security-->openGate()-->Gate.open() closeGate()-->Gate.close(); guard(); operateLift(); sleep(*); eat(*);


class Security{
	
	static void openGate()
	{
		System.out.println("Opening Gate...!");
		Gate.open();
	}
	
	static void closeGate()
	{
		System.out.println("Closing Gate.");
		Gate.close();
	}
	
	static void gaurd()
	{
		System.out.println("Guarding the gate.");
	}
	static void operateLift()
	{
		System.out.println("Operating Lift.");
	}
	static void sleep()
	{
		System.out.println("Sleeping...!");
	}
	static void eat()
	{
		System.out.println("Break! Eating...");
	}
	
	

}
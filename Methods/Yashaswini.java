//Yashaswini--> enterApartment(*)--->Security.openGate(); exitApartment()-->Security.closeGate();

class Yashaswini{
	
	static void enterApartment()
	{
		System.out.println("Entering the apartment :");
		Security.openGate();
	}
	
	static void exitApartment()
	{
		System.out.println("Bye Bye apartment :");
		Security.closeGate();
	}
}
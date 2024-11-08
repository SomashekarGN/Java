//Varun--->playCricket(*)--->bat()--->holdBat()--->energy()--->eat()--->prepareFood()--->buyItems()-->goToShop()-->rideBike()--->checkPetrol()--->openTank()-->seeInside()

class Varun{

	static void playCricket()
	{
		System.out.println("Varun is Playing Cricket");
		bat();
	}
	
	static void bat()
	{
		System.out.println("Varun is batting");
		holdBat();
	}
	
	static void holdBat()
	{
		System.out.println("Varun is holding Bat");
		eat();

	}
	
	
	static void eat()
	{
		System.out.println("Varun is ");
		prepareFood();
	}
	
	static void prepareFood()
	{
		System.out.println("Varun is preparing Food.");
		buyItems();

	}
	
	static void buyItems()
	{
		System.out.println("Varun is buying items to preparing Food.");
		goToShop();

	}
	
	static void goToShop()
	{
		System.out.println("Varun is going to shop to buying items to preparing Food.");
		rideBike();

	}
	
	static void rideBike()
	{
		System.out.println("Varun is riding bike to going to shop to buying items to preparing Food.");
		checkPetrol();

	}
	
	static void checkPetrol()
	{
		System.out.println("Varun is checking petrol in the bike.");
		openTank();

	}
	
	static void openTank()
	{
		System.out.println("Varun is opening the tank to check petrol in the bike.");
		seeInside();

	}
	
	static void seeInside()
	{
		System.out.println("Varun is seeing into the tank to check petrol in the bike.");
	}
	
} 
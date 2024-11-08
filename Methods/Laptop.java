class Laptop{

	static void info()
	{
		String brand="Asus";
		String modelNo="Xt8050";
		
		System.out.println("Laptop Brand :"+brand);
		System.out.println("Laptop Model No :"+modelNo);
	}
	
	
	static void info(String modelNo)
	{
		String brand="Asus";
		//String modelNo="Xt8050";
		
		System.out.println("Laptop Brand :"+brand);
		System.out.println("Laptop Model No :"+modelNo);
	}
	
	static void cost(String modelNo,int price)
	{
	
		String brand="Asus";
		System.out.println("Laptop Brand :"+brand);
		System.out.println("Laptop Model No :"+modelNo);
		System.out.println("Laptop price :"+price);
	}
	
	static void cost(String modelNo,int price,int quantity)
	{
		System.out.println("Laptop Model No :"+modelNo);
		System.out.println("Laptop price :"+price);
		System.out.println("Laptop stock :"+quantity);

	}
}
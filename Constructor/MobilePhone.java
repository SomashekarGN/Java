/*1. Declare a class with least 10 properties
2. Write least 5 Constructor
3. Create 5 copies and print all variables
HINT : can use chaining*/

class MobilePhone
{
	
	String brand;
	String model;
	int price;
	int ram;
	int rom;
	int batteryCapacity;
	double displaySize;
	boolean is5g;
	boolean isDualSim;
	String cameraSpecs;
	
	MobilePhone()
	{
		System.out.println("Mobile Brand :"+brand);
		System.out.println("Mobile Model :"+model);
		System.out.println("Mobile Price :"+price);
		System.out.println("Mobile Ram Capacity :"+ram);
		System.out.println("Mobile Storage Capacity :"+rom);
		System.out.println("Mobile Battery :"+batteryCapacity);
		System.out.println("Mobile Display Size :"+displaySize);
		System.out.println("Is Mobile 5G ready :"+is5g);
		System.out.println("Is Mobile Dual Sim Capable :"+isDualSim);
		System.out.println("Mobile Camera Specifications :"+cameraSpecs);
	}
	
	MobilePhone(String brand,String model)
	{
		this.brand=brand;
		this.model=model;
		System.out.println("Mobile Brand :"+this.brand);
		System.out.println("Mobile model :"+this.model);
	}
	
		MobilePhone(String brand,String model,int price,int ram,int rom)
		{
			this(brand,model);
			this.price=price;
			this.ram=ram;
			this.rom=rom;
			System.out.println("Mobile Price :"+this.price);
			System.out.println("Mobile ram Capacity :"+this.ram);
			System.out.println("Mobile Storage Capacity :"+this.rom);
		}
		
		MobilePhone(String brand,String model,int price,int ram,int rom,double displaySize,boolean is5g,boolean isDualSim)
		{
			this(brand,model,price,ram,rom);
			this.displaySize=displaySize;
			this.is5g=is5g;
			this.isDualSim=isDualSim;
			System.out.println("Mobile Display Size :"+this.displaySize);
			System.out.println("Supports 5g :"+this.is5g);
			System.out.println("DualSim Support :"+this.isDualSim);
			
		}
		
		MobilePhone(String brand,String model,int price,int ram,int rom,double displaySize,boolean is5g,boolean isDualSim,String cameraSpecs)
		{
			this(brand,model,price,ram,rom,displaySize,is5g,isDualSim);
			this.cameraSpecs=cameraSpecs;
			System.out.println("Mobile Camera Specifications :"+this.cameraSpecs);
			
		}


}
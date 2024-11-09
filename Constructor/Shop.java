/*Declare a below class and init variables using const


1. Declare least 5 const in below class
2.Create 6 copies and print the variables for each copy
HINT : can use chaining
Shop : name,ownerName,landlineNo,estDate

*/

class Shop
{
	
	String name;
	String ownerName;
	String landLineNo;
	int estYear;
	
	Shop()
	{
		System.out.println("Shop name :"+name);
		System.out.println("Shop Owner Name :"+ownerName);
		System.out.println("Shop LandLine no :"+landLineNo);
		System.out.println("Shop EstYear :"+estYear);
	}
	
	Shop(String name)
	{
		this.name=name;
		//System.out.println("Into Constructor with one parameter ");
		System.out.println("Shop Name : "+name);

	}
	
	Shop(String name,String ownerName)
	{
		this(name);
		this.ownerName=ownerName;
		
		System.out.println("Shop Name :"+name);
		System.out.println("Shop Owner Name :"+ownerName);
	}
	
	Shop(String name,String ownerName,String landLineNo)
	{
		this(name,ownerName);
		this.landLineNo=landLineNo;
		
		System.out.println("Shop Name :"+name);
		System.out.println("Shop Owner Name :"+ownerName);
		System.out.println("Shop LandLine No :"+landLineNo);
		
	}
	
	Shop(String name,String ownerName,String landLineNo,int estYear)
	{
		this(name,ownerName,landLineNo);
		this.estYear=estYear;
		
		System.out.println("Shop Name :"+name);
		System.out.println("Shop Owner Name :"+ownerName);
		System.out.println("Shop LandLine No :"+landLineNo);
		System.out.println("Shop established year :"+estYear);
	}
}
//Nail: Add 5 properites

class Nail
{
	String material="Iron";
	double price=2.25;
	double length;
	double diameter;
	String nailHead;
	String coating;
	
	
	
	Nail(double length,double diameter)
	{
		this.length=length;
		this.diameter=diameter;
	}
	
	public void print()
	{
		System.out.println("Nail Material :"+this.material);
		System.out.println("Nail Price per Unit :"+this.price);
		System.out.println("Length Of the Nail :"+this.length);
		System.out.println("Diameter of the Nail :"+this.diameter);
		System.out.println("Nail Head Type :"+this.nailHead);
		System.out.println("Nail coating :"+this.coating);

	}
	
}

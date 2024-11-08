//Iron : Add 5 properites

class Iron
{
	String shape="Round";
	String strength="Strong";
	int price;
	String brand;
	double length;
	double width;
	
	
	 
	Iron(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
		
	}
	
	public void print()
	{
		System.out.println("Shape Of the Iron :"+this.shape);
		System.out.println("Price Of the Iron :"+this.price);
		System.out.println("Iron length :"+this.length);
		System.out.println("Iron width:"+this.width);
		System.out.println("Shape Of the Iron :"+this.brand);
		System.out.println("Shape Of the Iron :"+this.strength);
	}
}
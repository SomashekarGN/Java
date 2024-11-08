//Chicken: Add 2 properites

class Chicken
{
	
	double weight;
	String chickenType="farm";
	int price;
	
	Chicken(double weight)
	{
		this.weight=weight;
		
	}
	
	public void print()
	{
		System.out.println("Chicken weight :"+this.weight);
		System.out.println("Chicken Type :"+this.chickenType);
		System.out.println("Chicken price :"+this.price);
	}
}
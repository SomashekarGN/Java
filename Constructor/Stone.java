//Stone : Add 3 properites
class Stone
{
	
	int weight;
	String stoneType;
	String colour="grey";
	
	Stone(String stoneType)
	{
		this.stoneType=stoneType;
	}
	
	public void print()
	{
		System.out.println("Stone colour :"+this.colour);
		System.out.println("Stone colour :"+this.weight);
		System.out.println("Stone colour :"+this.stoneType);
	}
	
	
}
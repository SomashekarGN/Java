//Bridge : : Add 4 properites

class Bridge
{
	double lengthInKM=1.6;
	String bridgeType="Hanging Bridge";
	String bridgeLocation;
	String connectingTo;
	String supportStructure;
	int lifeSpanofTheBridge;
	
	
	Bridge(String bridgeLocation,String connectingTo)
	{
		this.bridgeLocation=bridgeLocation;
		this.connectingTo=connectingTo;
	}
	
	public void print()
	{
		System.out.println("Bridge Length :"+this.lengthInKM);
		System.out.println("Type of bridge :"+this.bridgeType);
		System.out.println("Location of the Bridge :"+this.bridgeLocation);
		System.out.println("Bridge connecting To :"+this.connectingTo);
		System.out.println("Bridge Supporting Structure :"+this.supportStructure);
		System.out.println("Life Span Of The Bridge in years :"+this.lifeSpanofTheBridge);
		
	}
}
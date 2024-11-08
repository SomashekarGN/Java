//Camp : Add 6 properites
class Camp
{
	String campName="Elephant Camp";
	String location="Sakre Bailu";
	String startDate;
	String endDate;
	String campType;
	double pricePerParticipant;
	
	
	Camp(String campType,double pricePerParticipant)
	{
		this.campType=campType;
		this.pricePerParticipant=pricePerParticipant;
		
	}
	
	public void print()
	{
		System.out.println("Camp Name :"+this.campName);
		System.out.println("Camp location :"+this.location);
		System.out.println("Camp Start Date :"+this.startDate);
		System.out.println("Camp End Date :"+this.endDate);
		System.out.println("Camp Type :"+this.campType);
		System.out.println("Camp Cost per Person :"+this.pricePerParticipant);
	}
	
}

/*Create 3 copies of each class , init all variables
10 Variables using literal
10 Variables using constructor
10 Variables using ref
declare instance method to print all variables

River : Add 30 properites
Iron : Add 5 properites
Bridge : : Add 4 properites
Stone : Add 3 properites
Chicken: Add 2 properites
Festival: Add 2 properites
Nail: Add 5 properites
Camp : Add 6 properites
Diamond: Add 46 properites*/

class River
{
	String riverName="Kaveri";
	double lengthOfRiverFlows=800;
	double depth=1341;
	double width=365;
	String statesItCovers="Karnataka, Tamil Nadu, Kerala, and Pondicherry";
	String bornIn="WesterGhats of Karnataka TalaKaveri";
	String originState="Karnataka";
	String endsAt=" Bay of Bengal";
	String endsAtState="Pondicherry";
	boolean flowsThroughOutTheYear=true;
	boolean seansonal;
	String seansonsItFlows;
	String benifitedIndustries;
	boolean polluted;
	double waterDensity;
	boolean waterDrinkable;
	String waterType;
	boolean afftectedByRain;
	boolean isGlacierFed;
	int numberOfTributaries; 
	boolean hasDams;  
	double averageTemperature; 
	boolean hasHydroelectricPower;
	int numberOfBridges;
	boolean isEndangeredRiver;
	boolean hasFloodHistory;
	boolean supportsFisheries;
	double flowRate;  
	boolean isPartOfHydropower;
	boolean isTransboundary; 
	
	
	
	
	
	
	River(boolean seansonal,String seansonsItFlows,String benifitedIndustries,boolean polluted,double waterDensity,boolean waterDrinkable,String waterType,boolean afftectedByRain,boolean isGlacierFed,int numberOfTributaries)
	{
		this.seansonal=seansonal;
		this.seansonsItFlows=seansonsItFlows;
		this.benifitedIndustries=benifitedIndustries;
		this.polluted=polluted;
		this.waterDensity=waterDensity;
		this.waterDrinkable=waterDrinkable;
		this.waterType=waterType;
		this.afftectedByRain=afftectedByRain;
		this.isGlacierFed=isGlacierFed;
		this.numberOfTributaries=numberOfTributaries;
		
	}
	
	public void print()
	{
		System.out.println("Name of the River :"+this.riverName);
		System.out.println("Length of the River flow :"+this.lengthOfRiverFlows);
		System.out.println("Depth of the River :"+this.depth);
		System.out.println("Width of the River :"+this.width);
		System.out.println("States in which the River flows :"+this.statesItCovers);
		System.out.println("Birth place of the River :"+this.bornIn);
		System.out.println("Name of the River :"+this.riverName);
		System.out.println("River origin state :"+this.originState);
		System.out.println("River ends at :"+this.endsAt);
		System.out.println("The State in which the River ends :"+this.endsAtState);
		System.out.println("Does the River flows throughOut the year :"+this.flowsThroughOutTheYear);
		System.out.println("Is the flow of the River seasonal :"+this.seansonal);
		System.out.println("Seanson's in which the River flows :"+this.seansonsItFlows);
		System.out.println("Benifited Industries by the River :"+this.benifitedIndustries);
		System.out.println("Is the River polluted :"+this.polluted);
		System.out.println("Water density of the River :"+this.waterDensity);
		System.out.println("Is Water of the River Drinkable? :"+this.waterDrinkable);
		System.out.println("Type of the Water of the River :"+this.waterType);
		System.out.println("Is the River affected by the RainFall :"+this.afftectedByRain);
		System.out.println("Is the River affected GlacierFed :"+this.isGlacierFed);
		System.out.println("No of Tributeries of the River :"+this.numberOfTributaries);
		System.out.println("Does the River has Dams Bulit Across It :"+this.hasDams);
		System.out.println("Average Temperature of the River :"+this.averageTemperature);
		System.out.println("Is the River equipped with Hydroelectric Power :"+this.hasHydroelectricPower);
		System.out.println("No of bridges built across the River :"+this.numberOfBridges);
		System.out.println("Is the River Endangered :"+this.isEndangeredRiver);
		System.out.println("Does the River has any flood history :"+this.hasFloodHistory);
		System.out.println("Does the River Support Fishery :"+this.supportsFisheries);
		System.out.println("Flow Rate Of the River :"+this.flowRate);
		System.out.println("Is the River part of Hydro Power Generation :"+this.isPartOfHydropower);
		System.out.println("Is the River Crosses Boundries :"+this.isTransboundary);
	}
}
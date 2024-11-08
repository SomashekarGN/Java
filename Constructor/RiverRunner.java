class RiverRunner
{
	public static void main(String[] args)
	{
		
		River river=new River(true,"Monsoon seasons","Agriculture,Textile Industry,Hydropower Generation,Fishing Industry,Paper and Pulp Industry,Tourism,Sugar Industry",true,0.0,false,"Fresh Water river",true,false,29);
		
		river.hasDams=true;
		river.averageTemperature=0.0;
		river.hasHydroelectricPower=true;
		river.numberOfBridges=6;
		river.isEndangeredRiver=false;
		river.hasFloodHistory=true;
		river.supportsFisheries=true;
		river.flowRate=677;
		river.isPartOfHydropower=true;
		river.isTransboundary=true;
		
		river.print();
	}

}
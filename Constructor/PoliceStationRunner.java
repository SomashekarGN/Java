class PoliceStationRunner
{

	public static void main(String[] args)
	{
		
		PoliceStation ps=new PoliceStation();
		
		String name="Rajajinagar PoliceStation";
		PoliceStation ps1=new PoliceStation(name);
		
		String location="Rajajinagar";
		PoliceStation ps2=new PoliceStation(name,location);
		
		String subInspectorName="HariRam"; 
		PoliceStation ps3=new PoliceStation(name,location,subInspectorName);
		
		
		String constableName="Krishnappa";
		PoliceStation ps4=new PoliceStation(name,location,subInspectorName,constableName);
		
		
		String inspector="Satish";
		PoliceStation ps5=new PoliceStation(name,location,subInspectorName,constableName,inspector);

		String headConstable="RamMurthy";
		PoliceStation ps6=new PoliceStation(name,location,subInspectorName,constableName,inspector,headConstable);

	}

}
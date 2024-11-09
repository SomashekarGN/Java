/*1. Declare least 7 const in below class
2. Create 8 copies and print the variables for each copy
HINT : can use chaining
2.PoliceStation : name,location,subInspectorName,constableName,InspectorName,headConstableName*/

class PoliceStation
{
	
	String name;
	String location;
	String subInspectorName;
	String constableName;
	String inspectorName;
	String headConstableName;
	
	
	PoliceStation()
	{
		System.out.println("Polica Station Name :"+name);
		System.out.println("Polica Station Location :"+location);
		System.out.println("SubInspector Name :"+subInspectorName);
		System.out.println("Constable Name :"+constableName);
		System.out.println("Inspector Name :"+inspectorName);
		System.out.println("HeadConstable Name :"+headConstableName);

	}
	
		PoliceStation(String name)
		{
			this.name=name;
			System.out.println("Polica Station Name :"+name);
		}
		
		PoliceStation(String name,String location)
		{
			this(name);
			this.location=location;
			System.out.println("Polica Station Location :"+location);
		}
		
		PoliceStation(String name,String location,String subInspectorName)
		{
			this(name,location);
			this.subInspectorName=subInspectorName;
			System.out.println("SubInspector Name :"+subInspectorName);
		}
		
		PoliceStation(String name,String location,String subInspectorName,String constableName)
		{
			this(name,location,subInspectorName);
			this.constableName=constableName;
			System.out.println("Constable Name :"+constableName);
		}
		
		PoliceStation(String name,String location,String subInspectorName,String constableName,String inspectorName)
		{
			this(name,location,subInspectorName,constableName);
			this.inspectorName=inspectorName;
			System.out.println("Inspector Name :"+inspectorName);
		}
		
		PoliceStation(String name,String location,String subInspectorName,String constableName,String inspectorName,String headConstableName)
		{
			this(name,location,subInspectorName,constableName,inspectorName);
			this.headConstableName=headConstableName;
			System.out.println("Head Constable Name :"+headConstableName);
		}


	
	
}
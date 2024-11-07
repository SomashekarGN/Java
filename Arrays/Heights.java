class Heights{
	public static void main(String[] args){
	
	double somaHeight=5.5;
	double bhimsHeight=4.9;
	double arjunHeight=5.4;
	double nakulHeight=4.8;
	double sahadevHeight=4.5;
	double pratapHeight=5.8;
	double satishHeight=6.2;
	double harishHeight=6.1;
	double sureshHeight=6.0;
	double rameshHeight=6.4;

	double[] heightsOfPeople={somaHeight,bhimsHeight,arjunHeight,nakulHeight,sahadevHeight,pratapHeight,satishHeight,harishHeight,sureshHeight,maheshHeight};
	
	int total=heightsOfPeople.length;
	System.out.println("Total heights of people :"+total);
	
	
	for(int i=0;i<total;i++)
	{
		double val=heightsOfPeople[i];
		System.out.println("Height of "+i+"is :"+val);
		
		if(val>5.9)
		{
			System.out.println("Heights of" +i+" is "+val+"which is greater than 5.9");
		}
		if(val<5.3)
		{
			System.out.println("Heights of" +i+" is "+val+"which is less than 5.3");

		}
	}
	}
}
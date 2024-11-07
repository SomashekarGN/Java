//Store price of 5 soap , update price by 5 if price < 50 After store print again


class Soaps{
	public static void main(String[] args){
	
	int lux=25;
	int lifeboy=46;
	int medmix=60;
	int liril=70;
	int cinthol=35;
	
	int[] soaps={lux,lifeboy,liril,medmix,cinthol};
	
	int total=soaps.length;
	System.out.println("Total number of soaps :"+total);
	
	for(int i=0;i<total;i++)
	{
		int val=soaps[i];
		if(val<50)
		{
			//val=val+5;
			soaps[i]=val+5;
		}
		System.out.println("The Amount of soap is :"+val);
	
	}
	
	}
}
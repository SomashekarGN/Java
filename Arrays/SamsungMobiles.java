//Store price of ten mobile phones, update price by 500 if price equals or greater than 25000 After store print again

class SamsungMobiles{
	public static void main(String[] args){
	
	int samsungS22=35000;
	int samsungS22Ultra=122000;
	int samsungS22pro=80000;
	int samsungS22Fe=23000;
	int samsungA35=18000;
	int samsungA45=28000;
	int samsungS24=54000;
	int samsungA50=29999;
	int samsungS24Ultra=132000;
	int samsungS24Pro=98000;

	int[] samsungMobiles={samsungS22,samsungS22Ultra,samsungS22pro,samsungS22Fe,samsungA35,samsungA45,samsungS24,samsungA50,samsungS24Ultra,samsungS24Pro};
	
	int total=samsungMobiles.length;
	System.out.println("Total number of soaps :"+total);
	
	for(int i=0;i<total;i++)
	{
		int val=samsungMobiles[i];
		if(val<25000)
		{
			val=val+500;
		}
		System.out.println("The final  Amount of Mobile is :"+val);
	
	}
	
	
}
	
	
}
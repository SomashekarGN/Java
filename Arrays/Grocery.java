class Grocery{
	public static void main(String[] args){
	
	int sugar=44;
	int salt=20;
	int rice=56;
	int toorDal=70;
	int wheatFlour=65;
	int jowar=80;
	int milk=48;
	int tea=70;
	int coffee=54;
	int greenPeas=22;
	
	int[] groceryItems={sugar,salt,rice,toorDal,wheatFlour,jowar,milk,tea,coffee,greenPeas};
	
	int total=groceryItems.length;
		System.out.println("Total Number Of Grocery :"+total);
		
	for(int i=0;i<total;i++)
	{
	
		int val=groceryItems[i];
		if(val<50){
		System.out.println("these values are less than fifty rupees : "+val);
		}
	}
	}
}
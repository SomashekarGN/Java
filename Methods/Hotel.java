class Hotel{
	
	public static void main(String[] args){
		
		String a=order(12);
		System.out.println("Your order is :"+a);
	}


 static String order(int price)
 {
	if(price == 10)
	{
		return "Water Bottle";
	}
	
	else if(price == 12)
	{
		return "Tea/coffe";
	}
	
	else{
		return "Enter a valid choice";
	}
	
 
 }

}
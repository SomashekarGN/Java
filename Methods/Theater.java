/*2.Theater
100: Gandhi class,150 : Middle Class : 200:Balcony
static method book, which takes price and return seat type*/

class Theater{
	
	static public void main(String[] args)
	{
		
		String result=book(15);
		System.out.println(result);
	}
	
	
	static String book(int price)
	{
		
		if(price==100)
		{
			return "You Have Booked Gandhi Class Ticket";
		}
		
		else if(price==150)
		{
			return "You Have Booked Middle Class Ticket";
		}
		else if(price==200)
		{
			return "You Have Booked Balcony Ticket";
		}
		
		else
		{
			return "Please Enter a Valid choice";
		}
		
	}
}
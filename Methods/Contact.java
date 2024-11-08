/*3.Contact
//find least 10 names
static method findContact, take mobile number and return name ;*/

class Contact{
	
	public static void main(String[] args)
	{
		
		String result=findContact(9743065998L);
		
		System.out.println(result);
	}
	
	
	static String findContact(long mobileNumber)
	{
		
		if(mobileNumber==9743065930L)
		{
			return "Somashekar";
		}
		
		else if(mobileNumber==9380198092L)
		{
			return "Mummy";
		}
		
		else if(mobileNumber==9448209412L)
		{
			return "Dad";
		}
		else if(mobileNumber==7353486136L)
		{
			return "Tangi";
		}
		else if(mobileNumber==6361300732L)
		{
			return "Peanut";
		}
		else if(mobileNumber==8892463787L)
		{
			return "Buddy";
		}
		else if(mobileNumber==95130854581L)
		{
			return "Abhishek upari";
		}
		else if(mobileNumber==8050471025L)
		{
			return "My Num";
		}
		else if(mobileNumber==9743065933L)
		{
			return "Captain America";
		}
		else if(mobileNumber==9743065990L)
		{
			return "Avengers";
		}
		
		else
		{
			return "Enter a valid num/Num not found";
			
		}
		
	}
}
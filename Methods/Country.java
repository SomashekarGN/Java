/*4.Country
//find least 15 countries
static method findCountryCode,take name and return country code*/

class Country
{
	static public void main(String[] args)
	{
		
		String result=findCountryCode("Canada");
		
		System.out.println("Country code is :"+result);
	}
	
	
	static String findCountryCode(String name)
	{
		if(name=="India")
		{
			return "+91";
		}
		else if(name=="United States")
		{
			return "+1";
		}
		else if(name=="Canada")
		{
			return "+1";
		}
		else if(name=="United Kingdom")
		{
			return "+44";
		}
		else if(name=="Australia")
		{
			return "+61";
		}
		else if(name=="China")
		{
			return "+86";
		}
		else if(name=="Japan")
		{
			return "+81";
		}
		else if(name=="Germany")
		{
			return "+49";
		}
		else if(name=="France")
		{
			return "+33";
		}
		else if(name=="Russia")
		{
			return "+7";
		}
		else if(name=="South Africa")
		{
			return "+27";
		}
		else if(name=="Brazil")
		{
			return "+55";
		}
		else if(name=="Mexico")
		{
			return "+52";
		}
		else if(name=="BraziItalyl")
		{
			return "+39";
		}
		else if(name=="Spain")
		{
			return "+34";
		}
		
		else
		{
			return "Invalid choice";
		}
		
	}
}
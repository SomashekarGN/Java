	class ExampleArray{
		
		public static void main(String[] args)
		{
				int price[] ={225,337,179,217,83,435,313,420,108,120,101,143,90,35};
				
				int total=price.length;
				for(int i=0;i<total;i++)
				{
					if(price[i]<=250)
					{
						System.out.println("Given number is less than 250 :"+price[i]);
					}
					
					if(price[i]>400)
					{
						price[i]=price[i]+20;
						System.out.println("Updated Price +20 is :"+price[i]);
					}
					
					if(price[i]<100)
					{
						price[i]=price[i]*50;
						System.out.println("Updated Price *50 is :"+price[i]);
					}
					
					if(price[i]==420)
					{
						price[i]=price[i]-277;
						System.out.println("Updated Price 400-277 is  :"+price[i]);
					}
					
					
					
				}

		
		}
	
	}
	
class Colours{
	public static void main(String[] args){
	
	String c1="Red";
	String c2="Blue";
	String c3="Green";
	String c4="Yellow";
	String c5="Pink";
	String c6="Maroon";
	String c7="Purple";
	String c8="Grey";
	String c9="Black";
	String c10="White";
	
	
	String[] colours={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
	
	int total=colours.length;
	System.out.println("Total Number of Colours :"+total);
	
	System.out.println("Printing in Given Order. ");
	for(int i=0;i<total;i++)
	{
		String val=colours[i];
		System.out.println("The Colour is :"+val);
	}
	
		System.out.println("Printing in Reverse Order.");
		
	for(int j=colours.length-1;j>=0;j--)
	{
		String val=colours[j];
		System.out.println("The Colour is :"+val);
	}		

	}


}
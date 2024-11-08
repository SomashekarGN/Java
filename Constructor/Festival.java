//Festival: Add 2 properites

class Festival
{
	String nameOfTheFestival="Deepavali";
	String date="30-10-2024";
	int duration;
	String festivalTheme;
	boolean isPublicHoliday;
	String festivDish;
	
	Festival(String festivalTheme,int duration)
	{
		this.festivalTheme=festivalTheme;
		this.duration=duration;
	}
	
	public void print()
	{
		System.out.println("Festival : "+nameOfTheFestival);
		System.out.println("Festival date : "+date);
		System.out.println("Festival duration(indays) :"+duration);
		System.out.println("Festival Theme : "+festivalTheme);
		System.out.println("If the Festival Public Holiday : "+isPublicHoliday);
		System.out.println("Famous Dish prepared in this Festival : "+festivDish);

	}
	
	
}
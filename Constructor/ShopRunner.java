class ShopRunner
{
	public static void main(String[] args)
	{
	
		Shop shop=new Shop();
		
		String shopName="Desi Delights";
		Shop shop1=new Shop(shopName);
		
		String shopOwnerName="Shabbir";
		Shop shop2=new Shop(shopName,shopOwnerName);
		
		
		String shopLandlineNo="080-97436254";
		Shop shop3=new Shop(shopName,shopOwnerName,shopLandlineNo);
		
		int shopEstYear=1980;
		Shop shop4=new Shop(shopName,shopOwnerName,shopLandlineNo,shopEstYear);
		
	}
}
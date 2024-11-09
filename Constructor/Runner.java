class Runner{
	public static void main(String[] args)
	{
		TradeLocal tradelocal1 = new TradeLocal();
		
		
		System.out.println("TradeLocal color:"+tradelocal1.color);
		System.out.println("TradeLocal thinkness:"+tradelocal1.thinkness);
		
		tradelocal1.color="red";
		tradelocal1.thinkness=20;
		
		System.out.println("Updated color:"+tradelocal1.color);
		System.out.println("Updated thinkness:"+tradelocal1.thinkness);
		
		TradeLocal tradelocal2 = new TradeLocal();
		System.out.println("TradeLoca2 color:"+tradelocal2.color);
		System.out.println("TradeLoca2 thinkness:"+tradelocal2.thinkness);
		
		tradelocal2.color="blue";
		tradelocal2.thinkness=30;
		
		System.out.println("Updated color:"+tradelocal2.color);
		System.out.println("Updated thinkness:"+tradelocal2.thinkness);
		
		
		
		
		WaterBottle waterbottle1 = new WaterBottle();
		System.out.println("WaterBottle size:"+waterbottle1.size);
		System.out.println("WaterBottle shape:"+waterbottle1.shape);
		
		waterbottle1.size=10.0;
		waterbottle1.shape="circle";
		
		System.out.println("Updated size:"+waterbottle1.size);
		System.out.println("Updated shape:"+waterbottle1.shape);
		
		WaterBottle waterbottle2 = new WaterBottle();
		System.out.println("WaterBottle size:"+waterbottle2.size);
		System.out.println("WaterBottle shape:"+waterbottle2.shape);
		
		waterbottle2.size=20.0;
		waterbottle2.shape="square";
		
		System.out.println("Updated size:"+waterbottle2.size);
		System.out.println("Updated shape:"+waterbottle2.shape);
		
		
		
		Needle needle1 = new Needle();
		System.out.println("Needle material:"+needle1.material);
		System.out.println("Needle length:"+needle1.length);
		
		needle1.material = "Abc";
		needle1.length = 10;
		
		System.out.println("Updated material:"+needle1.material);
		System.out.println("Updated length:"+needle1.length);
		
		Needle needle2 = new Needle();
		System.out.println("Needle material:"+needle2.material);
		System.out.println("Needle length:"+needle2.length);
		
		needle2.material = "DEF";
		needle2.length = 20;
		
		System.out.println("Updated material:"+needle2.material);
		System.out.println("Updated length:"+needle2.length);
		
		
		
		
		Cooker cooker1 = new Cooker();
		System.out.println("Cooker quality:"+cooker1.quality);
		System.out.println("Cooker brand:"+cooker1.brand);
		
		cooker1.quality = 100;
		cooker1.brand = "DELL";
		
		System.out.println("Updated quality:"+cooker1.quality);
		System.out.println("Updated brand:"+cooker1.brand);
		
		Cooker cooker2 = new Cooker();
		System.out.println("Cooker quality:"+cooker2.quality);
		System.out.println("Cooker brand:"+cooker2.brand);
		
		cooker2.quality = 200;
		cooker2.brand ="Lenovo";
		
		System.out.println("Updated quality:"+cooker2.quality);
		System.out.println("Updated brand:"+cooker2.brand);
		
		
		
		
		Tripod tripod1 = new Tripod();
		System.out.println("Tripod stable:"+tripod1.stable);
		System.out.println("Tripod type:"+tripod1.type);
		
		tripod1.stable = true;
		tripod1.type = "A";
		
		System.out.println("Updated stable:"+tripod1.stable);
		System.out.println("Updated type:"+tripod1.type);
		
		Tripod tripod2 = new Tripod();
		System.out.println("Tripod stable:"+tripod2.stable);
		System.out.println("Tripod type:"+tripod2.type);
		
		tripod2.stable = false;
		tripod2.type = "B";
		
		System.out.println("Updated stable:"+tripod2.stable);
		System.out.println("Updated type:"+tripod2.type);

	}
}
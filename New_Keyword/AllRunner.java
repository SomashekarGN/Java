class AllRunner{

	public static void main(String[] args)
	{
		ThreadEx threadex=new ThreadEx();

		System.out.println("Thread Colour Default :"+threadex.colour);
		System.out.println("Thread Thickness Default :"+threadex.thickness);
		
		
		
		ThreadEx threadex1=new ThreadEx();
		threadex1.colour="red";
		threadex1.thickness=5;

		System.out.println("Thread Colour Updated :"+threadex1.colour);
		System.out.println("Thread Thickness Updated :"+threadex1.thickness);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");

		
		
		
		WaterBottle waterbottle=new WaterBottle();

		System.out.println("WaterBottle size Default :"+waterbottle.size);
		System.out.println("WaterBottle shape Default :"+waterbottle.shape);
		
		
		
		WaterBottle waterbottle1=new WaterBottle();
		waterbottle1.size=2;
		waterbottle1.shape="cubical";

		System.out.println("WaterBottle size Updated :"+waterbottle1.size);
		System.out.println("WaterBottle shape Updated :"+waterbottle1.shape);
		
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");

		
		
		Needle needle=new Needle();

		System.out.println("Needle material Default :"+needle.material);
		System.out.println("Needle length Default :"+needle.length);
		
		
		
		Needle needle1=new Needle();
		needle1.material="Stainless Steel";
		needle1.length=5;

		System.out.println("Needle material Updated :"+needle1.material);
		System.out.println("Needle length Updated :"+needle1.length);
		
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");

		
		
		Cooker cooker=new Cooker();

		System.out.println("Cooker size Default :"+cooker.size);
		System.out.println("Cooker Quantity Default :"+cooker.quantity);
		System.out.println("Cooker Brand Default :"+cooker.brand);
		
		Cooker cooker1=new Cooker();
		cooker1.size=3;
		cooker1.quantity=3000;
		cooker1.brand="Hakwins";

		System.out.println("Cooker size Updated :"+cooker1.size);
		System.out.println("Cooker Quantity Updated :"+cooker1.quantity);
		System.out.println("Cooker Brand Updated :"+cooker1.brand);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////");

		
		Tripod tripod=new Tripod();

		System.out.println("Tripod stable Default :"+tripod.stable);
		System.out.println("Tripod Length Default :"+tripod.length);
		System.out.println("Tripod Type Default :"+tripod.type);	
		
		Tripod tripod1=new Tripod();
		tripod1.stable=true;
		tripod1.length=6;
		tripod1.type="3 leg";
		System.out.println("Tripod stable Updated :"+tripod1.stable);
		System.out.println("Tripod Length Updated :"+tripod1.length);
		System.out.println("Tripod Type Updated :"+tripod1.type);	

		
		




	}
}
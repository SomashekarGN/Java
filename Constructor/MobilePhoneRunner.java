class MobilePhoneRunner
{
	public static void main(String[] values)
	{
		MobilePhone mp=new MobilePhone();
		
		System.out.println("/////////////////////////////////////////////////////////////////");
		String mobileBrand="Samsung";
		String mobileModel="S24 Ultra";
		MobilePhone mp1=new MobilePhone(mobileBrand,mobileModel);
		
		System.out.println("/////////////////////////////////////////////////////////////////");
		int mobilePrice=149999;
		int ram=12;
		int rom=256;
		MobilePhone mp2=new MobilePhone(mobileBrand,mobileModel,mobilePrice,ram,rom);
		
		System.out.println("/////////////////////////////////////////////////////////////////");
		double displaySize=6.9;
		boolean is5g=true;
		boolean isDualSim=true;
		MobilePhone mp3=new MobilePhone(mobileBrand,mobileModel,mobilePrice,ram,rom,displaySize,is5g,isDualSim);
		
		
		System.out.println("/////////////////////////////////////////////////////////////////");
		String camerSpecifications="108 Main Camera,40MP 100X telephoto,32MP UltraWide, 32MP Selfie Camera";
		MobilePhone mp4=new MobilePhone(mobileBrand,mobileModel,mobilePrice,ram,rom,displaySize,is5g,isDualSim,camerSpecifications);

		
		
		
	}

}
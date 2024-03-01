package assignments.day3;

public class Mobile {
	
	public void makeCall()
	{
		String mobileModel="Samsung S22";
		float mobileWeight=228f;
		System.out.println("------Inside method makeCall------");
		System.out.println("Model: "+mobileModel);
		System.out.println("Weight: "+mobileWeight+"g");
	}
	
	public void sendMsg() {
		boolean isFullCharged=true; 
		int mobileCost= 45000;
		System.out.println("------Inside method sendMsg------");
		System.out.println("Fully Charged: "+isFullCharged);
		System.out.println("Price: "+mobileCost);
	}
	
	public static void main(String[] args) {
		Mobile ObjMobile=new Mobile();
		System.out.println("This is my mobile");
		
		ObjMobile.makeCall();
		ObjMobile.sendMsg();
		
	}

}

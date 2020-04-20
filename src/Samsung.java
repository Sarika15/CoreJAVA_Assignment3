
public class Samsung extends Mobile {
	
	private int iemiCode;
	private int IsSingleSIM;
	private String processor;
	private int simCard;
	private long mobileNo;
	
	public Samsung() {}
	
	
	public Samsung(int iemiCode, int isSingleSIM, String processor, int simCard, long mobileNo) {
		
		this.iemiCode = iemiCode;
		IsSingleSIM = isSingleSIM;
		this.processor = processor;
		this.simCard = simCard;
		this.mobileNo = mobileNo;
	}


	public void connectBluetooth() {
		System.out.println("Wlecome to SAMSUNG Family & Enjoy your device!\n\n"+ "Please read all the details carefully before using this device.\n" );
	    System.out.println("1. Please connect to the bluetooth using connectivity option \n");
	}
	
	public void dial() {
		System.out.println("2.SAMSUNG device is having keyboard based daling \n");
	}
	
	public int getIEMICode() {
		return 1234;
	}
	
	public void getWifiConnection() {
		System.out.println("3.Please connect your SAMSUNG device to WiFi by using internet settings \n");
	}
	
	public void receive() {
		System.out.println("3.When there is a incomming call to your SAMSUNG device, please receive it. \n");
	}
	public void sendMessage() {
		System.out.println("4.You can succesfully send text or media messages from SAMSUNG device \n");
		System.out.println("Thank you for all your business and we hope you will enjoy our service");
	}
    
}

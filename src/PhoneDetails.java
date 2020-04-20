import java.util.Scanner;

public class PhoneDetails {
	static Scanner sc = new Scanner(System.in);
	
	public static void mobile() {
		System.out.println("---------------------------------");
		System.out.println("|-------Mobile Items Menu-------|");
		System.out.println("|1. SAMSUNG |");
		System.out.println("|2. NOKIA   |");
		System.out.println("|3. IPHONE  |");
		System.out.println("|4. Back    |");
		System.out.println("---------------------------------");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter IMEI Code for a SAMSUNG Mobile");
		        int imeiCode = sc.nextInt();
		        System.out.println("If it is having a single SIM select 1 else 2: ");
		        int n = sc.nextInt();
		        boolean IsSingleSIM;
		        if(n == 1) {
		         IsSingleSIM = true;	
		        }else {
		        IsSingleSIM = false;
		        }
		        System.out.println("Enter the name of Professor for SAMSUNG Mobile: ");
		        String processor = sc.next();
		        
		        System.out.println("Enter the SIM Card number: ");
		        int simCard = sc.nextInt();
		        
		        System.out.println("Enter mobile/Telephone number: ");
		        long mobileNo = sc.nextLong();
		        
		        Samsung s = new Samsung(1234, 1, "ARM7", 11, 980230001);
			    SamsungS5 s5 = new SamsungS5();
			    s5.connectBluetooth();
			    s5.dial();
			    s5.getIEMICode();
			    s5.getWifiConnection();
			    s5.receive();
			    s5.sendMessage();
			    break;
			    
		case 2: System.out.println("Enter IMEI Code for NOKIA Mobile");
                int imeiCode1 = sc.nextInt();
                System.out.println("Select 1 if it's single SIM else 2: ");
                int n1 = sc.nextInt();
                boolean IsSingleSIM1;
                if(n1 == 1) {
                  IsSingleSIM1 = true;	
                 }else {
        	       IsSingleSIM1 = false;
                   }
               System.out.println("Enter the name of Professor for NOKIA Mobile: ");
               String processor1 = sc.next();
               System.out.println("Enter the SIM Card number: ");
               int simCard1 = sc.nextInt();
               System.out.println("Enter mobile number: ");
               long mobileNo1 = sc.nextLong();
               Nokia no = new Nokia(1234, 1, "ARM7", 11, 980230001);
               NokiaLumia365 n365 = new NokiaLumia365();
               n365.connectBluetooth();
               n365.dial();
               n365.getIEMICode();
               n365.getWifiConnection();
               n365.receive();
               n365.sendMessage();
               break;
               
		case 3: System.out.println("Enter IMEI Code for IPhone Mobile");
                int imeiCode2 = sc.nextInt();
                System.out.println("Select 1 if it's single SIM else 2: ");
                int n2 = sc.nextInt();
                boolean IsSingleSIM2;
                if(n2 == 1) {
                IsSingleSIM2 = true;	
                }else {
	            IsSingleSIM2 = false;
                }
                System.out.println("Enter the name of Professor for IPhone Mobile: ");
                String processor2 = sc.next();
                System.out.println("Enter the SIM Card number: ");
                int simCard2 = sc.nextInt();
                System.out.println("Enter mobile number: ");
                long mobileNo2 = sc.nextLong();
                IPhone ip = new IPhone(1234, 1, "ARM7", 11, 980230001);
                IPhoneS7 s7 = new IPhoneS7();
                s7.connectBluetooth();
                s7.dial();
                s7.getIEMICode();
                s7.getWifiConnection();
                s7.receive();
                s7.sendMessage();
                break;
		case 4: MobileStore.main(null);
		        break;
		 default: System.out.println("Please select options in between 1 to 4");
		}
	}
	public static void telephone() {
		System.out.println("---------------------------------");
		System.out.println("|-------Telephone Items Menu-------|");
		System.out.println("|1. SAMSUNG |");
		System.out.println("|2. NOKIA   |");
		System.out.println("|3. IPHONE  |");
		System.out.println("|4. Back    |");
		System.out.println("---------------------------------");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter IMEI Code for SAMSUNG Telephone");
		        int imeiCode = sc.nextInt();
		        System.out.println("Select 1 if it's single SIM else 2: ");
		        int n = sc.nextInt();
		        boolean IsSingleSIM;
		        if(n == 1) {
		         IsSingleSIM = true;	
		        }else {
		        	IsSingleSIM = false;
		        }
		        System.out.println("Enter the name of Professor in the device: ");
		        String processor = sc.next();
		        System.out.println("Enter the SIM Card number: ");
		        int simCard = sc.nextInt();
		        System.out.println("Enter Telephone number: ");
		        long mobileNo = sc.nextLong();
		        Samsung s = new Samsung(1112, 1, "ARM3", 11, 222155);
			    SamsungS5 s5 = new SamsungS5();
			    s5.connectBluetooth();
			    s5.dial();
			    s5.getIEMICode();
			    s5.getWifiConnection();
			    s5.receive();
			    s5.sendMessage();
			    break;
			    
		case 2: System.out.println("Enter IMEI Code for NOKIA Telephone");
                int imeiCode1 = sc.nextInt();
                System.out.println("Select 1 if it's single SIM else 2: ");
                int n1 = sc.nextInt();
                boolean IsSingleSIM1;
                if(n1 == 1) {
                  IsSingleSIM1 = true;	
                 }else {
        	       IsSingleSIM1 = false;
                   }
               System.out.println("Enter the name of Professor in the device: ");
               String processor1 = sc.next();
               System.out.println("Enter the SIM Card number: ");
               int simCard1 = sc.nextInt();
               System.out.println("Enter Telephone number: ");
               long mobileNo1 = sc.nextLong();
               Nokia no = new Nokia(1112, 1, "ARM3", 11, 222155);
               NokiaLumia365 n365 = new NokiaLumia365();
               n365.connectBluetooth();
               n365.dial();
               n365.getIEMICode();
               n365.getWifiConnection();
               n365.receive();
               n365.sendMessage();
               break;
               
		case 3: System.out.println("Enter IMEI Code for IPhone Telephone");
                int imeiCode2 = sc.nextInt();
                System.out.println("Select 1 if it's single SIM else 2: ");
                int n2 = sc.nextInt();
                boolean IsSingleSIM2;
                if(n2 == 1) {
                IsSingleSIM2 = true;	
                }else {
	            IsSingleSIM2 = false;
                }
                System.out.println("Enter the name of Professor in the device: ");
                String processor2 = sc.next();
                System.out.println("Enter the SIM Card number: ");
                int simCard2 = sc.nextInt();
                System.out.println("Enter Telephone number: ");
                long mobileNo2 = sc.nextLong();
                IPhone ip = new IPhone(1112, 1, "ARM3", 11, 222155);
                IPhoneS7 s7 = new IPhoneS7();
                s7.connectBluetooth();
                s7.dial();
                s7.getIEMICode();
                s7.getWifiConnection();
                s7.receive();
                s7.sendMessage();
                break;
		case 4: MobileStore.main(null);
		        break;
		 default: System.out.println("Please select options in between 1 to 4");
		}
	}

}

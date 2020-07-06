package EmailApplication;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email1 = new Email("Jane", "Karlsson");
		System.out.println();
		System.out.println(email1.getInfo());
		
		System.out.println();
		System.out.println();
		Email em2 = new Email("Mizzou", "Bhaddie");
		System.out.println();
		System.out.println(em2.getInfo());
		
		
		//email1.setAltEmail("JaneKarlsson01@gmail.com");
		//System.out.println(email1.getAltEmail());
	}

}

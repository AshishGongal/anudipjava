package First_Problem;

public class BankMain {

	public static void main(String[] args) 
	{
		Bank a = new BankA();
		System.out.println("Available Balance in Bank A : "+a.getBalance());

		Bank b = new BankB();
		System.out.println("\nAvailable Balance in Bank B: "+b.getBalance());

		Bank c = new BankC();
		System.out.println("\nAvailable Balance in Bank C: "+c.getBalance());
	}

}

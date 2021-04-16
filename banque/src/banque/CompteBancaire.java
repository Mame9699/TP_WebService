package banque;

public class CompteBancaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		{
		
		CompteBanque cb1 =new CompteBanque();
				cb1.deposerArgent(100);
				cb1.retirerArgent(50);
				System.out.print(journalisation.getInstance().getLog());
				
		
	}	
	}

}

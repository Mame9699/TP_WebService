package banque;

public class CompteBanque {

	private int numero;
   private  double solde;
   
	public void CompteBancaire(double s, int n) {
		this.solde=s;
		this.numero=n;
	}
	private void CompteBancaire() {}
		
		public void deposerArgent(double depot) 
		{
			this.solde=depot;
			journalisation.getInstance().ajouterLog(""+this.solde);
			
		}
		
		public void retirerArgent(double retrait)
		{
			if(this.solde>retrait)
			{
				this.solde=this.solde-retrait;
				journalisation.getInstance().ajouterLog("le compte a retiré:"+retrait);
			}
		}
	
	
	
}

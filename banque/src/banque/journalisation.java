package banque;

public class journalisation {
private String log;
	
	private journalisation() {}
	
	private static journalisation INSTANCE=null;
	
	public static journalisation getInstance()
	{
		if(INSTANCE== null)
		{
			INSTANCE= new journalisation();
		}
		return INSTANCE;
	}
	
	public void ajouterLog(String log)
	{
		
		this.log="le montant ajouté est de :"+log;
	}
	
	public String getLog()
	{
		return this.log;
	}
	
	
}

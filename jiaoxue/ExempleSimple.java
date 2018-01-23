package jiaoxue;

public class ExempleSimple 
{ 
	public void premierTest(Generateur gen)
	{ 
		System.out.println("Premier test:"); 
		System.out.println("-------------"); 
		String chaine = "alea jacta est";
		try {
			System.out.println("un");
			gen.tryMe(chaine);
			System.out.println("deux");
		} catch(MonException e) 
		{ 
			System.out.println("trois");
		}
		System.out.println("quatre");
	}
	public void secondTest(Generateur gen) 
	{
		System.out.println("Second test:"); 
		System.out.println("------------"); 
		String chaine = "aller a la gare de l’est";
		try 
		{		
			System.out.println("un");
			gen.tryMe(chaine);
			System.out.println("deux");
		} catch(MonException e) 
		{ 
			System.out.println("trois");
		}
		System.out.println("quatre");
	}
	public void troisiemeTest(Generateur gen) throws MonException
	{
		System.out.println("Troisieme test:"); 
		System.out.println("---------------"); 
		String chaine = "alea jacta est"; 
		System.out.println("un"); 
		gen.tryMe(chaine); 
		System.out.println("deux");
	}
	public void quatriemeTest(Generateur gen) throws MonException 
	{ 
		System.out.println("Quatrieme test:"); 
		System.out.println("---------------");
		String chaine = "aller a la gare de l’est"; 
		System.out.println("un");
		gen.tryMe(chaine);
		System.out.println("deux");
	}
	public void cinquiemeTest(Generateur gen) throws MonException 
	{ 
		System.out.println("Cinquieme test:"); 
		System.out.println("---------------");
		String chaine = "alea jacta est";
	try {
		System.out.println("un"); 
		gen.tryMe(chaine); 
		System.out.println("deux");
		} 
		catch(MonException e) 
		{ 
		System.out.println("trois"); 
		throw e;
		} finally 
		{
		System.out.println("trois bis");
		}
		System.out.println("quatre");
	}
	public void sixiemeTest(Generateur gen) throws MonException 
	{ 
		System.out.println("Sixieme test:"); 
		System.out.println("-------------");
		String chaine = "aller a la gare de l’est";
		try {
			System.out.println("un"); 
			gen.tryMe(chaine); 
			System.out.println("deux");
		} catch(MonException e) 
		{
		      System.out.println("trois");
		      throw e; 
		} finally 
		{
		      System.out.println("trois bis");
		}
		System.out.println("quatre");
	}		  
	public static void main(String[] args) {
		Generateur gen = new Generateur("alea jacta est"); 
		ExempleSimple exemple = new ExempleSimple(); 
		exemple.premierTest(gen);
		exemple.secondTest(gen);
		try {
			exemple.troisiemeTest(gen); 
			} catch(MonException e) 
			{
				System.out.println("cinq"); 
			}
		try {
		      exemple.quatriemeTest(gen); 
		    } catch(MonException e) 
			{
		      System.out.println("cinq");
			}
		try {
		      exemple.cinquiemeTest(gen); 
		    } catch(MonException e) 
			{
		      System.out.println("cinq");
			}
		try {
		      exemple.sixiemeTest(gen); 
		    } catch(MonException e) 
			{
		      System.out.println("cinq");
			}
		}
}
package jiaoxue;

public class Generateur 
{ 
	private String genstr;
	public Generateur(String genstr) 
	{ 
		this.genstr = genstr;
	}
	public void tryMe(String str) throws MonException 
	{ 
		if(str.equals(genstr))
			throw new MonException("Oups, l’exception est levee");
	}
}
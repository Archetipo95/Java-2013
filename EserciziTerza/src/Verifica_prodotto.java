public class Verifica_prodotto {
	protected String nome; 
	protected double altezza; 
	protected double larghezza;
	protected double profonditā; 
	protected double kg;

	public Verifica_prodotto ()
	{
	}
	public Verifica_prodotto (String n, double h, double l, double p, double k)
	{
		nome=n;
		altezza=h;
		larghezza=l;
		profonditā=p;
		kg=k;
	}
	protected double volume()
	{
		double v;
		v= altezza*larghezza*profonditā;
		return v;
	}
	protected void setnome(String nome)
	{
		this.nome=nome;
	}
	protected void setaltezza(double altezza)
	{
		this.altezza=altezza;
	}
	protected void setprofonditā(double profonditā)
	{
		this.profonditā=profonditā;
	}
	protected void setlarghezza(double larghezza)
	{
		this.larghezza=larghezza;
	}
	protected void setkg(double kg)
	{
		this.kg=kg;
	}
}

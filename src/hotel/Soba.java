package hotel;

public class Soba {
	
	private int brojKreveta;
	private int brojSobe;
	private boolean zauzeto;
	
	public Soba()
	{
		
	}
	public Soba(int brojSobe)
	{
		
	}
	public Soba(int brojKreveta, int brojSobe)
	{
		this.brojKreveta = brojKreveta;
		this.brojSobe = brojSobe;
		
	}
	public Soba(int brojKreveta, int brojSobe, boolean zauzeto)
	{
		this.brojKreveta = brojKreveta;
		this.brojSobe = brojSobe;
	}
	public boolean odobrenje(int n)
	{
		if(n > brojKreveta || zauzeto != false)
			return false;
		else
			return true;
	}
	
	public int getBrojKreveta() {
		return brojKreveta;
	}
	public void setBrojKreveta(int brojKreveta) {
		this.brojKreveta = brojKreveta;
	}
	public int getBrojSobe() {
		return brojSobe;
	}
	public void setBrojSobe(int brojSobe) {
		this.brojSobe = brojSobe;
	}
	public boolean isZauzeto() {
		return zauzeto;
	}
	public void setZauzeto(boolean zauzeto) {
		this.zauzeto = zauzeto;
	}
	
	
}

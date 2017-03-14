package pl.b2b.parker.moreNet.web.util;

public class Item {

	private String nazwa;
	private String cena;

	public Item( String nazwa, String cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
	}

	

	public String getCena() {
		return cena;
	}



	public void setCena(String cena) {
		this.cena = cena;
	}



	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	
}

package model;

public abstract class Product {
	abstract String getnaam();
	abstract int getEenheid();
	abstract int getPrijsPerEenheid();
	abstract String getImageURL();
	static final int gram = 1;
	static final int kilo = 2;
	static final int liters = 3;
	static final int stuk = 4;
	static final int pak = 5;
	
	Product(String naam, int prijspereenheid, String imageUrl, int eenheid){	
	}
	Product(String naam, int prijspereenheid, String imageUrl){	
	}
	public int getPrijs(int hoeveelheid){
		int prijs;
		prijs = hoeveelheid/getPrijsPerEenheid();
		return prijs;
	}
	public String toString(){
		String omschrijving;
		omschrijving = getnaam() + getEenheid() + getPrijs().prijs;
		return omschrijving.toString();
	}
	
	//volgende methode: static of niet? En: naam van de eenheid (int) omzetten naar String?
	static String getEenheidNaam(){
		String EenheidNaam = "";
		return EenheidNaam;
	}
}

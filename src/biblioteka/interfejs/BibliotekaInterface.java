package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

/**
 * Interfejs koji predstavlja biblioteku.
 * 
 * @author Djordje
 *
 */

public interface BibliotekaInterface {
	/**
	 * Dodaje novu knjigu u biblioteku.
	 * 
	 * @param knjiga
	 * @throws java.lang.NullPointException ako je uneta knjiga null
	 * @throws java.lang.NullPointException ako je uneta knjiga koja vec postoji u biblioteci (duplikat)
	 */
	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public LinkedList<Knjiga> vratiSveKnjige();
	
	public LinkedList<Knjiga> pronadjiKnjigu(
			Autor autor,
			String isbn,
			String naslov,
			String izdavac);

}

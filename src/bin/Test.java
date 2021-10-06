package bin;

import de.informatics4kids.Picture;
import de.informatics4kids.PictureViewer;
import lib.Faltung;
import lib.Gauss;
	

public class Test {
	
	
	
	public static void main(String[] args) {

		Faltung faltung = new Gauss();

		Picture firefox = new Picture("index.jpeg");
		faltung.setPicture(firefox);
		
		
		
		PictureViewer display = new PictureViewer(faltung.transform().getPicture());
		display.show();
		PictureViewer display_orig = new PictureViewer(firefox.getPicture());
		display_orig.show();
	}

}

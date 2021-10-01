package bin;

import de.informatics4kids.Picture;
import de.informatics4kids.PictureViewer;
import lib.Sobel;
import lib.Sobel.SobelType;

	

public class Test {
	
	
	
	public static void main(String[] args) {
		Sobel faltung = new Sobel();
		
		Picture firefox = new Picture("index2.jpeg");
		faltung.setPicture(firefox);
		
		
		
		PictureViewer display = new PictureViewer(faltung.transform(SobelType.G).getPicture());
		display.show();
		PictureViewer display_orig = new PictureViewer(firefox.getPicture());
		display_orig.show();
	}

}

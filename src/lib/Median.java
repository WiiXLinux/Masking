package lib;

public class Median extends Faltung {
	@Override
	public void calculateValue() {
		setValue((int)Bubblesorter.bubblesort(inputToOneDimArray())[4]);
}
}

package creationalpattern;

public class DongVatFactory {
	public static DongVat getDongVat (DongVatAbstractFactory facrory) {
		return facrory.taoDongVat();
	}
}

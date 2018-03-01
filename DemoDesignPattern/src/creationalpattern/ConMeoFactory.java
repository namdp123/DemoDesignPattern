package creationalpattern;

public class ConMeoFactory implements DongVatAbstractFactory {
private String mauLong;
private String tenGoi;
private String tiengKeu;
public ConMeoFactory(String mauLong, String tenGoi, String tiengKeu) {
	// TODO Auto-generated constructor stub
	this.tenGoi = tenGoi;
	this.mauLong = mauLong;
	this.tiengKeu = tiengKeu;
}
	@Override
	public DongVat taoDongVat() {
		// TODO Auto-generated method stub
		return new ConMeo(mauLong, tenGoi, tiengKeu);
	}
	

}

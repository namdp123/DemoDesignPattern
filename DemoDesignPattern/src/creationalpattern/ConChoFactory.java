package creationalpattern;

public class ConChoFactory  implements DongVatAbstractFactory{
private String tiengKeu;
private String tenGoi;
private String mauLong;
public ConChoFactory( String mauLong, String tenGoi,  String tiengKeu) {
	this.tiengKeu = tiengKeu;
	this.tenGoi = tenGoi;
	this.mauLong = mauLong;
}
	@Override
	public DongVat taoDongVat() {
		// TODO Auto-generated method stub
		return new ConCho(tiengKeu, tenGoi, mauLong);
	}
	

}

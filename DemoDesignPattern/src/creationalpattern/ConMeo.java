package creationalpattern;

public class ConMeo extends DongVat {
private String mauLong;
private String tenGoi;
private String tiengKeu;
public ConMeo(String mauLong, String tenGoi, String tiengKeu){
	this.mauLong = mauLong;
	this.tiengKeu = tiengKeu;
	this.tenGoi = tenGoi;
}
	@Override
	public String GetMauLong() {
		// TODO Auto-generated method stub
		return this.mauLong;
	}

	@Override
	public String TenGoi() {
		// TODO Auto-generated method stub
		return this.tenGoi;
	}

	@Override
	public String TiengKeu() {
		// TODO Auto-generated method stub
		return this.tiengKeu;
	}

}

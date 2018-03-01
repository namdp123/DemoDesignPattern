package creationalpattern;

public class ConCho extends DongVat {
private String mauLong;
private String tenGoi;
private String tiengKeu;

public ConCho(String mauLong, String tenGoi, String tiengKeu) {
	// TODO Auto-generated constructor stub
	this.mauLong = mauLong;
	this.tenGoi = tenGoi;
	this.tiengKeu = tiengKeu;
}

@Override
public String GetMauLong() {
	// TODO Auto-generated method stub
	return mauLong;
}

@Override
public String TenGoi() {
	// TODO Auto-generated method stub
	return tenGoi;
}

@Override
public String TiengKeu() {
	// TODO Auto-generated method stub
	return tiengKeu;
}

}

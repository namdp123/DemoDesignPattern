package creationalpattern;

public class NguoiNuoi {
	public static DongVat GetDongVat (String loai, String tenGoi, String mauLong, String tiengKeu) {
		if("Cho".equalsIgnoreCase(loai)) 
			return new ConCho(mauLong, tenGoi, tiengKeu);
		else if ("Meo".equalsIgnoreCase(loai))
			return new ConMeo(mauLong, tenGoi, tiengKeu);
		return null;
	}

}

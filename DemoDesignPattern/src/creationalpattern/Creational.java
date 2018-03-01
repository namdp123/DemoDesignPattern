package creationalpattern;


public class Creational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo Singleton
		Singleton stm = Singleton.getInstance();
		stm.Demo();
		stm.XuatChuoi("abc"); 
		
		
		//Demo Factory
		System.out.println(" ");
		System.out.println(" Demo Factory ");
		DongVat cho = NguoiNuoi.GetDongVat("Cho", "Pin", "Màu Vàng", "Gâu Gâu");
		DongVat meo = NguoiNuoi.GetDongVat("Meo", "MyMy", "Vằn", "Meo Meo");
		System.out.println("Đây là con chó: Lông "+cho.GetMauLong()+ " Tên " + cho.TenGoi() + " Kêu "+ cho.TiengKeu());
		System.out.println("Đây là con mèo: Lông "+meo.GetMauLong()+ " Tên " + meo.TenGoi() +" Kêu "+ meo.TiengKeu());
		
		//Demo Abstract Factory
		System.out.println(" ");
		System.out.println("Demo Abstract Factory ");
		DongVat conCho = DongVatFactory.getDongVat(new ConChoFactory("Gâu Gâu", "Cậu Vàng", "Vàng"));
		DongVat conMeo = DongVatFactory.getDongVat(new ConMeoFactory("Vằn", "Mướp", "Meo Meo"));
		System.out.println("Đây là con chó: Lông "+conCho.GetMauLong()+ " Tên " + conCho.TenGoi() + " Kêu "+ conCho.TiengKeu());
		System.out.println("Đây là con mèo: Lông "+conMeo.GetMauLong()+ " Tên " + conMeo.TenGoi() +" Kêu "+ conMeo.TiengKeu());
		
		//Demo Builder
		System.out.println(" ");
		ComputerBuilder cb = new ComputerBuilder("500GB","4GB","4Cell","MB001").setBuletoothEnable(true).setGraphicCardEnable(true);
		Computer cp = new Computer(cb);
		System.out.println("Kết quả: "+cp.getHDD()+ " "+ cp.getRam() + " "+ cp.getPin()+ " "+ cp.getMainBoard() + " Bluetooth " + cp.isBluetoothEnnable() + " Graphic "+ cp.isGraphicCardEnable());
	}

	

}

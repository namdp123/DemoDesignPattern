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
		System.out.println("Kết quả: "+cp.getHDD()+ " "+ cp.getRam() + " "+ cp.getPin()
		+ " "+ cp.getMainBoard() + " Bluetooth " + cp.isBluetoothEnnable() + " Graphic "+ cp.isGraphicCardEnable());
		
		//Demo Prototype
		System.out.println(" ");
		Address address  = new Address("Tay Thanh", "Tan Phu", "TP.HCM");
		SinhVien sv = new SinhVien("Nguyen Thi Thao Anh", "2001140", address, "20/11/1994");
		SinhVien svShallowCopy = sv.shallowCopy();
		SinhVien svDeepCopy = sv.deepCopy();
		System.out.println("Truoc khi thay doi");
		System.out.println("Sinh Vien " +sv.getHoTen() +" "+sv.getMSSV() +" "+ sv.getNgaySinh() +" "+sv.getDiaChi().getPhuong() 
				+" "+ sv.getDiaChi().getQuan() +" "+ sv.getDiaChi().getThanhPho());
		System.out.println("Shallow Copy: " + svShallowCopy.getDiaChi().getPhuong() + " "+ svShallowCopy.getDiaChi().getQuan() +
				" "+ svShallowCopy.getDiaChi().getThanhPho());
		System.out.println("Deep Copy: " + svDeepCopy.getDiaChi().getPhuong() +" "+ svDeepCopy.getDiaChi().getQuan() 
				+ " "+ svDeepCopy.getDiaChi().getThanhPho());
		
		System.out.println(" ");
		System.out.println("Sau khi shallow SV doi dia chi");
		svShallowCopy.getDiaChi().setQuan("Binh Tan");
		System.out.println("Sinh Vien: "+sv.getHoTen() +" "+sv.getMSSV() +" "+ sv.getNgaySinh() +" "+ sv.getDiaChi().getQuan());
		System.out.println("Shallow Copy: "+ svShallowCopy.getDiaChi().getPhuong() + " "+ svShallowCopy.getDiaChi().getQuan() +
				" "+ svShallowCopy.getDiaChi().getThanhPho());
		System.out.println("Deep Copy: " + svDeepCopy.getDiaChi().getPhuong() +" "+ svDeepCopy.getDiaChi().getQuan() 
				+ " "+ svDeepCopy.getDiaChi().getThanhPho());
		
		System.out.println(" ");
		System.out.println("Sau khi shallow SV doi dia chi");
		svDeepCopy.getDiaChi().setQuan("Quan 01");
		System.out.println("Sinh Vien: "+sv.getHoTen() +" "+sv.getMSSV() +" "+ sv.getNgaySinh() +" "+sv.getDiaChi().getPhuong() 
				+" "+ sv.getDiaChi().getQuan() +" "+ sv.getDiaChi().getThanhPho());
		System.out.println("Shallow Copy: "+ svShallowCopy.getDiaChi().getPhuong() + " "+ svShallowCopy.getDiaChi().getQuan() 
				+ " "+ svShallowCopy.getDiaChi().getThanhPho());
		System.out.println("Deep Copy: " + svDeepCopy.getDiaChi().getPhuong() +" "+ svDeepCopy.getDiaChi().getQuan() 
				+ " "+ svDeepCopy.getDiaChi().getThanhPho());
		
		//Demo Adapter
		System.out.println(" ");
		CheckPhone adapter = new Adapter();
		String input1 = "abc";
		String input2 = "01727374840054";
		String input3 = "01223456789";
		System.out.println(input1 +" la so dien thoai "+adapter.checkPhoneInput(input1));
		System.out.println(input2 +" la so dien thoai "+adapter.checkPhoneInput(input2));
		System.out.println(input3 +" la so dien thoai "+adapter.checkPhoneInput(input3));
		
		
	}

	

}

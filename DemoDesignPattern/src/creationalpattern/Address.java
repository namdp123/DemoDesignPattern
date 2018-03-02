package creationalpattern;

public class Address {
	private String phuong;
	private String quan;
	private String thanhPho;
	public Address (String phuong, String quan, String thanhPho) {
		this.setPhuong(phuong);
		this.setQuan(quan);
		this.setThanhPho(thanhPho);
	}
	public String getPhuong() {
		return phuong;
	}
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	public String getQuan() {
		return quan;
	}
	public void setQuan(String quan) {
		this.quan = quan;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}

}

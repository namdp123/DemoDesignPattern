package creationalpattern;

import java.util.*;

public class SinhVien {

	private String hoTen;
	private String MSSV;
	private String ngaySinh;
	private Address diaChi;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMSSV() {
		return MSSV;
	}
	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Address getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(Address diaChi) {
		this.diaChi = diaChi;
	}
	public SinhVien(String hoTen, String MSSV, Address diaChi, String ngaySinh) {
		this.hoTen = hoTen;
		this.MSSV = MSSV;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
	}
	public SinhVien shallowCopy() {
		SinhVien sinhvien = new SinhVien(this.hoTen, this.MSSV, this.diaChi, this.ngaySinh);
		return sinhvien;
	}
	public SinhVien deepCopy() {
		Address address = new Address(this.getDiaChi().getPhuong(), this.getDiaChi().getQuan(), this.getDiaChi().getThanhPho());
		SinhVien sinhvien = new SinhVien (this.hoTen, this.MSSV , address, this.ngaySinh);
		return sinhvien;
	}
	
	
}

package model.bean;

public class Student 
{
	String masv;
	String hoten,khoa,namsinh;
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	public Student(String _masv, String hoten, String khoa, String namsinh) {
		super();
		this.masv = _masv;
		this.hoten = hoten;
		this.khoa = khoa;
		this.namsinh = namsinh;
	}
	
}

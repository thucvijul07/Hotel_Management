package entity;

public class LoaiPhong {
	private String maLoaiPhong;
	private String tenLoaiPhong;
	private double donGia;
	//
	public String getMaLoaiPhong() {
		return maLoaiPhong;
	}
	public String getTenLoaiPhong() {
		return tenLoaiPhong;
	}
	public double getDonGia() {
		return donGia;
	}
	private void setMaLoaiPhong(String maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}
	private void setTenLoaiPhong(String tenLoaiPhong) {
		this.tenLoaiPhong = tenLoaiPhong;
	}
	private void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	//
	public LoaiPhong(String maLoaiPhong, String tenLoaiPhong, double donGia) {
		super();
		setMaLoaiPhong(maLoaiPhong);
		setTenLoaiPhong(tenLoaiPhong);
		setDonGia(donGia);
	}
	public LoaiPhong() {
		super();
	}
	//
	@Override
	public String toString() {
		return "LoaiPhong [maLoaiPhong=" + maLoaiPhong + ", tenLoaiPhong=" + tenLoaiPhong + ", donGia=" + donGia + "]";
	}
	
}

package entity;

import java.sql.Timestamp;

public class HoaDon {
	private int maHoaDon;
	private DonDatPhong donDatPhong;
	private double phuPhiMoiPhong;
	private double tongThanhTien;
	private Timestamp ngayDatPhong;
	private Timestamp ngayTraPhong;
	//
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public DonDatPhong getDonDatPhong() {
		return donDatPhong;
	}
	public double getPhuPhiMoiPhong() {
		return phuPhiMoiPhong;
	}
	public double getTongThanhTien() {
		return tongThanhTien;
	}
	public Timestamp getNgayDatPhong() {
		return ngayDatPhong;
	}
	public Timestamp getNgayTraPhong() {
		return ngayTraPhong;
	}
	private void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	private void setDonDatPhong(DonDatPhong donDatPhong) {
		this.donDatPhong = donDatPhong;
	}
	private void setPhuPhiMoiPhong(double phuPhiMoiPhong) {
		this.phuPhiMoiPhong = phuPhiMoiPhong;
	}
	private void setTongThanhTien(double tongThanhTien) {
		this.tongThanhTien = tongThanhTien;
	}
	private void setNgayDatPhong(Timestamp ngayDatPhong) {
		this.ngayDatPhong = ngayDatPhong;
	}
	private void setNgayTraPhong(Timestamp ngayTraPhong) {
		this.ngayTraPhong = ngayTraPhong;
	}
	//
	public HoaDon(int maHoaDon, DonDatPhong donDatPhong, double phuPhiMoiPhong, double tongThanhTien,
			Timestamp ngayDatPhong, Timestamp ngayTraPhong) {
		super();
		setMaHoaDon(maHoaDon);
		setDonDatPhong(donDatPhong);
		setPhuPhiMoiPhong(phuPhiMoiPhong);
		setTongThanhTien(tongThanhTien);
		setNgayDatPhong(ngayDatPhong);
		setNgayTraPhong(ngayTraPhong);
	}
	public HoaDon(DonDatPhong donDatPhong, double phuPhiMoiPhong, double tongThanhTien, Timestamp ngayDatPhong) {
		super();
		setDonDatPhong(donDatPhong);
		setPhuPhiMoiPhong(phuPhiMoiPhong);
		setTongThanhTien(tongThanhTien);
		setNgayDatPhong(ngayDatPhong);
	}
	public HoaDon() {
		super();
	}
	//
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", donDatPhong=" + donDatPhong + ", phuPhiMoiPhong=" + phuPhiMoiPhong
				+ ", tongThanhTien=" + tongThanhTien + ", ngayDatPhong=" + ngayDatPhong + ", ngayTraPhong="
				+ ngayTraPhong + "]";
	}
}

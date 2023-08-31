package entity;

import java.sql.Timestamp;

public class DonDatPhong {
	private int maDonDat;
	private KhachHang khachHang;
	private TiepTan tiepTan;
	private int soLuongKhach;
	private Enum_HinhThucThue hinhThucThue;
	private Enum_TrangThaiThanhToan trangThaiThanhToan;
	private Timestamp ngayDatPhong;
	//
	public int getMaDonDat() {
		return maDonDat;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public TiepTan getTiepTan() {
		return tiepTan;
	}
	public int getSoLuongKhach() {
		return soLuongKhach;
	}
	public Enum_HinhThucThue getHinhThucThue() {
		return hinhThucThue;
	}
	public Enum_TrangThaiThanhToan getTrangThaiThanhToan() {
		return trangThaiThanhToan;
	}
	public Timestamp getNgayDatPhong() {
		return ngayDatPhong;
	}
	private void setMaDonDat(int maDonDat) {
		this.maDonDat = maDonDat;
	}
	private void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	private void setTiepTan(TiepTan tiepTan) {
		this.tiepTan = tiepTan;
	}
	private void setSoLuongKhach(int soLuongKhach) {
		this.soLuongKhach = soLuongKhach;
	}
	private void setHinhThucThue(Enum_HinhThucThue hinhThucThue) {
		this.hinhThucThue = hinhThucThue;
	}
	private void setTrangThaiThanhToan(Enum_TrangThaiThanhToan trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}
	private void setNgayDatPhong(Timestamp ngayDatPhong) {
		this.ngayDatPhong = ngayDatPhong;
	}
	//
	public DonDatPhong(int maDonDat, KhachHang khachHang, TiepTan tiepTan, int soLuongKhach,
			Enum_HinhThucThue hinhThucThue, Enum_TrangThaiThanhToan trangThaiThanhToan, Timestamp ngayDatPhong) {
		super();
		setMaDonDat(maDonDat);
		setKhachHang(khachHang);
		setTiepTan(tiepTan);
		setSoLuongKhach(soLuongKhach);
		setHinhThucThue(hinhThucThue);
		setTrangThaiThanhToan(trangThaiThanhToan);
		setNgayDatPhong(ngayDatPhong);
	}
	public DonDatPhong(KhachHang khachHang, TiepTan tiepTan, int soLuongKhach, Enum_HinhThucThue hinhThucThue,
			Enum_TrangThaiThanhToan trangThaiThanhToan) {
		super();
		setKhachHang(khachHang);
		setTiepTan(tiepTan);
		setSoLuongKhach(soLuongKhach);
		setHinhThucThue(hinhThucThue);
		setTrangThaiThanhToan(trangThaiThanhToan);
	}
	public DonDatPhong(int maDonDat) {
		super();
		setMaDonDat(maDonDat);
	}
	public DonDatPhong() {
		super();
	}
	//
	@Override
	public String toString() {
		return "DonDatPhong [maDonDat=" + maDonDat + ", khachHang=" + khachHang + ", tiepTan=" + tiepTan
				+ ", soLuongKhach=" + soLuongKhach + ", hinhThucThue=" + hinhThucThue + ", trangThaiThanhToan="
				+ trangThaiThanhToan + ", ngayDatPhong=" + ngayDatPhong + "]";
	}
	//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maDonDat;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonDatPhong other = (DonDatPhong) obj;
		if (maDonDat != other.maDonDat)
			return false;
		return true;
	}
	
}

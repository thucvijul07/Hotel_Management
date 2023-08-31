package entity;

public class Phong {
	private String maPhong;
	private int soPhong;
	private int soTang;
	private String tenPhong;
	private Enum_TinhTrang tinhTrang;
	private LoaiPhong loaiPhong;
	//
	public String getMaPhong() {
		return maPhong;
	}
	public int getSoPhong() {
		return soPhong;
	}
	public int getSoTang() {
		return soTang;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public Enum_TinhTrang getTinhTrang() {
		return tinhTrang;
	}
	public LoaiPhong getLoaiPhong() {
		return loaiPhong;
	}
	private void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	private void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}
	private void setSoTang(int soTang) {
		this.soTang = soTang;
	}
	private void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	private void setTinhTrang(Enum_TinhTrang tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	private void setLoaiPhong(LoaiPhong loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	//
	public Phong(String maPhong, int soPhong, int soTang, String tenPhong, Enum_TinhTrang tinhTrang,
			LoaiPhong loaiPhong) {
		super();
		setMaPhong(maPhong);
		setSoPhong(soPhong);
		setSoTang(soTang);
		setTenPhong(tenPhong);
		setTinhTrang(tinhTrang);
		setLoaiPhong(loaiPhong);
	}
	public Phong(String maPhong) {
		super();
		setMaPhong(maPhong);
	}
	public Phong() {
		super();
	}
	//
	@Override
	public String toString() {
		return "Phong [maPhong=" + maPhong + ", soPhong=" + soPhong + ", soTang=" + soTang + ", tenPhong=" + tenPhong
				+ ", tinhTrang=" + tinhTrang + ", loaiPhong=" + loaiPhong + "]";
	}
	//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maPhong == null) ? 0 : maPhong.hashCode());
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
		Phong other = (Phong) obj;
		if (maPhong == null) {
			if (other.maPhong != null)
				return false;
		} else if (!maPhong.equals(other.maPhong))
			return false;
		return true;
	}
}

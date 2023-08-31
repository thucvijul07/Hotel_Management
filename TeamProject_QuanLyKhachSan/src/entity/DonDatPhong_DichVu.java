package entity;

public class DonDatPhong_DichVu {
	private int id;
	private DonDatPhong donDatPhong;
	private DichVu dichVu;
	private Phong phongDat;
	private int soLuong;
	//
	public int getId() {
		return id;
	}
	public DonDatPhong getDonDatPhong() {
		return donDatPhong;
	}
	public DichVu getDichVu() {
		return dichVu;
	}
	public Phong getPhongDat() {
		return phongDat;
	}
	public int getSoLuong() {
		return soLuong;
	}
	private void setId(int id) {
		this.id = id;
	}
	private void setDonDatPhong(DonDatPhong donDatPhong) {
		this.donDatPhong = donDatPhong;
	}
	private void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}
	private void setPhongDat(Phong phongDat) {
		this.phongDat = phongDat;
	}
	private void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	//
	public DonDatPhong_DichVu(int id, DonDatPhong donDatPhong, DichVu dichVu, Phong phongDat, int soLuong) {
		super();
		setId(id);
		setDonDatPhong(donDatPhong);
		setDichVu(dichVu);
		setPhongDat(phongDat);
		setSoLuong(soLuong);
	}
	public DonDatPhong_DichVu(DonDatPhong donDatPhong, DichVu dichVu, Phong phongDat, int soLuong) {
		super();
		setDonDatPhong(donDatPhong);
		setDichVu(dichVu);
		setPhongDat(phongDat);
		setSoLuong(soLuong);
	}
	public DonDatPhong_DichVu() {
		super();
	}
	//
	@Override
	public String toString() {
		return "DonDatPhong_DichVu [id=" + id + ", donDatPhong=" + donDatPhong + ", dichVu=" + dichVu + ", phongDat="
				+ phongDat + ", soLuong=" + soLuong + "]";
	}
}

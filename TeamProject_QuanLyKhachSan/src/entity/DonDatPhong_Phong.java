package entity;

public class DonDatPhong_Phong {
	private int id;
	private DonDatPhong donDatPhong;
	private Phong phongDat;
	//
	public int getId() {
		return id;
	}
	public DonDatPhong getDonDatPhong() {
		return donDatPhong;
	}
	public Phong getPhongDat() {
		return phongDat;
	}
	private void setId(int id) {
		this.id = id;
	}
	private void setDonDatPhong(DonDatPhong donDatPhong) {
		this.donDatPhong = donDatPhong;
	}
	private void setPhongDat(Phong phongDat) {
		this.phongDat = phongDat;
	}
	//
	public DonDatPhong_Phong(int id, DonDatPhong donDatPhong, Phong phongDat) {
		super();
		setId(id);
		setDonDatPhong(donDatPhong);
		setPhongDat(phongDat);
	}
	public DonDatPhong_Phong(DonDatPhong donDatPhong, Phong phongDat) {
		super();
		setDonDatPhong(donDatPhong);
		setPhongDat(phongDat);
	}
	public DonDatPhong_Phong() {
		super();
	}
	//
	@Override
	public String toString() {
		return "DonDatPhong_Phong [id=" + id + ", donDatPhong=" + donDatPhong + ", phongDat=" + phongDat + "]";
	}
}

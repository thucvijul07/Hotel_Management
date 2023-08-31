package entity;

public class DichVu {
	private String maDichVu;
	private String tenDichVu;
	private double donGia;
	private Enum_LoaiDichVu LoaiDichVu;
	//
	public String getMaDichVu() {
		return maDichVu;
	}
	public String getTenDichVu() {
		return tenDichVu;
	}
	public double getDonGia() {
		return donGia;
	}
	public Enum_LoaiDichVu getLoaiDichVu() {
		return LoaiDichVu;
	}
	private void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}
	private void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	private void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	private void setLoaiDichVu(Enum_LoaiDichVu loaiDichVu) {
		LoaiDichVu = loaiDichVu;
	}
	//
	public DichVu(String maDichVu, String tenDichVu, double donGia, Enum_LoaiDichVu loaiDichVu) {
		super();
		setMaDichVu(maDichVu);
		setTenDichVu(tenDichVu);
		setDonGia(donGia);
		setLoaiDichVu(loaiDichVu);
	}
	public DichVu() {
		super();
	}
	//
	@Override
	public String toString() {
		return "DichVu [maDichVu=" + maDichVu + ", tenDichVu=" + tenDichVu + ", donGia=" + donGia + ", LoaiDichVu="
				+ LoaiDichVu + "]";
	}
}

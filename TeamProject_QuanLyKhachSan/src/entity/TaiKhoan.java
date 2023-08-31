package entity;

public class TaiKhoan {
	private String maTaiKhoan;
	private String tenTaiKhoan;
	//
	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	private void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}
	private void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	//
	public TaiKhoan(String maTaiKhoan, String tenTaiKhoan) {
		super();
		setMaTaiKhoan(maTaiKhoan);
		setTenTaiKhoan(tenTaiKhoan);
	}
	public TaiKhoan() {
		super();
	}
	//
	@Override
	public String toString() {
		return "TaiKhoan [maTaiKhoan=" + maTaiKhoan + ", tenTaiKhoan=" + tenTaiKhoan + "]";
	}
}

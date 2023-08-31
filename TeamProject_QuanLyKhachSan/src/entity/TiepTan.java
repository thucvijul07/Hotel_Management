package entity;

public class TiepTan {
	private String maTiepTan;
	private String hoDem;
	private String ten;
	private String cccd;
	private String sdt;
	private TaiKhoan taiKhoan;
	//
	public String getMaTiepTan() {
		return maTiepTan;
	}
	public String getHoDem() {
		return hoDem;
	}
	public String getTen() {
		return ten;
	}
	public String getCccd() {
		return cccd;
	}
	public String getSdt() {
		return sdt;
	}
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}
	private void setMaTiepTan(String maTiepTan) {
		this.maTiepTan = maTiepTan;
	}
	private void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}
	private void setTen(String ten) {
		this.ten = ten;
	}
	private void setCccd(String cccd) {
		this.cccd = cccd;
	}
	private void setSdt(String sdt) {
		this.sdt = sdt;
	}
	private void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	//
	public TiepTan(String maTiepTan, String hoDem, String ten, String cccd, String sdt, TaiKhoan taiKhoan) {
		super();
		setMaTiepTan(maTiepTan);
		setHoDem(hoDem);
		setTen(ten);
		setCccd(cccd);
		setSdt(sdt);
		setTaiKhoan(taiKhoan);
	}
	public TiepTan(String maTiepTan) {
		super();
		setMaTiepTan(maTiepTan);
	}
	public TiepTan() {
		super();
	}
	//
	@Override
	public String toString() {
		return "TiepTan [maTiepTan=" + maTiepTan + ", hoDem=" + hoDem + ", ten=" + ten + ", cccd=" + cccd + ", sdt="
				+ sdt + ", taiKhoan=" + taiKhoan + "]";
	}
	//
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maTiepTan == null) ? 0 : maTiepTan.hashCode());
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
		TiepTan other = (TiepTan) obj;
		if (maTiepTan == null) {
			if (other.maTiepTan != null)
				return false;
		} else if (!maTiepTan.equals(other.maTiepTan))
			return false;
		return true;
	}
	
}

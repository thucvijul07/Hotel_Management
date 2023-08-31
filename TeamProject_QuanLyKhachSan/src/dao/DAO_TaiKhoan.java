package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectDB.ConnectDB;
import entity.TaiKhoan;

public class DAO_TaiKhoan {
	public DAO_TaiKhoan() {}
	private static TaiKhoan taiKhoanHienHanh = null;
	public static TaiKhoan getTaiKhoanHienHanh() {
		return taiKhoanHienHanh;
	}
	private static void setTaiKhoanHienHanh(TaiKhoan thisTaiKhoan) {
		taiKhoanHienHanh = thisTaiKhoan;
	}
	public static boolean kiemTraTaiKhoan(String username, String password) {
		Connection connect = ConnectDB.getConnection();
		boolean tonTai = false;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM TaiKhoan "
					+ "WHERE TenTaiKhoan = ? AND  MatKhauTaiKhoan = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setString(1, username);
			prpStm.setString(2, password);
			ResultSet result = prpStm.executeQuery();
			if(result.next()) {
				setTaiKhoanHienHanh(new TaiKhoan(result.getString("MaTaiKhoan"), result.getString("TenTaiKhoan")));
				tonTai=true;
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			
		}
		return tonTai;
	}
	public static TaiKhoan getTaiKhoanTheoMaTaiKhoan(String thisMaTaiKhoan) {
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM TaiKhoan "
					+ "WHERE MaTaiKhoan = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setString(1, thisMaTaiKhoan);
			ResultSet result = prpStm.executeQuery();
			
			while(result.next()) {
				String maTaiKhoan = result.getString("MaTaiKhoan");
				String tenTaiKhoan = result.getString("TenTaiKhoan");
				TaiKhoan taiKhoan = new TaiKhoan(maTaiKhoan, tenTaiKhoan);
				
				rowCount++;
				
				return taiKhoan;
			}
			if(rowCount == 0) return null;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			
		}
		return null;
	}
}

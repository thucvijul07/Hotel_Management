package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.KhachHang;

public class DAO_KhachHang {
	public DAO_KhachHang() {}
	public static ArrayList<KhachHang> getDanhSachKhachHang(){
		ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM KhachHang";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				int maKhachHang = result.getInt("MaKhachHang");
				String hoDem = result.getString("HoDem");
				String ten = result.getString("Ten");
				String cccd = result.getString("CCCD");
				String sdt = result.getString("SDT");
				String quocTich = result.getString("QuocTich");
				
				KhachHang khachHang = new KhachHang(maKhachHang, hoDem, ten, cccd, sdt, quocTich);
				
				listKH.add(khachHang);
				
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			
		}
		return listKH;
	}
	public static KhachHang getKhachHangTheoMaKhachHang(int thisMaKhachHang) {
		ArrayList<KhachHang> listKH = DAO_KhachHang.getDanhSachKhachHang();
		KhachHang khachHang = new KhachHang(thisMaKhachHang);
		if(listKH.contains(khachHang)) return listKH.get(listKH.indexOf(khachHang));
		else return null;
	}
	
	public static KhachHang getKhachHangTheoCCCD(String cccd) {
		ArrayList<KhachHang> listKH = DAO_KhachHang.getDanhSachKhachHang();
		for(KhachHang thisKhachHang : listKH)
			if(thisKhachHang.getCccd().equals(cccd))
				return thisKhachHang;
		return null;
	}
	
	public static boolean createKhachHang(KhachHang khachHang) {
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n =0;
		try {
			statement = con.prepareStatement("INSERT INTO KhachHang(HoDem, Ten, CCCD, SDT, QuocTich) VALUES(?,?,?,?,?)");
			//MaKhachHang là cột tăng tự động không cần thêm vào
			statement.setString(1, khachHang.getHoDem());
			statement.setString(2, khachHang.getTen());
			statement.setString(3, khachHang.getCccd());
			statement.setString(4, khachHang.getSdt());
			statement.setString(5, khachHang.getQuocTich());
			n = statement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
			} catch ( SQLException e) {
				e.printStackTrace();
			}
		}
		return n>0;
	}
	
	public static int getNewKhachHang() {
		int maKhachHang=0;
		try {
			Connection connection = ConnectDB.getConnection();
			String sql = "SELECT TOP 1 MaKhachHang "
					+ "FROM [dbo].[KhachHang] "
					+ "ORDER BY MaKhachHang DESC";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if (rs.next()) {
				maKhachHang = rs.getInt(1);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return maKhachHang;
	}
	
	public boolean updateKhachHang(KhachHang khachHang) {
		Connection con = ConnectDB.getConnection();
		PreparedStatement statement = null;
		int n =0;
		try {
			statement = con.prepareStatement("UPDATE KhachHang SET HoDem=?, Ten=?, CCCD=?, SDT=?, QuocTich=? WHERE MaKhachHang=?");
			statement.setString(1, khachHang.getHoDem());
			statement.setString(2, khachHang.getTen());
			statement.setString(3, khachHang.getCccd());
			statement.setString(4, khachHang.getSdt());
			statement.setString(5, khachHang.getQuocTich());
			statement.setInt(6, khachHang.getMaKhachHang());
			n = statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
			}
			catch ( SQLException e) {
				e.printStackTrace();
			}
		}
		return n>0;
	}
	
	public static boolean kiemTraKhachHangDaTonTai(String cccd) {
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM KhachHang "
					+ "WHERE CCCD = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setString(1, cccd);
			ResultSet result = prpStm.executeQuery();
			
			while(result.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static ArrayList<KhachHang> getDanhSachKhachHangDatPhongTrongNgay(){
		ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT DISTINCT MaKhachHang "
					+ "FROM DonDatPhong "
					+ "WHERE DAY(NgayDatPhong) = DAY(GETDATE()) AND MONTH(NgayDatPhong) = MONTH(GETDATE()) AND YEAR(NgayDatPhong) = YEAR(GETDATE())";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				int maKhachHang = result.getInt("MaKhachHang");
				KhachHang khachHang = getKhachHangTheoMaKhachHang(maKhachHang);
				listKH.add(khachHang);
				
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			
		}
		return listKH;
	}
}

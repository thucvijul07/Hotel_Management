package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.DonDatPhong;
import entity.HoaDon;

public class DAO_HoaDon {
	DAO_HoaDon(){}
	public static ArrayList<HoaDon> getDanhSachHoaDon(){
		ArrayList<HoaDon> listHD = new ArrayList<HoaDon>();
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM HoaDon";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			int rowCount = 0;
			while(result.next()) {
				int maHoaDon = result.getInt("MaHoaDon");
				int maDonDat = result.getInt("MaDonDat");
				double phuPhi = result.getDouble("PhuPhi");
				double tongThanhTien = result.getDouble("TongThanhTien");
				Timestamp ngayDatPhong = result.getTimestamp("NgayDatPhong");
				Timestamp ngayTraPhong = result.getTimestamp("NgayTraPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				
				HoaDon tempHoaDon = new HoaDon(maHoaDon, donDatPhong, phuPhi, tongThanhTien, ngayDatPhong, ngayTraPhong);
				listHD.add(tempHoaDon);
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return listHD;
	}
	public static HoaDon getHoaDonTheoMaHoaDon(int maHoaDonCanTim) {
		HoaDon tempHoaDon = new HoaDon();
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM HoaDon "
					+ "WHERE MaHoaDon = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, maHoaDonCanTim);
			ResultSet result = prpStm.executeQuery();
			int rowCount = 0;
			while(result.next()) {
				int maHoaDon = result.getInt("MaHoaDon");
				int maDonDat = result.getInt("MaDonDat");
				double phuPhi = result.getDouble("PhuPhi");
				double tongThanhTien = result.getDouble("TongThanhTien");
				Timestamp ngayDatPhong = result.getTimestamp("NgayDatPhong");
				Timestamp ngayTraPhong = result.getTimestamp("NgayTraPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				
				tempHoaDon = new HoaDon(maHoaDon, donDatPhong, phuPhi, tongThanhTien, ngayDatPhong, ngayTraPhong);
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return tempHoaDon;
	}
	public static HoaDon getHoaDonTheoMaDonDat(int maDonDatCanTim) {
		HoaDon tempHoaDon = new HoaDon();
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM HoaDon "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, maDonDatCanTim);
			ResultSet result = prpStm.executeQuery();
			int rowCount = 0;
			while(result.next()) {
				int maHoaDon = result.getInt("MaHoaDon");
				int maDonDat = result.getInt("MaDonDat");
				double phuPhi = result.getDouble("PhuPhi");
				double tongThanhTien = result.getDouble("TongThanhTien");
				Timestamp ngayDatPhong = result.getTimestamp("NgayDatPhong");
				Timestamp ngayTraPhong = result.getTimestamp("NgayTraPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				
				tempHoaDon = new HoaDon(maHoaDon, donDatPhong, phuPhi, tongThanhTien, ngayDatPhong, ngayTraPhong);
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return tempHoaDon;
	}
	public static void insertNewHoaDon(HoaDon newHoaDon) {
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "INSERT INTO HoaDon(MaDonDat, PhuPhi, TongThanhTien, NgayDatPhong) "
					+ "VALUES (?, ?, ?, ?)";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			//Mã Hóa đơn cột tăng tự động không cần thêm
			prpStm.setInt(1, newHoaDon.getDonDatPhong().getMaDonDat());
			prpStm.setDouble(2, newHoaDon.getPhuPhiMoiPhong());
			prpStm.setDouble(3, newHoaDon.getTongThanhTien());
			prpStm.setTimestamp(4, newHoaDon.getNgayDatPhong());
			//Ngày trả phòng cột tăng tự động không cần thêm
			prpStm.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
	public static ArrayList<HoaDon> getDanhSachHoaDonTheoThangVaNam(int thang, int nam){
		ArrayList<HoaDon> listHD = new ArrayList<HoaDon>();
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM HoaDon "
					+ "WHERE MONTH(NgayTraPhong) = ? AND YEAR(NgayTraPhong) = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, thang);
			prpStm.setInt(2, nam);
			ResultSet result = prpStm.executeQuery();
			int rowCount = 0;
			while(result.next()) {
				int maHoaDon = result.getInt("MaHoaDon");
				int maDonDat = result.getInt("MaDonDat");
				double phuPhi = result.getDouble("PhuPhi");
				double tongThanhTien = result.getDouble("TongThanhTien");
				Timestamp ngayDatPhong = result.getTimestamp("NgayDatPhong");
				Timestamp ngayTraPhong = result.getTimestamp("NgayTraPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				
				HoaDon thisHoaDon = new HoaDon(maHoaDon, donDatPhong, phuPhi, tongThanhTien, ngayDatPhong, ngayTraPhong);
				
				listHD.add(thisHoaDon);
				
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return listHD;
	}
	public static ArrayList<HoaDon> getDanhSachHoaDonTheoNam(int nam){
		ArrayList<HoaDon> listHD = new ArrayList<HoaDon>();
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM HoaDon "
					+ "WHERE YEAR(NgayTraPhong) = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, nam);
			ResultSet result = prpStm.executeQuery();
			int rowCount = 0;
			while(result.next()) {
				int maHoaDon = result.getInt("MaHoaDon");
				int maDonDat = result.getInt("MaDonDat");
				double phuPhi = result.getDouble("PhuPhi");
				double tongThanhTien = result.getDouble("TongThanhTien");
				Timestamp ngayDatPhong = result.getTimestamp("NgayDatPhong");
				Timestamp ngayTraPhong = result.getTimestamp("NgayTraPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				
				HoaDon thisHoaDon = new HoaDon(maHoaDon, donDatPhong, phuPhi, tongThanhTien, ngayDatPhong, ngayTraPhong);
				
				listHD.add(thisHoaDon);
				
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return listHD;
	}
}

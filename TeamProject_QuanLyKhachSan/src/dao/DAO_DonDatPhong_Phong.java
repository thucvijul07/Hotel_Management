package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.DonDatPhong;
import entity.DonDatPhong_Phong;
import entity.Phong;

public class DAO_DonDatPhong_Phong {
	DAO_DonDatPhong_Phong(){}
	public static ArrayList<DonDatPhong_Phong> getDanhSachPhongDat(){
		ArrayList<DonDatPhong_Phong> listDP = new ArrayList<DonDatPhong_Phong>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong_Phong";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				int id = result.getInt("ID");
				int maDonDat = result.getInt("MaDonDat");
				String maPhong = result.getString("MaPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				Phong phong = DAO_Phong.getPhongTheoMaPhong(maPhong);
				
				DonDatPhong_Phong donDatPhong_Phong = new DonDatPhong_Phong(id, donDatPhong, phong);
				
				listDP.add(donDatPhong_Phong);
				
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			
		}
		return listDP;
	}
	
	public static ArrayList<DonDatPhong_Phong> getDanhSachPhongDatTheoMaDonDat(int thisMaDonDat){
		ArrayList<DonDatPhong_Phong> listDP = new ArrayList<DonDatPhong_Phong>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong_Phong "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, thisMaDonDat);
			ResultSet result = prpStm.executeQuery();
			
			while(result.next()) {
				int id = result.getInt("ID");
				int maDonDat = result.getInt("MaDonDat");
				String maPhong = result.getString("MaPhong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				Phong phong = DAO_Phong.getPhongTheoMaPhong(maPhong);
				
				DonDatPhong_Phong donDatPhong_Phong = new DonDatPhong_Phong(id, donDatPhong, phong);
				
				listDP.add(donDatPhong_Phong);
				
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		finally {
			
		}
		return listDP;
	}
	
	public static int getMaDonDatGanNhatCuaPhong(String maPhongCanTim) {
		int maPhong = 0;
		try {
			
			Connection connect = ConnectDB.getConnection();
			String sql = "SELECT TOP 1 * "
					+ "FROM DonDatPhong_Phong "
					+ "WHERE MaPhong = ? "
					+ "ORDER BY ID DESC";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setString(1, maPhongCanTim);
			ResultSet result = prpStm.executeQuery();
			while(result.next()) {
				maPhong = result.getInt("MaDonDat");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return maPhong;
	}
	
	public static boolean createDonDatPhong_Phong(DonDatPhong_Phong donDatPhong_Phong) {
		Connection connection = ConnectDB.getConnection();
		int n = 0;
		try {
			String sql = ""
					+ "INSERT INTO DonDatPhong_Phong (MaDonDat, MaPhong) "
					+ "VALUES (?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, donDatPhong_Phong.getDonDatPhong().getMaDonDat());
			statement.setString(2, donDatPhong_Phong.getPhongDat().getMaPhong());
			n = statement.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return n>0;
	}
	
	public static boolean deleteDonDatPhong_Phong(int maDonDat) {
		Connection connection = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "DELETE FROM DonDatPhong_Phong "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connection.prepareStatement(sql);
			prpStm.setInt(1, maDonDat);
			rowCount = prpStm.executeUpdate();
			if(rowCount == 0) return false;
			else return true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static int tongSoPhongTrongMotDonDat(int thisMaDonDat) {
		int tongSoPhong = 0;
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong_Phong "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, thisMaDonDat);
			ResultSet result = prpStm.executeQuery();
			while(result.next())
				tongSoPhong++;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			
		}
		return tongSoPhong;
	}
}

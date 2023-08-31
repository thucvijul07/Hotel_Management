package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.DichVu;
import entity.DonDatPhong;
import entity.DonDatPhong_DichVu;
import entity.Phong;

public class DAO_DonDatPhong_DichVu {
	DAO_DonDatPhong_DichVu(){}
	public static ArrayList<DonDatPhong_DichVu> getDanhSachDichVuDat(){
		ArrayList<DonDatPhong_DichVu> listDDV = new ArrayList<DonDatPhong_DichVu>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong_DichVu";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
		
			while(result.next()) {
				int id = result.getInt("ID");
				int maDonDat = result.getInt("MaDonDat");
				String maDichVu = result.getString("MaDichVu");
				String maPhong = result.getString("MaPhong");
				int soLuong = result.getInt("SoLuong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				DichVu dichVu = DAO_DichVu.getDichVuTheoMaDichVu(maDichVu);
				Phong phong = DAO_Phong.getPhongTheoMaPhong(maPhong);
				
				DonDatPhong_DichVu donDatPhong_DichVu = new DonDatPhong_DichVu(id, donDatPhong, dichVu, phong, soLuong);
				
				listDDV.add(donDatPhong_DichVu);
				
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
		return listDDV;
	}
	
	public static ArrayList<DonDatPhong_DichVu> getDanhSachDichVuDatTheoMaDonDat(int thisMaDonDat){
		ArrayList<DonDatPhong_DichVu> listDDV = new ArrayList<DonDatPhong_DichVu>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong_DichVu "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, thisMaDonDat);
			ResultSet result = prpStm.executeQuery();
		
			while(result.next()) {
				int id = result.getInt("ID");
				int maDonDat = result.getInt("MaDonDat");
				String maDichVu = result.getString("MaDichVu");
				String maPhong = result.getString("MaPhong");
				int soLuong = result.getInt("SoLuong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				DichVu dichVu = DAO_DichVu.getDichVuTheoMaDichVu(maDichVu);
				Phong phong = DAO_Phong.getPhongTheoMaPhong(maPhong);
				
				DonDatPhong_DichVu donDatPhong_DichVu = new DonDatPhong_DichVu(id, donDatPhong, dichVu, phong, soLuong);
				
				listDDV.add(donDatPhong_DichVu);
				
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
		return listDDV;
	}
	
	public static ArrayList<DonDatPhong_DichVu> getDanhSachDichVuDatTheoMaDonDatMaPhong(int thisMaDonDat, String thisMaPhongDat){
		ArrayList<DonDatPhong_DichVu> listDDV = new ArrayList<DonDatPhong_DichVu>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong_DichVu "
					+ "WHERE MaDonDat = ? AND MaPhong = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, thisMaDonDat);
			prpStm.setString(2, thisMaPhongDat);
			ResultSet result = prpStm.executeQuery();
		
			while(result.next()) {
				int id = result.getInt("ID");
				int maDonDat = result.getInt("MaDonDat");
				String maDichVu = result.getString("MaDichVu");
				String maPhong = result.getString("MaPhong");
				int soLuong = result.getInt("SoLuong");
				
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				DichVu dichVu = DAO_DichVu.getDichVuTheoMaDichVu(maDichVu);
				Phong phong = DAO_Phong.getPhongTheoMaPhong(maPhong);
				
				DonDatPhong_DichVu donDatPhong_DichVu = new DonDatPhong_DichVu(id, donDatPhong, dichVu, phong, soLuong);
				
				listDDV.add(donDatPhong_DichVu);
				
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
		return listDDV;
	}
	
	public static boolean insertDonDatPhong_DichVu(DonDatPhong_DichVu thisDDV) {
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "INSERT INTO DonDatPhong_DichVu(MaDonDat, MaDichVu, MaPhong, SoLuong) "
					+ "VALUES (?, ?, ?, ?)";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setInt(1, thisDDV.getDonDatPhong().getMaDonDat());
			prpStm.setString(2, thisDDV.getDichVu().getMaDichVu());
			prpStm.setString(3, thisDDV.getPhongDat().getMaPhong());
			prpStm.setInt(4, thisDDV.getSoLuong());
			
			rowCount = prpStm.executeUpdate();
			
			if(rowCount > 0) return true;
			else return false;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			
		}
	}
}

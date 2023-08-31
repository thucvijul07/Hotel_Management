package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.DichVu;
import entity.Enum_LoaiDichVu;

public class DAO_DichVu {
public DAO_DichVu() {}
	public static ArrayList<DichVu> getAllDSDichVu() {
		ArrayList<DichVu> listDV = new ArrayList<DichVu>();
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "select * from DichVu";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String maDV = rs.getString("MaDichVu");
				String tenDV = rs.getString("TenDichVu");
				double donGia = rs.getDouble("DonGia");
				String loaiDV = rs.getString("LoaiDichVu");
				
				Enum_LoaiDichVu loaiDichVu = null;
				if (loaiDV.equals("Foods")) {
					loaiDichVu = Enum_LoaiDichVu.Foods;
				}
				if (loaiDV.equals("Drinks")) {
					loaiDichVu = Enum_LoaiDichVu.Drinks;
				}
				if (loaiDV.equals("Others")) {
					loaiDichVu = Enum_LoaiDichVu.Others;
				}
				
				DichVu dv = new DichVu(maDV, tenDV, donGia, loaiDichVu);
				listDV.add(dv);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listDV;
	}
	
	public static ArrayList<DichVu> getDSDichVuTheoThucAn() {
		ArrayList<DichVu> listDV = new ArrayList<DichVu>();
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "select * from DichVu where LoaiDichVu like 'Foods'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String maDV = rs.getString("MaDichVu");
				String tenDV = rs.getString("TenDichVu");
				double donGia = rs.getDouble("DonGia");
				String loaiDV = rs.getString("LoaiDichVu");
				
				Enum_LoaiDichVu loaiDichVu = null;
				if (loaiDV.equals("Foods")) {
					loaiDichVu = Enum_LoaiDichVu.Foods;
				}
				
				DichVu dv = new DichVu(maDV, tenDV, donGia, loaiDichVu);
				listDV.add(dv);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listDV;
	}
	
	public static ArrayList<DichVu> getDSDichVuTheoDoUong() {
		ArrayList<DichVu> listDV = new ArrayList<DichVu>();
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "select * from DichVu where LoaiDichVu like 'Drinks'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String maDV = rs.getString("MaDichVu");
				String tenDV = rs.getString("TenDichVu");
				double donGia = rs.getDouble("DonGia");
				String loaiDV = rs.getString("LoaiDichVu");
				
				Enum_LoaiDichVu loaiDichVu = null;
				if (loaiDV.equals("Drinks")) {
					loaiDichVu = Enum_LoaiDichVu.Drinks;
				}
				
				DichVu dv = new DichVu(maDV, tenDV, donGia, loaiDichVu);
				listDV.add(dv);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listDV;
	}
	
	public static ArrayList<DichVu> getDSDichVuConLai() {
		ArrayList<DichVu> listDV = new ArrayList<DichVu>();
		try {
			Connection con = ConnectDB.getConnection();
			String sql = "select * from DichVu where LoaiDichVu like 'Others'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String maDV = rs.getString("MaDichVu");
				String tenDV = rs.getString("TenDichVu");
				double donGia = rs.getDouble("DonGia");
				String loaiDV = rs.getString("LoaiDichVu");
				
				Enum_LoaiDichVu loaiDichVu = null;
				if (loaiDV.equals("Others")) {
					loaiDichVu = Enum_LoaiDichVu.Others;
				}
				DichVu dv = new DichVu(maDV, tenDV, donGia, loaiDichVu);
				listDV.add(dv);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return listDV;
	}
	
	public static DichVu getDichVuTheoMaDichVu(String maDichVu) {
		ArrayList<DichVu> listDV = getAllDSDichVu();
		for(DichVu thisDichVu : listDV) {
			if(thisDichVu.getMaDichVu().equals(maDichVu)) {
				return thisDichVu;
			}
		}
		return null;
	}
}

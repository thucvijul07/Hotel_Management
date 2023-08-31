package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.Enum_TinhTrang;
import entity.Phong;

public class DAO_Phong {
	public DAO_Phong() {}
	public static ArrayList<Phong> getDanhSachPhong(){
		ArrayList<Phong> listP = new ArrayList<Phong>();
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM Phong";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			int rowCount = 0;
			while(result.next()) {
				String maPhong = result.getString("MaPhong");
				int soPhong = result.getInt("SoPhong");
				int soTang = result.getInt("SoTang");
				String tenPhong = result.getString("TenPhong");
				
				Enum_TinhTrang enumtinhTrang = null;
				String tinhTrang = result.getString("TinhTrang");
				if(tinhTrang.equals("Available"))
					enumtinhTrang = Enum_TinhTrang.Available;
				if(tinhTrang.equals("Booked"))
					enumtinhTrang = Enum_TinhTrang.Booked;
				if(tinhTrang.equals("Not Available"))
					enumtinhTrang = Enum_TinhTrang.Not_Available;
				
				String maLoaiPhong = result.getString("MaLoaiPhong");
				
				Phong tempPhong = new Phong(maPhong, soPhong, soTang, tenPhong, enumtinhTrang, DAO_LoaiPhong.getLoaiPhongTheoMaLoaiPhong(maLoaiPhong));
				rowCount++;
				listP.add(tempPhong);
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return listP;
	}
	public static Phong getPhongTheoMaPhong(String maPhongCanTim) {
		Phong tempPhong = new Phong();
		
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM Phong "
					+ "WHERE MaPhong = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setString(1, maPhongCanTim);
			ResultSet result = prpStm.executeQuery();
			int rowCount = 0;
			while(result.next()) {
				String maPhong = result.getString("MaPhong");
				int soPhong = result.getInt("SoPhong");
				int soTang = result.getInt("SoTang");
				String tenPhong = result.getString("TenPhong");
				Enum_TinhTrang enumtinhTrang = null;
				String tinhTrang = result.getString("TinhTrang");
				if(tinhTrang.equals("Available"))
					enumtinhTrang = Enum_TinhTrang.Available;
				if(tinhTrang.equals("Booked"))
					enumtinhTrang = Enum_TinhTrang.Booked;
				if(tinhTrang.equals("Not Available"))
					enumtinhTrang = Enum_TinhTrang.Not_Available;				
				String maLoaiPhong = result.getString("MaLoaiPhong");
				tempPhong = new Phong(maPhong, soPhong, soTang, tenPhong, enumtinhTrang, DAO_LoaiPhong.getLoaiPhongTheoMaLoaiPhong(maLoaiPhong));
				rowCount++;
			}
			if(rowCount == 0) return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return tempPhong;
	}
	
	public static ArrayList<Phong> filterPhong(String trangThai, String loaiPhong) {
		ArrayList<Phong> listPhong = DAO_Phong.getDanhSachPhong();
		ArrayList<Phong> listFilterTrangThai = new ArrayList<Phong>();
		ArrayList<Phong> listFilterLoaiPhong = new ArrayList<Phong>();
		if(!trangThai.equals("Tất cả")) {
			for(Phong thisPhong : listPhong) {
				if(thisPhong.getTinhTrang().toString().equals(trangThai))
					listFilterTrangThai.add(thisPhong);
			}
		}
		else
			listFilterTrangThai = listPhong;
		if(!loaiPhong.equals("Tất cả")) {
			for(Phong thisPhong : listFilterTrangThai) {
				if(thisPhong.getLoaiPhong().getTenLoaiPhong().equals(loaiPhong))
					listFilterLoaiPhong.add(thisPhong);
			}
		}
		else
			listFilterLoaiPhong = listFilterTrangThai;
		return listFilterLoaiPhong;
	}
	public static boolean updatePhongToBooked(Phong phong) {
		Connection connection = ConnectDB.getConnection();
		int n = 0;
		try {
			String sql = "UPDATE [dbo].[Phong] "
					+ "SET [TinhTrang] = N'Booked' "
					+ "WHERE [MaPhong] = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, phong.getMaPhong());
			n = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n>0;
	}
	public static boolean updatePhongToAvailable(Phong phong) {
		Connection connection = ConnectDB.getConnection();
		int n = 0;
		try {
			String sql = "UPDATE [dbo].[Phong] "
					+ "SET [TinhTrang] = N'Available' "
					+ "WHERE [MaPhong] = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, phong.getMaPhong());
			n = statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n>0;
	}
}

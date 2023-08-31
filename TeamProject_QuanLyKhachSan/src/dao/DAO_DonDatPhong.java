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
import entity.Enum_HinhThucThue;
import entity.Enum_TrangThaiThanhToan;
import entity.KhachHang;
import entity.TiepTan;

public class DAO_DonDatPhong {
	public DAO_DonDatPhong() {}
	public static ArrayList<DonDatPhong> getDanhSachDonDatPhong() {
		ArrayList<DonDatPhong> listDDP = new ArrayList<DonDatPhong>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM DonDatPhong";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				int maDonDat = result.getInt("MaDonDat");
				int maKhachhang = result.getInt("MaKhachHang");
				String maTiepTan = result.getString("MaTiepTan");
				int soLuongKhach = result.getInt("SoLuongKhach");
				String stringHinhThucThue = result.getString("HinhThucThue");
				String stringTrangThaiThanhToan = result.getString("TrangThaiThanhToan");
				Timestamp ngayDat = result.getTimestamp("NgayDatPhong");
				
				KhachHang khachHang = DAO_KhachHang.getKhachHangTheoMaKhachHang(maKhachhang);
				TiepTan tiepTan = DAO_TiepTan.getTiepTanTheoMaTiepTan(maTiepTan);
				
				Enum_HinhThucThue hinhThucThue = null;
				if(stringHinhThucThue.equals("Theo giờ"))
					hinhThucThue = Enum_HinhThucThue.Hours;
				if(stringHinhThucThue.equals("Theo ngày"))
					hinhThucThue = Enum_HinhThucThue.Days;
			
				Enum_TrangThaiThanhToan trangThaiThanhToan = null;
				if(stringTrangThaiThanhToan.equals("Đã thanh toán"))
					trangThaiThanhToan = Enum_TrangThaiThanhToan.Paid;
				if(stringTrangThaiThanhToan.equals("Chưa thanh toán"))
					trangThaiThanhToan = Enum_TrangThaiThanhToan.Yet;
				
				DonDatPhong donDatPhong = new DonDatPhong(maDonDat, khachHang, tiepTan, soLuongKhach, hinhThucThue, trangThaiThanhToan, ngayDat);
			
				listDDP.add(donDatPhong);
				
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
		return listDDP;
	}
	
	public static DonDatPhong getDonDatPhongTheoMaDonDat(int thisMaDonDat) {
		ArrayList<DonDatPhong> listDDP = DAO_DonDatPhong.getDanhSachDonDatPhong();
		DonDatPhong donDatPhong = new DonDatPhong(thisMaDonDat);
		if(listDDP.contains(donDatPhong))
			return listDDP.get(listDDP.indexOf(donDatPhong));
		return null;
	}
	
	public static boolean createDonDatPhong(DonDatPhong donDatPhong) {
		Connection connection = ConnectDB.getConnection();
		int n = 0;
		try {
			String sql = "INSERT INTO [dbo].[DonDatPhong] "
					+ "([MaKhachHang], [MaTiepTan], [SoLuongKhach], [HinhThucThue], [TrangThaiThanhToan]) "
					+ "VALUES(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, Integer.toString(donDatPhong.getKhachHang().getMaKhachHang()));
			statement.setString(2, donDatPhong.getTiepTan().getMaTiepTan());
			statement.setString(3, donDatPhong.getSoLuongKhach() + "");
			statement.setString(4, donDatPhong.getHinhThucThue() == Enum_HinhThucThue.Days ? "Theo ngày" : "Theo giờ");
			statement.setString(5, "Chưa thanh toán");
			n = statement.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}

		return n>0;
	}

	public static DonDatPhong getNewDonDat() {
		Connection connection = ConnectDB.getConnection();
		try {
			String sql = "SELECT TOP 1 MaDonDat "
					+ "FROM [dbo].[DonDatPhong] "
					+ "ORDER BY MaDonDat DESC";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if (rs.next()) {
				int maDonDat = rs.getInt("MaDonDat");
				DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
				return donDatPhong;
			}
		}
		catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return null;
	}
	
	public static void setTrangThaiThanhToanMaDonDat(int maDonDatCanSet, String trangThaiThanhToanCanSet) {
		Connection connect = ConnectDB.getConnection();
		try {
			String sql = ""
					+ "UPDATE DonDatPhong "
					+ "SET TrangThaiThanhToan = ? "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
			prpStm.setString(1, trangThaiThanhToanCanSet);
			prpStm.setInt(2, maDonDatCanSet);
			prpStm.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		finally {
			
		}
	}
	
	public static boolean xoaDonDatPhong(int maDonDat) {
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "DELETE FROM DonDatPhong "
					+ "WHERE MaDonDat = ?";
			PreparedStatement prpStm = connect.prepareStatement(sql);
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
}

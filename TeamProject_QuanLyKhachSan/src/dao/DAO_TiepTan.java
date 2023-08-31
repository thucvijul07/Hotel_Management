package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.TaiKhoan;
import entity.TiepTan;

public class DAO_TiepTan {
	DAO_TiepTan(){}
	public static ArrayList<TiepTan> getDanhSachTiepTan(){
		ArrayList<TiepTan> listTT = new ArrayList<TiepTan>();
		Connection connect = ConnectDB.getConnection();
		int rowCount = 0;
		try {
			String sql = ""
					+ "SELECT * "
					+ "FROM TiepTan";
			Statement stm = connect.createStatement();
			ResultSet result = stm.executeQuery(sql);
			
			while(result.next()) {
				String maTiepTan = result.getString("MaTiepTan");
				String hoDem = result.getString("HoDem");
				String ten = result.getString("Ten");
				String cccd = result.getString("CCCD");
				String sdt = result.getString("SDT");
				String maTaiKhoan = result.getString("MaTaiKhoan");
				
				TaiKhoan taiKhoan = DAO_TaiKhoan.getTaiKhoanTheoMaTaiKhoan(maTaiKhoan);
				TiepTan tiepTan = new TiepTan(maTiepTan, hoDem, ten, cccd, sdt, taiKhoan);
				
				listTT.add(tiepTan);
				
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
		return listTT;
	}
	public static TiepTan getTiepTanTheoMaTiepTan(String thisMaTiepTan) {
		ArrayList<TiepTan> listTT = DAO_TiepTan.getDanhSachTiepTan();
		TiepTan tiepTan = new TiepTan(thisMaTiepTan);
		if(listTT.contains(tiepTan)) return listTT.get(listTT.indexOf(tiepTan));
		else return null;
	}
	
	public static TiepTan getTiepTanTheoMaTaiKhoan(String thisMaTaiKhoan) {
		ArrayList<TiepTan> listTT = DAO_TiepTan.getDanhSachTiepTan();
		for(TiepTan thisTiepTan : listTT)
			if(thisTiepTan.getTaiKhoan().getMaTaiKhoan().equals(thisMaTaiKhoan))
				return thisTiepTan;
		return null;
	}
}

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DonDatPhong_Phong;
import dao.DAO_HoaDon;
import dao.DAO_KhachHang;
import entity.DonDatPhong_Phong;
import entity.Enum_HinhThucThue;
import entity.HoaDon;
import entity.KhachHang;
import entity.Phong;

public class UI_ThongKe extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UI_ThongKe instance = new UI_ThongKe();
	private static final double tiLeGioThue = 0.07;
	//
	private DefaultTableModel modelTheoThang;
	private DefaultTableModel modelTheoNam;
	private DefaultTableModel modelKhachHang;
	//
	private javax.swing.JButton btnThongKeNam;
    private javax.swing.JButton btnThongKeThang;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboNamOnly;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JLabel lblINgay;
    private javax.swing.JLabel lblITongDoanhThuThang;
    private javax.swing.JLabel lblITongDoanhThuNam;
    private javax.swing.JLabel lblITongSoHoaDonThang;
    private javax.swing.JLabel lblITongSoHoaDonNam;
    private javax.swing.JLabel lblITongSoPhongThang;
    private javax.swing.JLabel lblITongSoPhongNam;
    private javax.swing.JLabel lblLNgay;
    private javax.swing.JLabel lblLTongDoanhThuThang;
    private javax.swing.JLabel lblLTongDoanhThuNam;
    private javax.swing.JLabel lblLTongSoHoaDonThang;
    private javax.swing.JLabel lblLTongSoHoaDonNam;
    private javax.swing.JLabel lblLTongSoPhongThang;
    private javax.swing.JLabel lblLTongSoPhongNam;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblNam1;
    private javax.swing.JLabel lblNone1;
    private javax.swing.JLabel lblNone10;
    private javax.swing.JLabel lblNone2;
    private javax.swing.JLabel lblNone3;
    private javax.swing.JLabel lblNone4;
    private javax.swing.JLabel lblNone5;
    private javax.swing.JLabel lblNone6;
    private javax.swing.JLabel lblNone7;
    private javax.swing.JLabel lblNone8;
    private javax.swing.JLabel lblNone9;
    private javax.swing.JLabel lblTKNam;
    private javax.swing.JLabel lblTKThang;
    private javax.swing.JLabel lblThang;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBtn;
    private javax.swing.JPanel pnlBtnNam;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlComboNam;
    private javax.swing.JPanel pnlComboThang;
    private javax.swing.JPanel pnlKQNam;
    private javax.swing.JPanel pnlKQThang;
    private javax.swing.JPanel pnlKhachHang;
    private javax.swing.JPanel pnlNam;
    private javax.swing.JPanel pnlNamOnly;
    private javax.swing.JPanel pnlOptionNam;
    private javax.swing.JPanel pnlOptionThang;
    private javax.swing.JPanel pnlRightNam;
    private javax.swing.JPanel pnlRightThang;
    private javax.swing.JPanel pnlTKNam;
    private javax.swing.JPanel pnlTKThang;
    private javax.swing.JPanel pnlThang;
    private javax.swing.JPanel pnlTheoNam;
    private javax.swing.JPanel pnlTheoThang;
    private javax.swing.JTabbedPane pnlThongKe;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTitleNgay;
    private javax.swing.JScrollPane scrCenter;
    private javax.swing.JScrollPane scrHoaDonNam;
    private javax.swing.JScrollPane scrHoaDonThang;
    private javax.swing.JTable tblHoaDonNam;
    private javax.swing.JTable tblHoaDonThang;
    private javax.swing.JTable tblKhachHang;
    //
	public UI_ThongKe() {
        initComponents();
        addModel();
        addItem();
        addActionListener();
    }
	//
	public static UI_ThongKe getUI_ThongKeInstance() {return instance;}
	//
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JTabbedPane();
        pnlTheoThang = new javax.swing.JPanel();
        scrHoaDonThang = new javax.swing.JScrollPane();
        tblHoaDonThang = new javax.swing.JTable();
        pnlRightThang = new javax.swing.JPanel();
        pnlTKThang = new javax.swing.JPanel();
        lblTKThang = new javax.swing.JLabel();
        pnlOptionThang = new javax.swing.JPanel();
        pnlComboThang = new javax.swing.JPanel();
        pnlNam = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        pnlThang = new javax.swing.JPanel();
        lblThang = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        pnlBtn = new javax.swing.JPanel();
        btnThongKeThang = new javax.swing.JButton();
        pnlKQThang = new javax.swing.JPanel();
        lblLTongSoHoaDonThang = new javax.swing.JLabel();
        lblITongSoHoaDonThang = new javax.swing.JLabel();
        lblLTongSoPhongThang = new javax.swing.JLabel();
        lblITongSoPhongThang = new javax.swing.JLabel();
        lblLTongDoanhThuThang = new javax.swing.JLabel();
        lblITongDoanhThuThang = new javax.swing.JLabel();
        lblNone7 = new javax.swing.JLabel();
        lblNone8 = new javax.swing.JLabel();
        lblNone9 = new javax.swing.JLabel();
        lblNone10 = new javax.swing.JLabel();
        pnlTheoNam = new javax.swing.JPanel();
        scrHoaDonNam = new javax.swing.JScrollPane();
        tblHoaDonNam = new javax.swing.JTable();
        pnlRightNam = new javax.swing.JPanel();
        pnlTKNam = new javax.swing.JPanel();
        lblTKNam = new javax.swing.JLabel();
        pnlKQNam = new javax.swing.JPanel();
        lblLTongSoHoaDonNam = new javax.swing.JLabel();
        lblITongSoHoaDonNam = new javax.swing.JLabel();
        lblLTongSoPhongNam = new javax.swing.JLabel();
        lblITongSoPhongNam = new javax.swing.JLabel();
        lblLTongDoanhThuNam = new javax.swing.JLabel();
        lblITongDoanhThuNam = new javax.swing.JLabel();
        lblNone3 = new javax.swing.JLabel();
        lblNone4 = new javax.swing.JLabel();
        lblNone5 = new javax.swing.JLabel();
        lblNone6 = new javax.swing.JLabel();
        pnlOptionNam = new javax.swing.JPanel();
        pnlComboNam = new javax.swing.JPanel();
        pnlNamOnly = new javax.swing.JPanel();
        lblNam1 = new javax.swing.JLabel();
        cboNamOnly = new javax.swing.JComboBox<>();
        lblNone1 = new javax.swing.JLabel();
        lblNone2 = new javax.swing.JLabel();
        pnlBtnNam = new javax.swing.JPanel();
        btnThongKeNam = new javax.swing.JButton();
        pnlKhachHang = new javax.swing.JPanel();
        pnlTitleNgay = new javax.swing.JPanel();
        lblLNgay = new javax.swing.JLabel();
        lblINgay = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        scrCenter = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new java.awt.BorderLayout(3, 3));

        pnlTitle.setBackground(new java.awt.Color(204, 204, 204));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTitle.setPreferredSize(new java.awt.Dimension(935, 50));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Thống kê");
        pnlTitle.add(lblTitle, new java.awt.GridBagConstraints());

        add(pnlTitle, java.awt.BorderLayout.NORTH);

        pnlTheoThang.setBackground(new java.awt.Color(204, 204, 204));
        pnlTheoThang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTheoThang.setLayout(new java.awt.BorderLayout());

        scrHoaDonThang.setViewportView(tblHoaDonThang);

        pnlTheoThang.add(scrHoaDonThang, java.awt.BorderLayout.CENTER);

        pnlRightThang.setPreferredSize(new java.awt.Dimension(300, 472));
        pnlRightThang.setLayout(new java.awt.BorderLayout());

        pnlTKThang.setLayout(new java.awt.GridBagLayout());

        lblTKThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTKThang.setText("Lựa chọn Thống kê");
        pnlTKThang.add(lblTKThang, new java.awt.GridBagConstraints());

        pnlRightThang.add(pnlTKThang, java.awt.BorderLayout.NORTH);

        pnlOptionThang.setLayout(new java.awt.BorderLayout());

        pnlComboThang.setLayout(new java.awt.GridLayout(0, 2));

        pnlNam.setLayout(new java.awt.GridBagLayout());

        lblNam.setText("Năm");
        pnlNam.add(lblNam, new java.awt.GridBagConstraints());

        pnlComboThang.add(pnlNam);
        pnlComboThang.add(cboNam);

        pnlThang.setLayout(new java.awt.GridBagLayout());

        lblThang.setText("Tháng");
        pnlThang.add(lblThang, new java.awt.GridBagConstraints());

        pnlComboThang.add(pnlThang);
        pnlComboThang.add(cboThang);

        pnlOptionThang.add(pnlComboThang, java.awt.BorderLayout.CENTER);

        pnlBtn.setPreferredSize(new java.awt.Dimension(300, 70));
        pnlBtn.setLayout(new java.awt.GridBagLayout());

        btnThongKeThang.setBackground(new java.awt.Color(128, 128, 255));
        btnThongKeThang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThongKeThang.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKeThang.setText("Thống Kê");
        btnThongKeThang.setPreferredSize(new java.awt.Dimension(100, 40));
        pnlBtn.add(btnThongKeThang, new java.awt.GridBagConstraints());

        pnlOptionThang.add(pnlBtn, java.awt.BorderLayout.SOUTH);

        pnlRightThang.add(pnlOptionThang, java.awt.BorderLayout.CENTER);

        pnlKQThang.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlKQThang.setLayout(new java.awt.GridLayout(0, 2));

        lblLTongSoHoaDonThang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTongSoHoaDonThang.setForeground(new java.awt.Color(102, 102, 102));
        lblLTongSoHoaDonThang.setText("Tổng số hóa đơn:");
        pnlKQThang.add(lblLTongSoHoaDonThang);
        pnlKQThang.add(lblITongSoHoaDonThang);

        lblLTongSoPhongThang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTongSoPhongThang.setForeground(new java.awt.Color(102, 102, 102));
        lblLTongSoPhongThang.setText("Tổng số phòng đã đặt:");
        pnlKQThang.add(lblLTongSoPhongThang);
        pnlKQThang.add(lblITongSoPhongThang);

        lblLTongDoanhThuThang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTongDoanhThuThang.setForeground(new java.awt.Color(102, 102, 102));
        lblLTongDoanhThuThang.setText("Tổng doanh thu:");
        pnlKQThang.add(lblLTongDoanhThuThang);
        pnlKQThang.add(lblITongDoanhThuThang);
        pnlKQThang.add(lblNone7);
        pnlKQThang.add(lblNone8);
        pnlKQThang.add(lblNone9);
        pnlKQThang.add(lblNone10);

        pnlRightThang.add(pnlKQThang, java.awt.BorderLayout.SOUTH);

        pnlTheoThang.add(pnlRightThang, java.awt.BorderLayout.EAST);

        pnlThongKe.addTab("Doanh Thu Theo Tháng", pnlTheoThang);

        pnlTheoNam.setBackground(new java.awt.Color(204, 204, 204));
        pnlTheoNam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTheoNam.setLayout(new java.awt.BorderLayout());

        scrHoaDonNam.setViewportView(tblHoaDonNam);

        pnlTheoNam.add(scrHoaDonNam, java.awt.BorderLayout.CENTER);

        pnlRightNam.setPreferredSize(new java.awt.Dimension(300, 472));
        pnlRightNam.setLayout(new java.awt.BorderLayout());

        pnlTKNam.setLayout(new java.awt.GridBagLayout());

        lblTKNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTKNam.setText("Lựa chọn Thống kê");
        pnlTKNam.add(lblTKNam, new java.awt.GridBagConstraints());

        pnlRightNam.add(pnlTKNam, java.awt.BorderLayout.NORTH);

        pnlKQNam.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlKQNam.setLayout(new java.awt.GridLayout(0, 2));

        lblLTongSoHoaDonNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTongSoHoaDonNam.setForeground(new java.awt.Color(102, 102, 102));
        lblLTongSoHoaDonNam.setText("Tổng số hóa đơn:");
        pnlKQNam.add(lblLTongSoHoaDonNam);
        pnlKQNam.add(lblITongSoHoaDonNam);

        lblLTongSoPhongNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTongSoPhongNam.setForeground(new java.awt.Color(102, 102, 102));
        lblLTongSoPhongNam.setText("Tổng số phòng đã đặt:");
        pnlKQNam.add(lblLTongSoPhongNam);
        pnlKQNam.add(lblITongSoPhongNam);

        lblLTongDoanhThuNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTongDoanhThuNam.setForeground(new java.awt.Color(102, 102, 102));
        lblLTongDoanhThuNam.setText("Tổng doanh thu:");
        pnlKQNam.add(lblLTongDoanhThuNam);
        pnlKQNam.add(lblITongDoanhThuNam);
        pnlKQNam.add(lblNone3);
        pnlKQNam.add(lblNone4);
        pnlKQNam.add(lblNone5);
        pnlKQNam.add(lblNone6);

        pnlRightNam.add(pnlKQNam, java.awt.BorderLayout.SOUTH);

        pnlOptionNam.setLayout(new java.awt.BorderLayout());

        pnlComboNam.setLayout(new java.awt.GridLayout(0, 2));

        pnlNamOnly.setLayout(new java.awt.GridBagLayout());

        lblNam1.setText("Năm");
        pnlNamOnly.add(lblNam1, new java.awt.GridBagConstraints());

        pnlComboNam.add(pnlNamOnly);
        pnlComboNam.add(cboNamOnly);
        pnlComboNam.add(lblNone1);
        pnlComboNam.add(lblNone2);

        pnlOptionNam.add(pnlComboNam, java.awt.BorderLayout.CENTER);

        pnlBtnNam.setPreferredSize(new java.awt.Dimension(300, 70));
        pnlBtnNam.setLayout(new java.awt.GridBagLayout());

        btnThongKeNam.setBackground(new java.awt.Color(128, 128, 255));
        btnThongKeNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThongKeNam.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKeNam.setText("Thống Kê");
        btnThongKeNam.setPreferredSize(new java.awt.Dimension(100, 40));
        pnlBtnNam.add(btnThongKeNam, new java.awt.GridBagConstraints());

        pnlOptionNam.add(pnlBtnNam, java.awt.BorderLayout.SOUTH);

        pnlRightNam.add(pnlOptionNam, java.awt.BorderLayout.CENTER);

        pnlTheoNam.add(pnlRightNam, java.awt.BorderLayout.EAST);

        pnlThongKe.addTab("Doanh Thu Theo Năm", pnlTheoNam);

        pnlKhachHang.setBackground(new java.awt.Color(204, 204, 204));
        pnlKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlKhachHang.setLayout(new java.awt.BorderLayout());

        pnlTitleNgay.setPreferredSize(new java.awt.Dimension(931, 50));
        pnlTitleNgay.setLayout(new java.awt.GridBagLayout());

        lblLNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLNgay.setText("Ngày:");
        pnlTitleNgay.add(lblLNgay, new java.awt.GridBagConstraints());

        lblINgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlTitleNgay.add(lblINgay, new java.awt.GridBagConstraints());

        pnlKhachHang.add(pnlTitleNgay, java.awt.BorderLayout.NORTH);

        pnlCenter.setLayout(new java.awt.BorderLayout());

        scrCenter.setViewportView(tblKhachHang);

        pnlCenter.add(scrCenter, java.awt.BorderLayout.CENTER);

        pnlKhachHang.add(pnlCenter, java.awt.BorderLayout.CENTER);

        pnlThongKe.addTab("Khách hàng trong Ngày", pnlKhachHang);

        add(pnlThongKe, java.awt.BorderLayout.CENTER);
        pnlThongKe.getAccessibleContext().setAccessibleName("Doanh Thu Theo Năm");
    }
    //
    public void addModel() {
    	modelTheoThang = new DefaultTableModel(new String [] {
                "Mã hóa đơn", "Ngày trả phòng", "Tổng tiền phòng"
            }, 0);
    	modelTheoNam = new DefaultTableModel(new String [] {
                "Mã hóa đơn", "Ngày trả phòng", "Tổng tiền phòng"
            }, 0);
    	modelKhachHang = new DefaultTableModel(new String [] {
                "Mã khách hàng", "Căn Cước Công Dân", "Họ và Tên", "Số điện thoại", "Quốc Tịch"
            }, 0);
    	
    	tblHoaDonThang.setModel(modelTheoThang);
    	tblHoaDonNam.setModel(modelTheoNam);
    	tblKhachHang.setModel(modelKhachHang);
    }
    public void thongKeTheoThang() {
    	String stringThang = cboThang.getSelectedItem().toString();
    	String stringNam = cboNam.getSelectedItem().toString();
    	
    	int thang = 0;
    	int nam = 0;
    	
    	try {
			thang = Integer.parseInt(stringThang);
			nam = Integer.parseInt(stringNam);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
    	
    	ArrayList<HoaDon> listHD = DAO_HoaDon.getDanhSachHoaDonTheoThangVaNam(thang, nam);
    	
    	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
    	
    	if(listHD != null) {
    		double tongDoanhThu = 0;
        	int tongSoPhong = 0;
    		modelTheoThang.getDataVector().removeAllElements();
    		for(HoaDon thisHoaDon : listHD) {
    			int soPhong = DAO_DonDatPhong_Phong.tongSoPhongTrongMotDonDat(thisHoaDon.getDonDatPhong().getMaDonDat());
    			tongSoPhong += soPhong;
    			double tienPhong = tinhThongTienPhongCuaMotHoaDon(thisHoaDon);
    			tongDoanhThu += tienPhong;
        		modelTheoThang.addRow(new String[] {
        			Integer.toString(thisHoaDon.getMaHoaDon()),
        			thisHoaDon.getNgayTraPhong().toString(),
        			nf.format(tienPhong)
        		});

        		int tongHoaDon = listHD.size();
        		setKetQuaThongKeThang(tongHoaDon, tongSoPhong, tongDoanhThu);
        		
        	}
    	}
    	else {
    		lblITongSoHoaDonThang.setText("");
    		lblITongSoPhongThang.setText("");
    		lblITongDoanhThuThang.setText("");
    		modelTheoThang.getDataVector().removeAllElements();
    		tblHoaDonThang.revalidate();
    		tblHoaDonThang.repaint();
    		JOptionPane.showMessageDialog(this, "Không có dữ liệu Thống kê");
    		return;
    	}
    }
    public void thongKeTheoNam() {
    	String stringNam = cboNamOnly.getSelectedItem().toString();
    	int nam = 0;
    	try {
			nam = Integer.parseInt(stringNam);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
    	ArrayList<HoaDon> listHD = DAO_HoaDon.getDanhSachHoaDonTheoNam(nam);
    	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
    	if(listHD != null) {
    		double tongDoanhThu = 0;
        	int tongSoPhong = 0;
    		modelTheoNam.getDataVector().removeAllElements();
    		for(HoaDon thisHoaDon : listHD) {
    			int soPhong = DAO_DonDatPhong_Phong.tongSoPhongTrongMotDonDat(thisHoaDon.getDonDatPhong().getMaDonDat());
    			tongSoPhong += soPhong;
    			double tienPhong = tinhThongTienPhongCuaMotHoaDon(thisHoaDon);
    			tongDoanhThu += tienPhong;
        		modelTheoNam.addRow(new String[] {
        			Integer.toString(thisHoaDon.getMaHoaDon()),
        			thisHoaDon.getNgayTraPhong().toString(),
        			nf.format(tienPhong)
        		});
        	}
    		int tongHoaDon = listHD.size();
    		setKetQuaThongKeNam(tongHoaDon, tongSoPhong, tongDoanhThu);
    	}
    	else {
    		lblITongSoHoaDonNam.setText("");
    		lblITongSoPhongNam.setText("");
    		lblITongDoanhThuNam.setText("");
    		modelTheoNam.getDataVector().removeAllElements();
    		JOptionPane.showMessageDialog(this, "Không có dữ liệu thống kê");
    		return;
    	}
    }
    public void showKhachHangTrongNgay() {
    	ArrayList<KhachHang> listKhachHang = DAO_KhachHang.getDanhSachKhachHangDatPhongTrongNgay();
    	if(listKhachHang != null) {
    		modelKhachHang.getDataVector().removeAllElements();
    		for(KhachHang thisKhachHang : listKhachHang) {
    			modelKhachHang.addRow(new String[] {
    	    		Integer.toString(thisKhachHang.getMaKhachHang()),
    	    		thisKhachHang.getCccd(),
    	    		thisKhachHang.getHoDem() + " " + thisKhachHang.getTen(),
    	    		thisKhachHang.getSdt(),
    	    		thisKhachHang.getQuocTich()
    	    	});
    		}
    	}
    	LocalDate date = LocalDate.now();
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	lblINgay.setText(" "+dtf.format(date));
    }
    public void addItem() {
    	for(int i = 1; i <= 12; i++) {
    		cboThang.addItem(Integer.toString(i));
    	}
    	
    	cboNam.addItem(Integer.toString(2022));
    	cboNam.addItem(Integer.toString(2023));
    	
    	cboNamOnly.addItem(Integer.toString(2022));
    	cboNamOnly.addItem(Integer.toString(2023));
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == btnThongKeThang) {
			thongKeTheoThang();
		}
			
		if(o == btnThongKeNam)
			thongKeTheoNam();
	}
	public double tinhThongTienPhongCuaMotHoaDon(HoaDon thisHD) {
		double tongTien = 0;
		
		Enum_HinhThucThue enumHinhThucThue = thisHD.getDonDatPhong().getHinhThucThue();
		ArrayList<DonDatPhong_Phong> listDP = DAO_DonDatPhong_Phong.getDanhSachPhongDatTheoMaDonDat(thisHD.getDonDatPhong().getMaDonDat());
		double thoiGianDatPhong = thisHD.getNgayDatPhong().getTime();
		double thoiGianTraPhong = thisHD.getNgayTraPhong().getTime();
		long thoiGianThue = 0;
		if(enumHinhThucThue.equals(Enum_HinhThucThue.Days)) {
			thoiGianThue = Math.round(Math.ceil((thoiGianTraPhong-thoiGianDatPhong)/86400000));
		}
		if(enumHinhThucThue.equals(Enum_HinhThucThue.Hours)) {
			thoiGianThue = Math.round(Math.ceil((thoiGianTraPhong-thoiGianDatPhong)/3600000));
		}
		if(enumHinhThucThue.equals(Enum_HinhThucThue.Days)) {
    		for(DonDatPhong_Phong thisDP : listDP) {
    			Phong thisPhong = thisDP.getPhongDat();
    			double donGiaPhong = thisPhong.getLoaiPhong().getDonGia();
    			tongTien += donGiaPhong*thoiGianThue;
    		}
    	}
    	if(enumHinhThucThue.equals(Enum_HinhThucThue.Hours)) {
    		for(DonDatPhong_Phong thisDP : listDP) {
    			Phong thisPhong = thisDP.getPhongDat();
    			double donGiaPhong = thisPhong.getLoaiPhong().getDonGia();
    			tongTien+= donGiaPhong*tiLeGioThue*thoiGianThue;
    		}
    	}
    	return tongTien;
	}
	public void addActionListener() {
		btnThongKeThang.addActionListener(this);
		btnThongKeNam.addActionListener(this);
	}
	
	public void setKetQuaThongKeThang(int tongHoaDon, int tongSoPhong, double tongDoanhThu) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
		lblITongSoHoaDonThang.setText(Integer.toString(tongHoaDon));
		lblITongSoPhongThang.setText(Integer.toString(tongSoPhong));
		lblITongDoanhThuThang.setText(nf.format(tongDoanhThu));
	}
	
	public void setKetQuaThongKeNam(int tongHoaDon, int tongSoPhong, double tongDoanhThu) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
		lblITongSoHoaDonNam.setText(Integer.toString(tongHoaDon));
		lblITongSoPhongNam.setText(Integer.toString(tongSoPhong));
		lblITongDoanhThuNam.setText(nf.format(tongDoanhThu));
	}
	
	public void resetModel() {
		lblITongSoHoaDonThang.setText("");
		lblITongSoPhongThang.setText("");
		lblITongDoanhThuThang.setText("");
		lblITongSoHoaDonNam.setText("");
		lblITongSoPhongNam.setText("");
		lblITongDoanhThuNam.setText("");
		modelTheoThang.getDataVector().removeAllElements();
		modelTheoNam.getDataVector().removeAllElements();
	}
}

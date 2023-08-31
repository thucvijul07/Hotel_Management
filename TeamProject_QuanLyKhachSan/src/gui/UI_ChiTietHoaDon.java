package gui;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DonDatPhong_DichVu;
import dao.DAO_DonDatPhong_Phong;
import dao.DAO_HoaDon;
import entity.DichVu;
import entity.DonDatPhong;
import entity.DonDatPhong_DichVu;
import entity.DonDatPhong_Phong;
import entity.HoaDon;
import entity.KhachHang;
import entity.Phong;

public class UI_ChiTietHoaDon extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//
	private static UI_ChiTietHoaDon instance = new UI_ChiTietHoaDon();
	private DefaultTableModel modelDV;
	private DefaultTableModel modelP;
    //
    public static UI_ChiTietHoaDon getUI_ChiTietHoaDonInstance() {return instance;}
    public static UI_ChiTietHoaDon newUI_ChiTietHoaDonInstance() {instance = new UI_ChiTietHoaDon(); return instance;}
    //
    private javax.swing.JLabel lblIHDMDD;
    private javax.swing.JLabel lblIHDND;
    private javax.swing.JLabel lblIHDNT;
    private javax.swing.JLabel lblIHDNone;
    private javax.swing.JLabel lblIHDPP;
    private javax.swing.JLabel lblIHDTTT;
    private javax.swing.JLabel lblIKHCCCD;
    private javax.swing.JLabel lblIKHHD;
    private javax.swing.JLabel lblIKHM;
    private javax.swing.JLabel lblIKHQT;
    private javax.swing.JLabel lblIKHSDT;
    private javax.swing.JLabel lblIKHT;
    private javax.swing.JLabel lblIMHD;
    private javax.swing.JLabel lblLHDMDD;
    private javax.swing.JLabel lblLHDND;
    private javax.swing.JLabel lblLHDNT;
    private javax.swing.JLabel lblLHDNone;
    private javax.swing.JLabel lblLHDPP;
    private javax.swing.JLabel lblLHDTTT;
    private javax.swing.JLabel lblLKHCCCD;
    private javax.swing.JLabel lblLKHHD;
    private javax.swing.JLabel lblLKHM;
    private javax.swing.JLabel lblLKHQT;
    private javax.swing.JLabel lblLKHSDT;
    private javax.swing.JLabel lblLKHT;
    private javax.swing.JLabel lblLMHD;
    private javax.swing.JPanel pnlDV;
    private javax.swing.JPanel pnlDVP;
    private javax.swing.JPanel pnlHD;
    private javax.swing.JPanel pnlIHD;
    private javax.swing.JPanel pnlIKH;
    private javax.swing.JPanel pnlInform;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JPanel pnlKHHD;
    private javax.swing.JPanel pnlLHD;
    private javax.swing.JPanel pnlLKH;
    private javax.swing.JPanel pnlP;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JScrollPane scrDV;
    private javax.swing.JScrollPane scrP;
    private javax.swing.JTable tblDV;
    private javax.swing.JTable tblP;
    //
    public UI_ChiTietHoaDon(){
    	initComponents();
    	addTableModel();
    }
    //
    private void initComponents() {

        pnlTitle = new javax.swing.JPanel();
        lblLMHD = new javax.swing.JLabel();
        lblIMHD = new javax.swing.JLabel();
        pnlInform = new javax.swing.JPanel();
        pnlKHHD = new javax.swing.JPanel();
        pnlKH = new javax.swing.JPanel();
        pnlLKH = new javax.swing.JPanel();
        lblLKHM = new javax.swing.JLabel();
        lblLKHHD = new javax.swing.JLabel();
        lblLKHT = new javax.swing.JLabel();
        lblLKHCCCD = new javax.swing.JLabel();
        lblLKHSDT = new javax.swing.JLabel();
        lblLKHQT = new javax.swing.JLabel();
        pnlIKH = new javax.swing.JPanel();
        lblIKHM = new javax.swing.JLabel();
        lblIKHHD = new javax.swing.JLabel();
        lblIKHT = new javax.swing.JLabel();
        lblIKHCCCD = new javax.swing.JLabel();
        lblIKHSDT = new javax.swing.JLabel();
        lblIKHQT = new javax.swing.JLabel();
        pnlHD = new javax.swing.JPanel();
        pnlLHD = new javax.swing.JPanel();
        lblLHDMDD = new javax.swing.JLabel();
        lblLHDPP = new javax.swing.JLabel();
        lblLHDTTT = new javax.swing.JLabel();
        lblLHDND = new javax.swing.JLabel();
        lblLHDNT = new javax.swing.JLabel();
        lblLHDNone = new javax.swing.JLabel();
        pnlIHD = new javax.swing.JPanel();
        lblIHDMDD = new javax.swing.JLabel();
        lblIHDPP = new javax.swing.JLabel();
        lblIHDTTT = new javax.swing.JLabel();
        lblIHDND = new javax.swing.JLabel();
        lblIHDNT = new javax.swing.JLabel();
        lblIHDNone = new javax.swing.JLabel();
        pnlDVP = new javax.swing.JPanel();
        pnlDV = new javax.swing.JPanel();
        scrDV = new javax.swing.JScrollPane();
        tblDV = new javax.swing.JTable();
        pnlP = new javax.swing.JPanel();
        scrP = new javax.swing.JScrollPane();
        tblP = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new java.awt.BorderLayout(3, 3));

        pnlTitle.setBackground(new java.awt.Color(204, 204, 204));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTitle.setPreferredSize(new java.awt.Dimension(935, 50));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblLMHD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLMHD.setForeground(new java.awt.Color(102, 102, 102));
        lblLMHD.setText("Mã Hóa Đơn: ");
        pnlTitle.add(lblLMHD, new java.awt.GridBagConstraints());

        lblIMHD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlTitle.add(lblIMHD, new java.awt.GridBagConstraints());

        add(pnlTitle, java.awt.BorderLayout.PAGE_START);

        pnlInform.setBackground(new java.awt.Color(204, 204, 204));
        pnlInform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlInform.setLayout(new java.awt.BorderLayout());

        pnlKHHD.setOpaque(false);
        pnlKHHD.setPreferredSize(new java.awt.Dimension(931, 300));
        pnlKHHD.setLayout(new java.awt.GridLayout(1, 2));

        pnlKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin Khách hàng"));
        pnlKH.setOpaque(false);
        pnlKH.setLayout(new java.awt.GridLayout(1, 2));

        pnlLKH.setOpaque(false);
        pnlLKH.setLayout(new java.awt.GridLayout(6, 1));

        lblLKHM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLKHM.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHM.setText("Mã Khách hàng:");
        lblLKHM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHM);

        lblLKHHD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLKHHD.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHHD.setText("Họ Đệm:");
        lblLKHHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHHD);

        lblLKHT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLKHT.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHT.setText("Tên:");
        lblLKHT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHT);

        lblLKHCCCD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLKHCCCD.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHCCCD.setText("Số Căn cước công dân:");
        lblLKHCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHCCCD);

        lblLKHSDT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLKHSDT.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHSDT.setText("Số điện thoại:");
        lblLKHSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHSDT);

        lblLKHQT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLKHQT.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHQT.setText("Quốc tịch:");
        lblLKHQT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHQT);

        pnlKH.add(pnlLKH);

        pnlIKH.setOpaque(false);
        pnlIKH.setLayout(new java.awt.GridLayout(6, 1));

        lblIKHM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIKHM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHM);

        lblIKHHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIKHHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHHD);

        lblIKHT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIKHT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHT);

        lblIKHCCCD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIKHCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHCCCD);

        lblIKHSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIKHSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHSDT);

        lblIKHQT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIKHQT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHQT);

        pnlKH.add(pnlIKH);

        pnlKHHD.add(pnlKH);

        pnlHD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chi tiết Hóa đơn"));
        pnlHD.setOpaque(false);
        pnlHD.setLayout(new java.awt.GridLayout(1, 2));

        pnlLHD.setOpaque(false);
        pnlLHD.setLayout(new java.awt.GridLayout(6, 1));

        lblLHDMDD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLHDMDD.setForeground(new java.awt.Color(102, 102, 102));
        lblLHDMDD.setText("Mã Đơn đặt:");
        lblLHDMDD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLHD.add(lblLHDMDD);

        lblLHDPP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLHDPP.setForeground(new java.awt.Color(102, 102, 102));
        lblLHDPP.setText("Phụ phí / Phòng:");
        lblLHDPP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLHD.add(lblLHDPP);

        lblLHDTTT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLHDTTT.setForeground(new java.awt.Color(102, 102, 102));
        lblLHDTTT.setText("Tổng thành tiền:");
        lblLHDTTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLHD.add(lblLHDTTT);

        lblLHDND.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLHDND.setForeground(new java.awt.Color(102, 102, 102));
        lblLHDND.setText("Ngày đặt phòng:");
        lblLHDND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLHD.add(lblLHDND);

        lblLHDNT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLHDNT.setForeground(new java.awt.Color(102, 102, 102));
        lblLHDNT.setText("Ngày trả phòng:");
        lblLHDNT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlLHD.add(lblLHDNT);

        lblLHDNone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLHDNone.setForeground(new java.awt.Color(102, 102, 102));
        pnlLHD.add(lblLHDNone);

        pnlHD.add(pnlLHD);

        pnlIHD.setOpaque(false);
        pnlIHD.setLayout(new java.awt.GridLayout(6, 1));

        lblIHDMDD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIHDMDD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIHD.add(lblIHDMDD);

        lblIHDPP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIHDPP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIHD.add(lblIHDPP);

        lblIHDTTT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIHDTTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIHD.add(lblIHDTTT);

        lblIHDND.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIHDND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIHD.add(lblIHDND);

        lblIHDNT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIHDNT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlIHD.add(lblIHDNT);

        lblIHDNone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnlIHD.add(lblIHDNone);

        pnlHD.add(pnlIHD);

        pnlKHHD.add(pnlHD);

        pnlInform.add(pnlKHHD, java.awt.BorderLayout.CENTER);

        pnlDVP.setMinimumSize(new java.awt.Dimension(100, 200));
        pnlDVP.setOpaque(false);
        pnlDVP.setPreferredSize(new java.awt.Dimension(931, 200));
        pnlDVP.setLayout(new java.awt.BorderLayout());

        pnlDV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách Dịch vụ đã đặt"));
        pnlDV.setOpaque(false);
        pnlDV.setPreferredSize(new java.awt.Dimension(400, 225));
        pnlDV.setLayout(new java.awt.BorderLayout());

        tblDV.setBackground(new java.awt.Color(245, 245, 245));
        
        tblDV.setToolTipText("");
        scrDV.setViewportView(tblDV);

        pnlDV.add(scrDV, java.awt.BorderLayout.CENTER);

        pnlDVP.add(pnlDV, java.awt.BorderLayout.WEST);

        pnlP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách Phòng đã đặt"));
        pnlP.setOpaque(false);
        pnlP.setLayout(new java.awt.BorderLayout());

        scrP.setViewportView(tblP);

        pnlP.add(scrP, java.awt.BorderLayout.CENTER);

        pnlDVP.add(pnlP, java.awt.BorderLayout.CENTER);

        pnlInform.add(pnlDVP, java.awt.BorderLayout.SOUTH);

        add(pnlInform, java.awt.BorderLayout.CENTER);
    }
    
    private void addTableModel(){
    	modelDV = new DefaultTableModel(new String [] {"Mã Dịch vụ", "Tên Dịch vụ", "Đơn giá", "Loại Dịch vụ", "Số lượng"}, 0);
    	modelP = new DefaultTableModel(new String[] {"Mã Phòng", "Số Phòng", "Số Tầng", "Mã Loại phòng", "Loại phòng", "Đơn Giá"}, 0); 	
    	tblDV.setModel(modelDV);
    	tblP.setModel(modelP);
    }
    
    public void setHoaDon(int maHoaDon) {
    	modelDV.getDataVector().removeAllElements();
    	modelP.getDataVector().removeAllElements();
    	
    	HoaDon hoaDon = DAO_HoaDon.getHoaDonTheoMaHoaDon(maHoaDon);
    	DonDatPhong donDatPhong = hoaDon.getDonDatPhong();
    	KhachHang khachHang = donDatPhong.getKhachHang();
    	ArrayList<DonDatPhong_DichVu> listDDV = DAO_DonDatPhong_DichVu.getDanhSachDichVuDatTheoMaDonDat(donDatPhong.getMaDonDat());
    	ArrayList<DonDatPhong_Phong> listDP = DAO_DonDatPhong_Phong.getDanhSachPhongDatTheoMaDonDat(donDatPhong.getMaDonDat());
    	
    	addThongTinKhachHang(khachHang);
    	addChiTietHoaDon(hoaDon);
    	if(listDDV != null)
    		addDanhSachDichVu(listDDV);
    	if(listDP != null)
    		addDanhSachPhong(listDP);
    	  	
    }
    
    private void addThongTinKhachHang(KhachHang khachHang) {
    	lblIKHM.setText(Integer.toString(khachHang.getMaKhachHang()));
    	lblIKHHD.setText(khachHang.getHoDem());
    	lblIKHT.setText(khachHang.getTen());
    	lblIKHCCCD.setText(khachHang.getCccd());
    	lblIKHSDT.setText(khachHang.getSdt());
    	lblIKHQT.setText(khachHang.getQuocTich());
    }
    private void addChiTietHoaDon(HoaDon hoaDon) {
    	NumberFormat nf_vn = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
    	lblIMHD.setText(Integer.toString(hoaDon.getMaHoaDon()));
    	lblIHDMDD.setText(Integer.toString(hoaDon.getDonDatPhong().getMaDonDat()));
    	lblIHDPP.setText(nf_vn.format(hoaDon.getPhuPhiMoiPhong()));
    	lblIHDTTT.setText(nf_vn.format(hoaDon.getTongThanhTien()));
    	lblIHDND.setText(hoaDon.getNgayDatPhong().toString());
    	lblIHDNT.setText(hoaDon.getNgayTraPhong().toString());
    }
    private void addDanhSachDichVu(ArrayList<DonDatPhong_DichVu> listDDV) {
    	NumberFormat nf_vn = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
    	for(DonDatPhong_DichVu thisDDV : listDDV) {
    		DichVu thisDichVu = thisDDV.getDichVu();
    		modelDV.addRow(new String[] {
    			thisDichVu.getMaDichVu(),
    			thisDichVu.getTenDichVu(),
    			nf_vn.format(thisDichVu.getDonGia()),
    			thisDichVu.getLoaiDichVu().toString(),
    			Integer.toString(thisDDV.getSoLuong())
    		});
    	}
    }
    private void addDanhSachPhong(ArrayList<DonDatPhong_Phong> listDP) {
    	NumberFormat nf_vn = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
    	for(DonDatPhong_Phong thisDP : listDP) {
    		Phong thisPhong = thisDP.getPhongDat();
    		modelP.addRow(new String[] {
    			thisPhong.getMaPhong(),
    			Integer.toString(thisPhong.getSoPhong()),
    			Integer.toString(thisPhong.getSoTang()),
    			thisPhong.getLoaiPhong().getMaLoaiPhong(),
    			thisPhong.getLoaiPhong().getTenLoaiPhong(),
    			nf_vn.format(thisPhong.getLoaiPhong().getDonGia())
    		});
    	}
    }
}

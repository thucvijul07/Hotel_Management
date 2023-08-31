package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DonDatPhong;
import dao.DAO_DonDatPhong_DichVu;
import dao.DAO_DonDatPhong_Phong;
import dao.DAO_HoaDon;
import dao.DAO_Phong;
import entity.DichVu;
import entity.DonDatPhong;
import entity.DonDatPhong_DichVu;
import entity.DonDatPhong_Phong;
import entity.Enum_HinhThucThue;
import entity.Enum_TrangThaiThanhToan;
import entity.HoaDon;
import entity.KhachHang;
import entity.Phong;
import entity.TiepTan;

public class UI_ChiTietDonDat extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final double phuPhi = 50000;
	private final double tiLeGioThue = 0.07;
	private static UI_ChiTietDonDat instance = new UI_ChiTietDonDat();
	private DefaultTableModel modelP;
	private DefaultTableModel modelDV;
	//
	private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lblIDDHTT;
    private javax.swing.JLabel lblIDDMDD;
    private javax.swing.JLabel lblIDDND;
    private javax.swing.JLabel lblIDDSL;
    private javax.swing.JLabel lblIDDTTTT;
    private javax.swing.JLabel lblIKHCCCD;
    private javax.swing.JLabel lblIKHHD;
    private javax.swing.JLabel lblIKHQT;
    private javax.swing.JLabel lblIKHSDT;
    private javax.swing.JLabel lblIKHT;
    private javax.swing.JLabel lblIMNDichVu;
    private javax.swing.JLabel lblIMNDistance;
    private javax.swing.JLabel lblIMNPhong;
    private javax.swing.JLabel lblIMNPhuPhi;
    private javax.swing.JLabel lblIMNTime;
    private javax.swing.JLabel lblIMNTong;
    private javax.swing.JLabel lblITTCCCD;
    private javax.swing.JLabel lblITTHD;
    private javax.swing.JLabel lblITTMTT;
    private javax.swing.JLabel lblITTT;
    private javax.swing.JLabel lblLDDHTT;
    private javax.swing.JLabel lblLDDMDD;
    private javax.swing.JLabel lblLDDND;
    private javax.swing.JLabel lblLDDSL;
    private javax.swing.JLabel lblLDDTTTT;
    private javax.swing.JLabel lblLKHCCCD;
    private javax.swing.JLabel lblLKHHD;
    private javax.swing.JLabel lblLKHQT;
    private javax.swing.JLabel lblLKHSDT;
    private javax.swing.JLabel lblLKHT;
    private javax.swing.JLabel lblLMNDichVu;
    private javax.swing.JLabel lblLMNDistance;
    private javax.swing.JLabel lblLMNPhong;
    private javax.swing.JLabel lblLMNPhuPhi;
    private javax.swing.JLabel lblLMNTime;
    private javax.swing.JLabel lblLMNTong;
    private javax.swing.JLabel lblLMTT;
    private javax.swing.JLabel lblLTTCCCD;
    private javax.swing.JLabel lblLTTHD;
    private javax.swing.JLabel lblLTTT;
    private javax.swing.JLabel lblNone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDD;
    private javax.swing.JPanel pnlDV;
    private javax.swing.JPanel pnlICT;
    private javax.swing.JPanel pnlIDD;
    private javax.swing.JPanel pnlIKH;
    private javax.swing.JPanel pnlIMN;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JPanel pnlLDD;
    private javax.swing.JPanel pnlLKH;
    private javax.swing.JPanel pnlLMN;
    private javax.swing.JPanel pnlLTT;
    private javax.swing.JPanel pnlMN;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlP;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JPanel pnlTT;
    private javax.swing.JScrollPane scrDV;
    private javax.swing.JScrollPane scrP;
    private javax.swing.JTable tblDV;
    private javax.swing.JTable tblP;
    //
    public static UI_ChiTietDonDat getUI_ChiTietDonDatInstance() {return instance;}
    public static UI_ChiTietDonDat newUI_ChiTietDonDatInstance() {instance = new UI_ChiTietDonDat(); return instance;}
    //
    public UI_ChiTietDonDat() {
    	initComponents();
    	addModel();
    	addActionListener();
    }                          
    private void initComponents() {

        pnlNorth = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlSouth = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        lblNone = new javax.swing.JLabel();
        btnThanhToan = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlKH = new javax.swing.JPanel();
        pnlLKH = new javax.swing.JPanel();
        lblLKHHD = new javax.swing.JLabel();
        lblLKHT = new javax.swing.JLabel();
        lblLKHCCCD = new javax.swing.JLabel();
        lblLKHSDT = new javax.swing.JLabel();
        lblLKHQT = new javax.swing.JLabel();
        pnlIKH = new javax.swing.JPanel();
        lblIKHHD = new javax.swing.JLabel();
        lblIKHT = new javax.swing.JLabel();
        lblIKHCCCD = new javax.swing.JLabel();
        lblIKHSDT = new javax.swing.JLabel();
        lblIKHQT = new javax.swing.JLabel();
        pnlDD = new javax.swing.JPanel();
        pnlLDD = new javax.swing.JPanel();
        lblLDDMDD = new javax.swing.JLabel();
        lblLDDSL = new javax.swing.JLabel();
        lblLDDHTT = new javax.swing.JLabel();
        lblLDDTTTT = new javax.swing.JLabel();
        lblLDDND = new javax.swing.JLabel();
        pnlIDD = new javax.swing.JPanel();
        lblIDDMDD = new javax.swing.JLabel();
        lblIDDSL = new javax.swing.JLabel();
        lblIDDHTT = new javax.swing.JLabel();
        lblIDDTTTT = new javax.swing.JLabel();
        lblIDDND = new javax.swing.JLabel();
        pnlP = new javax.swing.JPanel();
        scrP = new javax.swing.JScrollPane();
        tblP = new javax.swing.JTable();
        pnlDV = new javax.swing.JPanel();
        scrDV = new javax.swing.JScrollPane();
        tblDV = new javax.swing.JTable();
        pnlTT = new javax.swing.JPanel();
        pnlLTT = new javax.swing.JPanel();
        lblLMTT = new javax.swing.JLabel();
        lblLTTHD = new javax.swing.JLabel();
        lblLTTT = new javax.swing.JLabel();
        lblLTTCCCD = new javax.swing.JLabel();
        pnlICT = new javax.swing.JPanel();
        lblITTMTT = new javax.swing.JLabel();
        lblITTHD = new javax.swing.JLabel();
        lblITTT = new javax.swing.JLabel();
        lblITTCCCD = new javax.swing.JLabel();
        pnlMN = new javax.swing.JPanel();
        pnlLMN = new javax.swing.JPanel();
        lblLMNTime = new javax.swing.JLabel();
        lblLMNDistance = new javax.swing.JLabel();
        lblLMNPhong = new javax.swing.JLabel();
        lblLMNDichVu = new javax.swing.JLabel();
        lblLMNPhuPhi = new javax.swing.JLabel();
        lblLMNTong = new javax.swing.JLabel();
        pnlIMN = new javax.swing.JPanel();
        lblIMNTime = new javax.swing.JLabel();
        lblIMNDistance = new javax.swing.JLabel();
        lblIMNPhong = new javax.swing.JLabel();
        lblIMNDichVu = new javax.swing.JLabel();
        lblIMNPhuPhi = new javax.swing.JLabel();
        lblIMNTong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new java.awt.BorderLayout(3, 3));

        pnlNorth.setBackground(new java.awt.Color(204, 204, 204));
        pnlNorth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlNorth.setPreferredSize(new java.awt.Dimension(935, 50));
        pnlNorth.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Chi tiết Đơn đặt");
        pnlNorth.add(lblTitle, new java.awt.GridBagConstraints());

        add(pnlNorth, java.awt.BorderLayout.PAGE_START);

        pnlSouth.setBackground(new java.awt.Color(204, 204, 204));
        pnlSouth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlSouth.setPreferredSize(new java.awt.Dimension(931, 50));
        pnlSouth.setLayout(new java.awt.GridBagLayout());

        btnXoa.setBackground(new java.awt.Color(255, 128, 128));
        btnXoa.setText("Xóa Đơn đặt");
        btnXoa.setPreferredSize(new java.awt.Dimension(150, 40));
        pnlSouth.add(btnXoa, new java.awt.GridBagConstraints());

        lblNone.setPreferredSize(new java.awt.Dimension(30, 0));
        pnlSouth.add(lblNone, new java.awt.GridBagConstraints());

        btnThanhToan.setBackground(new java.awt.Color(128, 128, 255));
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setPreferredSize(new java.awt.Dimension(150, 40));
        pnlSouth.add(btnThanhToan, new java.awt.GridBagConstraints());

        add(pnlSouth, java.awt.BorderLayout.SOUTH);

        pnlCenter.setBackground(new java.awt.Color(204, 204, 204));
        pnlCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCenter.setLayout(new java.awt.GridLayout(3, 2));

        pnlKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin Khách hàng"));
        pnlKH.setOpaque(false);
        pnlKH.setLayout(new java.awt.GridLayout(0, 2));

        pnlLKH.setOpaque(false);
        pnlLKH.setLayout(new java.awt.GridLayout(5, 1));

        lblLKHHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLKHHD.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHHD.setText("Họ Đệm:");
        lblLKHHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHHD);

        lblLKHT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLKHT.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHT.setText("Tên:");
        lblLKHT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHT);

        lblLKHCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLKHCCCD.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHCCCD.setText("Số Căn cước công dân:");
        lblLKHCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHCCCD);

        lblLKHSDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLKHSDT.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHSDT.setText("Số điện thoại:");
        lblLKHSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHSDT);

        lblLKHQT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLKHQT.setForeground(new java.awt.Color(102, 102, 102));
        lblLKHQT.setText("Quốc tịch:");
        lblLKHQT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLKH.add(lblLKHQT);

        pnlKH.add(pnlLKH);

        pnlIKH.setOpaque(false);
        pnlIKH.setLayout(new java.awt.GridLayout(5, 1));

        lblIKHHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHHD);

        lblIKHT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHT);

        lblIKHCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHCCCD);

        lblIKHSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHSDT);

        lblIKHQT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIKH.add(lblIKHQT);

        pnlKH.add(pnlIKH);

        pnlCenter.add(pnlKH);

        pnlDD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chi tiết Đơn đặt"));
        pnlDD.setOpaque(false);
        pnlDD.setLayout(new java.awt.GridLayout(0, 2));

        pnlLDD.setOpaque(false);
        pnlLDD.setLayout(new java.awt.GridLayout(5, 1));

        lblLDDMDD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLDDMDD.setForeground(new java.awt.Color(102, 102, 102));
        lblLDDMDD.setText("Mã đơn đặt:");
        lblLDDMDD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLDD.add(lblLDDMDD);

        lblLDDSL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLDDSL.setForeground(new java.awt.Color(102, 102, 102));
        lblLDDSL.setText("Số lượng khách:");
        lblLDDSL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLDD.add(lblLDDSL);

        lblLDDHTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLDDHTT.setForeground(new java.awt.Color(102, 102, 102));
        lblLDDHTT.setText("Hình thức thuê:");
        lblLDDHTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLDD.add(lblLDDHTT);

        lblLDDTTTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLDDTTTT.setForeground(new java.awt.Color(102, 102, 102));
        lblLDDTTTT.setText("Trạng thái thanh toán:");
        lblLDDTTTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLDD.add(lblLDDTTTT);

        lblLDDND.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLDDND.setForeground(new java.awt.Color(102, 102, 102));
        lblLDDND.setText("Ngày đặt phòng:");
        lblLDDND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLDD.add(lblLDDND);

        pnlDD.add(pnlLDD);

        pnlIDD.setOpaque(false);
        pnlIDD.setLayout(new java.awt.GridLayout(5, 1));

        lblIDDMDD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIDD.add(lblIDDMDD);

        lblIDDSL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIDD.add(lblIDDSL);

        lblIDDHTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIDD.add(lblIDDHTT);

        lblIDDTTTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIDD.add(lblIDDTTTT);

        lblIDDND.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIDD.add(lblIDDND);

        pnlDD.add(pnlIDD);

        pnlCenter.add(pnlDD);

        pnlP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Phòng đã đặt"));
        pnlP.setOpaque(false);
        pnlP.setLayout(new java.awt.BorderLayout());

        scrP.setViewportView(tblP);

        pnlP.add(scrP, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlP);

        pnlDV.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dịch vụ đã đặt"));
        pnlDV.setOpaque(false);
        pnlDV.setLayout(new java.awt.BorderLayout());

        scrDV.setViewportView(tblDV);

        pnlDV.add(scrDV, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlDV);

        pnlTT.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin Tiếp tân tạo đơn"));
        pnlTT.setOpaque(false);
        pnlTT.setLayout(new java.awt.GridLayout(0, 2));

        pnlLTT.setOpaque(false);
        pnlLTT.setLayout(new java.awt.GridLayout(6, 1));

        lblLMTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMTT.setForeground(new java.awt.Color(102, 102, 102));
        lblLMTT.setText("Mã Tiếp tân:");
        lblLMTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLTT.add(lblLMTT);

        lblLTTHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTTHD.setForeground(new java.awt.Color(102, 102, 102));
        lblLTTHD.setText("Họ Đệm:");
        lblLTTHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLTT.add(lblLTTHD);

        lblLTTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTTT.setForeground(new java.awt.Color(102, 102, 102));
        lblLTTT.setText("Tên:");
        lblLTTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLTT.add(lblLTTT);

        lblLTTCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTTCCCD.setForeground(new java.awt.Color(102, 102, 102));
        lblLTTCCCD.setText("Số Căn cước công dân:");
        lblLTTCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLTT.add(lblLTTCCCD);

        pnlTT.add(pnlLTT);

        pnlICT.setOpaque(false);
        pnlICT.setLayout(new java.awt.GridLayout(6, 1));

        lblITTMTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlICT.add(lblITTMTT);

        lblITTHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlICT.add(lblITTHD);

        lblITTT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlICT.add(lblITTT);

        lblITTCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlICT.add(lblITTCCCD);

        pnlTT.add(pnlICT);

        pnlCenter.add(pnlTT);

        pnlMN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chi phí thanh toán"));
        pnlMN.setOpaque(false);
        pnlMN.setLayout(new java.awt.GridLayout(0, 2));

        pnlLMN.setOpaque(false);
        pnlLMN.setLayout(new java.awt.GridLayout(6, 1));

        lblLMNTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMNTime.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNTime.setText("Thời điểm trả phòng:");
        lblLMNTime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLMN.add(lblLMNTime);

        lblLMNDistance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMNDistance.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNDistance.setText("Tổng thời gian thuê:");
        lblLMNDistance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLMN.add(lblLMNDistance);

        lblLMNPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMNPhong.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNPhong.setText("Tổng tiền Phòng:");
        lblLMNPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLMN.add(lblLMNPhong);

        lblLMNDichVu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMNDichVu.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNDichVu.setText("Tổng tiền Dịch vụ:");
        lblLMNDichVu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLMN.add(lblLMNDichVu);

        lblLMNPhuPhi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMNPhuPhi.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNPhuPhi.setText("Phụ phí / Phòng:");
        lblLMNPhuPhi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLMN.add(lblLMNPhuPhi);

        lblLMNTong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMNTong.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNTong.setText("Tổng thanh toán:");
        lblLMNTong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlLMN.add(lblLMNTong);

        pnlMN.add(pnlLMN);

        pnlIMN.setOpaque(false);
        pnlIMN.setLayout(new java.awt.GridLayout(6, 1));

        lblIMNTime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIMN.add(lblIMNTime);

        lblIMNDistance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIMN.add(lblIMNDistance);

        lblIMNPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIMN.add(lblIMNPhong);

        lblIMNDichVu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIMN.add(lblIMNDichVu);

        lblIMNPhuPhi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIMN.add(lblIMNPhuPhi);

        lblIMNTong.setBackground(new java.awt.Color(255, 128, 128));
        lblIMNTong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        pnlIMN.add(lblIMNTong);

        pnlMN.add(pnlIMN);

        pnlCenter.add(pnlMN);

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }
    //
    public void addModel() {
    	modelP = new DefaultTableModel(new String [] {"Tên Phòng", "Số Phòng", "Loại Phòng", "Đơn Giá"},0);
    	modelDV = new DefaultTableModel(new String [] {"Tên Dịch vụ", "Loại Dịch vụ", "Số Lượng", "Đơn Giá", "Tổng Tiền"}, 0);
    	
    	tblP.setModel(modelP);
    	tblDV.setModel(modelDV);
    }
    public void setDonDat(int maDonDat) {
    	modelP.getDataVector().removeAllElements();
    	modelDV.getDataVector().removeAllElements();
    	
    	DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
    	KhachHang khachHang = donDatPhong.getKhachHang();
    	TiepTan tiepTan = donDatPhong.getTiepTan();
    	ArrayList<DonDatPhong_DichVu> listDDV = DAO_DonDatPhong_DichVu.getDanhSachDichVuDatTheoMaDonDat(maDonDat);
    	ArrayList<DonDatPhong_Phong> listDP = DAO_DonDatPhong_Phong.getDanhSachPhongDatTheoMaDonDat(maDonDat);
    	
    	Timestamp thoiDiemDatPhong = donDatPhong.getNgayDatPhong();;
    	Timestamp thoiDiemTraPhong = new Timestamp(0);
    	long thoiGianThue = 0;
    	double tongTienPhong = 0;
    	double tongTienDichVu = 0;
    	double tongTienThanhToan = 0;
    	    	
    	//KhachHang
    	lblIKHHD.setText(khachHang.getHoDem());
    	lblIKHT.setText(khachHang.getTen());
    	lblIKHCCCD.setText(khachHang.getCccd());
    	lblIKHSDT.setText(khachHang.getSdt());
    	lblIKHQT.setText(khachHang.getQuocTich());
    	
    	//DonDatPhong
    	lblIDDMDD.setText(Integer.toString(donDatPhong.getMaDonDat()));
    	lblIDDSL.setText(Integer.toString(donDatPhong.getSoLuongKhach()));
    	lblIDDHTT.setText(donDatPhong.getHinhThucThue().toString());
    	lblIDDTTTT.setText(donDatPhong.getTrangThaiThanhToan().toString());
    	lblIDDND.setText(donDatPhong.getNgayDatPhong().toString());
    	
    	//TiepTan
    	lblITTMTT.setText(tiepTan.getMaTiepTan());
    	lblITTHD.setText(tiepTan.getHoDem());
    	lblITTT.setText(tiepTan.getTen());
    	lblITTCCCD.setText(tiepTan.getCccd());
    	
    	//Phong
    	if(listDP != null) {
    		for(DonDatPhong_Phong thisDP : listDP) {
        		Phong thisPhong = thisDP.getPhongDat();
        		modelP.addRow(new String[] {
    				thisPhong.getTenPhong(),
    				Integer.toString(thisPhong.getSoPhong()),
    				thisPhong.getLoaiPhong().getTenLoaiPhong(),
    				Double.toString(thisPhong.getLoaiPhong().getDonGia()),
        		});
        	}
    	}
    	
    	//DichVu
    	if(listDDV != null) {
    		for(DonDatPhong_DichVu thisDDV : listDDV) {
        		DichVu thisDichVu = thisDDV.getDichVu();
    			modelDV.addRow(new String[] {
    				thisDichVu.getTenDichVu(),
    				thisDichVu.getLoaiDichVu().toString(),
    				Integer.toString(thisDDV.getSoLuong()),
    				Double.toString(thisDichVu.getDonGia()),
    				Double.toString(thisDDV.getSoLuong()*thisDichVu.getDonGia())
        		});
        	}
    	}
    	
    	//Calculate money
    	if(donDatPhong.getTrangThaiThanhToan().equals(Enum_TrangThaiThanhToan.Paid)) {
    		thoiDiemTraPhong = DAO_HoaDon.getHoaDonTheoMaDonDat(donDatPhong.getMaDonDat()).getNgayTraPhong();
    		thoiGianThue = tinhThoiGianThue(thoiDiemDatPhong, thoiDiemTraPhong, donDatPhong.getHinhThucThue());
    	}
  	
    	if(donDatPhong.getTrangThaiThanhToan().equals(Enum_TrangThaiThanhToan.Yet)) {
    		thoiDiemTraPhong = Timestamp.from(Instant.now());
    		thoiGianThue = tinhThoiGianThue(thoiDiemDatPhong, thoiDiemTraPhong, donDatPhong.getHinhThucThue());
    	}
    	
    	tongTienPhong = tinhTongTienPhong(listDP, donDatPhong.getHinhThucThue(), thoiGianThue);
    	tongTienDichVu = tinhTongTienDichVu(listDDV);
    	tongTienThanhToan = tinhTongTienThanhToan(tongTienPhong, tongTienDichVu);
    	
    	//TongTien
    	NumberFormat nf_vn = NumberFormat.getInstance(new Locale("vi","VN"));
    	
    	lblIMNTime.setText(thoiDiemTraPhong.toString());
    	if(donDatPhong.getHinhThucThue().equals(Enum_HinhThucThue.Days)) {
    		lblIMNDistance.setText(Long.toString(thoiGianThue) + " Ngày");
    	}
    	if(donDatPhong.getHinhThucThue().equals(Enum_HinhThucThue.Hours)) {
    		lblIMNDistance.setText(Long.toString(thoiGianThue) + " Giờ");
    	}
    	
    	lblIMNPhong.setText(nf_vn.format(tongTienPhong));
    	lblIMNDichVu.setText(nf_vn.format(tongTienDichVu));
    	lblIMNPhuPhi.setText(nf_vn.format(phuPhi));
    	lblIMNTong.setText(nf_vn.format(tongTienThanhToan));
    	
    	//Disable Button
    	if(donDatPhong.getTrangThaiThanhToan().equals(Enum_TrangThaiThanhToan.Paid)) {
    		btnThanhToan.setEnabled(false);
    		btnXoa.setEnabled(false);
    	}
    }
    
    public double tinhTongTienPhong(ArrayList<DonDatPhong_Phong> listDP, Enum_HinhThucThue enumHinhThucThue, long thoiGianThue) {
    	double tongTienPhong = 0;
    	double donGiaPhong = 0;
    	
    	if(listDP != null) {
    		if(enumHinhThucThue.equals(Enum_HinhThucThue.Days)) {
        		for(DonDatPhong_Phong thisDP : listDP) {
        			Phong thisPhong = thisDP.getPhongDat();
        			donGiaPhong = thisPhong.getLoaiPhong().getDonGia();
        			tongTienPhong += donGiaPhong*thoiGianThue;
        		}
        	}
        	if(enumHinhThucThue.equals(Enum_HinhThucThue.Hours)) {
        		for(DonDatPhong_Phong thisDP : listDP) {
        			Phong thisPhong = thisDP.getPhongDat();
        			donGiaPhong = thisPhong.getLoaiPhong().getDonGia();
        			tongTienPhong+= donGiaPhong*tiLeGioThue*thoiGianThue;
        		}
        	}
    	}
    	return tongTienPhong;
    }
    
    public double tinhTongTienDichVu(ArrayList<DonDatPhong_DichVu> listDDV) {
    	double tongTienDichVu = 0;
    	if(listDDV != null) {
    		for(DonDatPhong_DichVu thisDDV : listDDV) {
        		DichVu thisDichVu = thisDDV.getDichVu();
        		tongTienDichVu += thisDichVu.getDonGia() * thisDDV.getSoLuong();
        	}
    	}
    	return tongTienDichVu;
    }
    
    public double tinhTongTienThanhToan(double tongTienPhong, double tongTienDichVu) {
    	return tongTienPhong + tongTienDichVu + modelP.getRowCount()*phuPhi;
    }
    
    public long tinhThoiGianThue(Timestamp thoiDiemDatPhong, Timestamp thoiDiemTraPhong, Enum_HinhThucThue enumHinhThucThue) {
    	double thoiGianDatPhong = thoiDiemDatPhong.getTime();
		double thoiGianTraPhong = thoiDiemTraPhong.getTime();
		
		if(enumHinhThucThue.equals(Enum_HinhThucThue.Days)) {
			return Math.round(Math.ceil((thoiGianTraPhong-thoiGianDatPhong)/86400000));
		}
		if(enumHinhThucThue.equals(Enum_HinhThucThue.Hours)) {
			return Math.round(Math.ceil((thoiGianTraPhong-thoiGianDatPhong)/3600000));
		}
		return 0;
    }
    public void addActionListener() {
    	btnThanhToan.addActionListener(this);
    	btnXoa.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == btnThanhToan)
			thanhToanDonDatPhong();
		if(o == btnXoa)
			xoaDonDatPhong();
	}
	
	public void xoaDonDatPhong() {
		int maDonDat = 0;
		try {
			maDonDat = Integer.parseInt(lblIDDMDD.getText());
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
		int prompt = JOptionPane.showConfirmDialog(this, "Xin hãy xác nhận hủy đơn phòng", "Hủy đơn", JOptionPane.YES_NO_OPTION);
		if(prompt == JOptionPane.YES_OPTION) {
			ArrayList<DonDatPhong_Phong> listDP = DAO_DonDatPhong_Phong.getDanhSachPhongDatTheoMaDonDat(maDonDat);
			for(DonDatPhong_Phong thisDP : listDP) {
				Phong thisPhong = thisDP.getPhongDat();
				DAO_Phong.updatePhongToAvailable(thisPhong);
			}
			if(DAO_DonDatPhong_Phong.deleteDonDatPhong_Phong(maDonDat) && DAO_DonDatPhong.xoaDonDatPhong(maDonDat)) {
				JOptionPane.showMessageDialog(this, "Xóa thành công đơn đặt phòng");
				UI_Main.getUI_MainInstance().showUI(UI_DonDatPhong.newUI_DonDatPhongInstance());
				UI_DonDatPhong.getUI_DonDatPhongInstance().reloadTable();
			}
		}
	}
	
	public void thanhToanDonDatPhong() {
		int prompt = JOptionPane.showConfirmDialog(this, "Xin hãy xác nhận thanh toán", "Thanh toán", JOptionPane.YES_NO_OPTION);
		if(prompt == JOptionPane.YES_OPTION) {
			int maDonDat = Integer.parseInt(lblIDDMDD.getText());
			double phuPhi = Double.parseDouble(lblIMNPhuPhi.getText().replaceAll("\\.", ""));
			double tongThanhTien = Double.parseDouble(lblIMNTong.getText().replaceAll("\\.", ""));
			Timestamp ngayDatPhong = Timestamp.valueOf(lblIDDND.getText());
			
			DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
			
			HoaDon hoaDon = new HoaDon(donDatPhong, phuPhi, tongThanhTien, ngayDatPhong);
			DAO_HoaDon.insertNewHoaDon(hoaDon);
			DAO_DonDatPhong.setTrangThaiThanhToanMaDonDat(maDonDat, "Đã thanh toán");
			
			ArrayList<DonDatPhong_Phong> listDP = DAO_DonDatPhong_Phong.getDanhSachPhongDatTheoMaDonDat(maDonDat);
			for(DonDatPhong_Phong thisDP : listDP) {
				Phong thisPhong = thisDP.getPhongDat();
				DAO_Phong.updatePhongToAvailable(thisPhong);
			}
			
			UI_Main.getUI_MainInstance().showUI(UI_ChiTietHoaDon.newUI_ChiTietHoaDonInstance());
			int maHoaDon = DAO_HoaDon.getHoaDonTheoMaDonDat(maDonDat).getMaHoaDon();
			UI_ChiTietHoaDon.getUI_ChiTietHoaDonInstance().setHoaDon(maHoaDon);
		}
	}
}

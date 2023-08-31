package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DichVu;
import dao.DAO_DonDatPhong;
import dao.DAO_DonDatPhong_DichVu;
import dao.DAO_DonDatPhong_Phong;
import dao.DAO_Phong;
import entity.DichVu;
import entity.DonDatPhong;
import entity.DonDatPhong_DichVu;
import entity.KhachHang;
import entity.Phong;

public class UI_ChiTietDonPhong extends JPanel implements ActionListener, MouseListener, ItemListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UI_ChiTietDonPhong instance = new UI_ChiTietDonPhong();
	private DefaultTableModel modelDichVu;
	private DefaultTableModel modelBooked;
	//
	private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboDichVu;
    private javax.swing.JLabel lblICCCD;
    private javax.swing.JLabel lblIDG;
    private javax.swing.JLabel lblIHD;
    private javax.swing.JLabel lblILP;
    private javax.swing.JLabel lblIMDD;
    private javax.swing.JLabel lblIMKH;
    private javax.swing.JLabel lblIMP;
    private javax.swing.JLabel lblIQT;
    private javax.swing.JLabel lblISDT;
    private javax.swing.JLabel lblISP;
    private javax.swing.JLabel lblIST;
    private javax.swing.JLabel lblIT;
    private javax.swing.JLabel lblITP;
    private javax.swing.JLabel lblITT;
    private javax.swing.JLabel lblLCCCD;
    private javax.swing.JLabel lblLDG;
    private javax.swing.JLabel lblLHD;
    private javax.swing.JLabel lblLLP;
    private javax.swing.JLabel lblLMDD;
    private javax.swing.JLabel lblLMKH;
    private javax.swing.JLabel lblLMP;
    private javax.swing.JLabel lblLQT;
    private javax.swing.JLabel lblLSDT;
    private javax.swing.JLabel lblLSP;
    private javax.swing.JLabel lblLST;
    private javax.swing.JLabel lblLT;
    private javax.swing.JLabel lblLTP;
    private javax.swing.JLabel lblLTT;
    private javax.swing.JLabel lblLoc;
    private javax.swing.JLabel lblNone1;
    private javax.swing.JLabel lblNone2;
    private javax.swing.JLabel lblNone3;
//  private javax.swing.JLabel lblNone4;
    private javax.swing.JLabel lblNone5;
    private javax.swing.JLabel lblNone6;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDVFunc;
    private javax.swing.JPanel pnlDichVu;
    private javax.swing.JPanel pnlDichVuDat;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JPanel pnlKH1;
    private javax.swing.JPanel pnlKH2;
    private javax.swing.JPanel pnlKH3;
    private javax.swing.JPanel pnlKH4;
    private javax.swing.JPanel pnlP;
    private javax.swing.JPanel pnlP1;
    private javax.swing.JPanel pnlP2;
    private javax.swing.JPanel pnlP3;
    private javax.swing.JPanel pnlP4;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JScrollPane scrDichVu;
    private javax.swing.JScrollPane scrDichVuDat;
    private javax.swing.JTable tblDV;
    private javax.swing.JTable tblDVD;
    private javax.swing.JTextField txtSoLuong;
    //
    public static UI_ChiTietDonPhong getUI_ChiTietDonPhongInstance() {return instance;}
    public static UI_ChiTietDonPhong newUI_ChiTietDonPhongInstance() {instance = new UI_ChiTietDonPhong() ;return instance;}
    //
    public UI_ChiTietDonPhong() {
    	initComponents();
    	addTableModel();
    	addComboBoxItem();
    	updateServicesTableData();
		
    	btnThem.addActionListener(this);
		cboDichVu.addItemListener(this);
		tblDV.addMouseListener(this);
    }
    //                         
    private void initComponents() {

        pnlTitle = new javax.swing.JPanel();
        lblLMP = new javax.swing.JLabel();
        lblIMP = new javax.swing.JLabel();
        pnlSouth = new javax.swing.JPanel();
        pnlDichVu = new javax.swing.JPanel();
        pnlDVFunc = new javax.swing.JPanel();
        lblLoc = new javax.swing.JLabel();
        cboDichVu = new javax.swing.JComboBox<>();
        lblSoLuong = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        scrDichVu = new javax.swing.JScrollPane();
        tblDV = new javax.swing.JTable();
        pnlDichVuDat = new javax.swing.JPanel();
        scrDichVuDat = new javax.swing.JScrollPane();
        tblDVD = new javax.swing.JTable();
        pnlCenter = new javax.swing.JPanel();
        pnlKH = new javax.swing.JPanel();
        pnlKH1 = new javax.swing.JPanel();
        lblLMKH = new javax.swing.JLabel();
        lblIMKH = new javax.swing.JLabel();
        pnlKH2 = new javax.swing.JPanel();
        lblLHD = new javax.swing.JLabel();
        lblIHD = new javax.swing.JLabel();
        lblLT = new javax.swing.JLabel();
        lblIT = new javax.swing.JLabel();
        pnlKH3 = new javax.swing.JPanel();
        lblLCCCD = new javax.swing.JLabel();
        lblICCCD = new javax.swing.JLabel();
        pnlKH4 = new javax.swing.JPanel();
        lblLSDT = new javax.swing.JLabel();
        lblISDT = new javax.swing.JLabel();
        lblLQT = new javax.swing.JLabel();
        lblIQT = new javax.swing.JLabel();
        pnlP = new javax.swing.JPanel();
        pnlP1 = new javax.swing.JPanel();
        lblLMDD = new javax.swing.JLabel();
        lblIMDD = new javax.swing.JLabel();
        pnlP2 = new javax.swing.JPanel();
        lblLTP = new javax.swing.JLabel();
        lblITP = new javax.swing.JLabel();
        lblLTT = new javax.swing.JLabel();
        lblITT = new javax.swing.JLabel();
        pnlP3 = new javax.swing.JPanel();
        lblLSP = new javax.swing.JLabel();
        lblISP = new javax.swing.JLabel();
        lblLST = new javax.swing.JLabel();
        lblIST = new javax.swing.JLabel();
        pnlP4 = new javax.swing.JPanel();
        lblLLP = new javax.swing.JLabel();
        lblILP = new javax.swing.JLabel();
        lblLDG = new javax.swing.JLabel();
        lblIDG = new javax.swing.JLabel();
        lblNone1 = new javax.swing.JLabel("");
        lblNone2 = new javax.swing.JLabel("");
        lblNone3 = new javax.swing.JLabel("");
//      lblNone4 = new javax.swing.JLabel("");
        lblNone5 = new javax.swing.JLabel("");
        lblNone6 = new javax.swing.JLabel("");

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new java.awt.BorderLayout(3, 3));

        pnlTitle.setBackground(new java.awt.Color(204, 204, 204));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTitle.setPreferredSize(new java.awt.Dimension(935, 50));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblLMP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLMP.setForeground(new java.awt.Color(102, 102, 102));
        lblLMP.setText("Mã phòng: ");
        pnlTitle.add(lblLMP, new java.awt.GridBagConstraints());

        lblIMP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlTitle.add(lblIMP, new java.awt.GridBagConstraints());

        add(pnlTitle, java.awt.BorderLayout.NORTH);

        pnlSouth.setBackground(new java.awt.Color(204, 204, 204));
        pnlSouth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlSouth.setPreferredSize(new java.awt.Dimension(935, 300));
        pnlSouth.setLayout(new java.awt.BorderLayout());

        pnlDichVu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dịch vụ"));
        pnlDichVu.setOpaque(false);
        pnlDichVu.setPreferredSize(new java.awt.Dimension(400, 296));
        pnlDichVu.setLayout(new java.awt.BorderLayout());

        pnlDVFunc.setOpaque(false);
        pnlDVFunc.setPreferredSize(new java.awt.Dimension(390, 40));

        lblLoc.setText("Lọc theo:");
        pnlDVFunc.add(lblLoc);

        cboDichVu.setPreferredSize(new java.awt.Dimension(140, 30));
        pnlDVFunc.add(cboDichVu);

        lblSoLuong.setText("Số lượng:");
        pnlDVFunc.add(lblSoLuong);

        txtSoLuong.setPreferredSize(new java.awt.Dimension(40, 30));
        pnlDVFunc.add(txtSoLuong);

        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(75, 30));
        pnlDVFunc.add(btnThem);

        pnlDichVu.add(pnlDVFunc, java.awt.BorderLayout.SOUTH);

        scrDichVu.setViewportView(tblDV);

        pnlDichVu.add(scrDichVu, java.awt.BorderLayout.CENTER);

        pnlSouth.add(pnlDichVu, java.awt.BorderLayout.WEST);

        pnlDichVuDat.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dịch vụ đã đặt"));
        pnlDichVuDat.setOpaque(false);
        pnlDichVuDat.setLayout(new java.awt.BorderLayout());

        scrDichVuDat.setViewportView(tblDVD);

        pnlDichVuDat.add(scrDichVuDat, java.awt.BorderLayout.CENTER);

        pnlSouth.add(pnlDichVuDat, java.awt.BorderLayout.CENTER);

        add(pnlSouth, java.awt.BorderLayout.SOUTH);

        pnlCenter.setBackground(new java.awt.Color(204, 204, 204));
        pnlCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCenter.setLayout(new java.awt.GridLayout(1, 1));

        pnlKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin Khách hàng"));
        pnlKH.setOpaque(false);
        pnlKH.setLayout(new java.awt.GridLayout(4, 1));

        pnlKH1.setOpaque(false);
        pnlKH1.setLayout(new java.awt.GridLayout());

        lblLMKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMKH.setForeground(new java.awt.Color(102, 102, 102));
        lblLMKH.setText("Mã khách hàng:");
        pnlKH1.add(lblLMKH);
        pnlKH1.add(lblIMKH);
        pnlKH1.add(lblNone1);
        pnlKH1.add(lblNone2);

        pnlKH.add(pnlKH1);

        pnlKH2.setOpaque(false);
        pnlKH2.setLayout(new java.awt.GridLayout());

        lblLHD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLHD.setForeground(new java.awt.Color(102, 102, 102));
        lblLHD.setText("Họ đệm:");
        pnlKH2.add(lblLHD);
        pnlKH2.add(lblIHD);

        lblLT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLT.setForeground(new java.awt.Color(102, 102, 102));
        lblLT.setText("Tên:");
        pnlKH2.add(lblLT);
        pnlKH2.add(lblIT);

        pnlKH.add(pnlKH2);

        pnlKH3.setOpaque(false);
        pnlKH3.setLayout(new java.awt.GridLayout());

        lblLCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLCCCD.setForeground(new java.awt.Color(102, 102, 102));
        lblLCCCD.setText("Số Căn Cước Công Dân:");
        pnlKH3.add(lblLCCCD);
        pnlKH3.add(lblICCCD);
        pnlKH3.add(lblNone3);
//       pnlKH3.add(lblNone4);

        pnlKH.add(pnlKH3);

        pnlKH4.setOpaque(false);
        pnlKH4.setLayout(new java.awt.GridLayout());

        lblLSDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLSDT.setForeground(new java.awt.Color(102, 102, 102));
        lblLSDT.setText("Quốc Tịch:");
        pnlKH4.add(lblLSDT);
        pnlKH4.add(lblISDT);

        lblLQT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLQT.setForeground(new java.awt.Color(102, 102, 102));
        lblLQT.setText("Số điện thoại:");
        pnlKH4.add(lblLQT);
        pnlKH4.add(lblIQT);

        pnlKH.add(pnlKH4);

        pnlCenter.add(pnlKH);

        pnlP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chi tiết Phòng"));
        pnlP.setOpaque(false);
        pnlP.setLayout(new java.awt.GridLayout(4, 1));

        pnlP1.setOpaque(false);
        pnlP1.setLayout(new java.awt.GridLayout());

        lblLMDD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLMDD.setForeground(new java.awt.Color(102, 102, 102));
        lblLMDD.setText("Mã Đơn đặt phòng:");
        pnlP1.add(lblLMDD);
        pnlP1.add(lblIMDD);
        pnlP1.add(lblNone5);
        pnlP1.add(lblNone6);

        pnlP.add(pnlP1);

        pnlP2.setOpaque(false);
        pnlP2.setLayout(new java.awt.GridLayout());

        lblLTP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTP.setForeground(new java.awt.Color(102, 102, 102));
        lblLTP.setText("Tên Phòng:");
        pnlP2.add(lblLTP);
        pnlP2.add(lblITP);

        lblLTT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLTT.setForeground(new java.awt.Color(102, 102, 102));
        lblLTT.setText("Tình trạng:");
        pnlP2.add(lblLTT);
        pnlP2.add(lblITT);

        pnlP.add(pnlP2);

        pnlP3.setOpaque(false);
        pnlP3.setLayout(new java.awt.GridLayout());

        lblLSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLSP.setForeground(new java.awt.Color(102, 102, 102));
        lblLSP.setText("Số phòng:");
        pnlP3.add(lblLSP);
        pnlP3.add(lblISP);

        lblLST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLST.setForeground(new java.awt.Color(102, 102, 102));
        lblLST.setText("Số tầng:");
        pnlP3.add(lblLST);
        pnlP3.add(lblIST);

        pnlP.add(pnlP3);

        pnlP4.setOpaque(false);
        pnlP4.setLayout(new java.awt.GridLayout());

        lblLLP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLLP.setForeground(new java.awt.Color(102, 102, 102));
        lblLLP.setText("Loại Phòng:");
        pnlP4.add(lblLLP);
        pnlP4.add(lblILP);

        lblLDG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLDG.setForeground(new java.awt.Color(102, 102, 102));
        lblLDG.setText("Đơn giá:");
        pnlP4.add(lblLDG);
        pnlP4.add(lblIDG);

        pnlP.add(pnlP4);

        pnlCenter.add(pnlP);

        add(pnlCenter, java.awt.BorderLayout.CENTER);
    }
    
    public void addTableModel() {
    	modelDichVu = new DefaultTableModel(new String[] {"Mã Dịch vu", "Tên Dịch vụ", "Đơn giá", "Loại Dịch vụ"}, 0);
    	modelBooked = new DefaultTableModel(new String[] {"Mã Đơn đặt", "Mã Dịch vụ", "Tên Dịch vụ", "Số lượng", "Đơn giá", "Thành tiền"}, 0);
    	
    	tblDV.setModel(modelDichVu);
    	tblDVD.setModel(modelBooked);
    }
    
    public void setThongTinUI(String maPhongCanSet) {
		Phong phong = DAO_Phong.getPhongTheoMaPhong(maPhongCanSet);
		int maPhong = DAO_DonDatPhong_Phong.getMaDonDatGanNhatCuaPhong(phong.getMaPhong());
		ArrayList<DonDatPhong_DichVu> listDVD = DAO_DonDatPhong_DichVu.getDanhSachDichVuDatTheoMaDonDatMaPhong(maPhong, phong.getMaPhong());
		DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maPhong);
		KhachHang khachHang = donDatPhong.getKhachHang();
		
		lblIMP.setText(phong.getMaPhong());
		
		lblIMKH.setText(Integer.toString(khachHang.getMaKhachHang()));
		lblIHD.setText(khachHang.getHoDem());
		lblIT.setText(khachHang.getTen());
		lblICCCD.setText(khachHang.getCccd());
		lblIQT.setText(khachHang.getQuocTich());
		lblISDT.setText(khachHang.getSdt());
		
		lblIMDD.setText(Integer.toString(donDatPhong.getMaDonDat()));
		lblITP.setText(phong.getTenPhong());
		lblITT.setText(phong.getTinhTrang().toString());
		lblISP.setText(Integer.toString(phong.getSoPhong()));
		lblIST.setText(Integer.toString(phong.getSoTang()));
		lblILP.setText(phong.getLoaiPhong().getTenLoaiPhong());
		lblIDG.setText(Double.toString(phong.getLoaiPhong().getDonGia()));
		
		if(listDVD != null) {
			for(DonDatPhong_DichVu thisDDV : listDVD) {
				DichVu thisDichVu = thisDDV.getDichVu();
				modelBooked.addRow(new String[] {
					Integer.toString(thisDDV.getDonDatPhong().getMaDonDat()),
					thisDichVu.getMaDichVu(),
					thisDichVu.getTenDichVu(),
					Integer.toString(thisDDV.getSoLuong()),
					Double.toString(thisDichVu.getDonGia()),
					Double.toString(thisDDV.getSoLuong()*thisDichVu.getDonGia())
				});
			}
		}
	}
    
    private void updateServicesTableData() {
		ArrayList<DichVu> listDV = DAO_DichVu.getAllDSDichVu();
		modelDichVu.setRowCount(0);
		for (DichVu dichvu : listDV) {
			String[] rowDatas = {dichvu.getMaDichVu(), dichvu.getTenDichVu(), 
					dichvu.getDonGia() + "", dichvu.getLoaiDichVu().toString()};
			modelDichVu.addRow(rowDatas);
		}
	}
    
    @Override
	public void itemStateChanged(ItemEvent e) {
		Object o = cboDichVu.getSelectedItem();
		if (o.equals("Foods")) {
			modelDichVu.setRowCount(0);
			ArrayList<DichVu> listDV = DAO_DichVu.getDSDichVuTheoThucAn();
			for (DichVu dichvu : listDV) {
				String[] rowDatas = {dichvu.getMaDichVu(), dichvu.getTenDichVu(), 
						dichvu.getDonGia() + "", dichvu.getLoaiDichVu().toString() + ""};
				modelDichVu.addRow(rowDatas);
			}
		} else if (o.equals("Drinks")) {
			modelDichVu.setRowCount(0);
			ArrayList<DichVu> listDV = DAO_DichVu.getDSDichVuTheoDoUong();
			for (DichVu dichvu : listDV) {
				String[] rowDatas = {dichvu.getMaDichVu(), dichvu.getTenDichVu(), 
						dichvu.getDonGia() + "", dichvu.getLoaiDichVu().toString() + ""};
				modelDichVu.addRow(rowDatas);
			}
		} else if (o.equals("Others Services")) {
			modelDichVu.setRowCount(0);
			ArrayList<DichVu> listDV = DAO_DichVu.getDSDichVuConLai();
			for (DichVu dichvu : listDV) {
				String[] rowDatas = {dichvu.getMaDichVu(), dichvu.getTenDichVu(), 
						dichvu.getDonGia() + "", dichvu.getLoaiDichVu().toString() + ""};
				modelDichVu.addRow(rowDatas);
			}
		} else
			updateServicesTableData();
	}
    
    public void addComboBoxItem() {
    	cboDichVu.addItem("All Services");
    	cboDichVu.addItem("Foods");
    	cboDichVu.addItem("Drinks");
    	cboDichVu.addItem("Others Services");
    }
    
    public void themDichVu() {
    	
    }
    
    @Override
	public void mouseClicked(MouseEvent e) {
		int row = tblDV.getSelectedRow();
		if (row != -1) {
			btnThem.setEnabled(true);
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == btnThem) {
			int rowCount = tblDV.getSelectedRowCount();
			if(rowCount > 1) {
				JOptionPane.showMessageDialog(this, "Vui lòng chọn duy nhất một Dịch vụ");
				return;
			}
			if(rowCount == 0) {
				JOptionPane.showMessageDialog(this, "Vui lòng chọn một Dịch vụ");
				return;
			}
			int soLuong = 0;
			try {
				soLuong = Integer.parseInt(txtSoLuong.getText());
			}
			catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(
						this, 
						"Vui lòng kiểm tra lại số lượng nhập",
						"Lỗi thao tác",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			DonDatPhong dondatPhong = null;
			try {
				dondatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(Integer.parseInt(lblIMDD.getText()));
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(
						this, 
						"Lỗi xảy ra khi thao tác Đơn đặt phòng",
						"Lỗi hệ thống",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			Phong phong = DAO_Phong.getPhongTheoMaPhong(lblIMP.getText());
			
			int row = tblDV.getSelectedRow();
			DichVu dichVu = DAO_DichVu.getDichVuTheoMaDichVu(tblDV.getValueAt(row, 0).toString());
			
			DonDatPhong_DichVu donDatPhong_DichVu = new DonDatPhong_DichVu(dondatPhong, dichVu, phong, soLuong);
			
			if(DAO_DonDatPhong_DichVu.insertDonDatPhong_DichVu(donDatPhong_DichVu) == true) {
				modelBooked.addRow(new String[] {
					Integer.toString(donDatPhong_DichVu.getDonDatPhong().getMaDonDat()),
					donDatPhong_DichVu.getDichVu().getMaDichVu(),
					donDatPhong_DichVu.getDichVu().getTenDichVu(),
					Integer.toString(donDatPhong_DichVu.getSoLuong()),
					Double.toString(donDatPhong_DichVu.getDichVu().getDonGia()),
					Double.toString(donDatPhong_DichVu.getSoLuong()*donDatPhong_DichVu.getDichVu().getDonGia())
				});
				txtSoLuong.setText("");
			}
			else {
				JOptionPane.showMessageDialog(
						this, 
						"Lỗi xảy ra khi thêm vào Cơ sở dữ liệu",
						"Lỗi hệ thống",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
	}
}

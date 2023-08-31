package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import dao.DAO_DonDatPhong;
import entity.DonDatPhong;

public class UI_DonDatPhong extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UI_DonDatPhong instance = new UI_DonDatPhong();
	private DefaultTableModel modelDD;
	//
	private javax.swing.JButton btnChiTiet;
    private javax.swing.ButtonGroup btnGroupLoc;
    private javax.swing.ButtonGroup btnGroupTim;
//    private javax.swing.JButton btnHuyDD;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnTaiLai;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFunc;
    private javax.swing.JPanel pnlLoc;
    private javax.swing.JPanel pnlTim;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JRadioButton radCCCD;
    private javax.swing.JRadioButton radMDD;
    private javax.swing.JRadioButton radND;
    private javax.swing.JRadioButton radTTTT;
    private javax.swing.JScrollPane scrDD;
    private javax.swing.JTable tblDD;
    //
    public UI_DonDatPhong() {
    	initComponents();
    	addTableModel();
    	addActionListener();
    	addButtonGroup();
    	setDecorateButton();
    }
    //
    public static UI_DonDatPhong getUI_DonDatPhongInstance() {return instance;}
    public static UI_DonDatPhong newUI_DonDatPhongInstance() {instance = new UI_DonDatPhong(); return instance;}
    //
    private void initComponents() {

        btnGroupTim = new javax.swing.ButtonGroup();
        btnGroupLoc = new javax.swing.ButtonGroup();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlFunc = new javax.swing.JPanel();
        btnChiTiet = new javax.swing.JButton();
//        btnHuyDD = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        pnlTim = new javax.swing.JPanel();
        radMDD = new javax.swing.JRadioButton();
        radCCCD = new javax.swing.JRadioButton();
        btnLoc = new javax.swing.JButton();
        pnlLoc = new javax.swing.JPanel();
        radTTTT = new javax.swing.JRadioButton();
        radND = new javax.swing.JRadioButton();
        btnTaiLai = new javax.swing.JButton();
        pnlTable = new javax.swing.JPanel();
        scrDD = new javax.swing.JScrollPane();
        tblDD = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setDoubleBuffered(false);
        setLayout(new java.awt.BorderLayout(3, 3));

        pnlTitle.setBackground(new java.awt.Color(204, 204, 204));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTitle.setPreferredSize(new java.awt.Dimension(935, 50));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Danh sách Đơn đặt phòng");
        pnlTitle.add(lblTitle, new java.awt.GridBagConstraints());

        add(pnlTitle, java.awt.BorderLayout.PAGE_START);

        pnlFunc.setBackground(new java.awt.Color(204, 204, 204));
        pnlFunc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlFunc.setPreferredSize(new java.awt.Dimension(175, 507));

        btnChiTiet.setBackground(new java.awt.Color(128, 128, 255));
        btnChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnChiTiet.setForeground(new java.awt.Color(34, 34, 34));
        btnChiTiet.setText("Chi tiết");
        btnChiTiet.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlFunc.add(btnChiTiet);

//        btnHuyDD.setBackground(new java.awt.Color(128, 128, 255));
//        btnHuyDD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
//        btnHuyDD.setForeground(new java.awt.Color(34, 34, 34));
//        btnHuyDD.setText("Hủy Đơn đặt");
//        btnHuyDD.setToolTipText("");
//        btnHuyDD.setPreferredSize(new java.awt.Dimension(150, 50));
//        pnlFunc.add(btnHuyDD);

        btnTim.setBackground(new java.awt.Color(128, 128, 255));
        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTim.setForeground(new java.awt.Color(34, 34, 34));
        btnTim.setText("Tìm");
        btnTim.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlFunc.add(btnTim);

        pnlTim.setOpaque(false);
        pnlTim.setPreferredSize(new java.awt.Dimension(150, 75));
        pnlTim.setLayout(new javax.swing.BoxLayout(pnlTim, javax.swing.BoxLayout.Y_AXIS));

        radMDD.setBackground(new java.awt.Color(204, 204, 204));
        radMDD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radMDD.setText("Theo Mã Đơn đặt");
        pnlTim.add(radMDD);

        radCCCD.setBackground(new java.awt.Color(204, 204, 204));
        radCCCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radCCCD.setText("Theo CCCD Khách");
        pnlTim.add(radCCCD);

        pnlFunc.add(pnlTim);

        btnLoc.setBackground(new java.awt.Color(128, 128, 255));
        btnLoc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLoc.setForeground(new java.awt.Color(34, 34, 34));
        btnLoc.setText("Lọc");
        btnLoc.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlFunc.add(btnLoc);

        pnlLoc.setOpaque(false);
        pnlLoc.setPreferredSize(new java.awt.Dimension(150, 75));
        pnlLoc.setLayout(new javax.swing.BoxLayout(pnlLoc, javax.swing.BoxLayout.Y_AXIS));

        radTTTT.setBackground(new java.awt.Color(204, 204, 204));
        radTTTT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radTTTT.setText("Theo TT Thanh Toán");
        pnlLoc.add(radTTTT);

        radND.setBackground(new java.awt.Color(204, 204, 204));
        radND.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radND.setText("Theo Ngày đặt");
        pnlLoc.add(radND);

        pnlFunc.add(pnlLoc);

        btnTaiLai.setBackground(new java.awt.Color(255, 128, 128));
        btnTaiLai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTaiLai.setForeground(new java.awt.Color(34, 34, 34));
        btnTaiLai.setText("Tải lại");
        btnTaiLai.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlFunc.add(btnTaiLai);

        add(pnlFunc, java.awt.BorderLayout.LINE_END);

        pnlTable.setBackground(new java.awt.Color(204, 204, 204));
        pnlTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTable.setLayout(new java.awt.BorderLayout());

        tblDD.setRowHeight(40);
        scrDD.setViewportView(tblDD);

        pnlTable.add(scrDD, java.awt.BorderLayout.CENTER);

        add(pnlTable, java.awt.BorderLayout.CENTER);
    }
    public void addTableModel() {
    	modelDD = new DefaultTableModel(new String [] {"Mã Đơn đặt", "Mã Khách hàng", "Lượng Khách", "Hình Thức Thuê", "TT Thanh Toán", "Ngày Đặt"}, 0);
    	
    	tblDD.setModel(modelDD);
    	
    	tblDD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    public void addActionListener() {
    	btnChiTiet.addActionListener(this);
//		btnHuyDD.addActionListener(this);
		btnTim.addActionListener(this);
		btnLoc.addActionListener(this);
		btnTaiLai.addActionListener(this);
    }
    public void addButtonGroup() {
    	btnGroupTim.add(radMDD);
    	btnGroupTim.add(radCCCD);
    	
    	btnGroupLoc.add(radTTTT);
    	btnGroupLoc.add(radND);
    }
    public void addDanhSachDonDatPhong() {
    	ArrayList<DonDatPhong> listDDP = DAO_DonDatPhong.getDanhSachDonDatPhong();
    	if(listDDP == null) return;
    	else {
    		for(DonDatPhong thisDDP : listDDP) {
        		modelDD.addRow(new String[] {
        			Integer.toString(thisDDP.getMaDonDat()),
        			Integer.toString(thisDDP.getKhachHang().getMaKhachHang()),
        			Integer.toString(thisDDP.getSoLuongKhach()),
        			thisDDP.getHinhThucThue().toString(),
        			thisDDP.getTrangThaiThanhToan().toString(),
        			thisDDP.getNgayDatPhong().toString()
        		});
        	}
    	}
    }
    private void setDecorateButton() {
		btnChiTiet.setFocusPainted(false);
//		btnHuyDD.setFocusPainted(false);
		btnTim.setFocusPainted(false);
		btnLoc.setFocusPainted(false);
		btnTaiLai.setFocusPainted(false);
	}
    private void xemChiTiet() {
    	int row = tblDD.getSelectedRow();
		if(row == -1)
			JOptionPane.showMessageDialog(this, "Vui lòng chọn Hóa đơn cần xem");
		else {
			UI_Main.getUI_MainInstance().showUI(UI_ChiTietDonDat.newUI_ChiTietDonDatInstance());
			UI_ChiTietDonDat.getUI_ChiTietDonDatInstance().setDonDat(Integer.parseInt(modelDD.getValueAt(row, 0).toString()));;
		}
    }
    public void reloadTable() {
    	modelDD.getDataVector().removeAllElements();
		addDanhSachDonDatPhong();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == btnChiTiet)
			xemChiTiet();
//		if(o == btnHuyDD);
		if(o == btnTim)
			timDonDatPhong();
		if(o == btnLoc)
			locDonDatPhong();
		if(o == btnTaiLai)
			reloadTable();
	}
	public void timDonDatPhong() {
		if(radMDD.isSelected()) {
			String stringMaDonDat = JOptionPane.showInputDialog(this, "Nhập Mã đơn đặt: ", "Tìm theo Mã đơn đặt", JOptionPane.PLAIN_MESSAGE);
			if(stringMaDonDat == null || stringMaDonDat.isBlank()) {
				JOptionPane.showMessageDialog(this, "Hủy thao tác");
				return;
			}
			int maDonDat = 0;
			try {
				maDonDat = Integer.parseInt(stringMaDonDat);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng dạng", "Lỗi thao tác", JOptionPane.ERROR_MESSAGE);
				return;
			}
			DonDatPhong donDatPhong = DAO_DonDatPhong.getDonDatPhongTheoMaDonDat(maDonDat);
			if(donDatPhong == null) {
				JOptionPane.showMessageDialog(this, "Đơn đặt không tồn tại");
				return;
			}
			else {
				modelDD.getDataVector().removeAllElements();
				modelDD.addRow(new String[] {
					Integer.toString(donDatPhong.getMaDonDat()),
        			Integer.toString(donDatPhong.getKhachHang().getMaKhachHang()),
        			Integer.toString(donDatPhong.getSoLuongKhach()),
        			donDatPhong.getHinhThucThue().toString(),
        			donDatPhong.getTrangThaiThanhToan().toString(),
        			donDatPhong.getNgayDatPhong().toString()	
				});
			}
		}
		else if(radCCCD.isSelected()) {
			String stringCCCD = JOptionPane.showInputDialog(this, "Nhập Căn cước công dân: ", "Tìm theo Căn Cước Công Dân", JOptionPane.PLAIN_MESSAGE);
			if(stringCCCD == null || stringCCCD.isBlank()) {
				JOptionPane.showMessageDialog(this, "Hủy thao tác");
				return;
			}
			ArrayList<DonDatPhong> listDonDatPhong = DAO_DonDatPhong.getDanhSachDonDatPhong();
			ArrayList<DonDatPhong> listFilter = new ArrayList<DonDatPhong>();
			for(DonDatPhong thisDonDatPhong : listDonDatPhong) {
				if(thisDonDatPhong.getKhachHang().getCccd().equals(stringCCCD))
					listFilter.add(thisDonDatPhong);
			}
			if(listFilter.size() == 0) {
				JOptionPane.showMessageDialog(this, "Đơn đặt có Khách hàng có Căn Cước Công Dân này không tồn tại");
			}
			else {
				modelDD.getDataVector().removeAllElements();
				for(DonDatPhong donDatPhong : listFilter) {
					modelDD.addRow(new String[] {
							Integer.toString(donDatPhong.getMaDonDat()),
		        			Integer.toString(donDatPhong.getKhachHang().getMaKhachHang()),
		        			Integer.toString(donDatPhong.getSoLuongKhach()),
		        			donDatPhong.getHinhThucThue().toString(),
		        			donDatPhong.getTrangThaiThanhToan().toString(),
		        			donDatPhong.getNgayDatPhong().toString()	
						});
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn một lựa chọn tìm");
		}
	}
	
	public void locDonDatPhong() {
		if(radTTTT.isSelected()) {
			String stringTTTT = JOptionPane.showInputDialog(this, "Nhập Trạng thái thanh toán (Yet/Paid): ", "Lọc theo Trạng thái thanh toán", JOptionPane.PLAIN_MESSAGE);
			if(stringTTTT == null || stringTTTT.isBlank()) {
				JOptionPane.showMessageDialog(this, "Hủy thao tác");
				return;
			}
			ArrayList<DonDatPhong> listDonDatPhong = DAO_DonDatPhong.getDanhSachDonDatPhong();
			if(stringTTTT.equals("Yet") || (stringTTTT.equals("Paid"))) {
				modelDD.getDataVector().removeAllElements();
				for(DonDatPhong thisDonDatPhong : listDonDatPhong) {
					if(thisDonDatPhong.getTrangThaiThanhToan().toString().equals(stringTTTT)) {
						modelDD.addRow(new String[] {
								Integer.toString(thisDonDatPhong.getMaDonDat()),
			        			Integer.toString(thisDonDatPhong.getKhachHang().getMaKhachHang()),
			        			Integer.toString(thisDonDatPhong.getSoLuongKhach()),
			        			thisDonDatPhong.getHinhThucThue().toString(),
			        			thisDonDatPhong.getTrangThaiThanhToan().toString(),
			        			thisDonDatPhong.getNgayDatPhong().toString()	
							});
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng Trạng thái thanh toán");
			}
		}
		else if(radND.isSelected()) {
			String stringND = JOptionPane.showInputDialog(this, "Nhập Ngày đặt phòng (dd/MM/yyyy): ", "Lọc theo Ngày đặt phòng", JOptionPane.PLAIN_MESSAGE);
			if(stringND == null || stringND.isBlank()) {
				JOptionPane.showMessageDialog(this, "Hủy thao tác");
				return;
			}
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate ngayCanLoc = LocalDate.parse(stringND, dtf);
			
	        modelDD.getDataVector().removeAllElements();
	        ArrayList<DonDatPhong> listDonDatPhong = DAO_DonDatPhong.getDanhSachDonDatPhong();
	        for(DonDatPhong thisDonDatPhong : listDonDatPhong) {
	        	LocalDate ngayDatPhong = thisDonDatPhong.getNgayDatPhong().toLocalDateTime().toLocalDate();
	        	if(ngayCanLoc.isEqual(ngayDatPhong)) {
	        		modelDD.addRow(new String[] {
						Integer.toString(thisDonDatPhong.getMaDonDat()),
	        			Integer.toString(thisDonDatPhong.getKhachHang().getMaKhachHang()),
	        			Integer.toString(thisDonDatPhong.getSoLuongKhach()),
	        			thisDonDatPhong.getHinhThucThue().toString(),
	        			thisDonDatPhong.getTrangThaiThanhToan().toString(),
	        			thisDonDatPhong.getNgayDatPhong().toString()	
					});
	        	}
	        }
		}
		else {
			JOptionPane.showMessageDialog(this, "Vui lòng chọn một lựa chọn lọc");
		}
	}
}

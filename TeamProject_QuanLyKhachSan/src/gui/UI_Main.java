package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import connectDB.ConnectDB;
import dao.DAO_Phong;

public class UI_Main extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UI_Main instance = new UI_Main();
	
	private javax.swing.JPanel borderBot;
    private javax.swing.JPanel borderLeft;
    private javax.swing.JPanel borderRight;
    private javax.swing.JPanel borderTop;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDonDat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTiepTan;
    private javax.swing.JLabel lblHolder1;
    private javax.swing.JLabel lblHolder2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlTask;
    private javax.swing.JPanel pnlTaskbar;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlWork;
    
    ArrayList<JButton> functionalButton = new ArrayList<JButton>();
    //
    public static UI_Main getUI_MainInstance() {return instance;}
    public static void newUI_MainInstance() {instance = new UI_Main();}
    //
	public UI_Main() {
        initComponents();
        addFunctionalButton();
        setDecorateButton();
        showUI(UI_Phong.getUI_PhongInstance());
        UI_Phong.getUI_PhongInstance().addAllTableData(DAO_Phong.getDanhSachPhong());;
        addActionPerform();
    }
	//                        
    private void initComponents() {

        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlTaskbar = new javax.swing.JPanel();
        btnPhong = new javax.swing.JButton();
        btnDonDat = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnTiepTan = new javax.swing.JButton();
        lblHolder1 = new javax.swing.JLabel();
        lblHolder2 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        pnlWork = new javax.swing.JPanel();
        pnlTask = new javax.swing.JPanel();
        borderTop = new javax.swing.JPanel();
        borderBot = new javax.swing.JPanel();
        borderLeft = new javax.swing.JPanel();
        borderRight = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Đặt Phòng Khách Sạn");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new java.awt.BorderLayout(3, 3));
        setUndecorated(true);
    	setLocationRelativeTo(null);

        pnlTitle.setBackground(new java.awt.Color(204, 204, 204));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTitle.setPreferredSize(new java.awt.Dimension(800, 50));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lblTitle.setText("Quản Lý Đặt Phòng Khách Sạn");
        pnlTitle.add(lblTitle, new java.awt.GridBagConstraints());

        getContentPane().add(pnlTitle, java.awt.BorderLayout.PAGE_START);

        pnlTaskbar.setBackground(new java.awt.Color(153, 153, 153));
        pnlTaskbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTaskbar.setPreferredSize(new java.awt.Dimension(200, 350));
        pnlTaskbar.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        btnPhong.setText("Phòng");
        pnlTaskbar.add(btnPhong);

        btnDonDat.setText("Đơn Đặt");
        pnlTaskbar.add(btnDonDat);

        btnHoaDon.setText("Hóa Đơn");
        pnlTaskbar.add(btnHoaDon);

        btnThongKe.setText("Thống Kê");
        pnlTaskbar.add(btnThongKe);

        btnTiepTan.setText("Tiếp Tân");
        pnlTaskbar.add(btnTiepTan);
        pnlTaskbar.add(lblHolder1);
        pnlTaskbar.add(lblHolder2);

        btnDangXuat.setText("Đăng Xuất");
        pnlTaskbar.add(btnDangXuat);

        getContentPane().add(pnlTaskbar, java.awt.BorderLayout.LINE_END);

        pnlWork.setBackground(new java.awt.Color(153, 153, 153));
        pnlWork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlWork.setLayout(new java.awt.BorderLayout());

        pnlTask.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnlTaskLayout = new javax.swing.GroupLayout(pnlTask);
        pnlTask.setLayout(pnlTaskLayout);
        pnlTaskLayout.setHorizontalGroup(
            pnlTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        pnlTaskLayout.setVerticalGroup(
            pnlTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        pnlWork.add(pnlTask, java.awt.BorderLayout.CENTER);

        borderTop.setBackground(new java.awt.Color(102, 102, 102));
        borderTop.setPreferredSize(new java.awt.Dimension(600, 25));

        javax.swing.GroupLayout borderTopLayout = new javax.swing.GroupLayout(borderTop);
        borderTop.setLayout(borderTopLayout);
        borderTopLayout.setHorizontalGroup(
            borderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        borderTopLayout.setVerticalGroup(
            borderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        pnlWork.add(borderTop, java.awt.BorderLayout.PAGE_START);

        borderBot.setBackground(new java.awt.Color(102, 102, 102));
        borderBot.setPreferredSize(new java.awt.Dimension(600, 25));

        javax.swing.GroupLayout borderBotLayout = new javax.swing.GroupLayout(borderBot);
        borderBot.setLayout(borderBotLayout);
        borderBotLayout.setHorizontalGroup(
            borderBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
        );
        borderBotLayout.setVerticalGroup(
            borderBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        pnlWork.add(borderBot, java.awt.BorderLayout.PAGE_END);

        borderLeft.setBackground(new java.awt.Color(102, 102, 102));
        borderLeft.setPreferredSize(new java.awt.Dimension(25, 300));

        javax.swing.GroupLayout borderLeftLayout = new javax.swing.GroupLayout(borderLeft);
        borderLeft.setLayout(borderLeftLayout);
        borderLeftLayout.setHorizontalGroup(
            borderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        borderLeftLayout.setVerticalGroup(
            borderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        pnlWork.add(borderLeft, java.awt.BorderLayout.LINE_START);

        borderRight.setBackground(new java.awt.Color(102, 102, 102));
        borderRight.setPreferredSize(new java.awt.Dimension(25, 300));

        javax.swing.GroupLayout borderRightLayout = new javax.swing.GroupLayout(borderRight);
        borderRight.setLayout(borderRightLayout);
        borderRightLayout.setHorizontalGroup(
            borderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        borderRightLayout.setVerticalGroup(
            borderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        pnlWork.add(borderRight, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlWork, java.awt.BorderLayout.CENTER);

        pack();
    }
    private void addFunctionalButton() {
		functionalButton.add(btnPhong);
		functionalButton.add(btnDonDat);
		functionalButton.add(btnHoaDon);
		functionalButton.add(btnTiepTan);
		functionalButton.add(btnThongKe);
		functionalButton.add(btnDangXuat);
	}
    private void setDecorateOneButton(JButton button) {
		button.setForeground(Color.decode("#222222"));
		button.setBackground(Color.decode("#8080FF"));
		button.setPreferredSize(new Dimension(0, 50));
		button.setFont(new Font("Arial", Font.PLAIN, 18));
		button.setFocusPainted(false);
		button.setBorder(BorderFactory.createBevelBorder(
				BevelBorder.RAISED, Color.white, Color.black));	
	}
    private void setDecorateButton() {
		for(JButton thisButton : functionalButton)
			setDecorateOneButton(thisButton);
		btnDangXuat.setForeground(Color.decode("#222222"));
		btnDangXuat.setBackground(Color.decode("#FF8080"));
	}
    private void checkPanelInstance(JPanel panel) {
		if(panel instanceof UI_Phong) {
			btnPhong.setBackground(Color.decode("#3333FF"));
		}
		if(panel instanceof UI_TiepTan) {
			btnTiepTan.setBackground(Color.decode("#3333FF"));
		}
		if(panel instanceof UI_DonDatPhong) {
			btnDonDat.setBackground(Color.decode("#3333FF"));
		}
		if(panel instanceof UI_HoaDon) {
			btnHoaDon.setBackground(Color.decode("#3333FF"));
		}
		if(panel instanceof UI_ThongKe) {
			btnThongKe.setBackground(Color.decode("#3333FF"));
		}
	}
    public void showUI(JPanel panel) {
		pnlTask.removeAll();
		pnlTask.revalidate();
		pnlTask.repaint();
		pnlTask.setLayout(new BorderLayout());
		pnlTask.add(panel, BorderLayout.CENTER);
		setDecorateButton();
		checkPanelInstance(panel);
	}
    private void addActionPerform() {
		btnPhong.addActionListener(this);
		btnTiepTan.addActionListener(this);
		btnDonDat.addActionListener(this);
		btnHoaDon.addActionListener(this);
		btnThongKe.addActionListener(this);
		btnDangXuat.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int logOutPrompt = JOptionPane.showConfirmDialog(getUI_MainInstance(), "Xin hãy xác nhận Đăng xuất", "Đăng Xuất", JOptionPane.YES_NO_OPTION);
				if(logOutPrompt == JOptionPane.YES_OPTION) {
					UI_Login.newUI_LoginInstance().setVisible(true);
					getUI_MainInstance().dispose();
				}
			}
		});
	}
	private void logOut() {
		int logOutPrompt = JOptionPane.showConfirmDialog(this, "Xin hãy xác nhận Đăng xuất", "Đăng Xuất", JOptionPane.YES_NO_OPTION);
		if(logOutPrompt == JOptionPane.YES_OPTION) {
			ConnectDB.getInstance().disconnectDatabase();
			UI_Login.newUI_LoginInstance();
			this.dispose();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o == btnPhong) {
			showUI(UI_Phong.getUI_PhongInstance());
			UI_Phong.getUI_PhongInstance().addAllTableData(DAO_Phong.getDanhSachPhong());
		}
		if(o == btnTiepTan) {
			showUI(UI_TiepTan.getUI_TiepTanInstance());
			UI_TiepTan.getUI_TiepTanInstance().showThongTinTiepTan();
		}
		if(o == btnDonDat) {
			showUI(UI_DonDatPhong.newUI_DonDatPhongInstance());
			UI_DonDatPhong.getUI_DonDatPhongInstance().reloadTable();
		}
		if(o == btnHoaDon) {
			showUI(UI_HoaDon.newUI_HoaDonInstance());
			UI_HoaDon.getUI_HoaDonInstance().reloadTable();
		}
		if(o == btnThongKe) {
			showUI(UI_ThongKe.getUI_ThongKeInstance());
			UI_ThongKe.getUI_ThongKeInstance().resetModel();
			UI_ThongKe.getUI_ThongKeInstance().showKhachHangTrongNgay();
		}
		if(o == btnDangXuat) {
			logOut();
		}
	}
}

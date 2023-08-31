package gui;

import javax.swing.JPanel;

import dao.DAO_TaiKhoan;
import dao.DAO_TiepTan;
import entity.TaiKhoan;
import entity.TiepTan;

public class UI_TiepTan extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UI_TiepTan instance = new UI_TiepTan();
	//
	private javax.swing.JLabel lblICCCD;
    private javax.swing.JLabel lblIHD;
    private javax.swing.JLabel lblIMNV;
    private javax.swing.JLabel lblISDT;
    private javax.swing.JLabel lblIT;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLCCCD;
    private javax.swing.JLabel lblLHD;
    private javax.swing.JLabel lblLMNV;
    private javax.swing.JLabel lblLSDT;
    private javax.swing.JLabel lblLT;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBot;
    private javax.swing.JPanel pnlCCCD;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlHoDem;
    private javax.swing.JPanel pnlICCCD;
    private javax.swing.JPanel pnlIHD;
    private javax.swing.JPanel pnlIMNV;
    private javax.swing.JPanel pnlISDT;
    private javax.swing.JPanel pnlIT;
    private javax.swing.JPanel pnlIcon;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JPanel pnlLCCCD;
    private javax.swing.JPanel pnlLHD;
    private javax.swing.JPanel pnlLMNV;
    private javax.swing.JPanel pnlLSDT;
    private javax.swing.JPanel pnlLT;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlMaNV;
    private javax.swing.JPanel pnlPadding;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlSDT;
    private javax.swing.JPanel pnlTen;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTop;
	//
	public static UI_TiepTan getUI_TiepTanInstance() {return instance;}
	//
	public UI_TiepTan() {
		initComponents();
	}
	//
	private void initComponents() {

        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlIcon = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        pnlLeft = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        pnlBot = new javax.swing.JPanel();
        pnlCenter = new javax.swing.JPanel();
        pnlMaNV = new javax.swing.JPanel();
        pnlLMNV = new javax.swing.JPanel();
        lblLMNV = new javax.swing.JLabel();
        pnlIMNV = new javax.swing.JPanel();
        lblIMNV = new javax.swing.JLabel();
        pnlHoDem = new javax.swing.JPanel();
        pnlLHD = new javax.swing.JPanel();
        lblLHD = new javax.swing.JLabel();
        pnlIHD = new javax.swing.JPanel();
        lblIHD = new javax.swing.JLabel();
        pnlTen = new javax.swing.JPanel();
        pnlLT = new javax.swing.JPanel();
        lblLT = new javax.swing.JLabel();
        pnlIT = new javax.swing.JPanel();
        lblIT = new javax.swing.JLabel();
        pnlCCCD = new javax.swing.JPanel();
        pnlLCCCD = new javax.swing.JPanel();
        lblLCCCD = new javax.swing.JLabel();
        pnlICCCD = new javax.swing.JPanel();
        lblICCCD = new javax.swing.JLabel();
        pnlSDT = new javax.swing.JPanel();
        pnlLSDT = new javax.swing.JPanel();
        lblLSDT = new javax.swing.JLabel();
        pnlISDT = new javax.swing.JPanel();
        lblISDT = new javax.swing.JLabel();
        pnlPadding = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(935, 560));
        setLayout(new java.awt.BorderLayout(3, 3));

        pnlTitle.setBackground(new java.awt.Color(204, 204, 204));
        pnlTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlTitle.setPreferredSize(new java.awt.Dimension(935, 50));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("Thông Tin Tiếp Tân");
        pnlTitle.add(lblTitle, new java.awt.GridBagConstraints());

        add(pnlTitle, java.awt.BorderLayout.PAGE_START);

        pnlIcon.setBackground(new java.awt.Color(102, 102, 102));
        pnlIcon.setForeground(new java.awt.Color(242, 242, 242));
        pnlIcon.setPreferredSize(new java.awt.Dimension(256, 522));
        pnlIcon.setLayout(new java.awt.BorderLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon("img\\user.png")); // NOI18N
        lblIcon.setText("jLabel2");
        lblIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlIcon.add(lblIcon, java.awt.BorderLayout.PAGE_START);

        add(pnlIcon, java.awt.BorderLayout.LINE_END);

        pnlInfo.setBackground(new java.awt.Color(204, 204, 204));
        pnlInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlInfo.setLayout(new java.awt.BorderLayout());

        pnlLeft.setOpaque(false);
        pnlLeft.setPreferredSize(new java.awt.Dimension(25, 403));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        pnlInfo.add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlRight.setOpaque(false);
        pnlRight.setPreferredSize(new java.awt.Dimension(25, 403));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        pnlInfo.add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlTop.setOpaque(false);
        pnlTop.setPreferredSize(new java.awt.Dimension(773, 5));

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        pnlInfo.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBot.setOpaque(false);
        pnlBot.setPreferredSize(new java.awt.Dimension(773, 45));

        javax.swing.GroupLayout pnlBotLayout = new javax.swing.GroupLayout(pnlBot);
        pnlBot.setLayout(pnlBotLayout);
        pnlBotLayout.setHorizontalGroup(
            pnlBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );
        pnlBotLayout.setVerticalGroup(
            pnlBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        pnlInfo.add(pnlBot, java.awt.BorderLayout.PAGE_END);

        pnlCenter.setOpaque(false);
        pnlCenter.setLayout(new java.awt.GridLayout(0, 1));

        pnlMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlMaNV.setForeground(new java.awt.Color(102, 102, 102));
        pnlMaNV.setOpaque(false);
        pnlMaNV.setLayout(new java.awt.GridLayout(0, 2));

        pnlLMNV.setOpaque(false);
        pnlLMNV.setLayout(new javax.swing.BoxLayout(pnlLMNV, javax.swing.BoxLayout.LINE_AXIS));

        lblLMNV.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLMNV.setForeground(new java.awt.Color(102, 102, 102));
        lblLMNV.setText("Mã Nhân Viên");
        pnlLMNV.add(lblLMNV);

        pnlMaNV.add(pnlLMNV);

        pnlIMNV.setOpaque(false);
        pnlIMNV.setLayout(new javax.swing.BoxLayout(pnlIMNV, javax.swing.BoxLayout.LINE_AXIS));

        lblIMNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlIMNV.add(lblIMNV);

        pnlMaNV.add(pnlIMNV);

        pnlCenter.add(pnlMaNV);

        pnlHoDem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlHoDem.setForeground(new java.awt.Color(102, 102, 102));
        pnlHoDem.setOpaque(false);
        pnlHoDem.setLayout(new java.awt.GridLayout(0, 2));

        pnlLHD.setOpaque(false);
        pnlLHD.setLayout(new javax.swing.BoxLayout(pnlLHD, javax.swing.BoxLayout.LINE_AXIS));

        lblLHD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLHD.setForeground(new java.awt.Color(102, 102, 102));
        lblLHD.setText("Họ Đệm");
        pnlLHD.add(lblLHD);

        pnlHoDem.add(pnlLHD);

        pnlIHD.setOpaque(false);
        pnlIHD.setLayout(new javax.swing.BoxLayout(pnlIHD, javax.swing.BoxLayout.LINE_AXIS));

        lblIHD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlIHD.add(lblIHD);

        pnlHoDem.add(pnlIHD);

        pnlCenter.add(pnlHoDem);

        pnlTen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlTen.setForeground(new java.awt.Color(102, 102, 102));
        pnlTen.setOpaque(false);
        pnlTen.setLayout(new java.awt.GridLayout(0, 2));

        pnlLT.setOpaque(false);
        pnlLT.setLayout(new javax.swing.BoxLayout(pnlLT, javax.swing.BoxLayout.LINE_AXIS));

        lblLT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLT.setForeground(new java.awt.Color(102, 102, 102));
        lblLT.setText("Tên");
        pnlLT.add(lblLT);

        pnlTen.add(pnlLT);

        pnlIT.setOpaque(false);
        pnlIT.setLayout(new javax.swing.BoxLayout(pnlIT, javax.swing.BoxLayout.LINE_AXIS));

        lblIT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlIT.add(lblIT);

        pnlTen.add(pnlIT);

        pnlCenter.add(pnlTen);

        pnlCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlCCCD.setForeground(new java.awt.Color(102, 102, 102));
        pnlCCCD.setOpaque(false);
        pnlCCCD.setLayout(new java.awt.GridLayout(0, 2));

        pnlLCCCD.setOpaque(false);
        pnlLCCCD.setLayout(new javax.swing.BoxLayout(pnlLCCCD, javax.swing.BoxLayout.LINE_AXIS));

        lblLCCCD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLCCCD.setForeground(new java.awt.Color(102, 102, 102));
        lblLCCCD.setText("Số Căn Cước Công Dân");
        pnlLCCCD.add(lblLCCCD);

        pnlCCCD.add(pnlLCCCD);

        pnlICCCD.setOpaque(false);
        pnlICCCD.setLayout(new javax.swing.BoxLayout(pnlICCCD, javax.swing.BoxLayout.LINE_AXIS));

        lblICCCD.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlICCCD.add(lblICCCD);

        pnlCCCD.add(pnlICCCD);

        pnlCenter.add(pnlCCCD);

        pnlSDT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        pnlSDT.setForeground(new java.awt.Color(102, 102, 102));
        pnlSDT.setOpaque(false);
        pnlSDT.setLayout(new java.awt.GridLayout(0, 2));

        pnlLSDT.setOpaque(false);
        pnlLSDT.setLayout(new javax.swing.BoxLayout(pnlLSDT, javax.swing.BoxLayout.LINE_AXIS));

        lblLSDT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLSDT.setForeground(new java.awt.Color(102, 102, 102));
        lblLSDT.setText("Số Điện Thoại");
        pnlLSDT.add(lblLSDT);

        pnlSDT.add(pnlLSDT);

        pnlISDT.setOpaque(false);
        pnlISDT.setLayout(new javax.swing.BoxLayout(pnlISDT, javax.swing.BoxLayout.LINE_AXIS));

        lblISDT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlISDT.add(lblISDT);

        pnlSDT.add(pnlISDT);

        pnlCenter.add(pnlSDT);

        pnlInfo.add(pnlCenter, java.awt.BorderLayout.CENTER);

        add(pnlInfo, java.awt.BorderLayout.CENTER);

        pnlPadding.setOpaque(false);
        pnlPadding.setPreferredSize(new java.awt.Dimension(1036, 150));

        javax.swing.GroupLayout pnlPaddingLayout = new javax.swing.GroupLayout(pnlPadding);
        pnlPadding.setLayout(pnlPaddingLayout);
        pnlPaddingLayout.setHorizontalGroup(
            pnlPaddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );
        pnlPaddingLayout.setVerticalGroup(
            pnlPaddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        add(pnlPadding, java.awt.BorderLayout.PAGE_END);
    }
	public void showThongTinTiepTan() {
		TaiKhoan taiKhoanHienHanh = DAO_TaiKhoan.getTaiKhoanHienHanh();
		TiepTan tiepTan = null;
		if(taiKhoanHienHanh != null) {
			tiepTan = DAO_TiepTan.getTiepTanTheoMaTaiKhoan(taiKhoanHienHanh.getMaTaiKhoan());
		}
		if(tiepTan != null)
			setThongTinTiepTan(tiepTan);
	}
	private void setThongTinTiepTan(TiepTan thisTiepTan) {
		lblIMNV.setText(thisTiepTan.getMaTiepTan());
		lblIHD.setText(thisTiepTan.getHoDem());
		lblIT.setText(thisTiepTan.getTen());
		lblICCCD.setText(thisTiepTan.getCccd());
		lblISDT.setText(thisTiepTan.getSdt());
	}
}

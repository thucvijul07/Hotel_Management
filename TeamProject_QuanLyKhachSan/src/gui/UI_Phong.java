package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.DAO_LoaiPhong;
import dao.DAO_Phong;
import entity.Enum_TinhTrang;
import entity.LoaiPhong;
import entity.Phong;


public class UI_Phong extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static UI_Phong instance = new UI_Phong();

	public static UI_Phong getUI_PhongInstance() {
		return instance;
	}

	private JButton btnThue;
	private JButton btnLoc;
	private JButton btnThemDichVu;
	private JTable table;
	private DefaultTableModel model;
	private JComboBox<String> cboLoaiPhong;
	private JComboBox<String> cboTrangThai;

	public UI_Phong() {
		setBackground(new java.awt.Color(102, 102, 102));
		setDoubleBuffered(false);
		setLayout(new java.awt.BorderLayout(3, 3));

		createGUI();
		
		btnThue.addActionListener(this);
		btnLoc.addActionListener(this);
		btnThemDichVu.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if(object.equals(btnThue))
			handlerBtnThue();
		if(object.equals(btnLoc)) 	
			handlerBtnloc();
		if(object.equals(btnThemDichVu))
			handlerBtnThemDichVu();
	}
	
	private void handlerBtnThue() {
		int row = table.getSelectedRowCount();
		if(row == 0)
			JOptionPane.showMessageDialog(this, "Vui lòng chọn phòng muốn đặt");
		else {
			ArrayList<Phong> listPhong = DAO_Phong.getDanhSachPhong();
			ArrayList<Phong> listPhongBooking= new ArrayList<Phong>();
			int[] selectedRows = table.getSelectedRows();
			for(int i = 0; i < selectedRows.length; i++) {
				String maPhong = (String) table.getValueAt(selectedRows[i], 0);
				Phong phong = new Phong(maPhong);
				listPhongBooking.add(listPhong.get(listPhong.indexOf(phong)));
			}
			for(Phong thisPhong : listPhongBooking) {
				if(thisPhong.getTinhTrang().equals(Enum_TinhTrang.Booked) || 
						thisPhong.getTinhTrang().equals(Enum_TinhTrang.Not_Available)) {
					JOptionPane.showMessageDialog(
							this, 
							"Phòng chọn hiện tại không có sẵn\nVui lòng chọn lại", 
							"Lỗi thao tác", 
							JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
			UI_Main.getUI_MainInstance().showUI(UI_DatPhong.newUI_DatPhongInstance());
			UI_DatPhong.getUI_DatPhongInstance().addListRoom(listPhongBooking);
			UI_DatPhong.getUI_DatPhongInstance().updateAvailableRoom();
		}
	}
	
	private void handlerBtnloc() {
		String trangThai = cboTrangThai.getSelectedItem().toString();
		String loaiPhong = cboLoaiPhong.getSelectedItem().toString();
		ArrayList<Phong> listFilter = DAO_Phong.filterPhong(trangThai, loaiPhong);
		addAllTableData(listFilter);
	}
	
	private void handlerBtnThemDichVu() {
		int rowCount = table.getSelectedRowCount();
		if(rowCount == 0) {
			JOptionPane.showMessageDialog(
					this, 
					"Vui lòng chọn một phòng để thêm Dịch vụ",
					"Lỗi thao tác",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
			
		if(rowCount > 1) {
			JOptionPane.showMessageDialog(
					this, 
					"Vui lòng chọn duy nhất một phòng để thêm Dịch vụ",
					"Lỗi thao tác",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		int row = table.getSelectedRow();
		String trangThai = table.getValueAt(row, 4).toString();
		if(!trangThai.equals("Booked")) {
			JOptionPane.showMessageDialog(
					this, 
					"Vui lòng chọn phòng đang trong trạng thái Booked",
					"Lỗi thao tác",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		else {
			String maPhong = table.getValueAt(row, 0).toString();
			UI_Main.getUI_MainInstance().showUI(UI_ChiTietDonPhong.newUI_ChiTietDonPhongInstance());
			UI_ChiTietDonPhong.getUI_ChiTietDonPhongInstance().setThongTinUI(maPhong);
		}
	}
	
	private void createGUI() {
		createTitle();
		createTable();
		createOption();
	}

	private void createTitle() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
		panel.setPreferredSize(new Dimension(935, 50));
		panel.setLayout(new GridBagLayout());

		JLabel lblTitle = new JLabel();
		lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		lblTitle.setText("Danh sách Phòng");
		panel.add(lblTitle, new GridBagConstraints());

		add(panel, BorderLayout.PAGE_START);
	}
	
	private void createTable() {
		JScrollPane scroll;
		String[] headers = { "Mã phòng", "Số phòng", "Số tầng", "Tên phòng", "Tình Trạng", "Loại phòng" };
		model = new DefaultTableModel(headers, 0);
		table = new JTable(model);
		add(scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
		table.setRowHeight(20);
		scroll.setPreferredSize(new Dimension(0, 250));

		table.setRowHeight(40);
	}
	
	private void createOption() {
		JPanel panel = new JPanel();
		add(panel, BorderLayout.LINE_END);
		panel.setBackground(new Color(204, 204, 204));
		panel.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
		panel.setPreferredSize(new java.awt.Dimension(175, 507));

		panel.add(btnThue = new JButton());
		btnThue.setBackground(new Color(128, 128, 255));
		btnThue.setFont(new Font("Segoe UI", 0, 18)); 
		btnThue.setForeground(new Color(34, 34, 34));
		btnThue.setText("Thuê phòng");
		btnThue.setPreferredSize(new Dimension(150, 50));

		panel.add(btnThemDichVu = new JButton());
		btnThemDichVu.setBackground(new Color(128, 128, 255));
		btnThemDichVu.setFont(new Font("Segoe UI", 0, 18));
		btnThemDichVu.setForeground(new Color(34, 34, 34));
		btnThemDichVu.setText("Thêm Dịch vụ");
		btnThemDichVu.setPreferredSize(new Dimension(150, 50));
		
		panel.add(btnLoc = new JButton());
		btnLoc.setBackground(new Color(128, 128, 255));
		btnLoc.setFont(new Font("Segoe UI", 0, 18));
		btnLoc.setForeground(new Color(34, 34, 34));
		btnLoc.setText("Lọc phòng");
		btnLoc.setPreferredSize(new Dimension(150, 50));
		
		JPanel pnlTinhTrang = new JPanel();
		pnlTinhTrang.add(cboTrangThai = new JComboBox<String>());
		cboTrangThai.setPreferredSize(new Dimension(150, 30));
		String[] tinhTrang = {"Tất cả", "Available", "Booked", "Not_Available"};
		cboTrangThai.setModel(new DefaultComboBoxModel<String>(tinhTrang));;
		panel.add(cboTrangThai);
		
		JPanel pnlLoaiPhong = new JPanel();
		pnlLoaiPhong.add(cboLoaiPhong = new JComboBox<String>());
		cboLoaiPhong.setPreferredSize(new Dimension(150, 30));
		cboLoaiPhong.addItem("Tất cả");
		ArrayList<LoaiPhong> listLP = DAO_LoaiPhong.getAllLoaiPhong();
		for(LoaiPhong thisLoaiPhong : listLP) {
			cboLoaiPhong.addItem(thisLoaiPhong.getTenLoaiPhong());
		}
		panel.add(cboLoaiPhong);
	}
	
	public void addAllTableData(ArrayList<Phong> listP) {
		model.getDataVector().removeAllElements();
		table.revalidate();
		table.repaint();
		for(Phong thisPhong : listP) {
			model.addRow(new String[] {
				thisPhong.getMaPhong(),
				Integer.toString(thisPhong.getSoPhong()),
				Integer.toString(thisPhong.getSoTang()),
				thisPhong.getTenPhong(),
				thisPhong.getTinhTrang().toString(),
				thisPhong.getLoaiPhong().getTenLoaiPhong()
			});
		}
	}
}
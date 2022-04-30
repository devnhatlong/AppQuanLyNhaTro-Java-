package GUI;

import BLL.DangKyPhongBLL;
import BLL.HoaDonDichVuBLL;
import BLL.ThongKeBLL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import GUI.loadTable;
import GUI.frmThongKe;
import Entity.HoaDonDichVuEntity;
import Entity.ThongKeEntity;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class frmHoaDonDichVu extends javax.swing.JInternalFrame {

    HoaDonDichVuBLL hoadondichvu = new HoaDonDichVuBLL();
    loadTable loadtable = new loadTable();
    ThongKeBLL thongke = new ThongKeBLL();

    public frmHoaDonDichVu() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;//Chiều dài form
        int h = this.getSize().height;//Chiều cao form
        int x = (dim.width-w)/2;//canh chiều ngang
        int y = (dim.height-h)/4;//canh chiều dọc

        // Đặt vị trí theo tọa độ x,y
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietDichVu = new javax.swing.JTable();
        btnLapHoaDon = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDichVu = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lblQuyCach = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cbbPhongChuaCoHoaDon = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhongDaCoHoaDon = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChiTietHoaDonDichVu = new javax.swing.JTable();
        btnXuatbill = new javax.swing.JButton();
        btnXoaHoaDon = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Hóa đơn dịch vụ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết sử dụng dịch vụ"));

        tblChiTietDichVu.setAutoCreateRowSorter(true);
        tblChiTietDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Dịch vụ", "Đơn giá", "Số lượng", "Quy cách", "Tổng chi phí"
            }
        ));
        jScrollPane1.setViewportView(tblChiTietDichVu);

        btnLapHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLapHoaDon.setForeground(new java.awt.Color(255, 0, 204));
        btnLapHoaDon.setText("Lập hóa đơn");
        btnLapHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLapHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLapHoaDon)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnLapHoaDon)
                .addGap(9, 9, 9))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dịch vụ"));

        tblDichVu.setAutoCreateRowSorter(true);
        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDichVuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDichVu);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Tên dịch vụ:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Đơn giá:");

        txtTenDichVu.setEnabled(false);

        txtDonGia.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Đơn vị sử dụng:");

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(0, 255, 51));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 0, 0));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        lblQuyCach.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuyCach.setForeground(new java.awt.Color(0, 153, 204));
        lblQuyCach.setText("Đơn vị");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Mã dịch vụ:");

        txtMaDichVu.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblQuyCach, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTenDichVu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuyCach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách phòng"));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(165, 165, 165)
                .addComponent(cbbPhongChuaCoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbPhongChuaCoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Phòng đã lập hóa đơn"));

        tblPhongDaCoHoaDon.setAutoCreateRowSorter(true);
        tblPhongDaCoHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPhongDaCoHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongDaCoHoaDonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPhongDaCoHoaDon);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chi tiết hóa đơn dịch vụ"));

        tblChiTietHoaDonDichVu.setAutoCreateRowSorter(true);
        tblChiTietHoaDonDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblChiTietHoaDonDichVu);

        btnXuatbill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXuatbill.setForeground(new java.awt.Color(0, 204, 204));
        btnXuatbill.setText("Xuất hóa đơn");
        btnXuatbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatbillActionPerformed(evt);
            }
        });

        btnXoaHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoaHoaDon.setForeground(new java.awt.Color(255, 0, 0));
        btnXoaHoaDon.setText("Xóa hóa đơn");
        btnXoaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHoaDonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 204));
        jLabel7.setText("Tổng tiền:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuatbill)
                        .addGap(41, 41, 41)
                        .addComponent(btnXoaHoaDon)
                        .addGap(27, 27, 27))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatbill)
                    .addComponent(btnXoaHoaDon)
                    .addComponent(jLabel7)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("HÓA ĐƠN DỊCH VỤ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(455, 455, 455))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            loadtable.loadJtable(hoadondichvu.loadDichVu(), tblDichVu);//load thông tin các dịch vụ lên bảng hoadondichvu
            loadPhongChuaCoHoaDonTheoThang();//load danh sách các phòng chưa có hóa đơn
            Date ngayhientai = new Date(System.currentTimeMillis()); //Lấy ngày hệ thống        
            SimpleDateFormat dayFormat = new SimpleDateFormat("MM/yyyy"); //Khai báo định dạng ngày tháng
            jLabel4.setText("Phòng chưa lập hóa đơn tháng: " + dayFormat.format(ngayhientai.getTime()));
        } catch (Exception ex) {
            Logger.getLogger(frmHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void loadPhongChuaCoHoaDonTheoThang() throws SQLException, Exception {
        Date ngayhientai = new Date(System.currentTimeMillis()); //Lấy ngày hệ thống        
        java.text.SimpleDateFormat dayFormat = new java.text.SimpleDateFormat("dd/MM/yyyy"); //Khai báo định dạng ngày tháng
        HoaDonDichVuEntity hoadondichvuEntity = new HoaDonDichVuEntity();
        hoadondichvuEntity.setNgaylaphoadon(dayFormat.format(ngayhientai.getTime()));//gán giá trị ngày lập hóa đơn là ngày hiện tại
        loadtable.loadJcombobox(hoadondichvu.loadPhongChuaCoHoaDon(hoadondichvuEntity), cbbPhongChuaCoHoaDon, "MaPhong");
        loadtable.loadJtable(hoadondichvu.loadPhongDaCoHoaDon(hoadondichvuEntity), tblPhongDaCoHoaDon);//Load danh sách các phòng đã có hóa đơn của tháng này
    }
    private void tblDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDichVuMouseClicked
        try {
            int index = tblDichVu.getSelectedRow();//lấy giá trị index của hàng  được chọn
            HoaDonDichVuEntity hoadondichvuEntity = new HoaDonDichVuEntity();
            hoadondichvuEntity.setDichvu((String) tblDichVu.getValueAt(index, 0));//Gán giá trị dịch vụ là hàng thứ index và cột thứ 0
            ResultSet rs = hoadondichvu.loadDichVuTheoMa(hoadondichvuEntity);

            while (rs.next())//lặp tất cả các hàng trong resultSet
            {
                //lần lượt chạy từng hàng trong resultSet và load các cột tương ứng vào các textfield
                txtMaDichVu.setText(rs.getString(1).toString());
                txtTenDichVu.setText(rs.getString(2).toString());
                txtDonGia.setText(rs.getString(3).toString());
                lblQuyCach.setText(rs.getString(4).toString());
                //Nếu như dịch vụ là những dịch vụ trả tiền mặc định theo tháng 
                if (txtTenDichVu.getText().toString().equals("Điện") || txtTenDichVu.getText().toString().equals("Nước (máy)")) {
                    txtSoLuong.setText("");//bỏ gán giá trị mặc dịnh cho textfiled
                    txtSoLuong.setEnabled(true);//enable textfield để người dùng nhập vào
                } else {
                    txtSoLuong.setText("1");//Mặc định gán giá trị cho đơn vi sử dụng là 1
                    txtSoLuong.setEnabled(false);//disable textfeild không cho người dùng sửa
                }

            }

        } catch (Exception ex) {
            Logger.getLogger(frmHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblDichVuMouseClicked

    private void tblPhongDaCoHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongDaCoHoaDonMouseClicked
        try {
            int index = tblPhongDaCoHoaDon.getSelectedRow();//Lấy giá trị hàng hiện tại
            Date ngayhientai = new Date(System.currentTimeMillis()); //Lấy ngày hệ thống        
            SimpleDateFormat dayFormat = new SimpleDateFormat("dd/MM/yyyy"); //Khai báo định dạng ngày tháng
            HoaDonDichVuEntity hoadondichvuEntity = new HoaDonDichVuEntity();
            hoadondichvuEntity.setMaphong((String) tblPhongDaCoHoaDon.getValueAt(index, 0));//lấy giá trị mã phòng ở hàng thứ index và cột thứ 0
            hoadondichvuEntity.setNgaylaphoadon(dayFormat.format(ngayhientai.getTime()));//gán giá trị ngày lập hóa đơn là ngày hiện tại
            loadtable.loadJtable(hoadondichvu.loadCT_dichvu(hoadondichvuEntity), tblChiTietHoaDonDichVu);
            
            //ThongKeEntity thongkeEntity = new ThongKeEntity();
            //sthongkeEntity.setMaphong((String) tblChiTietHoaDonDichVu.getValueAt(index, 2));//mã phòng là giá trị hàng indexHD cột 2
            //thongkeEntity.setNgaylap((String) tblChiTietHoaDonDichVu.getValueAt(index, 1));//ngày lập là giá trị hàng indexHD cột 1
            //load lại 2 bảng tiền phòng và địch vụ
            //loadtable.loadJtable(thongke.loadTienPhongTheoMa(thongkeEntity), tblChiTietHoaDonDichVu);
            //loadtable.loadJtable(thongke.loadTienDichVuTheoMa(thongkeEntity), tblChiTietHoaDonDichVu);
            TongTienTheoThangCuaPhong();//tính tiền theo tháng của phòng
        } catch (Exception ex) {
            Logger.getLogger(frmHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblPhongDaCoHoaDonMouseClicked
    Date ngayhientai = new Date(System.currentTimeMillis()); //Lấy ngày hệ thống  
    private void btnLapHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLapHoaDonActionPerformed
        try {
            if (tblChiTietDichVu.getRowCount() == 0)//nếu như bảng table không có hàng nào được chọn
            {//xuất thông báo
                JOptionPane.showMessageDialog(rootPane, "Vui lòng thêm dịch vụ trước khi tạo hóa đơn");
                return;
            }
            //Nếu như không còn phòng nào chưa có hóa đơn <=> combobox bị rỗng
            if (cbbPhongChuaCoHoaDon.getItemCount() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Hiện tại không còn phòng nào chưa lập hóa đơn!!!");
                return;
            }
            HoaDonDichVuEntity hoadondichvuEntity = new HoaDonDichVuEntity();
                 
            java.text.SimpleDateFormat dayFormat = new java.text.SimpleDateFormat("dd/MM/yyyy"); //Khai báo định dạng ngày tháng
//            
            //System.out.println(dayFormat.format(ngayhientai));
            hoadondichvuEntity.setMaphong(cbbPhongChuaCoHoaDon.getSelectedItem().toString());//gán giá trị mã phòng là giá trị được chọn trong combobox
            String ngaylap = dayFormat.format(ngayhientai.getTime());
            //System.out.print(dayFormat.format(ngayhientai.getTime()));
            hoadondichvuEntity.setNgaylaphoadon(ngaylap);//lấy giá trị ngày lập hóa đơn là ngày hiện tại
            if (hoadondichvu.ThemHoaDon(hoadondichvuEntity) > 0)//nếu như thêm hóa đơn mới thành công
            {
                for (int i = 0; i < tblChiTietDichVu.getRowCount(); i++)//lặp tất cả các hàng trong bảng chi tiết dịch vụ
                {
                    hoadondichvuEntity.setMadichvu((String) tblChiTietDichVu.getValueAt(i, 0));//mã dịch vụ là hàng thứ i cột thứ 0
                    hoadondichvuEntity.setDonvisudung(Integer.parseInt((String) tblChiTietDichVu.getValueAt(i, 3)));//đơn vị sử dụng là hàng i cột 3
                    hoadondichvu.ThemChiTietDichVu(hoadondichvuEntity);
                }
                loadPhongChuaCoHoaDonTheoThang();//load lại các phòng chưa có hóa đơn theo tháng
                JOptionPane.showMessageDialog(rootPane, "Thêm mới hóa đơn thành công");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm mới hóa đơn thất bại");
            }
        } catch (Exception ex) {
            Logger.getLogger(frmHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLapHoaDonActionPerformed

    //nút xóa
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //tạo kiểu table mode cho bảng chi tiết dịch vụ
        DefaultTableModel model = (DefaultTableModel) tblChiTietDichVu.getModel();
        if (tblChiTietDichVu.getSelectedRow() == -1)//Nếu như chưa chọn hàng nào (index = -1)
        {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn dịch vụ cần xóa");
            return;
        }
        if (tblChiTietDichVu.getRowCount() > 0)//Nếu như trong table chi tiết dịch vụ có hàng
        {
            for (int i = 0; i < tblChiTietDichVu.getRowCount(); i++)//chạy vòng lặp
            {
                if (tblChiTietDichVu.getSelectedRow() == i)//nếu như hàng cần chọn bằng i
                {
                    model.removeRow(i);//xóa tại hàng đó
                }
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Số lượng không được để trống
        if (txtSoLuong.getText().equals("") || txtSoLuong.getText() == null) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng không được để trống!!!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblChiTietDichVu.getModel();
        if (tblChiTietDichVu.getRowCount() > 0)//Nếu như table chi tiết dịch vụ có hàng
        {
            for (int i = 0; i < tblChiTietDichVu.getRowCount(); i++)//chạy vòng lặp các hàng
            {
                if (((String) tblChiTietDichVu.getValueAt(i, 1)).equals(txtTenDichVu.getText()))//nếu như tên dịch vụ trong bảng bằng với textfield 
                {
                    JOptionPane.showMessageDialog(rootPane, "Dịch vụ đã chọn, vui lòng chọn dịch vụ khác!!!");
                    return;
                }
            }
        }
        //add từng hàng vào table với các giá trị từ các textfield
        model.addRow(new Object[]{
            txtMaDichVu.getText(),
            txtTenDichVu.getText(),
            txtDonGia.getText(),
            txtSoLuong.getText(),
            lblQuyCach.getText(),
            Integer.parseInt(txtDonGia.getText().replaceAll(",", "")) * Integer.parseInt(txtSoLuong.getText())//chi phí = số lượng  * đơn giá
        });

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHoaDonActionPerformed
        try {
            if (tblPhongDaCoHoaDon.getSelectedRow() == -1)// nếu như chưa chọn
            {
                JOptionPane.showMessageDialog(rootPane, "Hãy chọn hóa đơn cần xóa");
                return;
            }
            //tạo 1 biến thông báo kiểu yes no
            int reply = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa hóa đơn?", title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)// nếu chọn yes
            {
                int index = tblPhongDaCoHoaDon.getSelectedRow();//lấy index hàng được chọn
                HoaDonDichVuEntity hoadondichvuEntity = new HoaDonDichVuEntity();
                hoadondichvuEntity.setMahoadon((int) tblChiTietHoaDonDichVu.getValueAt(index, 0));//mã hóa đơn là giá trị hàng thứ index cột thứ 0
                if (hoadondichvu.XoaHoaDon(hoadondichvuEntity) > 0)//nếu xóa thành công
                {
                    JOptionPane.showMessageDialog(rootPane, "Xóa hóa đơn thành công");
                    loadPhongChuaCoHoaDonTheoThang();//load lại các phòng chưa có hóa đơn
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa hóa đơn thất bại");
                }
            } else {
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(frmHoaDonDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaHoaDonActionPerformed
    
    private void btnXuatbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatbillActionPerformed
        ghihoadon();
    }//GEN-LAST:event_btnXuatbillActionPerformed
    
    private void TongTienTheoThangCuaPhong() throws SQLException
    {
        try {
            int index = tblPhongDaCoHoaDon.getSelectedRow();//lấy idex hàng được chọn
            ThongKeEntity thongkeEntity = new ThongKeEntity();

            thongkeEntity.setMaphong((String)tblPhongDaCoHoaDon.getValueAt(index, 0));//mã phòng là giá trị hàng index cột 2
            thongkeEntity.setNgaylap((String)tblChiTietHoaDonDichVu.getValueAt(index, 1));//ngày lập là giá trị hàng index cột 1
            ResultSet rs = thongke.TongTienTheoThangCuaPhong(thongkeEntity);
            //lblPhong.setText((String) tblDanhsachHoaDon.getValueAt(index, 2));//label được gán giá trị ở hàng thứ index cột 2
            //lblPhong.setVisible(true);//hiện label 
            while(rs.next())//lặp tất cả hàng trong resultSet
            {
                txtTongTien.setText(rs.getString(1)+" VNĐ");//gán giá trị ở ô đầu tiên trong resultSet
            }
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void ghihoadon() {
        FileOutputStream fop = null;
        String thongtinchi = "________________________________________\r\n"
                + "Mã dịch vụ                 Thành Tiền\r\n"
                + "----------------------------------------\r\n";

        DefaultTableModel model = (DefaultTableModel) tblChiTietHoaDonDichVu.getModel();
        int a = model.getRowCount();
        String maphong = "";
        String maHD = "";
        String giaDV = "";
        String giaPhong = "";
//        try {
//            int indexHD = tblPhongDaCoHoaDon.getSelectedRow();//lấy index của hàng được chọn
//            HoaDonDichVuEntity hoadondichvu = new HoaDonDichVuEntity();
//            hoadondichvu.setMaphong((String) tblPhongDaCoHoaDon.getValueAt(indexHD, 0));//mã phòng là giá trị hàng indexHD cột 2
//            //thongkeEntity.setNgaylap((String) tblChiTietHoaDonDichVu.getValueAt(indexHD, 1));//ngày lập là giá trị hàng indexHD cột 1
//            ResultSet rs = thongke.loadTienPhongTheoMa(hoadondichvu);
//            //load lại 2 bảng tiền phòng và địch vụ
//            while(rs.next())//lặp tất cả hàng trong resultSet
//                {
//                    txtTongTien.setText(rs.getString(1)+" VNĐ");//gán giá trị ở ô đầu tiên trong resultSet
//                }
//    //        loadtable.loadJtable(thongke.loadTienPhongTheoMa(thongkeEntity), tblTienPhong);
//    //        loadtable.loadJtable(thongke.loadTienDichVuTheoMa(thongkeEntity), tblTienDichVu);
//        }
//        catch (Exception ex) 
//        {
//            Logger.getLogger(frmThongKe.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            System.out.println("số lượng dòng: "+a);
//            
        for (int i = 0; i < a; i++) {
            //System.out.println("số lượng cột: "+i);
            String maDV = (String) model.getValueAt(i, 1);
            maHD = (int) model.getValueAt(i, 0)+ "\r\n";
            maphong =(String) model.getValueAt(i, 2)+ "\r\n";
            maDV =(String) model.getValueAt(i, 3)+ "";
            giaDV =(String) model.getValueAt(i, 4)+ "";

            if (maDV.length() < 45) {
                for (int u = maDV.length(); u < 45 - maDV.length(); u++) {
                    maDV += " ";
                }
            }
            //Double gia =0;//theo chương trình đang chạy thằng này lấy ở cột chữ
            //System.out.println("gì đây? :"+ model.getValueAt(i, 4));
            //double thanhtien = (double) model.getValueAt(i, 4);
            thongtinchi += maDV + "      " + giaDV + "\r\n";
            
        }
//        } catch (Exception e) {
//            System.out.println("thành tiền lấy maximum cột 4 dòng ...");
//        e.printStackTrace();
//        }
        
        File file;
        String content ="            HÓA ĐƠN THANH TOÁN\r\n"
                + "Ngày: " + ngayhientai + "           "
                + "Mã Hóa Đơn: " + maHD + ""
                + "Mã Phòng: " + maphong + "\r\n"
                + "----------------------------------------\r\n"
                + "           THÔNG TIN THANH TOÁN\r\n"
                + thongtinchi + "\r\n" + ""
                + "Giá Phòng: " + "1,500,000 VNĐ" + "\r\n"
                + "Tổng Tiền: " + txtTongTien.getText()
                + "\r\n"
                + "------------CẢM ƠN QUÝ KHÁCH------------";

        try {

            file = new File("HOADON.txt");
            fop = new FileOutputStream(file);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            //System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Desktop.getDesktop().browse(new File("HOADON.txt").toURI());
        } catch (IOException ex) {
            alert("Không tìm thấy file hướng dẫn!");
            System.out.println(ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLapHoaDon;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaHoaDon;
    private javax.swing.JButton btnXuatbill;
    private javax.swing.JComboBox cbbPhongChuaCoHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblQuyCach;
    private javax.swing.JTable tblChiTietDichVu;
    private javax.swing.JTable tblChiTietHoaDonDichVu;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTable tblPhongDaCoHoaDon;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenDichVu;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void alert(String không_tìm_thấy_file_hướng_dẫn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package GUI;

import BLL.BangGiaDichVuBLL;
import Entity.BangGiaDichVuEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import GUI.loadTable;
import GUI.loadTable;

public class frmBangGiaDichVu extends javax.swing.JInternalFrame 
{
    loadTable loadtable = new loadTable();
    BangGiaDichVuBLL dichvu = new BangGiaDichVuBLL();

    public frmBangGiaDichVu() 
    {
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

        jButton4 = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenDichVu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbMaLoaiDichVu = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtQuyCach = new javax.swing.JTextField();
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();

        setClosable(true);
        setForeground(java.awt.Color.blue);
        setTitle("Thông Tin Dịch Vụ");
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

        jButton4.setText("jButton2");

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(51, 255, 0));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(0, 0, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Mã Dịch Vụ:");

        txtMaDichVu.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Tên Dịch Vụ:");

        txtTenDichVu.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Giá Tiền:");

        txtGiaTien.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Mã Loại Dịch Vụ:");

        cbbMaLoaiDichVu.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Quy Cách:");

        txtQuyCach.setEnabled(false);

        btnThemMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThemMoi.setForeground(new java.awt.Color(0, 0, 255));
        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.setEnabled(false);
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCapNhat.setForeground(new java.awt.Color(255, 200, 0));
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.setEnabled(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("DV01: Dịch Vụ Công Cộng");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 204));
        jLabel8.setText("DV02: Internet");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 51));
        jLabel9.setText("DV03: Điện / Nước");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txtTenDichVu)
                    .addComponent(txtMaDichVu))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(btnThemMoi))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCapNhat)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbbMaLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuyCach, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMaDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbbMaLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtQuyCach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThemMoi)
                            .addComponent(btnCapNhat)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbbMaLoaiDichVu.getAccessibleContext().setAccessibleName("cbbMaLoaiDichvu");
        cbbMaLoaiDichVu.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("THÔNG TIN DỊCH VỤ");

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 51, 51));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

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
        jScrollPane1.setViewportView(tblDichVu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(219, 219, 219))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(358, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addGap(257, 257, 257)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(339, Short.MAX_VALUE)))
        );

        btnThem.getAccessibleContext().setAccessibleName("btnThem");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try 
        {//load thông tin vào bảng dịch vụ và combobox mã loại dịch vụ khi load form
            loadtable.loadJtable(dichvu.LoadThongTinDichVu(), tblDichVu);
            loadtable.loadJcombobox(dichvu.loadMaLoaiDichVu(), cbbMaLoaiDichVu, "MaLoaiDichVu");
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Hiện ẩn các button, gán giá trị rỗng cho các textfield
        btnThemMoi.setEnabled(true);
        btnCapNhat.setEnabled(false);
        txtMaDichVu.setEnabled(true);
        txtTenDichVu.setEnabled(true);
        txtGiaTien.setEnabled(true);
        txtQuyCach.setEnabled(true);
        cbbMaLoaiDichVu.getItemAt(0);
        cbbMaLoaiDichVu.setEnabled(true);
        txtMaDichVu.setText("");
        txtTenDichVu.setText("");
        txtQuyCach.setText("");
        txtGiaTien.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //enable và disable các button và  textfield
        btnThemMoi.setEnabled(false);
        btnCapNhat.setEnabled(true);
        txtMaDichVu.setEnabled(false);
        txtTenDichVu.setEnabled(true);
        txtGiaTien.setEnabled(true);
        txtQuyCach.setEnabled(true);
        cbbMaLoaiDichVu.setEnabled(false);
        //Lấy index của bảng DIchVu khi click chuột vào
        int index=tblDichVu.getSelectedRow();
        //lấy giá tiền
        txtGiaTien.setText(String.valueOf(tblDichVu.getValueAt(index,2)).replaceAll(",",""));
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDichVuMouseClicked
        //Sự kiện click vào các hàng trong table
        txtMaDichVu.setEnabled(false);
        txtTenDichVu.setEnabled(false);
        txtGiaTien.setEnabled(false);
        txtQuyCach.setEnabled(false);
        cbbMaLoaiDichVu.setEnabled(false);
        int index=tblDichVu.getSelectedRow();
        txtMaDichVu.setText((String) tblDichVu.getValueAt(index,0));
        txtTenDichVu.setText((String) tblDichVu.getValueAt(index,1));
        txtGiaTien.setText(String.valueOf(tblDichVu.getValueAt(index,2)).replaceAll(",",""));
        txtQuyCach.setText((String) tblDichVu.getValueAt(index,4));
        cbbMaLoaiDichVu.setSelectedItem(tblDichVu.getValueAt(index, 3));
    }//GEN-LAST:event_tblDichVuMouseClicked

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        //Thông tin nhập vào không được để trống
        if(txtMaDichVu.getText().equals("")|| txtTenDichVu.getText().equals("") || txtGiaTien.getText().equals("") || txtQuyCach.getText().equals("") )
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        }
            else
            {          
                BangGiaDichVuEntity dichvuEntity = new BangGiaDichVuEntity();
                dichvuEntity.setMadichvu(txtMaDichVu.getText());
                dichvuEntity.setTendichvu(txtTenDichVu.getText());
                dichvuEntity.setGiatien(Integer.parseInt(txtGiaTien.getText()));
                dichvuEntity.setMaloaidichvu(cbbMaLoaiDichVu.getSelectedItem().toString());
                dichvuEntity.setQuycach(txtQuyCach.getText());
                try {
                        if(dichvu.ThemDichVu(dichvuEntity)>0)//Nếu thành công
                        {
                            JOptionPane.showMessageDialog(rootPane, "Thêm mới dịch vụ thành công");
                            loadtable.loadJtable(dichvu.LoadThongTinDichVu(),tblDichVu);//Load lại table Thông tin dịch vụ
                        }
                        else
                            JOptionPane.showMessageDialog(rootPane, "Thêm mới dịch vụ thất bại");         
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
             }
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if(txtMaDichVu.getText().equals("")|| txtTenDichVu.getText().equals("") || txtGiaTien.getText().equals("") || txtQuyCach.getText().equals("") )
        {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        }
        else
            {
                BangGiaDichVuEntity dichvuEntity = new BangGiaDichVuEntity();
                dichvuEntity.setMadichvu(txtMaDichVu.getText());
                dichvuEntity.setTendichvu(txtTenDichVu.getText());
                dichvuEntity.setGiatien(Integer.parseInt(txtGiaTien.getText()));
                dichvuEntity.setMaloaidichvu(cbbMaLoaiDichVu.getSelectedItem().toString());
                dichvuEntity.setQuycach(txtQuyCach.getText());
                try 
                {
                    if(dichvu.SuaDichVu(dichvuEntity)>0)//Nếu như sửa thành công
                    {
                        JOptionPane.showMessageDialog(rootPane, "Sửa dịch vụ thành công");
                        loadtable.loadJtable(dichvu.LoadThongTinDichVu(),tblDichVu);//Load lại table Thông tin dịch vụ
                    }
                    else
                        JOptionPane.showMessageDialog(rootPane, "Sửa dịch vụ thất bại");         
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //String madichvu = txtMaDichVu.getText();
        //tạo biến thông báo 
        int thongbao = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa dịch vụ này không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (thongbao == JOptionPane.YES_OPTION)//nếu chọn yes
        {
            BangGiaDichVuEntity BangGiaDichVuEntity = new BangGiaDichVuEntity();
            BangGiaDichVuEntity.setMadichvu(txtMaDichVu.getText());//lấy giá trị mã khách
            try {
                if (dichvu.XoaDichVu(BangGiaDichVuEntity) > 0)//nếu xóa thành công
                {
                    try {
                        JOptionPane.showMessageDialog(rootPane, "Xóa dịch vụ thành công");
                        loadtable.loadJtable(dichvu.LoadThongTinDichVu(), tblDichVu);//load lại bảng khách thuê
                    } catch (Exception ex) {
                        Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dịch vụ thất bại");
                }
            } catch (Exception ex) {
                Logger.getLogger(frmBangGiaDichVu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox cbbMaLoaiDichVu;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDichVu;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtQuyCach;
    private javax.swing.JTextField txtTenDichVu;
    // End of variables declaration//GEN-END:variables
}

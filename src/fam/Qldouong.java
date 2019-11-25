/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fam;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projectclass.DoUong;
import projectclass.ListDoUong;
import projectclass.ListLoaiDoUong;
import projectclass.LoaiDoUong;

/**
 *
 * @author Admin
 */
public class Qldouong extends javax.swing.JFrame {
    
    private ListDoUong lDouong = new ListDoUong();
    private ListLoaiDoUong lLoai = new ListLoaiDoUong();
    
    /**
     * Creates new form NewJFrame3
     */
    public Qldouong() {
        try {
        initComponents();
        lLoai.docFile();
        lDouong.docFile();
        
        hienThiLoaiDoUong();
        khoiTaoComboBox();
        hienThiDoUong();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void khoiTaoComboBox() {
        cmb_maloai.removeAllItems();
        for (LoaiDoUong loai : lLoai.getList()) {
            cmb_maloai.addItem(loai.getTenLoaiDoUong());
        }
        
    }
    
    public DoUong khoiTaoDoUong() {
        //khai báo
         int nMadouong = Integer.parseInt(txt_madouong.getText());
         
        int nMaloai = lLoai.findMa(cmb_maloai.getSelectedItem().toString());
        
        String sTendouong = txt_tendouong.getText();
        
        int nGia = Integer.parseInt(txt_gia.getText());
        
        int nSl = Integer.parseInt(txt_soluong.getText());
        
        DoUong du = new DoUong(nMadouong,nMaloai,sTendouong,nGia,nSl);
        
        return du;
    }
    public void hienThiDoUong() {
         DefaultTableModel model = (DefaultTableModel)tbl_douong.getModel();
         
         model.setRowCount(0);
         
         int stt = 1;
         
         for (DoUong du : lDouong.getList()) {
             model.addRow(new Object[] {stt, du.getMaDoUong(), lLoai.findTen(du.getMaLoaiDoUong()), du.getTenDoUong(),du.getGia(),du.getSoLuong()});
             stt++;
         }
    }
    public void clearLoai() {
        txt_maloai.setText("");
        txt_tenloai.setText("");
    }
    
    public void clearDoUong() {
        txt_gia.setText("");
        txt_soluong.setText("");
        txt_tendouong.setText("");
        txt_madouong.setText("");
        cmb_maloai.setSelectedItem("");
    }
    
    public LoaiDoUong khoiTaoLoai() {
        //khai báo
         int nMaloai = Integer.parseInt(txt_maloai.getText());
        
        String sTenloai = txt_tenloai.getText();
        
        LoaiDoUong loai = new LoaiDoUong(nMaloai,sTenloai);
        
        return loai;
    }
    
    public void hienThiLoaiDoUong() {
         DefaultTableModel model = (DefaultTableModel)tbl_loai.getModel();
         
         model.setRowCount(0);
         
         int stt = 1;
         for (LoaiDoUong loai : lLoai.getList()) {
             
             model.addRow(new Object[] {stt, loai.getMaLoaiDoUong(), loai.getTenLoaiDoUong()});
             stt++;
         }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_quaylai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_maloai = new javax.swing.JTextField();
        txt_tenloai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_themloai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_madouong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_tendouong = new javax.swing.JTextField();
        txt_gia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmb_maloai = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_loai = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_douong = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txt_soluong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_xoaloai = new javax.swing.JButton();
        btn_sualoai = new javax.swing.JButton();
        btn_themdouong = new javax.swing.JButton();
        btn_xoadouong = new javax.swing.JButton();
        btn_suadouong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Quản lí đồ uống");

        btn_quaylai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_quaylai.setText("quay lại");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tên loại");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("mã loại");

        btn_themloai.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_themloai.setText("Thêm");
        btn_themloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themloaiMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã đồ uống");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Loại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tên đồ uống");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Giá");

        cmb_maloai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tbl_loai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã loại", "Tên loại"
            }
        ));
        tbl_loai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_loaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_loai);

        tbl_douong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã đồ uống", "Loại", "Tên đồ uống", "Giá", "Số lượng"
            }
        ));
        tbl_douong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_douongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_douong);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Số lượng");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Quản lí loại");

        btn_xoaloai.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_xoaloai.setText("Xóa");
        btn_xoaloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaloaiMouseClicked(evt);
            }
        });

        btn_sualoai.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_sualoai.setText("Sửa");
        btn_sualoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sualoaiMouseClicked(evt);
            }
        });

        btn_themdouong.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_themdouong.setText("Thêm");
        btn_themdouong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themdouongMouseClicked(evt);
            }
        });

        btn_xoadouong.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_xoadouong.setText("Xóa");
        btn_xoadouong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoadouongMouseClicked(evt);
            }
        });

        btn_suadouong.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_suadouong.setText("Sửa");
        btn_suadouong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suadouongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_madouong, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_tendouong)
                                        .addComponent(txt_soluong, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_gia)
                                    .addComponent(cmb_maloai, 0, 132, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btn_themdouong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_xoadouong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btn_suadouong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_themloai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(btn_xoaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_sualoai, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))
                                                .addGap(36, 36, 36)
                                                .addComponent(txt_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(107, 107, 107)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(441, 441, 441))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(441, 441, 441))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_quaylai, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themloai, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xoaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sualoai, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txt_madouong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cmb_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_tendouong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themdouong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xoadouong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_suadouong, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themloaiMouseClicked
        // thêm loại
        try{
            lLoai.insert(khoiTaoLoai());
            clearLoai();
            khoiTaoComboBox();
            lLoai.ghiFile();
            
            hienThiLoaiDoUong();

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
    }//GEN-LAST:event_btn_themloaiMouseClicked

    private void btn_xoaloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaloaiMouseClicked
        // xóa loại
        try{
            lLoai.delete(khoiTaoLoai());
            clearLoai();
            
            khoiTaoComboBox();
            
            lLoai.ghiFile();
            hienThiLoaiDoUong();

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
    }//GEN-LAST:event_btn_xoaloaiMouseClicked

    private void btn_sualoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sualoaiMouseClicked
        // Sửa
        try{
            lLoai.update(khoiTaoLoai());
            khoiTaoComboBox();
            lLoai.ghiFile();
            
             hienThiLoaiDoUong();

            clearLoai();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
    }//GEN-LAST:event_btn_sualoaiMouseClicked

    private void btn_themdouongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themdouongMouseClicked
        // thêm
        try{
            lDouong.insert(khoiTaoDoUong());
            lDouong.ghiFile();
            
            hienThiDoUong();

            clearDoUong();
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
        
    }//GEN-LAST:event_btn_themdouongMouseClicked

    private void btn_xoadouongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoadouongMouseClicked
        // xóa
        try
        {
            lDouong.delete(khoiTaoDoUong());
            lDouong.ghiFile();
            
            hienThiDoUong();

            clearDoUong();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
        
    }//GEN-LAST:event_btn_xoadouongMouseClicked

    private void btn_suadouongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suadouongMouseClicked
        // Sửa
        try
        {
            lDouong.update(khoiTaoDoUong());
            lDouong.ghiFile();
        
            hienThiDoUong();

            clearDoUong();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Lỗi!!!");
        }
        
    }//GEN-LAST:event_btn_suadouongMouseClicked

    private void tbl_loaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_loaiMouseClicked
        // TODO add your handling code here:
        int row = tbl_loai.getSelectedRow();
        txt_maloai.setText(String.valueOf(lLoai.getList().get(row).getMaLoaiDoUong()));
        txt_tenloai.setText(lLoai.getList().get(row).getTenLoaiDoUong());
    }//GEN-LAST:event_tbl_loaiMouseClicked

    private void tbl_douongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_douongMouseClicked
        // TODO add your handling code here:
        int row = tbl_douong.getSelectedRow();
        txt_madouong.setText(String.valueOf(lDouong.getList().get(row).getMaDoUong()));
        txt_tendouong.setText(lDouong.getList().get(row).getTenDoUong());
        txt_gia.setText(String.valueOf(lDouong.getList().get(row).getGia()));
        txt_soluong.setText(String.valueOf(lDouong.getList().get(row).getSoLuong()));
        cmb_maloai.setSelectedItem(String.valueOf(lLoai.findTen(lDouong.getList().get(row).getMaLoaiDoUong())));
    }//GEN-LAST:event_tbl_douongMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Qldouong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Qldouong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Qldouong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Qldouong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qldouong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_quaylai;
    private javax.swing.JButton btn_suadouong;
    private javax.swing.JButton btn_sualoai;
    private javax.swing.JButton btn_themdouong;
    private javax.swing.JButton btn_themloai;
    private javax.swing.JButton btn_xoadouong;
    private javax.swing.JButton btn_xoaloai;
    private javax.swing.JComboBox cmb_maloai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_douong;
    private javax.swing.JTable tbl_loai;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_madouong;
    private javax.swing.JTextField txt_maloai;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tendouong;
    private javax.swing.JTextField txt_tenloai;
    // End of variables declaration//GEN-END:variables
}

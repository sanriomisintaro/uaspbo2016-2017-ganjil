/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerPinjam;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelPinjam;
import util.Koneksi;

/**
 *
 * @author MalingerS Media
 */
public class ViewPinjam extends javax.swing.JPanel {

    Koneksi koneksi = new Koneksi();
    ModelPinjam mp = new ModelPinjam();
    ControllerPinjam cp = new ControllerPinjam();

    /**
     * Creates new form ViewPinjam
     */
    public ViewPinjam() {
        initComponents();
        tampilPinjam();
    }

    private void tampilPinjam() {
        koneksi.koneksiDatabase();

        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("ID");
        tabel.addColumn("Nama Teman");
        tabel.addColumn("Barang yang Dipinjam");

        jTable2.setModel(tabel);
        try {
            String sql = "select * from tbl_pinjam";

            ResultSet res = koneksi.state.executeQuery(sql);
            while (res.next()) {
                tabel.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("namaTeman"),
                    res.getString("barangDipinjam")
                });
                jTable2.setModel(tabel);

            }
        } catch (SQLException eer) {
            System.err.println("SQLException:" + eer.getMessage());
        }
    }

    private void tombolBaru() {
        jTextFieldNama.setEditable(true);
        jTextArea1.setEditable(true);
        jTextFieldNama.requestFocus();
        jButtonCari.setEnabled(true);
        bersihJTextField();
    }

    private void tombolBatal() {
        jTextFieldNama.setEditable(false);
        jTextArea1.setEditable(false);
        jButtonCari.setEnabled(false);
        bersihJTextField();
    }

    private void bersihJTextField() {
        jTextFieldId.setText("");
        jTextFieldNama.setText("");
        jTextArea1.setText("");
        jComboBox1.removeAllItems();
    }

    private void tabelKlik() {
        jButtonHapus.setEnabled(true);
        jButtonUbah.setEnabled(true);
        jTextArea1.setEditable(true);
    }

    private void tabelUnKlik() {
        jButtonHapus.setEnabled(false);
        jButtonUbah.setEnabled(false);
        jTextArea1.setEditable(false);
        bersihJTextField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonBaru = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonBersih = new javax.swing.JButton();
        jButtonTutup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextFieldNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonCari = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Barang :");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jButtonBaru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBaru.setText("Baru");
        jButtonBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaruActionPerformed(evt);
            }
        });

        jButtonUbah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonUbah.setText("Ubah");
        jButtonUbah.setEnabled(false);
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jButtonSimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSimpan.setText("Simpan");
        jButtonSimpan.setEnabled(false);
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonHapus.setText("Hapus");
        jButtonHapus.setEnabled(false);
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonBersih.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBersih.setText("Bersih");
        jButtonBersih.setEnabled(false);
        jButtonBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBersihActionPerformed(evt);
            }
        });

        jButtonTutup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonTutup.setText("Tutup");
        jButtonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBersih, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("id :");

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextFieldNama.setEditable(false);
        jTextFieldNama.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nama :");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCari.setText("Cari");
        jButtonCari.setEnabled(false);
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCari)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNama)
                    .addComponent(jLabel2)
                    .addComponent(jButtonCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTutupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonTutupActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        // TODO add your handling code here:
        String ch = jTextFieldNama.getText().trim();
        
        if (ch.equals("")) {
//            jComboBox1.setVisible(false);
        } else {
            System.out.println(ch);
            jComboBox1.removeAllItems();
            try {
                koneksi.koneksiDatabase();
                String query = "select * from tbl_teman where nama like '%" + ch + "%'";
                ResultSet rs = koneksi.state.executeQuery(query);
                while (rs.next()) {
                    jComboBox1.addItem(rs.getString("nama"));
                }

                rs.last();
                int jumlahdata = rs.getRow();
                rs.first();
            } catch (SQLException e) {
                System.err.println("" + e);
            }
        }
    }//GEN-LAST:event_jButtonCariActionPerformed

    private void jButtonBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaruActionPerformed
        // TODO add your handling code here:
        String logic = jButtonBaru.getText();
        if (logic.equals("Baru")) {
            jButtonSimpan.setEnabled(true);
            jButtonBaru.setText("Batal");
            tombolBaru();
        } else {
            jButtonSimpan.setEnabled(false);
            jButtonBaru.setText("Baru");
            tombolBatal();
        }
    }//GEN-LAST:event_jButtonBaruActionPerformed

    private void jButtonBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBersihActionPerformed
        // TODO add your handling code here:
        bersihJTextField();
    }//GEN-LAST:event_jButtonBersihActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        try {
            int baris = jTable2.getSelectedRow();//mengambil urutan baris dari table yang ada
            jTextFieldId.setText(jTable2.getValueAt(baris, 0).toString());
            jTextFieldNama.setText(jTable2.getValueAt(baris, 1).toString());
            jTextArea1.setText(jTable2.getValueAt(baris, 2).toString());
            tabelKlik();
        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        // TODO add your handling code here:
        String nama = jComboBox1.getSelectedItem().toString();
        String barang = jTextArea1.getText();
        if(nama.equals("") || barang.equals("")){
            JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
        }else{
            
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda ingin Menyimpan?", "PERHATIAN",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                mp.setNama(nama);
                mp.setBarang(barang);
                
                cp.simpanPinjaman(mp);

                tampilPinjam();
                tombolBatal();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Harap Isi Data Dengan Benar");
            }
        } else {
        }
        }

    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Apakah Kamu ingin Mengubah?", "PERHATIAN",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(jTextFieldId.getText());
                String nama = jTextFieldNama.getText();
                String barang = jTextArea1.getText();

                mp.setId(id);//mt didapat dari pembuatan objek, dari kelas ModelTeman (instansiasi dilakukan diatas)
                mp.setNama(nama);
                mp.setBarang(barang);

                cp.ubahDataPinjam(mp);//ct didapat dari pembuatan objek, dari kelas ControllerTeman (instansiasi dilakukan diatas)

                tampilPinjam();
                tabelUnKlik();
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Galat jButtonUbahActionPerformed : ");
            }
        } else {
        }
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        // TODO add your handling code here:
         if (JOptionPane.showConfirmDialog(null, "Apakah Kamu Ingin Menghapus?", "PERHATIAN!",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(jTextFieldId.getText());

                mp.setId(id);//mt didapat dari pembuatan objek, dari kelas ModelTeman (instansiasi dilakukan diatas)
                cp.hapusDataPinjam(mp);//ct didapat dari pembuatan objek, dari kelas ControllerTeman (instansiasi dilakukan diatas)

                tampilPinjam();
                tabelUnKlik();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Galat jButtonHapusActionPerformed : " + e);
            }
        } else {
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBaru;
    private javax.swing.JButton jButtonBersih;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonTutup;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldId;
    public javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
}
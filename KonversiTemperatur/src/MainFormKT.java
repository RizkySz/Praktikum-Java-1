/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 100 Mbps (Rizky Saputa Zulkarnain)
 */
public class MainFormKT extends javax.swing.JFrame {
    
    private double nilai,hasil;
    /**
     * Creates new form MainFormKT
     */
    public MainFormKT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNilai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbFromCelcius = new javax.swing.JRadioButton();
        rbFromFahrenheit = new javax.swing.JRadioButton();
        rbFromCalvin = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rbToCelcius = new javax.swing.JRadioButton();
        rbToFahrenheit = new javax.swing.JRadioButton();
        rbToCalvin = new javax.swing.JRadioButton();
        btnCalculate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Input");

        jLabel2.setText("From");

        buttonGroup1.add(rbFromCelcius);
        rbFromCelcius.setText("Celcius");

        buttonGroup1.add(rbFromFahrenheit);
        rbFromFahrenheit.setText("Fahrenheit");

        buttonGroup1.add(rbFromCalvin);
        rbFromCalvin.setText("Calvin");

        jLabel3.setText("To");

        buttonGroup2.add(rbToCelcius);
        rbToCelcius.setText("Celcius");

        buttonGroup2.add(rbToFahrenheit);
        rbToFahrenheit.setText("Fahrenheit");

        buttonGroup2.add(rbToCalvin);
        rbToCalvin.setText("Calvin");

        btnCalculate.setText("Calculate!");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel4.setText("Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbFromFahrenheit)
                                            .addComponent(rbFromCalvin)
                                            .addComponent(rbFromCelcius))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbToCelcius)
                                            .addComponent(rbToCalvin)
                                            .addComponent(rbToFahrenheit)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(btnCalculate)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFromCelcius)
                    .addComponent(rbToCelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFromFahrenheit)
                    .addComponent(rbToFahrenheit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFromCalvin)
                    .addComponent(rbToCalvin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        nilai = Double.parseDouble(txtNilai.getText());
        
        //Rumus Memilih Celcius ke Fahrenheit,Calvin
        if (rbFromCelcius.isSelected()){
            if(rbToCelcius.isSelected()){
                hasil = nilai;
            } else if (rbToFahrenheit.isSelected()){
                hasil = (nilai*9/5)+32;
            } else if (rbToCalvin.isSelected()){
                hasil = nilai+273.15;
            }
        }
        
        //Rumus Memilih Fahrenheit ke Celcius,Calvin
        if (rbFromFahrenheit.isSelected()){
            if(rbToCelcius.isSelected()){
                hasil = (nilai-32)/1.8;
            } else if (rbToFahrenheit.isSelected()){
                hasil = nilai;
            } else if (rbToCalvin.isSelected()){
                hasil = (nilai+459.67)/1.8;
            }
        }
        
        //Rumus Memilih Calvin ke Celcius,Fahrenheit
        if (rbFromCalvin.isSelected()){
            if(rbToCelcius.isSelected()){
                hasil = nilai-273.18;
            } else if (rbToFahrenheit.isSelected()){
                hasil = (nilai-273.15)*9/5+32;
            } else if (rbToCalvin.isSelected()){
                hasil = nilai;
            }
        }
        //Menampilkan Hasil
        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(MainFormKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormKT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormKT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbFromCalvin;
    private javax.swing.JRadioButton rbFromCelcius;
    private javax.swing.JRadioButton rbFromFahrenheit;
    private javax.swing.JRadioButton rbToCalvin;
    private javax.swing.JRadioButton rbToCelcius;
    private javax.swing.JRadioButton rbToFahrenheit;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtNilai;
    // End of variables declaration//GEN-END:variables
}

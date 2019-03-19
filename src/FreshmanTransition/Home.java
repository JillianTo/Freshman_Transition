/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FreshmanTransition;

/**
 *
 * @author jilli
 */
public class Home extends javax.swing.JFrame {

    public static final int xSize = 400;
    public static final int ySize = 400;
    
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setSize(xSize, ySize);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        careerBtn = new javax.swing.JButton();
        scheduleBtn = new javax.swing.JButton();
        intranetBtn = new javax.swing.JButton();
        laptopBtn = new javax.swing.JButton();
        loginBlackPanel = new javax.swing.JPanel();
        homeWelcomeTxt = new javax.swing.JLabel();
        homeBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        careerBtn.setBackground(new java.awt.Color(255, 255, 255));
        careerBtn.setIcon(new javax.swing.ImageIcon("G:\\Documents\\9 - Clubs\\TSA\\FreshmanTransition\\resources\\career button 50x50.jpg")); // NOI18N
        careerBtn.setText("Career Finder");
        careerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        careerBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        careerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                careerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(careerBtn);
        careerBtn.setBounds(20, 80, 150, 70);

        scheduleBtn.setText("Schedule Maker");
        scheduleBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scheduleBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(scheduleBtn);
        scheduleBtn.setBounds(230, 80, 150, 70);

        intranetBtn.setText("Student Intranet");
        intranetBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        intranetBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(intranetBtn);
        intranetBtn.setBounds(20, 190, 150, 70);

        laptopBtn.setText("Laptop Troubleshooter");
        laptopBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        laptopBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(laptopBtn);
        laptopBtn.setBounds(230, 190, 150, 70);

        loginBlackPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginBlackPanel.setForeground(new java.awt.Color(255, 255, 255));

        homeWelcomeTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        homeWelcomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        homeWelcomeTxt.setText("Hello!");

        javax.swing.GroupLayout loginBlackPanelLayout = new javax.swing.GroupLayout(loginBlackPanel);
        loginBlackPanel.setLayout(loginBlackPanelLayout);
        loginBlackPanelLayout.setHorizontalGroup(
            loginBlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBlackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeWelcomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginBlackPanelLayout.setVerticalGroup(
            loginBlackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBlackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeWelcomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(loginBlackPanel);
        loginBlackPanel.setBounds(0, 0, 400, 60);

        homeBackground.setToolTipText("");
        getContentPane().add(homeBackground);
        homeBackground.setBounds(0, 0, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void careerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_careerBtnActionPerformed
        // TODO add your handling code here:
        Survey career = new Survey();
        career.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_careerBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton careerBtn;
    private javax.swing.JLabel homeBackground;
    private javax.swing.JLabel homeWelcomeTxt;
    private javax.swing.JButton intranetBtn;
    private javax.swing.JButton laptopBtn;
    private javax.swing.JPanel loginBlackPanel;
    private javax.swing.JButton scheduleBtn;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppliancesInfo;

/**
 *
 * @author Chintan
 */
public class AboutUI extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    /**
     * Creates new form AboutUI
     */
    public AboutUI() {
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

        TitleBarAboutUI = new javax.swing.JPanel();
        lblAboutUS = new javax.swing.JLabel();
        CloseAboutUI = new javax.swing.JLabel();
        frameDraggable = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        panelDevs = new javax.swing.JPanel();
        lblChintan = new javax.swing.JLabel();
        lblGroupMembers = new javax.swing.JLabel();
        lblRoshanB = new javax.swing.JLabel();
        lblDevelopedBy = new javax.swing.JLabel();
        lblRaju = new javax.swing.JLabel();
        lblRoshanT = new javax.swing.JLabel();
        lblGroupCR3 = new javax.swing.JLabel();
        lblIIC = new javax.swing.JLabel();
        imageMusic = new javax.swing.JLabel();
        separatorAboutUI = new javax.swing.JSeparator();
        panelProduct = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        lblDescriptionSystem = new javax.swing.JTextArea();
        lblProductName = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblChintan6 = new javax.swing.JLabel();
        inventoryImage = new javax.swing.JLabel();
        lblProductCompany = new javax.swing.JLabel();
        lblProductFor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleBarAboutUI.setBackground(new java.awt.Color(68, 5, 150));

        lblAboutUS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAboutUS.setForeground(new java.awt.Color(255, 255, 255));
        lblAboutUS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAboutUS.setText("About ");

        CloseAboutUI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseAboutUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Close.png"))); // NOI18N
        CloseAboutUI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CloseAboutUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseAboutUIMouseClicked(evt);
            }
        });
        CloseAboutUI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CloseAboutUIKeyPressed(evt);
            }
        });

        frameDraggable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDraggableMouseDragged(evt);
            }
        });
        frameDraggable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDraggableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout TitleBarAboutUILayout = new javax.swing.GroupLayout(TitleBarAboutUI);
        TitleBarAboutUI.setLayout(TitleBarAboutUILayout);
        TitleBarAboutUILayout.setHorizontalGroup(
            TitleBarAboutUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBarAboutUILayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAboutUS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleBarAboutUILayout.createSequentialGroup()
                .addComponent(frameDraggable, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseAboutUI, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleBarAboutUILayout.setVerticalGroup(
            TitleBarAboutUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBarAboutUILayout.createSequentialGroup()
                .addGroup(TitleBarAboutUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CloseAboutUI, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(frameDraggable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(lblAboutUS)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(TitleBarAboutUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        mainPanel.setBackground(new java.awt.Color(230, 242, 255));

        panelDevs.setBackground(new java.awt.Color(230, 242, 255));
        panelDevs.setBorder(null);

        lblChintan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChintan.setForeground(new java.awt.Color(68, 5, 150));
        lblChintan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblChintan.setText("Chintan Karki");

        lblGroupMembers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGroupMembers.setForeground(new java.awt.Color(68, 5, 150));
        lblGroupMembers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGroupMembers.setText("Group Members:");

        lblRoshanB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRoshanB.setForeground(new java.awt.Color(68, 5, 150));
        lblRoshanB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRoshanB.setText("Roshan Budhathoki");

        lblDevelopedBy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDevelopedBy.setForeground(new java.awt.Color(68, 5, 150));
        lblDevelopedBy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDevelopedBy.setText("Developed By: ");

        lblRaju.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRaju.setForeground(new java.awt.Color(68, 5, 150));
        lblRaju.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRaju.setText("Raju Chaudhary");

        lblRoshanT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRoshanT.setForeground(new java.awt.Color(68, 5, 150));
        lblRoshanT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRoshanT.setText("Roshan Timalsina");

        lblGroupCR3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblGroupCR3.setForeground(new java.awt.Color(68, 5, 150));
        lblGroupCR3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGroupCR3.setText("Group CR3 (L2C2) ");

        lblIIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIIC.setForeground(new java.awt.Color(68, 5, 150));
        lblIIC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIIC.setText("Itahari International College");

        imageMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/004-musical-notes.png"))); // NOI18N

        javax.swing.GroupLayout panelDevsLayout = new javax.swing.GroupLayout(panelDevs);
        panelDevs.setLayout(panelDevsLayout);
        panelDevsLayout.setHorizontalGroup(
            panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGroupMembers)
                    .addComponent(lblDevelopedBy))
                .addGap(18, 18, 18)
                .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDevsLayout.createSequentialGroup()
                        .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGroupCR3)
                            .addComponent(lblIIC))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDevsLayout.createSequentialGroup()
                        .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoshanB)
                            .addComponent(lblChintan)
                            .addGroup(panelDevsLayout.createSequentialGroup()
                                .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRaju)
                                    .addComponent(lblRoshanT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageMusic)))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        panelDevsLayout.setVerticalGroup(
            panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGroupCR3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDevelopedBy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIIC)
                .addGap(27, 27, 27)
                .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDevsLayout.createSequentialGroup()
                        .addComponent(lblChintan)
                        .addGap(18, 18, 18)
                        .addComponent(lblRoshanB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoshanT)
                            .addComponent(imageMusic)))
                    .addGroup(panelDevsLayout.createSequentialGroup()
                        .addComponent(lblGroupMembers)
                        .addGap(2, 2, 2)
                        .addComponent(lblRaju)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelProduct.setBackground(new java.awt.Color(230, 242, 255));

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(68, 5, 150));
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescription.setText("Description");

        lblDescriptionSystem.setEditable(false);
        lblDescriptionSystem.setBackground(new java.awt.Color(230, 242, 255));
        lblDescriptionSystem.setColumns(20);
        lblDescriptionSystem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescriptionSystem.setLineWrap(true);
        lblDescriptionSystem.setRows(5);
        lblDescriptionSystem.setText("This is a simple inventory management systemdesigned in order to keep track of all the musi-cal instruments in the inventory. It can store  the details of all the instruments, and also helpimport the existing inventory details.");
        lblDescriptionSystem.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(68, 5, 150));
        lblProductName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductName.setText("Product Name:");

        lblVersion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(68, 5, 150));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVersion.setText("Version");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(68, 5, 150));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("DMMC Inventory Management System ");

        lblChintan6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChintan6.setForeground(new java.awt.Color(68, 5, 150));
        lblChintan6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblChintan6.setText("v 1.0.0");

        inventoryImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/inventory.png"))); // NOI18N

        lblProductCompany.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProductCompany.setForeground(new java.awt.Color(68, 5, 150));
        lblProductCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductCompany.setText("Product For:");

        lblProductFor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProductFor.setForeground(new java.awt.Color(68, 5, 150));
        lblProductFor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblProductFor.setText("Dunder Mifflin Music Company (DMMC)");

        javax.swing.GroupLayout panelProductLayout = new javax.swing.GroupLayout(panelProduct);
        panelProduct.setLayout(panelProductLayout);
        panelProductLayout.setHorizontalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductCompany)
                    .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createSequentialGroup()
                            .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDescription)
                                .addComponent(inventoryImage))
                            .addGap(35, 35, 35)
                            .addComponent(lblDescriptionSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelProductLayout.createSequentialGroup()
                            .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblProductName)
                                .addComponent(lblVersion))
                            .addGap(18, 18, 18)
                            .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName)
                                .addComponent(lblChintan6)
                                .addComponent(lblProductFor))
                            .addGap(15, 15, 15)))))
        );
        panelProductLayout.setVerticalGroup(
            panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductCompany)
                    .addComponent(lblProductFor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVersion)
                    .addComponent(lblChintan6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductLayout.createSequentialGroup()
                        .addComponent(lblDescription)
                        .addGap(18, 18, 18)
                        .addComponent(inventoryImage))
                    .addComponent(lblDescriptionSystem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(panelDevs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separatorAboutUI, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separatorAboutUI, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDevs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 460, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseAboutUIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CloseAboutUIKeyPressed

    }//GEN-LAST:event_CloseAboutUIKeyPressed

    private void CloseAboutUIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseAboutUIMouseClicked
        AboutUI.super.dispose();
    }//GEN-LAST:event_CloseAboutUIMouseClicked

    private void frameDraggableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggableMouseDragged
        // Setting the position of the frame to current position if dragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDraggableMouseDragged

    private void frameDraggableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggableMousePressed
        // Calculating the current position of the frame when the mouse is seleted
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_frameDraggableMousePressed

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
            java.util.logging.Logger.getLogger(AboutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseAboutUI;
    private javax.swing.JPanel TitleBarAboutUI;
    private javax.swing.JLabel frameDraggable;
    private javax.swing.JLabel imageMusic;
    private javax.swing.JLabel inventoryImage;
    private javax.swing.JLabel lblAboutUS;
    private javax.swing.JLabel lblChintan;
    private javax.swing.JLabel lblChintan6;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JTextArea lblDescriptionSystem;
    private javax.swing.JLabel lblDevelopedBy;
    private javax.swing.JLabel lblGroupCR3;
    private javax.swing.JLabel lblGroupMembers;
    private javax.swing.JLabel lblIIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProductCompany;
    private javax.swing.JLabel lblProductFor;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblRaju;
    private javax.swing.JLabel lblRoshanB;
    private javax.swing.JLabel lblRoshanT;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelDevs;
    private javax.swing.JPanel panelProduct;
    private javax.swing.JSeparator separatorAboutUI;
    // End of variables declaration//GEN-END:variables
}

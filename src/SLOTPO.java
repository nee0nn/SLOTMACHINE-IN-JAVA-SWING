/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
import javax.swing.JOptionPane;
import java.util.Random;
public class SLOTPO extends javax.swing.JFrame {
    private int credits = 100;
    private int bet = 10;
    private int lastWin = 0;
    private final String[] symbols = {"🍒", "🍊", "🍋", "🍉", "⭐", "7️"};
    private final Random rand = new Random();

    private javax.swing.Timer allSpinTimer;
    private int spinCycle = 0;           
    private final int stopAtCycle1 = 20;      
    private final int stopAtCycle2 = 40;      
    private final int stopAtCycle3 = 60;      
    private final String[] finalSymbolsSpin = new String[3];
    private int spinCountForAd = 0;
    
    
   
    public SLOTPO() {
        initComponents();
        // Set initial display
        lblCredits.setText(String.valueOf(credits));
        lblBet.setText(String.valueOf(bet));
        lblWin.setText("0");
        
        // Set initial reel symbols to cherry
        jLabel1.setText("🍒");
        reel2.setText("🍒");
        reel3.setText("🍒");
        
        // Add action for BET + button (jButton2)
        jButton2.addActionListener((java.awt.event.ActionEvent evt) -> {
            changeBet(10);
        });
        
        // Add action for SPIN button (jButton3)
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            spin();
        });
        updateSpinButtonState();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        reel2 = new javax.swing.JLabel();
        reel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCredits = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBet = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblWin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 110, 110));

        reel2.setFont(reel2.getFont().deriveFont(reel2.getFont().getStyle() | java.awt.Font.BOLD, reel2.getFont().getSize()+36));
        reel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reel2.setText("2");
        reel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(reel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 110, 110));

        reel3.setFont(reel3.getFont().deriveFont(reel3.getFont().getStyle() | java.awt.Font.BOLD, reel3.getFont().getSize()+36));
        reel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reel3.setText("3");
        reel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        getContentPane().add(reel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 110, 110));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CREDITS: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 20));

        lblCredits.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCredits.setForeground(new java.awt.Color(255, 255, 255));
        lblCredits.setText("100");
        getContentPane().add(lblCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 70, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BET: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 60, 20));

        lblBet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBet.setForeground(new java.awt.Color(255, 255, 255));
        lblBet.setText("10");
        getContentPane().add(lblBet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 60, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LAST WIN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 90, 20));

        lblWin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblWin.setForeground(new java.awt.Color(255, 255, 255));
        lblWin.setText("0");
        getContentPane().add(lblWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 60, 20));

        jButton1.setText("BET -");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, 30));

        jButton2.setText("BET +");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 70, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("SPIN PO");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 140, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/709078400_1519498476341243_8294778656295878407_n (1).jpg"))); // NOI18N
        background.setText("jLabel2");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        changeBet(-10);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SLOTPO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SLOTPO().setVisible(true);
        });
    }
    private void changeBet(int delta) {
    int newBet = bet + delta;
    int minBet = 5;
    
    if (delta < 0) {  
        if (newBet >= minBet) {
            bet = newBet;
        } else {
            bet = minBet;   
        }
    } else {  
        if (newBet <= credits) {
            bet = newBet;
        } else {
            bet = credits;   
        }
    }
 
    if (bet < minBet) bet = minBet;
    if (bet > credits) bet = credits;
    
    lblBet.setText(String.valueOf(bet));
    updateSpinButtonState();   
}
     private void spin() {
        if (credits < bet) {
            JOptionPane.showMessageDialog(this, "Not enough credits!");
            return;
        }
        
        
        credits -= bet;
        lblCredits.setText(String.valueOf(credits));
        lastWin = 0;
        lblWin.setText("0");
        
        
        finalSymbolsSpin[0] = symbols[rand.nextInt(symbols.length)];
        finalSymbolsSpin[1] = symbols[rand.nextInt(symbols.length)];
        finalSymbolsSpin[2] = symbols[rand.nextInt(symbols.length)];
        
        
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        
       
        spinCycle = 0;
        if (allSpinTimer != null && allSpinTimer.isRunning()) {
            allSpinTimer.stop();
        }
        allSpinTimer = new javax.swing.Timer(50, (java.awt.event.ActionEvent e) -> {
            animateAllSpin();
        });
        allSpinTimer.start();
    }
     private void animateAllSpin() {
        spinCycle++;
        
       
        if (spinCycle <= stopAtCycle3) {
           
            if (spinCycle <= stopAtCycle1) {
                jLabel1.setText(symbols[rand.nextInt(symbols.length)]);
            } else {
                jLabel1.setText(finalSymbolsSpin[0]);
            }
            
           
            if (spinCycle <= stopAtCycle2) {
                reel2.setText(symbols[rand.nextInt(symbols.length)]);
            } else {
                reel2.setText(finalSymbolsSpin[1]);
            }
            
           
            if (spinCycle <= stopAtCycle3) {
                reel3.setText(symbols[rand.nextInt(symbols.length)]);
            } else {
                reel3.setText(finalSymbolsSpin[2]);
            }
        } else {
           
            allSpinTimer.stop();
            
            jButton3.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            
            checkWinAfterSpin();
        }
    }
      private void updateSpinButtonState() {
        if (credits < bet) {
            jButton3.setEnabled(false);
        } else {
            jButton3.setEnabled(true);
        }
    }
      
      private void checkWinAfterSpin() {
        String s1 = jLabel1.getText();
        String s2 = reel2.getText();
        String s3 = reel3.getText();
        
        int win = 0;
        if (s1.equals(s2) && s2.equals(s3)) {
            switch (s1) {
                case "🍒" -> win = bet * 2;
                case "🍊" -> win = bet * 3;
                case "🍋" -> win = bet * 4;
                case "🍉" -> win = bet * 5;
                case "⭐" -> win = bet * 10;
                case "7" -> win = bet * 20;
                default -> {}
            }
        } else if (s1.equals(s2) || s2.equals(s3) || s1.equals(s3)) {
            win = bet;
        }
        
        if (win > 0) {
            credits += win;
            lastWin = win;
            JOptionPane.showMessageDialog(this, "🎉 You won " + win + " credits! 🎉");
        } else {
            lastWin = 0;
        }
        
        lblCredits.setText(String.valueOf(credits));
        lblWin.setText(String.valueOf(lastWin));
        
        
        updateSpinButtonState();
        spinCountForAd++;
        if (spinCountForAd >= 3) {
            spinCountForAd = 0;
            
            javax.swing.ImageIcon adIcon = null;
            try {
                adIcon = new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\SLOTMACHINE\\src\\images\\ads.jpg");
                java.awt.Image img = adIcon.getImage().getScaledInstance(350, 150, java.awt.Image.SCALE_SMOOTH);
                adIcon = new javax.swing.ImageIcon(img);
            } catch (Exception e) {}
            
            JOptionPane.showMessageDialog(this, 
                " ",
                "Tatsulok.tv", 
                JOptionPane.INFORMATION_MESSAGE,
                adIcon);
        }
        if (credits <= 0) {
            javax.swing.ImageIcon gameOverIcon = null;
            try {
                gameOverIcon = new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\SLOTMACHINE\\src\\images\\gameover.jpg");
                java.awt.Image img = gameOverIcon.getImage().getScaledInstance(200, 400, java.awt.Image.SCALE_SMOOTH);
                gameOverIcon = new javax.swing.ImageIcon(img);
            } catch (Exception e) {
                gameOverIcon = null;
            }
            
            int choice = javax.swing.JOptionPane.showConfirmDialog(this, 
                "GAME OVER! You have 0 credits.\nCash in ka boy??", 
                "Game Over", 
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                gameOverIcon);
            
            if (choice == javax.swing.JOptionPane.YES_OPTION) {
                credits = 100;
                bet = 10;
                lastWin = 0;
                lblCredits.setText(String.valueOf(credits));
                lblBet.setText(String.valueOf(bet));
                lblWin.setText("0");
                jLabel1.setText("🍒");
                reel2.setText("🍒");
                reel3.setText("🍒");
                updateSpinButtonState();
            } else {
                System.exit(0);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBet;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblWin;
    private javax.swing.JLabel reel2;
    private javax.swing.JLabel reel3;
    // End of variables declaration//GEN-END:variables
}

package player;

import com.player.bll.UserAccount;
import javax.swing.JOptionPane;

public class CreateUserAccountGUI extends javax.swing.JFrame {
    UserAccount ua;
    public CreateUserAccountGUI() {
        initComponents();
        ua = new UserAccount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        password1Label = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        userNameTextField = new javax.swing.JTextField();
        createNewAccountButton = new javax.swing.JButton();
        emailAddressLabel = new javax.swing.JLabel();
        emailAddressTextField = new javax.swing.JTextField();
        password2Label = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        createUserAccountTitleLabel = new javax.swing.JLabel();
        returntoLoginPageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create User Account");

        panel1.setBackground(new java.awt.Color(153, 153, 153));

        password1Label.setText("Password");

        userNameLabel.setText("User Name");

        jPasswordField1.setToolTipText("");

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        createNewAccountButton.setText("Create New Account");
        createNewAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAccountButtonActionPerformed(evt);
            }
        });

        emailAddressLabel.setText("Email Address");

        password2Label.setText("Re-Type Password");

        jPasswordField2.setToolTipText("");

        createUserAccountTitleLabel.setFont(new java.awt.Font("PMingLiU", 1, 36)); // NOI18N
        createUserAccountTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createUserAccountTitleLabel.setText("Create New User Account");
        createUserAccountTitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        returntoLoginPageButton.setText("Return to Login Page");
        returntoLoginPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returntoLoginPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createUserAccountTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(userNameTextField)
                                    .addComponent(emailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addComponent(password2Label)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameLabel)
                                        .addComponent(emailAddressLabel)
                                        .addComponent(password1Label))
                                    .addGap(42, 42, 42)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(createNewAccountButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returntoLoginPageButton)
                                .addGap(34, 34, 34)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createUserAccountTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(userNameLabel)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddressLabel)
                    .addComponent(emailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1Label))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2Label)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewAccountButton)
                    .addComponent(returntoLoginPageButton))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAccountButtonActionPerformed
        
        String userName = userNameTextField.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        String password2 = String.valueOf(jPasswordField2.getPassword());
        String email = emailAddressTextField.getText();
        String error="";
        if (UserAccount.userExists(userName)) {
            System.out.println("Invalid Login");
            JOptionPane.showMessageDialog(this, "User already exists.",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (ua.isValidUsername(userName) && ua.isValidPassword(password)
                    && ua.isValidEmail(email) && ua.passwordMatch(password, password2)) {
                UserAccount newAccount = new UserAccount(userName, password, email);
                VampPlayerGUI player = new VampPlayerGUI();
                player.newUser(newAccount);
                this.setVisible(false);
            } else {
                if (ua.isValidUsername(userName) == false) {
                    error += "- Username must be 3-16 alphanumeric characters and start with a letter /n";
                }else{
                    error += "- Username IS VALID /n";
                }
                if (ua.isValidPassword(password) == false) {
                    error += "- Password be 6-16 characters and must contain at least: a number, a lowercase, an uppercase /n";
                }else{
                    error += "- Password IS VALID /n";
                }
                if (ua.isValidEmail(email) == false) {
                    error += "- Email must be in user@host.me format /n";
                }else{
                    error += "- Email IS VALID /n";
                }
                if (ua.passwordMatch(password, password2)) {
                    error += "- Passwords MATCH /n";
                }else{
                    error += "- Passwords do not match. /n";
                }
                System.out.println("Invalid Login");
                JOptionPane.showMessageDialog(this, error.split("/n"),
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    
    }//GEN-LAST:event_createNewAccountButtonActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

    private void returntoLoginPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returntoLoginPageButtonActionPerformed
        // TODO add your handling code here:
        VAMPLoginScreen login = new VAMPLoginScreen(); 
        this.setVisible(false);
        login.setVisible(true);
        
        
    }//GEN-LAST:event_returntoLoginPageButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserAccountGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CreateUserAccountGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewAccountButton;
    private javax.swing.JLabel createUserAccountTitleLabel;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField emailAddressTextField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private java.awt.Panel panel1;
    private javax.swing.JLabel password1Label;
    private javax.swing.JLabel password2Label;
    private javax.swing.JButton returntoLoginPageButton;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}

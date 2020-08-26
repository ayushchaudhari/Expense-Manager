package expense.manager;



import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/* @author chaudhari ji*/
 public class SignIn extends javax.swing.JFrame{
    String userName,passWord;
    /*Creates new form loginWindow*/
    public SignIn() {
        initComponents();
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passTF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameLabel.setText("Username");

        passwordLabel.setText("Password");

        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");

        signInButton.setText("Sign In");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        signupButton.setText("Sign Up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Create a new account ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(signInButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupButton))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameTFActionPerformed

    //Connection function java-sql
    public static Connection getCon(String username,String password){
		Connection con=null;
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensemanager",username,password);
		}catch(Exception e){System.out.println(e);}
		return con;
	}

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        String usernameEntered,passEntered;
        char ch[];
        usernameEntered =usernameTF.getText();
        //System.out.println(usernameEntered);         /*Just for testing purpose*/
        ch= passTF.getPassword();
        passEntered =String.valueOf(ch);
        //System.out.println(ch);                      /*Just for testing purpose*/
        if(!usernameTF.getText().equals("") && !passEntered.equals("")){
            try{
    /*----------------------------------JDBC Connection----------------------------------------------*/
                Connection con=getCon("root","root");
                
                /*Below code is just for testing the jdbc connection purpose*/
//                if(con!=null)
//                    System.out.println("Connection Successfull by Sign In");
//                else
//                    System.out.println("Connection Unsuccessfull by Sign In");
    /*-----------------------------------------------------------------------------------------------*/
             
                Statement st=con.createStatement();
    /*-------------------First-Logic-to-check-login-initials-and-getting-signed-in-------------------*/     
    
                ResultSet rs=st.executeQuery("select uid,username,password from userdb where username='"+usernameEntered+"'");
                
                boolean signInSuccess=false;
                
                if(rs.next()==true){
                    String pass=rs.getString("password");
                    if(pass.equals(passEntered)){
                        signInSuccess=true;
                        JOptionPane.showMessageDialog(null, "Login Successfull");
                    }
                }
                if(signInSuccess==true){
                    dispose();
                    int userid=rs.getInt("uid");
                    System.out.println(userid);
                    new WelcomePage(userid).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password entered!","ERROR", ERROR_MESSAGE);
                }
                       
    /*----------------------------------------First-Login-Ends------------------------------------------*/
    
    
    /*--------------------Second-Logic-to-check-login-initials-and-getting-signed-in--------------------*/
                       
//                ResultSet rs=st.executeQuery("select uid,username,password,fname from userdb ");
//
//                if(rs.next()==false){
//                    //System.out.println("result set is empty");   /*Just for testing purpose*/
//                    JOptionPane.showMessageDialog(null,"Invalid username or password entered!","Message", ERROR_MESSAGE);
//                }else{
//                   boolean signInSuccess=false;
//                    do{
//                        String pass=rs.getString("password");
//                        String user=rs.getString("userName");
//                        if(passEntered.equals(pass)==true && usernameEntered.equals(user)==true){
//                            JOptionPane.showMessageDialog(null, "Login Successfull");
//                            new WelcomePage(rs.getInt("uid")).setVisible(true);
//                            signInSuccess=true;
//                        }
//                        //System.out.println("Username="+user+"  Password="+pass);  /*Just for testing purpose*/
//                    }while(rs.next() && signInSuccess==false);
//                    if(signInSuccess==false)
//                        JOptionPane.showMessageDialog(null,"Invalid username or password entered!","Message", ERROR_MESSAGE);
//                    else
//                        dispose();
//                }
    /*----------------------------------------Second-Login-Ends------------------------------------------*/
                                
                st.close();
                con.close();
            }catch(HeadlessException | SQLException e){System.out.println(e);}
        }else{
            JOptionPane.showMessageDialog(null,"Invalid username or password entered!","ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signInButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        new SignUp().setVisible(true);   
    }//GEN-LAST:event_signupButtonActionPerformed

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
       /* 
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
			SignIn frameSignIn =new SignIn();
                        frameSignIn.setVisible(true);
		    } catch (Exception e) {
                                            e.printStackTrace();
                                           }
    
            }
        });
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}

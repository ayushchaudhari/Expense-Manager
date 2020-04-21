package expense.manager;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/* @author chaudhari ji*/
 public class SignIn extends javax.swing.JFrame{
    int userid;
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
        submitButton = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sign In");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        signupButton.setText("Sign Up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

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
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitButton))
                        .addGap(18, 18, 18)
                        .addComponent(signupButton)))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupButton))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameTFActionPerformed
    private void passwordActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    public static Connection getCon(String username,String password){
		Connection con=null;
		try{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensemanager",username,password);
		}catch(Exception e){System.out.println(e);}
		return con;
	}
   /* public static boolean validate(String name,String pass){
		boolean status=false;
		try{
			Connection con=getCon();
                        if(con!=null)
                        System.out.println("Connection Successfull by Sign In");
                        PreparedStatement ps=con.prepareStatement("select username,password from expensemanager.userdb where username=?");
			ps.setString(1,name);
			ResultSet rs=ps.executeQuery();
                     //   ResultSetMetaData resultsetmetadata=rs.getMetaData();
                        String password=rs.getString("password");
                        String username=rs.getString("username");
                        if(pass==password && username==name){
                           JOptionPane.showMessageDialog(null, "Login Successfull");
                        }
                        
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}*/
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String usernameEntered,passEntered;
        char ch[];
        usernameEntered =usernameTF.getText();
        System.out.println(usernameEntered);
        ch= passTF.getPassword();
        passEntered =String.valueOf(ch);
        try{
            Connection con=getCon("root","root");
            if(con!=null)
                System.out.println("Connection Successfull by Sign In");
            else
                System.out.println("Connection Unsuccessfull by Sign In");
            Statement st=con.createStatement();
            //PreparedStatement st=con.prepareStatement("select username,password from userdb where username=?");
            //st.setString(1,usernameTF.getText());
            ResultSet rs=st.executeQuery("select uid,username,password from userdb ");
            //ResultSet rs=st.executeQuery("select username,password from userdb where username="+usernameEntered);
            //ResultSetMetaData resultsetmetadata=rs.getMetaData();
            if(rs.next()==false){
                System.out.println("result set is empty");
            }else{
                boolean signInSuccess=false;
                
                do{
                    String pass=rs.getString("password");
                    String user=rs.getString("userName");
                    if(passEntered.equals(pass)==true && usernameEntered.equals(user)==true){
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    Page1 page1= new Page1();
                    page1.username=user;
                    page1.userid=rs.getInt("uid");
                    page1.setVisible(true);
                    signInSuccess=true;
                    }
                    System.out.println("Username="+user+"  Password="+pass);
                }while(rs.next() && signInSuccess==false);
                 if(signInSuccess==false)
                     JOptionPane.showMessageDialog(null,"Invalid username or password entered!","Message", ERROR_MESSAGE);
            }
         
            
           // String pass=rs.getString("password");
          //  String user=rs.getString("username");
            /*if(passEntered.equals(pass)==true && usernameEntered.equals(user)==true){
                JOptionPane.showMessageDialog(null, "Login Successfull");
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid username or password entered!","Message", ERROR_MESSAGE);
            } */ 
            st.close();
            con.close();
	}catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_submitButtonActionPerformed

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
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
			SignIn frameSignIn =new SignIn();
                        frameSignIn.setVisible(true);
		    } catch (Exception e) {
                                            e.printStackTrace();
                                           }
    
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton signupButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}

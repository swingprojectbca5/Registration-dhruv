package login_design;

import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class NewJFrame extends javax.swing.JFrame
{

    static Connection con;
    PreparedStatement ps;
    PreparedStatement ps1;
    Statement st;
    ResultSet result;
    ResultSet result1;

    int x;
    int y;

    public NewJFrame()
    {
        initComponents();
    }

    boolean ispasswordcorrect()
    {
        String query = "select * from signup where user like '" + txtuser.getText() + "'and pass like '" + txtpass.getText() + "'or gmail like '" + txtuser.getText() + "' and pass like '" + txtpass.getText() + "'";
        try
        {
            st = con.createStatement();
            result = st.executeQuery(query);

            if (result.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
        }
        return false;
    }

    static boolean isdriverloaded()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    static boolean isconnected()
    {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dhruvjdbc", "root", "");
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    boolean isuserempty()
    {
        if (txtuser.getText().equals("USERNAME OR MAIL"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean ispassempty()
    {
        if (txtpass.getText().equals("PASSWORD"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtpass = new javax.swing.JPasswordField();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        lblsignup = new javax.swing.JLabel();
        lblfpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                formMousePressed(evt);
            }
        });

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(407, 457));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login4.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
        );

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(407, 457));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        txtuser.setBackground(new Color(0,0,0,0));
        txtuser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtuser.setForeground(java.awt.Color.lightGray);
        txtuser.setText("USERNAME OR MAIL");
        txtuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtuser.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtuserFocusLost(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/closed.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel5MouseClicked(evt);
            }
        });

        jCheckBox1.setText("SHOW PASSWORD");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        txtpass.setBackground(new Color(0,0,0,0)
        );
        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpass.setText("PASSWORD");
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtpass.setEchoChar('*');
        txtpass.setPreferredSize(new java.awt.Dimension(93, 26));
        txtpass.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtpassFocusLost(evt);
            }
        });

        kButton1.setText("SIGN IN");
        kButton1.setkEndColor(new java.awt.Color(0, 0, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Not Yet Registered?");

        lblsignup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblsignup.setForeground(new java.awt.Color(255, 255, 255));
        lblsignup.setText("SIGN UP");
        lblsignup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblsignup.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblsignupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblsignupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblsignupMouseExited(evt);
            }
        });

        lblfpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblfpass.setForeground(new java.awt.Color(255, 255, 255));
        lblfpass.setText("Forgot Password ?");
        lblfpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblfpass.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblfpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblfpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblfpassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(lblfpass, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(lblsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(103, 103, 103))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(120, 120, 120)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsignup))
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lblfpass)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtuserFocusGained
    {//GEN-HEADEREND:event_txtuserFocusGained
        if (txtuser.getText().equals("USERNAME OR MAIL"))
        {
            txtuser.setText("");
            txtuser.setForeground(Color.white);
            txtuser.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        }

    }//GEN-LAST:event_txtuserFocusGained

    private void txtuserFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtuserFocusLost
    {//GEN-HEADEREND:event_txtuserFocusLost
        if (txtuser.getText().equals(""))
        {
            txtuser.setText("USERNAME OR MAIL");
            txtuser.setForeground(Color.lightGray);
            txtuser.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtuserFocusLost

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel5MouseClicked
    {//GEN-HEADEREND:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtpassFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtpassFocusGained
    {//GEN-HEADEREND:event_txtpassFocusGained
        if (txtpass.getText().equals("PASSWORD"))
        {
            txtpass.setText("");
            txtpass.setForeground(Color.white);
            txtpass.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtpassFocusGained

    private void txtpassFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtpassFocusLost
    {//GEN-HEADEREND:event_txtpassFocusLost
        if (txtpass.getText().equals(""))
        {
            txtpass.setText("PASSWORD");
            txtpass.setForeground(Color.lightGray);
            txtpass.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtpassFocusLost

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jCheckBox1ItemStateChanged
    {//GEN-HEADEREND:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected())
        {
            txtpass.setEchoChar((char) 0);
            jCheckBox1.setText("HIDE PASSWORD");
        }
        else
        {
            txtpass.setEchoChar('*');
            jCheckBox1.setText("SHOW PASSWORD");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void lblsignupMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsignupMouseEntered
    {//GEN-HEADEREND:event_lblsignupMouseEntered
        lblsignup.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblsignup.setText("<html><u>SIGN UP</u></html>");
    }//GEN-LAST:event_lblsignupMouseEntered

    private void lblsignupMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsignupMouseExited
    {//GEN-HEADEREND:event_lblsignupMouseExited
        lblsignup.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblsignup.setText("SIGN UP");
    }//GEN-LAST:event_lblsignupMouseExited

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_kButton1ActionPerformed
    {//GEN-HEADEREND:event_kButton1ActionPerformed
        if (isuserempty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill The UserName");
        }
        else if (ispassempty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill The Password");
        }
        else
        {
            String query = " select user,gmail from signup where user like '" + txtuser.getText() + "' or gmail like '" + txtuser.getText() + "'";

            try
            {
                st = con.createStatement();
                result = st.executeQuery(query);

                if (result.next() == true)
                {
                    if (ispasswordcorrect() == false)
                    {
                        JOptionPane.showMessageDialog(null, "Password Incorrect");
                    }
                    else if (ispasswordcorrect() == true)
                    {
                        JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGGED IN");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "User Dosn't Exist");
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMousePressed
    {//GEN-HEADEREND:event_formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_formMouseDragged
    {//GEN-HEADEREND:event_formMouseDragged
        setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_formMouseDragged

    private void lblsignupMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblsignupMouseClicked
    {//GEN-HEADEREND:event_lblsignupMouseClicked
        // TODO add your handling code here:
        NewJFrame1 n = new NewJFrame1();
        n.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblsignupMouseClicked

    private void lblfpassMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblfpassMouseClicked
    {//GEN-HEADEREND:event_lblfpassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfpassMouseClicked

    private void lblfpassMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblfpassMouseEntered
    {//GEN-HEADEREND:event_lblfpassMouseEntered
        lblfpass.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblfpass.setText("<html><u>Forgot Password ?</u></html>");
    }//GEN-LAST:event_lblfpassMouseEntered

    private void lblfpassMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblfpassMouseExited
    {//GEN-HEADEREND:event_lblfpassMouseExited
        lblfpass.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblfpass.setText("Forgot Password ?");
    }//GEN-LAST:event_lblfpassMouseExited

    public static void main(String args[])
    {
        if (isdriverloaded() == false)
        {
            JOptionPane.showMessageDialog(null, "Driver Issue");
        }
        else if (isconnected() == false)
        {
            JOptionPane.showMessageDialog(null, "Connection Failed");
        }
        else
        {
            try
            {
                UIManager.setLookAndFeel(new FlatMonocaiIJTheme());
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "UI Not Supported");
            }
        }

        java.awt.EventQueue.invokeLater(
                new Runnable()
        {

            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblfpass;
    private javax.swing.JLabel lblsignup;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}

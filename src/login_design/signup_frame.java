/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_design;

import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;
import java.awt.*;
import java.sql.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class signup_frame extends javax.swing.JFrame
{
    static Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet result;
    int rnd;
    int x,y;
    String emailgained;

    String otpgenerator()
    {
        rnd = (int) (Math.random() * 9000) + 1000;
        String otp = Integer.toString(rnd);

        return otp;
    }

    boolean isotpcorrect()
    {
        if (txtotp.getText().equals(Integer.toString(rnd)))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    boolean isuserexist()
    {
        String query = "select * from signup where user = '" + txtuser.getText() + "'";
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
            JOptionPane.showMessageDialog(null, "ERROR WHILE CHECKING USER EXIST");
        }
        return false;
    }

    boolean ispasswordcorrect()
    {
        if (txtpass.getText().equals(txtconpass.getText()))
        {
            return false;
        }
        else
        {
            return true;
        }
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
        if (txtuser.getText().equals("USERNAME"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isemailempty()
    {
        if (txtmail.getText().equals("EMAIL"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isotpempty()
    {
        if (txtotp.getText().equals("OTP"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isconpassempty()
    {
        if (txtconpass.getText().equals("CONFIRM PASSWORD"))
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

    public signup_frame()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtotp = new javax.swing.JTextField();
        lblotp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtconpass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnsignup = new com.k33ptoo.components.KButton();
        btnsignin = new com.k33ptoo.components.KButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(407, 457));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refer.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 581));

        kGradientPanel3.setkBorderRadius(0);
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(4015, 457));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/closed.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        txtuser.setBackground(new Color(0,0,0,0));
        txtuser.setForeground(java.awt.Color.lightGray);
        txtuser.setText("USERNAME");
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/email.png"))); // NOI18N

        txtmail.setBackground(new Color(0,0,0,0));
        txtmail.setForeground(java.awt.Color.lightGray);
        txtmail.setText("EMAIL");
        txtmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtmail.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtmailFocusLost(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/business-and-finance.png"))); // NOI18N

        txtotp.setBackground(new Color(0,0,0,0));
        txtotp.setForeground(java.awt.Color.lightGray);
        txtotp.setText("OTP");
        txtotp.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        txtotp.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtotpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtotpFocusLost(evt);
            }
        });
        txtotp.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtotpKeyPressed(evt);
            }
        });

        lblotp.setForeground(new java.awt.Color(255, 255, 255));
        lblotp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblotp.setText("SEND OTP");
        lblotp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lblotp.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblotpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblotpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblotpMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N

        txtpass.setBackground(new Color(0,0,0,0)
        );
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N

        txtconpass.setBackground(new Color(0,0,0,0)
        );
        txtconpass.setText("CONFIRM PASSWORD");
        txtconpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtconpass.setEchoChar('*');
        txtconpass.setPreferredSize(new java.awt.Dimension(93, 26));
        txtconpass.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txtconpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txtconpassFocusLost(evt);
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

        btnsignup.setText("SIGN UP");
        btnsignup.setkEndColor(new java.awt.Color(0, 0, 255));
        btnsignup.setkHoverEndColor(new java.awt.Color(0, 0, 255));
        btnsignup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsignupActionPerformed(evt);
            }
        });

        btnsignin.setText("SIGN IN");
        btnsignin.setkEndColor(new java.awt.Color(0, 0, 255));
        btnsignin.setkHoverEndColor(new java.awt.Color(0, 0, 255));
        btnsignin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsigninActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtconpass, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(kGradientPanel3Layout.createSequentialGroup()
                                            .addComponent(txtotp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblotp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtmail)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6))))
                    .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtuser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(14, 14, 14))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtotp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblotp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtconpass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsignin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 420, 581));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel7MouseClicked
    {//GEN-HEADEREND:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtuserFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtuserFocusGained
    {//GEN-HEADEREND:event_txtuserFocusGained
        if (txtuser.getText().equals("USERNAME"))
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
            txtuser.setText("USERNAME");
            txtuser.setForeground(Color.lightGray);
            txtuser.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtuserFocusLost

    private void txtconpassFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtconpassFocusGained
    {//GEN-HEADEREND:event_txtconpassFocusGained
        if (txtconpass.getText().equals("CONFIRM PASSWORD"))
        {
            txtconpass.setText("");
            txtconpass.setForeground(Color.white);
            txtconpass.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtconpassFocusGained

    private void txtconpassFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtconpassFocusLost
    {//GEN-HEADEREND:event_txtconpassFocusLost
        if (txtconpass.getText().equals(""))
        {
            txtconpass.setText("CONFIRM PASSWORD");
            txtconpass.setForeground(Color.lightGray);
            txtconpass.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtconpassFocusLost

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jCheckBox1ItemStateChanged
    {//GEN-HEADEREND:event_jCheckBox1ItemStateChanged
        if (jCheckBox1.isSelected())
        {
            txtconpass.setEchoChar((char) 0);
            txtpass.setEchoChar((char) 0);
            jCheckBox1.setText("HIDE PASSWORD");
        }
        else
        {
            txtconpass.setEchoChar('*');
            txtpass.setEchoChar('*');
            jCheckBox1.setText("SHOW PASSWORD");
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void lblotpMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblotpMouseClicked
    {//GEN-HEADEREND:event_lblotpMouseClicked

        String fromEmail = "ethicalanonymous111@gmail.com";
        String pswd = "anonymous@111";
        String subject = "TEST MESSAGE";
        String text = "Your Verification Code is " + otpgenerator();
        String toEmail = txtmail.getText();

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties, new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(fromEmail, pswd);
            }

        });

        session.setDebug(true);
        try
        {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(fromEmail);
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject(subject);
            msg.setText(text);
            Transport.send(msg);
            JOptionPane.showMessageDialog(null, "OTP SEND TO YOUR EMAIL PLEASE VERIFY YOUR EMAIL");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_lblotpMouseClicked

    private void lblotpMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblotpMouseEntered
    {//GEN-HEADEREND:event_lblotpMouseEntered
        lblotp.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblotp.setText("<html><u>SEND OTP</u></html>");
    }//GEN-LAST:event_lblotpMouseEntered

    private void lblotpMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblotpMouseExited
    {//GEN-HEADEREND:event_lblotpMouseExited
        lblotp.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblotp.setText("SEND OTP");
    }//GEN-LAST:event_lblotpMouseExited

    private void txtmailFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtmailFocusGained
    {//GEN-HEADEREND:event_txtmailFocusGained
        emailgained = txtmail.getText();
        if (txtmail.getText().equals("EMAIL"))
        {
            txtmail.setText("");
            txtmail.setForeground(Color.white);
            txtmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtmailFocusGained

    private void txtmailFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtmailFocusLost
    {//GEN-HEADEREND:event_txtmailFocusLost
        //emaillost = txtmail.getText();
        if (txtmail.getText().equals(emailgained))
        {
        }
        else if (txtmail.getText().equals(""))
        {
            txtmail.setText("EMAIL");
            txtmail.setForeground(Color.lightGray);
            txtmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
        else
        {
            rnd = 0;
            txtotp.setText("OTP");
            txtotp.grabFocus();
            txtotp.setForeground(Color.lightGray);
            txtotp.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtmailFocusLost

    private void txtotpFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtotpFocusGained
    {//GEN-HEADEREND:event_txtotpFocusGained
        if (txtotp.getText().equals("OTP"))
        {
            txtotp.setText("");
            txtotp.setForeground(Color.white);
            txtotp.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtotpFocusGained

    private void txtotpFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txtotpFocusLost
    {//GEN-HEADEREND:event_txtotpFocusLost
        if (txtotp.getText().equals(""))
        {
            txtotp.setText("OTP");
            txtotp.setForeground(Color.lightGray);
            txtotp.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_txtotpFocusLost

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

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsigninActionPerformed
    {//GEN-HEADEREND:event_btnsigninActionPerformed
        login_frame n = new login_frame();
        n.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsigninActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsignupActionPerformed
    {//GEN-HEADEREND:event_btnsignupActionPerformed
        if (isuserempty())
        {
            JOptionPane.showMessageDialog(null, "PLEASE FILL THE USERNAME");
            txtuser.grabFocus();
        }
        else if (isemailempty())
        {
            JOptionPane.showMessageDialog(null, "PLEASE FILL THE EMAIL");
            txtmail.grabFocus();
        }
        else if (isotpempty())
        {
            JOptionPane.showMessageDialog(null, "PLEASE FILL THE OTP");
            txtotp.grabFocus();
        }
        else if (isotpcorrect())
        {
            JOptionPane.showMessageDialog(null, "OTP INCORRECT");
            txtotp.grabFocus();
        }
        else if (ispassempty())
        {
            JOptionPane.showMessageDialog(null, "PLEASE FILL THE PASSWORD");
            txtpass.grabFocus();
        }
        else if (isconpassempty())
        {
            JOptionPane.showMessageDialog(null, "PlEASE CONFIRM THE PASSWORD");
            txtconpass.grabFocus();
        }
        else if (ispasswordcorrect() == true)
        {
            JOptionPane.showMessageDialog(null, "PASSWORD DOESN't MATCH");
            txtconpass.grabFocus();
        }
        else if (isuserexist())
        {
            JOptionPane.showMessageDialog(null, "USER ALREADY EXIST");
            txtuser.grabFocus();
        }
        else if (rnd == 0)
        {
            JOptionPane.showMessageDialog(null, "REGENRAte THE OTP");
            txtotp.grabFocus();
        }
        else
        {
            String query = "insert into signup values('" + txtmail.getText() + "','" + txtuser.getText() + "','" + txtpass.getText() + "')";

            try
            {
                ps = con.prepareStatement(query);
                int n = ps.executeUpdate();
                if (n > 0)
                {
                    JOptionPane.showMessageDialog(null, "1 RECORD INSERTED SUCCESSFULLY");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "CAN't INSERT THE RECORD");
                }
            }
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnsignupActionPerformed

    private void txtotpKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtotpKeyPressed
    {//GEN-HEADEREND:event_txtotpKeyPressed
        
          char c = evt.getKeyChar();
          
        if (Character.isLetter(c))
        {
            txtotp.setEditable(false);
        }
        else
        {
            txtotp.setEditable(true);
            if(txtotp.getText().equals(evt.VK_BACK_SPACE) || txtotp.getText().length() < 4)
            {
                txtotp.setEditable(true);
            }
            else if(txtotp.getText().length() > 4)
            {
                txtotp.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtotpKeyPressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(evt.getXOnScreen() - x, evt.getYOnScreen() - y);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         x = evt.getX();
         y = evt.getY();
    }//GEN-LAST:event_formMousePressed

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

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new signup_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnsignin;
    private com.k33ptoo.components.KButton btnsignup;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblotp;
    private javax.swing.JPasswordField txtconpass;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtotp;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}


package classes;

import java.beans.PropertyVetoException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends javax.swing.JFrame {

    java.sql.Connection conn = null;
     ResultSet rs = null;
     PreparedStatement pst = null;
     
    public Dashboard() {
        initComponents();
        conn = Connection.connexion();
        displayUsers();
        displayBooks();
        displayStudents();
        displayIssue();
        displayReturn();
     
    }
    
    public final void displayUsers(){
    
          try {
                              String query = "select count(*)  from lms_users";
                            Statement  stmt = conn.createStatement();
                            rs = stmt.executeQuery(query);
                            rs.next();
                            int count = rs.getInt(1);
                            UserNber.setText(String.valueOf(count));
                         
                            
                    } catch (SQLException e) {
                    }
    
    }
     public final void displayBooks(){
    
          try {
                              String query = "select count(*)  from lms_books";
                            Statement  stmt = conn.createStatement();
                            rs = stmt.executeQuery(query);
                            rs.next();
                            int count = rs.getInt(1);
                            BookNber.setText(String.valueOf(count));
                         
                            
                    } catch (SQLException e) {
                    }
    
    }
     
     public final void displayStudents(){
    
          try {
                             String query = "select count(*)  from student";
                            Statement  stmt = conn.createStatement();
                            rs = stmt.executeQuery(query);
                            rs.next();
                            int count = rs.getInt(1);
                            StudentNber.setText(String.valueOf(count));
                         
                            
                    } catch (SQLException e) {
                    }
    
    }
        public final void displayIssue(){
    
          try {
                             String query = "select count(*)  from withdraws";
                            Statement  stmt = conn.createStatement();
                            rs = stmt.executeQuery(query);
                            rs.next();
                            int count = rs.getInt(1);
                            issueBook.setText(String.valueOf(count));
                         
                            
                    } catch (SQLException e) {
                    }
    
    }
           public final void displayReturn(){
    
          try {
                             String query = "select count(*)  from deposit";
                            Statement  stmt = conn.createStatement();
                            rs = stmt.executeQuery(query);
                            rs.next();
                            int count = rs.getInt(1);
                            returnBook.setText(String.valueOf(count));
                         
                            
                    } catch (SQLException e) {
                    }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMain = new javax.swing.JPanel();
        Bureau = new javax.swing.JDesktopPane();
        Home = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BookNber = new javax.swing.JLabel();
        StudentNber = new javax.swing.JLabel();
        UserNber = new javax.swing.JLabel();
        returnBook = new javax.swing.JLabel();
        issueBook = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BtnDashboard = new javax.swing.JButton();
        BtnUsers = new javax.swing.JButton();
        BtnEtudiant = new javax.swing.JButton();
        BtnBiblio = new javax.swing.JButton();
        BtnIssue = new javax.swing.JButton();
        BtnReturn = new javax.swing.JButton();
        BtnStats = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        HomeMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        BookMenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        StudentMenu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        IssueMenu = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        ReturnMenu = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        CloseMenu = new javax.swing.JMenuItem();
        ReportMenu = new javax.swing.JMenu();
        MenuBook = new javax.swing.JMenu();
        MenuStudent = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(200, 50, 0, 0));
        setResizable(false);

        PanelMain.setBackground(new java.awt.Color(0, 0, 0));
        PanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bureau.setBackground(new java.awt.Color(255, 255, 255));

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel35.setFont(new java.awt.Font("Nimbus Sans L", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Users");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.jpg"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bOOK.jpg"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Nimbus Sans L", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Books");

        jLabel36.setFont(new java.awt.Font("Nimbus Sans L", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Students");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Student.jpg"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Nimbus Sans L", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Returned Books");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ReturnB.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Left.png"))); // NOI18N
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lib.png"))); // NOI18N
        jLabel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LeftNorth.png"))); // NOI18N
        jLabel48.setToolTipText("");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Up.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RightNorth.png"))); // NOI18N
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IssueB.jpeg"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Nimbus Sans L", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Issued  Books");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Right.png"))); // NOI18N
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HomeTitle.png"))); // NOI18N

        BookNber.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        BookNber.setForeground(new java.awt.Color(0, 51, 102));

        StudentNber.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        StudentNber.setForeground(new java.awt.Color(0, 51, 102));

        UserNber.setFont(new java.awt.Font("Cantarell", 0, 48)); // NOI18N
        UserNber.setForeground(new java.awt.Color(0, 51, 102));

        returnBook.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        returnBook.setForeground(new java.awt.Color(0, 51, 102));

        issueBook.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        issueBook.setForeground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserNber, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel40))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(109, 109, 109))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BookNber, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(HomeLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(84, 84, 84)))
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38))
                        .addGap(111, 111, 111))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel48)
                        .addGap(18, 18, 18)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentNber, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))))
            .addGroup(HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel46)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43))
                        .addGap(533, 533, 533)))
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel41))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)))
                .addGap(51, 51, 51))
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(UserNber, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(StudentNber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookNber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(returnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel43)
                                .addGap(22, 22, 22)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel46)
                                    .addComponent(issueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        Bureau.setLayer(Home, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout BureauLayout = new javax.swing.GroupLayout(Bureau);
        Bureau.setLayout(BureauLayout);
        BureauLayout.setHorizontalGroup(
            BureauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BureauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2, Short.MAX_VALUE))
        );
        BureauLayout.setVerticalGroup(
            BureauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BureauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelMain.add(Bureau, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 10, 900, 700));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo Marc.png"))); // NOI18N
        PanelMain.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 100));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "General", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nimbus Sans", 1, 14), new java.awt.Color(0, 51, 153))); // NOI18N

        BtnDashboard.setBackground(new java.awt.Color(255, 255, 255));
        BtnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnDashboard.png"))); // NOI18N
        BtnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnDashboard.setBorderPainted(false);
        BtnDashboard.setContentAreaFilled(false);
        BtnDashboard.setFocusPainted(false);
        BtnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDashboardActionPerformed(evt);
            }
        });

        BtnUsers.setBackground(new java.awt.Color(255, 255, 255));
        BtnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnUsers.png"))); // NOI18N
        BtnUsers.setToolTipText("");
        BtnUsers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnUsers.setBorderPainted(false);
        BtnUsers.setContentAreaFilled(false);
        BtnUsers.setFocusPainted(false);
        BtnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsersActionPerformed(evt);
            }
        });

        BtnEtudiant.setBackground(new java.awt.Color(255, 255, 255));
        BtnEtudiant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnEtudiant.png"))); // NOI18N
        BtnEtudiant.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEtudiant.setBorderPainted(false);
        BtnEtudiant.setContentAreaFilled(false);
        BtnEtudiant.setFocusPainted(false);
        BtnEtudiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEtudiantActionPerformed(evt);
            }
        });

        BtnBiblio.setBackground(new java.awt.Color(255, 255, 255));
        BtnBiblio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnBibliotheque.png"))); // NOI18N
        BtnBiblio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBiblio.setBorderPainted(false);
        BtnBiblio.setContentAreaFilled(false);
        BtnBiblio.setFocusPainted(false);
        BtnBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBiblioActionPerformed(evt);
            }
        });

        BtnIssue.setBackground(new java.awt.Color(255, 255, 255));
        BtnIssue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnIssue.png"))); // NOI18N
        BtnIssue.setToolTipText("");
        BtnIssue.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIssue.setBorderPainted(false);
        BtnIssue.setContentAreaFilled(false);
        BtnIssue.setFocusPainted(false);
        BtnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIssueActionPerformed(evt);
            }
        });

        BtnReturn.setBackground(new java.awt.Color(255, 255, 255));
        BtnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnReturn.png"))); // NOI18N
        BtnReturn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnReturn.setBorderPainted(false);
        BtnReturn.setContentAreaFilled(false);
        BtnReturn.setFocusPainted(false);
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        BtnStats.setBackground(new java.awt.Color(255, 255, 255));
        BtnStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BtnStats.png"))); // NOI18N
        BtnStats.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnStats.setBorderPainted(false);
        BtnStats.setContentAreaFilled(false);
        BtnStats.setFocusPainted(false);
        BtnStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStatsActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ParametresBtn.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnBiblio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(BtnEtudiant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BtnDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEtudiant)
                .addGap(18, 18, 18)
                .addComponent(BtnBiblio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnStats, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 490));

        jLabel50.setFont(new java.awt.Font("Lato Heavy", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Powered by Marcos Mus");
        PanelMain.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, -1, -1));

        jLabel51.setFont(new java.awt.Font("Lato Heavy", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("LMS V1.0");
        PanelMain.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));

        MenuBar.setBackground(new java.awt.Color(255, 255, 255));
        MenuBar.setForeground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.jpg"))); // NOI18N
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Nimbus Sans", 0, 24)); // NOI18N

        HomeMenu.setBackground(new java.awt.Color(255, 255, 255));
        HomeMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        HomeMenu.setForeground(new java.awt.Color(0, 0, 0));
        HomeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpeg"))); // NOI18N
        HomeMenu.setText("     Home");
        HomeMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HomeMenuItemStateChanged(evt);
            }
        });
        HomeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMenuActionPerformed(evt);
            }
        });
        jMenu1.add(HomeMenu);
        jMenu1.add(jSeparator1);

        BookMenu.setBackground(new java.awt.Color(255, 255, 255));
        BookMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        BookMenu.setForeground(new java.awt.Color(0, 0, 0));
        BookMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        BookMenu.setText("     New Book");
        BookMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookMenuActionPerformed(evt);
            }
        });
        jMenu1.add(BookMenu);
        jMenu1.add(jSeparator2);

        StudentMenu.setBackground(new java.awt.Color(255, 255, 255));
        StudentMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        StudentMenu.setForeground(new java.awt.Color(0, 0, 0));
        StudentMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign.jpg"))); // NOI18N
        StudentMenu.setText("     New Student");
        StudentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentMenuActionPerformed(evt);
            }
        });
        jMenu1.add(StudentMenu);
        jMenu1.add(jSeparator3);

        IssueMenu.setBackground(new java.awt.Color(255, 255, 255));
        IssueMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        IssueMenu.setForeground(new java.awt.Color(0, 0, 0));
        IssueMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue.png"))); // NOI18N
        IssueMenu.setText("     Issue Book");
        IssueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueMenuActionPerformed(evt);
            }
        });
        jMenu1.add(IssueMenu);
        jMenu1.add(jSeparator4);

        ReturnMenu.setBackground(new java.awt.Color(255, 255, 255));
        ReturnMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        ReturnMenu.setForeground(new java.awt.Color(0, 0, 0));
        ReturnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retrive.jpg"))); // NOI18N
        ReturnMenu.setText("     Return Book");
        ReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMenuActionPerformed(evt);
            }
        });
        jMenu1.add(ReturnMenu);
        jMenu1.add(jSeparator5);
        jMenu1.add(jSeparator6);

        CloseMenu.setBackground(new java.awt.Color(255, 255, 255));
        CloseMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 18)); // NOI18N
        CloseMenu.setForeground(new java.awt.Color(0, 0, 0));
        CloseMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cancel.png"))); // NOI18N
        CloseMenu.setText("     Close all");
        CloseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CloseMenu);

        MenuBar.add(jMenu1);

        ReportMenu.setBackground(new java.awt.Color(255, 255, 255));
        ReportMenu.setBorder(null);
        ReportMenu.setForeground(new java.awt.Color(0, 0, 0));
        ReportMenu.setText("Activities");
        ReportMenu.setFont(new java.awt.Font("Nimbus Sans", 0, 24)); // NOI18N
        ReportMenu.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                ReportMenuMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        MenuBar.add(ReportMenu);

        MenuBook.setBackground(new java.awt.Color(255, 255, 255));
        MenuBook.setBorder(null);
        MenuBook.setForeground(new java.awt.Color(0, 0, 0));
        MenuBook.setText("Manage Books");
        MenuBook.setFont(new java.awt.Font("Nimbus Sans", 0, 24)); // NOI18N
        MenuBook.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MenuBookMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        MenuBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBookActionPerformed(evt);
            }
        });
        MenuBar.add(MenuBook);

        MenuStudent.setBackground(new java.awt.Color(255, 255, 255));
        MenuStudent.setBorder(null);
        MenuStudent.setForeground(new java.awt.Color(0, 0, 0));
        MenuStudent.setText("Manage Students");
        MenuStudent.setFont(new java.awt.Font("Nimbus Sans", 0, 24)); // NOI18N
        MenuStudent.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                MenuStudentMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        MenuStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuStudentActionPerformed(evt);
            }
        });
        MenuBar.add(MenuStudent);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashboardActionPerformed
       
                   this.Bureau.removeAll();
                    this.Bureau.repaint();
                    this.Bureau.add(Home);
                   
                  
        
    }//GEN-LAST:event_BtnDashboardActionPerformed

    private void BtnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsersActionPerformed
                   this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Utilisateur userManage = new Utilisateur();
                   this.Bureau.add(userManage);
                   try {

                       userManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   userManage.show();
    }//GEN-LAST:event_BtnUsersActionPerformed

    private void BtnEtudiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEtudiantActionPerformed
                    this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Students studentManage = new Students();
                   this.Bureau.add(studentManage);
                   try {

                       studentManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   studentManage.show();
    }//GEN-LAST:event_BtnEtudiantActionPerformed

    private void BtnBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBiblioActionPerformed
                   this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Library libraryManage = new Library();
                   this.Bureau.add(libraryManage);
                   try {

                       libraryManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   libraryManage.show();
    }//GEN-LAST:event_BtnBiblioActionPerformed

    private void BtnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIssueActionPerformed
                   this.Bureau.removeAll();
                   this.Bureau.repaint();
                   IssueBook issueManage = new IssueBook();
                   this.Bureau.add(issueManage);
                   try {

                       issueManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   issueManage.show();
    }//GEN-LAST:event_BtnIssueActionPerformed

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
                    this.Bureau.removeAll();
                   this.Bureau.repaint();
                   ReturnBook returnManage = new ReturnBook();
                   this.Bureau.add(returnManage);
                   try {

                       returnManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   returnManage.show();
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStatsActionPerformed
                   this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Reports reportManage = new Reports();
                   this.Bureau.add(reportManage);
                   try {

                       reportManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   reportManage.show();
    }//GEN-LAST:event_BtnStatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Settings settingsManage = new Settings();
                   this.Bureau.add(settingsManage);
                   try {

                       settingsManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   settingsManage.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
                displayUsers();
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
                displayBooks();
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
                displayStudents();
    }//GEN-LAST:event_jLabel48MouseClicked

    private void HomeMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HomeMenuItemStateChanged
               
                   
    }//GEN-LAST:event_HomeMenuItemStateChanged

    private void HomeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeMenuActionPerformed
                
                this.Bureau.removeAll();
                this.Bureau.repaint();
                 this.Bureau.add(Home);
    }//GEN-LAST:event_HomeMenuActionPerformed

    private void CloseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseMenuActionPerformed
                System.exit(0);
    }//GEN-LAST:event_CloseMenuActionPerformed

    private void MenuBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBookActionPerformed
            
    }//GEN-LAST:event_MenuBookActionPerformed

    private void MenuStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuStudentActionPerformed
       
    }//GEN-LAST:event_MenuStudentActionPerformed

    private void MenuStudentMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MenuStudentMenuSelected
                 this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Students studentManage = new Students();
                   this.Bureau.add(studentManage);
                   try {

                       studentManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   studentManage.show();
        
        
      
    }//GEN-LAST:event_MenuStudentMenuSelected

    private void MenuBookMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_MenuBookMenuSelected
                  this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Library libraryManage = new Library();
                   this.Bureau.add(libraryManage);
                   try {

                       libraryManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   libraryManage.show();
          
    }//GEN-LAST:event_MenuBookMenuSelected

    private void ReportMenuMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_ReportMenuMenuSelected
                  this.Bureau.removeAll();
                   this.Bureau.repaint();
                   Reports reportManage = new Reports();
                   this.Bureau.add(reportManage);
                   try {

                       reportManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   reportManage.show();
    }//GEN-LAST:event_ReportMenuMenuSelected

    private void IssueMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueMenuActionPerformed
                     this.Bureau.removeAll();
                   this.Bureau.repaint();
                   IssueBook issueManage = new IssueBook();
                   this.Bureau.add(issueManage);
                   try {

                       issueManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   issueManage.show();
    }//GEN-LAST:event_IssueMenuActionPerformed

    private void ReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMenuActionPerformed
                   this.Bureau.removeAll();
                   this.Bureau.repaint();
                   ReturnBook returnManage = new ReturnBook();
                   this.Bureau.add(returnManage);
                   try {

                       returnManage.setMaximum(true);

                   } catch (PropertyVetoException e) {
                       Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE,null,e);
                   }

                   returnManage.show();
    }//GEN-LAST:event_ReturnMenuActionPerformed

    private void BookMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookMenuActionPerformed
                
                New_Book book = new New_Book();
                book.setVisible(true);
    }//GEN-LAST:event_BookMenuActionPerformed

    private void StudentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentMenuActionPerformed
                  New_Student student = new New_Student();
                student.setVisible(true);
    }//GEN-LAST:event_StudentMenuActionPerformed

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        displayIssue();
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
      displayReturn();
    }//GEN-LAST:event_jLabel45MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BookMenu;
    private javax.swing.JLabel BookNber;
    private javax.swing.JButton BtnBiblio;
    private javax.swing.JButton BtnDashboard;
    private javax.swing.JButton BtnEtudiant;
    private javax.swing.JButton BtnIssue;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnStats;
    private javax.swing.JButton BtnUsers;
    private javax.swing.JDesktopPane Bureau;
    private javax.swing.JMenuItem CloseMenu;
    private javax.swing.JPanel Home;
    private javax.swing.JMenuItem HomeMenu;
    private javax.swing.JMenuItem IssueMenu;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuBook;
    private javax.swing.JMenu MenuStudent;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JMenu ReportMenu;
    private javax.swing.JMenuItem ReturnMenu;
    private javax.swing.JMenuItem StudentMenu;
    private javax.swing.JLabel StudentNber;
    private javax.swing.JLabel UserNber;
    private javax.swing.JLabel issueBook;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel returnBook;
    // End of variables declaration//GEN-END:variables
}

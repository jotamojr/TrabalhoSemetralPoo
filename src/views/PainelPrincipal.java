package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class PainelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PainelPrincipal
     */
    boolean a=true;
    PainelQuartos tq = new PainelQuartos();
    //PainelHospedes painelHospedes = new PainelHospedes();
    
    BasicInternalFrameUI bi = (BasicInternalFrameUI)tq.getUI();
    
    
    Font font;
    public PainelPrincipal() {
        this.font = new Font(Font.SERIF,Font.PLAIN,20);
        
        initComponents();
       //PainelQuartos.setLayout(new MigLayout("wrap 5"));
       bi.setNorthPane(null);
       
       Date date =new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
       lblData.setText(sdf.format(date));
       setExtendedState(MAXIMIZED_BOTH);
       jDesktopPane2.add(tq);
       tq.setVisible(true);
    }
    
    public void ChangeColor(JPanel painel,Color cor){
        painel.setBackground(cor);
    }
    
    public void clickmenu(JPanel h1,int numberbool){
        if(numberbool==1){
            h1.setBackground(new Color(245,239,239));
            
        }else{
            h1.setBackground(new Color(86,86,86));
            
        }
    }
    public void hideShowMenu(JPanel menuShowHide,boolean dashboard){
        if (dashboard==true){
            sideFirstPanel.setPreferredSize(new Dimension(350,sideFirstPanel.getHeight()));
            changeIcon(menu,"/Images/back_45px.png");
            //"/Images/back_45px.png"
           // "C:\Users\Zita_Office\Documents\NetBeansProjects\GUITutorial\src\ResponsiveDesign\Icons\icons8_back_40px.png"
            //HideMenu.setBackground(new Color(7,10,55));
        }else{
            sideFirstPanel.setPreferredSize(new Dimension(100,sideFirstPanel.getHeight()));
            changeIcon(menu,"/Images/menu_45px.png");
            
        }
    
    }
    public void changeIcon(JLabel button,String source){
        ImageIcon img = new ImageIcon(getClass().getResource(source));
        button.setIcon(img);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("1opcao.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        sideFirstPanel = new javax.swing.JPanel();
        sideSecPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        menuButton = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        lineHome = new javax.swing.JPanel();
        homeButton = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        lineReservas = new javax.swing.JPanel();
        resButton = new javax.swing.JPanel();
        reservas = new javax.swing.JLabel();
        lineHospedagem = new javax.swing.JPanel();
        hospButton = new javax.swing.JPanel();
        hospedagem = new javax.swing.JLabel();
        lineHospede = new javax.swing.JPanel();
        HospedeButton = new javax.swing.JPanel();
        clients = new javax.swing.JLabel();
        lineUsers = new javax.swing.JPanel();
        userButton = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        userButton1 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        header1 = new javax.swing.JPanel();
        iconClose = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        jClose = new javax.swing.JLabel();
        btnMax = new javax.swing.JPanel();
        jMax = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        mainPanel.setLayout(new java.awt.BorderLayout());

        jDesktopPane1.setLayout(new java.awt.BorderLayout());

        //jPanel1.setBackground(new Color(238,225,225,1));
        sideFirstPanel.setBackground(new java.awt.Color(194, 194, 194,1));
        sideFirstPanel.setPreferredSize(new java.awt.Dimension(100, 588));
        sideFirstPanel.setLayout(new java.awt.BorderLayout());

        sideSecPanel.setBackground(new java.awt.Color(153, 153, 148));
        sideSecPanel.setPreferredSize(new java.awt.Dimension(300, 588));
        sideSecPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(350, 5));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        menuButton.setBackground(new java.awt.Color(153, 153, 153));
        menuButton.setAlignmentY(5.0F);
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButtonMouseExited(evt);
            }
        });

        menu.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(86, 86, 86));
        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_menu_45px.png"))); // NOI18N
        menu.setText("          Menu");

        javax.swing.GroupLayout menuButtonLayout = new javax.swing.GroupLayout(menuButton);
        menuButton.setLayout(menuButtonLayout);
        menuButtonLayout.setHorizontalGroup(
            menuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuButtonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuButtonLayout.setVerticalGroup(
            menuButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuButtonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(menu)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sideSecPanel.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 320, 70));

        lineHome.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout lineHomeLayout = new javax.swing.GroupLayout(lineHome);
        lineHome.setLayout(lineHomeLayout);
        lineHomeLayout.setHorizontalGroup(
            lineHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        lineHomeLayout.setVerticalGroup(
            lineHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, -1, -1));

        homeButton.setBackground(new java.awt.Color(153, 153, 153));
        homeButton.setPreferredSize(new java.awt.Dimension(320, 70));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });

        home.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        home.setForeground(new java.awt.Color(82, 82, 82));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_45px_2.png"))); // NOI18N
        home.setText("          Users");

        javax.swing.GroupLayout homeButtonLayout = new javax.swing.GroupLayout(homeButton);
        homeButton.setLayout(homeButtonLayout);
        homeButtonLayout.setHorizontalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
        homeButtonLayout.setVerticalGroup(
            homeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(home)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        sideSecPanel.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 320, -1));

        lineReservas.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout lineReservasLayout = new javax.swing.GroupLayout(lineReservas);
        lineReservas.setLayout(lineReservasLayout);
        lineReservasLayout.setHorizontalGroup(
            lineReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        lineReservasLayout.setVerticalGroup(
            lineReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 5));

        resButton.setBackground(new java.awt.Color(153, 153, 153));
        resButton.setPreferredSize(new java.awt.Dimension(141, 45));
        resButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resButtonMouseExited(evt);
            }
        });

        reservas.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        reservas.setForeground(new java.awt.Color(82, 82, 82));
        reservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_booking_45px.png"))); // NOI18N
        reservas.setText("         Stock");

        javax.swing.GroupLayout resButtonLayout = new javax.swing.GroupLayout(resButton);
        resButton.setLayout(resButtonLayout);
        resButtonLayout.setHorizontalGroup(
            resButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(reservas)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        resButtonLayout.setVerticalGroup(
            resButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reservas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );

        sideSecPanel.add(resButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 320, 70));

        lineHospedagem.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout lineHospedagemLayout = new javax.swing.GroupLayout(lineHospedagem);
        lineHospedagem.setLayout(lineHospedagemLayout);
        lineHospedagemLayout.setHorizontalGroup(
            lineHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        lineHospedagemLayout.setVerticalGroup(
            lineHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineHospedagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, -1, -1));

        hospButton.setBackground(new java.awt.Color(153, 153, 153));
        hospButton.setPreferredSize(new java.awt.Dimension(320, 70));
        hospButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hospButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hospButtonMouseExited(evt);
            }
        });

        hospedagem.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        hospedagem.setForeground(new java.awt.Color(82, 82, 82));
        hospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_hotel_check_in_45px.png"))); // NOI18N
        hospedagem.setText("         Caixa");

        javax.swing.GroupLayout hospButtonLayout = new javax.swing.GroupLayout(hospButton);
        hospButton.setLayout(hospButtonLayout);
        hospButtonLayout.setHorizontalGroup(
            hospButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(hospedagem)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        hospButtonLayout.setVerticalGroup(
            hospButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hospButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hospedagem)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        sideSecPanel.add(hospButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 320, -1));

        lineHospede.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout lineHospedeLayout = new javax.swing.GroupLayout(lineHospede);
        lineHospede.setLayout(lineHospedeLayout);
        lineHospedeLayout.setHorizontalGroup(
            lineHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        lineHospedeLayout.setVerticalGroup(
            lineHospedeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        HospedeButton.setBackground(new java.awt.Color(153, 153, 153));
        HospedeButton.setPreferredSize(new java.awt.Dimension(320, 70));
        HospedeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HospedeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HospedeButtonMouseExited(evt);
            }
        });

        clients.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        clients.setForeground(new java.awt.Color(82, 82, 82));
        clients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clients.png"))); // NOI18N
        clients.setText("         Relatorios");

        javax.swing.GroupLayout HospedeButtonLayout = new javax.swing.GroupLayout(HospedeButton);
        HospedeButton.setLayout(HospedeButtonLayout);
        HospedeButtonLayout.setHorizontalGroup(
            HospedeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospedeButtonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(clients)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        HospedeButtonLayout.setVerticalGroup(
            HospedeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospedeButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clients)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        sideSecPanel.add(HospedeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, 320, -1));

        lineUsers.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout lineUsersLayout = new javax.swing.GroupLayout(lineUsers);
        lineUsers.setLayout(lineUsersLayout);
        lineUsersLayout.setHorizontalGroup(
            lineUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        lineUsersLayout.setVerticalGroup(
            lineUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        sideSecPanel.add(lineUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 375, -1, -1));

        userButton.setBackground(new java.awt.Color(153, 153, 153));
        userButton.setPreferredSize(new java.awt.Dimension(320, 70));
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userButtonMouseExited(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        lblData.setForeground(new java.awt.Color(82, 82, 82));
        lblData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar-date.png"))); // NOI18N
        lblData.setText("                     Data: ");

        javax.swing.GroupLayout userButtonLayout = new javax.swing.GroupLayout(userButton);
        userButton.setLayout(userButtonLayout);
        userButtonLayout.setHorizontalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButtonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        userButtonLayout.setVerticalGroup(
            userButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        sideSecPanel.add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 320, -1));

        userButton1.setBackground(new java.awt.Color(153, 153, 153));
        userButton1.setPreferredSize(new java.awt.Dimension(320, 70));
        userButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userButton1MouseExited(evt);
            }
        });

        user1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        user1.setForeground(new java.awt.Color(82, 82, 82));
        user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_45px_2.png"))); // NOI18N
        user1.setText("          About Us");

        javax.swing.GroupLayout userButton1Layout = new javax.swing.GroupLayout(userButton1);
        userButton1.setLayout(userButton1Layout);
        userButton1Layout.setHorizontalGroup(
            userButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButton1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        userButton1Layout.setVerticalGroup(
            userButton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userButton1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(user1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        sideSecPanel.add(userButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 320, -1));

        sideFirstPanel.add(sideSecPanel, java.awt.BorderLayout.CENTER);

        jDesktopPane1.add(sideFirstPanel, java.awt.BorderLayout.LINE_START);

        jDesktopPane2.setBackground(new Color(153,153,153,1));
        jDesktopPane2.setLayout(new java.awt.BorderLayout());
        jDesktopPane1.add(jDesktopPane2, java.awt.BorderLayout.CENTER);

        mainPanel.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        header1.setBackground(new java.awt.Color(153, 153, 153));
        header1.setPreferredSize(new java.awt.Dimension(803, 50));
        header1.setLayout(new java.awt.BorderLayout());

        iconClose.setBackground(new java.awt.Color(153, 153, 153));
        iconClose.setPreferredSize(new java.awt.Dimension(155, 37));
        iconClose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(102, 102, 102));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        jClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-sign (1).png"))); // NOI18N

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconClose.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 40));

        btnMax.setBackground(new java.awt.Color(102, 102, 102));
        btnMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaxMouseExited(evt);
            }
        });

        jMax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/full-screen (1)_1.png"))); // NOI18N

        javax.swing.GroupLayout btnMaxLayout = new javax.swing.GroupLayout(btnMax);
        btnMax.setLayout(btnMaxLayout);
        btnMaxLayout.setHorizontalGroup(
            btnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jMax, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnMaxLayout.setVerticalGroup(
            btnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaxLayout.createSequentialGroup()
                .addComponent(jMax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconClose.add(btnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 50, 40));

        header1.add(iconClose, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/geography.png"))); // NOI18N
        jLabel6.setText("CHAVES");

        jTextField1.setBackground(new java.awt.Color(153, 153, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-pesquisar-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(145, 145, 145)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        header1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(header1, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(811, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_homeButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineHome,new Color(86,86,86));
        
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineHome,new Color(214, 217, 223));
    }//GEN-LAST:event_homeButtonMouseExited

    private void resButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineReservas,new Color(86,86,86));
    }//GEN-LAST:event_resButtonMouseEntered

    private void resButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineReservas,new Color(214, 217, 223));
    }//GEN-LAST:event_resButtonMouseExited

    private void hospButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineHospedagem,new Color(86,86,86));
    }//GEN-LAST:event_hospButtonMouseEntered

    private void hospButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hospButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineHospedagem,new Color(214, 217, 223));
    }//GEN-LAST:event_hospButtonMouseExited

    private void HospedeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospedeButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineHospede,new Color(86,86,86));
    }//GEN-LAST:event_HospedeButtonMouseEntered

    private void HospedeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HospedeButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineHospede,new Color(214, 217, 223));
    }//GEN-LAST:event_HospedeButtonMouseExited

    private void userButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseEntered
        // TODO add your handling code here:
        ChangeColor(lineUsers,new Color(86,86,86));
    }//GEN-LAST:event_userButtonMouseEntered

    private void userButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseExited
        // TODO add your handling code here:
        ChangeColor(lineUsers,new Color(214, 217, 223));
    }//GEN-LAST:event_userButtonMouseExited

    private void menuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseEntered
        // TODO add your handling code here:
        menuButton.setBackground(new Color(86,86,86));
        menu.setForeground(new Color(214, 217, 223));
      //  menu.setIcon(new Icon());
    }//GEN-LAST:event_menuButtonMouseEntered

    private void menuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseExited
        // TODO add your handling code here:
        menuButton.setBackground(new Color(214, 217, 223));
        menu.setForeground(new Color(86,86,86));
    }//GEN-LAST:event_menuButtonMouseExited

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        
        if(a==true){
            hideShowMenu(sideFirstPanel,a);
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }else{
            hideShowMenu(sideFirstPanel,a);
            SwingUtilities.updateComponentTreeUI(this);
           // HideMenu.setBackground(new Color(7,10,55));
            a=true;
        }
       
    }//GEN-LAST:event_menuButtonMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:
        btnClose.setBackground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
        btnClose.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseClicked
        if(this.getExtendedState() != PainelPrincipal.MAXIMIZED_BOTH){
            this.setExtendedState(PainelPrincipal.MAXIMIZED_BOTH);
        } else{
            this.setExtendedState(PainelPrincipal.NORMAL);
        }
    }//GEN-LAST:event_btnMaxMouseClicked

    private void btnMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseEntered
        // TODO add your handling code here:
        btnMax.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnMaxMouseEntered

    private void btnMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseExited
        // TODO add your handling code here:
        btnMax.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_btnMaxMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat f = DateFormat.getDateInstance(DateFormat.LONG);
        lblData.setText(f.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void userButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userButton1MouseEntered

    private void userButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_userButton1MouseExited

    
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
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HospedeButton;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnMax;
    private javax.swing.JLabel clients;
    private javax.swing.JPanel header1;
    private javax.swing.JLabel home;
    private javax.swing.JPanel homeButton;
    private javax.swing.JPanel hospButton;
    private javax.swing.JLabel hospedagem;
    private javax.swing.JPanel iconClose;
    private javax.swing.JLabel jClose;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jMax;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblData;
    private javax.swing.JPanel lineHome;
    private javax.swing.JPanel lineHospedagem;
    private javax.swing.JPanel lineHospede;
    private javax.swing.JPanel lineReservas;
    private javax.swing.JPanel lineUsers;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menu;
    private javax.swing.JPanel menuButton;
    private javax.swing.JPanel resButton;
    private javax.swing.JLabel reservas;
    private javax.swing.JPanel sideFirstPanel;
    private javax.swing.JPanel sideSecPanel;
    private javax.swing.JLabel user1;
    private javax.swing.JPanel userButton;
    private javax.swing.JPanel userButton1;
    // End of variables declaration//GEN-END:variables
}

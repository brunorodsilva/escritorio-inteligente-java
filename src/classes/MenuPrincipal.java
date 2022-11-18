package classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


//@author Bruno

public class MenuPrincipal extends javax.swing.JFrame {
    
    //Instância dos Objetos da Classe Mãe Escritório.
    private Escritorio LuzObj;
    private Escritorio PortaObj;
    private Escritorio ComputadoresObj;
    private Escritorio ArObj;

    /*Contador, para que, quando chegar no número máximo de intens ativos no painel for igual a:
    13, fazer com que desligue tudo ou ligue tudo dependendo da condição.
    */
    int contador = 0;


    
    public MenuPrincipal() {
        initComponents();
        
        //Crição dos Objetos
        LuzObj = new Luz();
        PortaObj = new Porta();
        ComputadoresObj = new Computadores();
        ArObj = new ArCondicionado();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnPc01 = new javax.swing.JToggleButton();
        lblPc1 = new javax.swing.JLabel();
        lblPc2 = new javax.swing.JLabel();
        btnPc02 = new javax.swing.JToggleButton();
        lblPc3 = new javax.swing.JLabel();
        btnPc03 = new javax.swing.JToggleButton();
        lblPc4 = new javax.swing.JLabel();
        lblPc5 = new javax.swing.JLabel();
        lblPc6 = new javax.swing.JLabel();
        btnPc06 = new javax.swing.JToggleButton();
        btnPc05 = new javax.swing.JToggleButton();
        btnPc04 = new javax.swing.JToggleButton();
        lblPc7 = new javax.swing.JLabel();
        lblPc8 = new javax.swing.JLabel();
        lblPc9 = new javax.swing.JLabel();
        btnPc09 = new javax.swing.JToggleButton();
        btnPc08 = new javax.swing.JToggleButton();
        btnPc07 = new javax.swing.JToggleButton();
        lblPc010 = new javax.swing.JLabel();
        btnPc10 = new javax.swing.JToggleButton();
        BtAr = new javax.swing.JToggleButton();
        lblAr2 = new javax.swing.JLabel();
        BtLuz = new javax.swing.JToggleButton();
        lblLuz = new javax.swing.JLabel();
        BtPorta = new javax.swing.JToggleButton();
        lblPorta2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLigarTudo = new javax.swing.JButton();
        jPEscritorio = new javax.swing.JPanel();
        lblLuz2 = new javax.swing.JLabel();
        lblLuz1 = new javax.swing.JLabel();
        lblLuz3 = new javax.swing.JLabel();
        lblLuz4 = new javax.swing.JLabel();
        lblAr = new javax.swing.JLabel();
        lblPc01 = new javax.swing.JLabel();
        lblPc03 = new javax.swing.JLabel();
        lblPc04 = new javax.swing.JLabel();
        lblPc02 = new javax.swing.JLabel();
        lblPc05 = new javax.swing.JLabel();
        lblPc06 = new javax.swing.JLabel();
        lblPc07 = new javax.swing.JLabel();
        lblPc08 = new javax.swing.JLabel();
        lblPc10 = new javax.swing.JLabel();
        lblPorta = new javax.swing.JLabel();
        lblPc09 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartOficce");
        setMinimumSize(new java.awt.Dimension(1024, 728));
        setSize(new java.awt.Dimension(1024, 728));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("SmartOficce");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Individual");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 2, -1, -1));

        btnPc01.setBackground(new java.awt.Color(102, 102, 102));
        btnPc01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc01ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc01, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, 90, 42));

        lblPc1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc1.setText("DESKTOP - 1");
        jPanel1.add(lblPc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 41, -1, -1));

        lblPc2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc2.setText("DESKTOP - 2");
        jPanel1.add(lblPc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 41, -1, -1));

        btnPc02.setBackground(new java.awt.Color(102, 102, 102));
        btnPc02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc02ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc02, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 64, 90, 42));

        lblPc3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc3.setText("DESKTOP - 3");
        jPanel1.add(lblPc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 41, -1, -1));

        btnPc03.setBackground(new java.awt.Color(102, 102, 102));
        btnPc03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc03ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc03, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 64, 90, 42));

        lblPc4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc4.setText("DESKTOP - 4");
        jPanel1.add(lblPc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, -1, -1));

        lblPc5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc5.setText("DESKTOP - 5");
        jPanel1.add(lblPc5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 124, -1, -1));

        lblPc6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc6.setText("DESKTOP - 6");
        jPanel1.add(lblPc6, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 124, -1, -1));

        btnPc06.setBackground(new java.awt.Color(102, 102, 102));
        btnPc06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc06ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc06, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 147, 90, 42));

        btnPc05.setBackground(new java.awt.Color(102, 102, 102));
        btnPc05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc05ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc05, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 147, 90, 42));

        btnPc04.setBackground(new java.awt.Color(102, 102, 102));
        btnPc04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc04ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc04, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 147, 90, 42));

        lblPc7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc7.setText("DESKTOP - 7");
        jPanel1.add(lblPc7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 207, -1, -1));

        lblPc8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc8.setText("DESKTOP - 8");
        jPanel1.add(lblPc8, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 207, -1, -1));

        lblPc9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc9.setText("DESKTOP - 9");
        jPanel1.add(lblPc9, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 207, -1, -1));

        btnPc09.setBackground(new java.awt.Color(102, 102, 102));
        btnPc09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc09ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc09, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 230, 90, 42));

        btnPc08.setBackground(new java.awt.Color(102, 102, 102));
        btnPc08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc08ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc08, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 230, 90, 42));

        btnPc07.setBackground(new java.awt.Color(102, 102, 102));
        btnPc07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc07ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc07, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 230, 90, 42));

        lblPc010.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPc010.setText("DESKTOP - 10");
        jPanel1.add(lblPc010, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 290, 95, -1));

        btnPc10.setBackground(new java.awt.Color(102, 102, 102));
        btnPc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Computador.png"))); // NOI18N
        btnPc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPc10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPc10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 313, 99, 42));

        BtAr.setBackground(new java.awt.Color(102, 102, 102));
        BtAr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ar.png"))); // NOI18N
        BtAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtArActionPerformed(evt);
            }
        });
        jPanel1.add(BtAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 313, 86, 42));

        lblAr2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblAr2.setText("LIGAR AR");
        jPanel1.add(lblAr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 290, -1, -1));

        BtLuz.setBackground(new java.awt.Color(102, 102, 102));
        BtLuz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/luz.png"))); // NOI18N
        BtLuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLuzActionPerformed(evt);
            }
        });
        jPanel1.add(BtLuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 313, 90, 42));

        lblLuz.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblLuz.setText("LIGAR LUZ");
        jPanel1.add(lblLuz, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 290, -1, -1));

        BtPorta.setBackground(new java.awt.Color(102, 102, 102));
        BtPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PortaIcon.png"))); // NOI18N
        BtPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPortaActionPerformed(evt);
            }
        });
        jPanel1.add(BtPorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 396, 60, -1));

        lblPorta2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPorta2.setText("ABRIR PORTA");
        jPanel1.add(lblPorta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 373, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 481, 331, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 33, 331, -1));

        btnLigarTudo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLigarTudo.setText("LIGAR TUDO");
        btnLigarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarTudoActionPerformed(evt);
            }
        });
        jPanel1.add(btnLigarTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 300, 40));

        jPEscritorio.setBackground(new java.awt.Color(102, 102, 102));
        jPEscritorio.setMaximumSize(null);
        jPEscritorio.setPreferredSize(new java.awt.Dimension(1024, 728));
        jPEscritorio.setLayout(null);

        lblLuz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png"))); // NOI18N
        jPEscritorio.add(lblLuz2);
        lblLuz2.setBounds(167, 0, 60, 60);

        lblLuz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png"))); // NOI18N
        jPEscritorio.add(lblLuz1);
        lblLuz1.setBounds(10, 0, 60, 60);

        lblLuz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png"))); // NOI18N
        jPEscritorio.add(lblLuz3);
        lblLuz3.setBounds(324, 0, 60, 60);

        lblLuz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png"))); // NOI18N
        jPEscritorio.add(lblLuz4);
        lblLuz4.setBounds(481, 0, 61, 60);

        lblAr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ar_Condicionado_Desligado.png"))); // NOI18N
        jPEscritorio.add(lblAr);
        lblAr.setBounds(690, 0, 180, 90);

        lblPc01.setBackground(new java.awt.Color(255, 255, 204));
        lblPc01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc01.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc01.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc01.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc01);
        lblPc01.setBounds(10, 126, 155, 128);

        lblPc03.setBackground(new java.awt.Color(255, 255, 204));
        lblPc03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc03.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc03.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc03.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc03);
        lblPc03.setBounds(481, 126, 155, 128);

        lblPc04.setBackground(new java.awt.Color(255, 255, 204));
        lblPc04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc04.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc04.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc04.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc04);
        lblPc04.setBounds(715, 126, 155, 128);

        lblPc02.setBackground(new java.awt.Color(255, 255, 204));
        lblPc02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc02.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc02.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc02.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc02);
        lblPc02.setBounds(244, 126, 155, 128);

        lblPc05.setBackground(new java.awt.Color(255, 255, 204));
        lblPc05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc05.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc05.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc05.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc05);
        lblPc05.setBounds(10, 316, 155, 128);

        lblPc06.setBackground(new java.awt.Color(255, 255, 204));
        lblPc06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc06.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc06.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc06.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc06);
        lblPc06.setBounds(244, 316, 155, 128);

        lblPc07.setBackground(new java.awt.Color(255, 255, 204));
        lblPc07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc07.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc07.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc07.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc07);
        lblPc07.setBounds(481, 316, 155, 128);

        lblPc08.setBackground(new java.awt.Color(255, 255, 204));
        lblPc08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc08.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc08.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc08.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc08);
        lblPc08.setBounds(715, 316, 155, 128);

        lblPc10.setBackground(new java.awt.Color(255, 255, 204));
        lblPc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc10.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc10.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc10.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc10);
        lblPc10.setBounds(599, 525, 155, 128);

        lblPorta.setBackground(new java.awt.Color(255, 255, 204));
        lblPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PortaFechada.png"))); // NOI18N
        lblPorta.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPorta.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPorta.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPorta);
        lblPorta.setBounds(391, 450, 103, 218);

        lblPc09.setBackground(new java.awt.Color(255, 255, 204));
        lblPc09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png"))); // NOI18N
        lblPc09.setMaximumSize(new java.awt.Dimension(155, 128));
        lblPc09.setMinimumSize(new java.awt.Dimension(155, 128));
        lblPc09.setPreferredSize(new java.awt.Dimension(155, 128));
        jPEscritorio.add(lblPc09);
        lblPc09.setBounds(119, 525, 155, 128);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1253, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtLuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLuzActionPerformed

        if (LuzObj != null) {
            if (((Luz) LuzObj).isLuz()) {
                ((Luz) LuzObj).setLuz(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Luz) LuzObj).setLuz(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Luz) LuzObj).isLuz()) {
            LuzObj.ligar();
        } else {
            LuzObj.desligar();
        }
    }//GEN-LAST:event_BtLuzActionPerformed

    private void btnPc01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc01ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc01()) {
                ((Computadores) ComputadoresObj).setPc01(false);
                
                if(this.contador != 0) this.contador--;
                
            } else {
                ((Computadores) ComputadoresObj).setPc01(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc01()) {
            ComputadoresObj.ligar("pc1");
        } else {
            ComputadoresObj.desligar("pc1");
        }
    }//GEN-LAST:event_btnPc01ActionPerformed

    private void btnLigarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigarTudoActionPerformed
        
        if(btnLigarTudo.getText().equals("LIGAR TUDO")){
            ((Luz) LuzObj).setLuz(true);
            ((ArCondicionado) ArObj).setAr(true);
            ((Porta) PortaObj).setPorta(true);
            
            ((Computadores) ComputadoresObj).setPc01(true);
            ((Computadores) ComputadoresObj).setPc02(true);
            ((Computadores) ComputadoresObj).setPc03(true);
            ((Computadores) ComputadoresObj).setPc04(true);
            ((Computadores) ComputadoresObj).setPc05(true);
            ((Computadores) ComputadoresObj).setPc06(true);
            ((Computadores) ComputadoresObj).setPc07(true);
            ((Computadores) ComputadoresObj).setPc08(true);
            ((Computadores) ComputadoresObj).setPc09(true);
            ((Computadores) ComputadoresObj).setPc10(true);
            
            this.contador = 13;
            
        }else{
            ((Luz) LuzObj).setLuz(false);
            ((ArCondicionado) ArObj).setAr(false);
            ((Porta) PortaObj).setPorta(false);
            
            ((Computadores) ComputadoresObj).setPc01(false);
            ((Computadores) ComputadoresObj).setPc02(false);
            ((Computadores) ComputadoresObj).setPc03(false);
            ((Computadores) ComputadoresObj).setPc04(false);
            ((Computadores) ComputadoresObj).setPc05(false);
            ((Computadores) ComputadoresObj).setPc06(false);
            ((Computadores) ComputadoresObj).setPc07(false);
            ((Computadores) ComputadoresObj).setPc08(false);
            ((Computadores) ComputadoresObj).setPc09(false);
            ((Computadores) ComputadoresObj).setPc10(false);
            
            this.contador = 0;

        }
        
        this.verifica();
    }//GEN-LAST:event_btnLigarTudoActionPerformed

    private void BtArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtArActionPerformed
        if (ArObj != null) {
            if (((ArCondicionado) ArObj).isAr()) {
                ((ArCondicionado) ArObj).setAr(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((ArCondicionado) ArObj).setAr(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((ArCondicionado) ArObj).isAr()) {
            ArObj.ligar();
        } else {
            ArObj.desligar();
        }
    }//GEN-LAST:event_BtArActionPerformed

    private void BtPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPortaActionPerformed
        // TODO add your handling code here:
        if (PortaObj != null) {
            if (((Porta) PortaObj).isPorta()) {
                ((Porta) PortaObj).setPorta(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Porta) PortaObj).setPorta(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Porta) PortaObj).isPorta()) {
            PortaObj.abrir();
        } else {
            PortaObj.fechar();
        }
    }//GEN-LAST:event_BtPortaActionPerformed

    private void btnPc02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc02ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc02()) {
                ((Computadores) ComputadoresObj).setPc02(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc02(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc02()) {
            ComputadoresObj.ligar("pc2");
        } else {
            ComputadoresObj.desligar("pc2");
        }
    }//GEN-LAST:event_btnPc02ActionPerformed

    private void btnPc03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc03ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc03()) {
                ((Computadores) ComputadoresObj).setPc03(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc03(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc03()) {
            ComputadoresObj.ligar("pc3");
        } else {
            ComputadoresObj.desligar("pc3");
        }
    }//GEN-LAST:event_btnPc03ActionPerformed

    private void btnPc04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc04ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc04()) {
                ((Computadores) ComputadoresObj).setPc04(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc04(true);
                contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc04()) {
            ComputadoresObj.ligar("pc4");
        } else {
            ComputadoresObj.desligar("pc4");
        }
    }//GEN-LAST:event_btnPc04ActionPerformed

    private void btnPc05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc05ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc05()) {
                ((Computadores) ComputadoresObj).setPc05(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc05(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc05()) {
            ComputadoresObj.ligar("pc5");
        } else {
            ComputadoresObj.desligar("pc5");
        }
    }//GEN-LAST:event_btnPc05ActionPerformed

    private void btnPc06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc06ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc06()) {
                ((Computadores) ComputadoresObj).setPc06(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc06(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc06()) {
            ComputadoresObj.ligar("pc6");
        } else {
            ComputadoresObj.desligar("pc6");
        }
    }//GEN-LAST:event_btnPc06ActionPerformed

    private void btnPc07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc07ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc07()) {
                ((Computadores) ComputadoresObj).setPc07(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc07(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc07()) {
            ComputadoresObj.ligar("pc7");
        } else {
            ComputadoresObj.desligar("pc7");
        }
    }//GEN-LAST:event_btnPc07ActionPerformed

    private void btnPc08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc08ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc08()) {
                ((Computadores) ComputadoresObj).setPc08(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc08(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc08()) {
            ComputadoresObj.ligar("pc8");
        } else {
            ComputadoresObj.desligar("pc8");
        }
    }//GEN-LAST:event_btnPc08ActionPerformed

    private void btnPc09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc09ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc09()) {
                ((Computadores) ComputadoresObj).setPc09(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc09(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc09()) {
            ComputadoresObj.ligar("pc9");
        } else {
            ComputadoresObj.desligar("pc9");
        }
    }//GEN-LAST:event_btnPc09ActionPerformed

    private void btnPc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPc10ActionPerformed
        if (ComputadoresObj != null) {
            if (((Computadores) ComputadoresObj).isPc10()) {
                ((Computadores) ComputadoresObj).setPc10(false);
                if(this.contador != 0) this.contador--;
            } else {
                ((Computadores) ComputadoresObj).setPc10(true);
                this.contador++;
            }
            this.verifica();
        }

        if (((Computadores) ComputadoresObj).isPc10()) {
            ComputadoresObj.ligar("pc10");
        } else {
            ComputadoresObj.desligar("pc10");
        }
    }//GEN-LAST:event_btnPc10ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public void verifica() {
        if (((Luz) LuzObj).isLuz()) {
            // Muda a imagem das labels
            lblLuz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Acesa.png")));
            lblLuz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Acesa.png")));
            lblLuz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Acesa.png")));
            lblLuz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Acesa.png")));

            // Muda a cor da parede para um amarelo claro
            jPEscritorio.setBackground(new java.awt.Color(255, 255, 204));
            BtLuz.setBackground(new java.awt.Color(255, 255, 204));
            lblLuz.setText("DES. LUZ");

        } else {
            lblLuz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png")));
            lblLuz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png")));
            lblLuz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png")));
            lblLuz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Luz_Apagada.png")));

            jPEscritorio.setBackground(new java.awt.Color(102, 102, 102));
            BtLuz.setBackground(new java.awt.Color(102, 102, 102));
            lblLuz.setText("LIGAR LUZ");
        }

        if (((ArCondicionado) ArObj).isAr()) {
            lblAr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ar_Condicionado_Ligado.png")));
            BtAr.setBackground(new java.awt.Color(255, 255, 204));
            lblAr2.setText("DESLIGAR AR");
        } else {
            lblAr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ar_Condicionado_Desligado.png")));
            BtAr.setBackground(new java.awt.Color(102, 102, 102));
            lblAr2.setText("LIGAR AR");
        }

        if (((Porta) PortaObj).isPorta()) {
            lblPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PortaAberta.png")));
            BtPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PortaIconAberta.png")));
            BtPorta.setBackground(new java.awt.Color(255, 255, 204));
            lblPorta2.setText("FECHAR PORTA");

        } else {
            lblPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PortaFechada.png")));
            BtPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/PortaIcon.png")));
            BtPorta.setBackground(new java.awt.Color(102, 102, 102));
            lblPorta2.setText("ABRIR PORTA");
        }

        if (((Computadores) ComputadoresObj).isPc01()) {
            lblPc01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_01.gif")));
            btnPc01.setBackground(new java.awt.Color(255, 255, 204));
            lblPc1.setText("PC-01 LIGADO");
        } else {
            lblPc01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc01.setBackground(new java.awt.Color(102, 102, 102));
            lblPc1.setText("PC-01 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc02()) {
            lblPc02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_02.gif")));
            btnPc02.setBackground(new java.awt.Color(255, 255, 204));
            lblPc2.setText("PC-02 LIGADO");
        }else{
            lblPc02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc02.setBackground(new java.awt.Color(102, 102, 102));
            lblPc2.setText("PC-02 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc03()) {
            lblPc03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_03.gif")));
            btnPc03.setBackground(new java.awt.Color(255, 255, 204));
            lblPc3.setText("PC-03 LIGADO");
        }else{
            lblPc03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc03.setBackground(new java.awt.Color(102, 102, 102));
            lblPc3.setText("PC-03 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc04()) {
            lblPc04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_04.gif")));
            btnPc04.setBackground(new java.awt.Color(255, 255, 204));
            lblPc4.setText("PC-04 LIGADO");
        }else{
            lblPc04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc04.setBackground(new java.awt.Color(102, 102, 102));
            lblPc4.setText("PC-04 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc05()) {
            lblPc05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_05.gif")));
            btnPc05.setBackground(new java.awt.Color(255, 255, 204));
            lblPc5.setText("PC-05 LIGADO");
        }else{
            lblPc05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc05.setBackground(new java.awt.Color(102, 102, 102));
            lblPc5.setText("PC-05 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc06()) {
            lblPc06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_06.gif")));
            btnPc06.setBackground(new java.awt.Color(255, 255, 204));
            lblPc6.setText("PC-06 LIGADO");
        }else{
            lblPc06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc06.setBackground(new java.awt.Color(102, 102, 102));
            lblPc6.setText("PC-06 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc07()) {
            lblPc07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_07.gif")));
            btnPc07.setBackground(new java.awt.Color(255, 255, 204));
            lblPc7.setText("PC-07 LIGADO");
        }else{
            lblPc07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc07.setBackground(new java.awt.Color(102, 102, 102));
            lblPc7.setText("PC-07 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc08()) {
            lblPc08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_08.gif")));
            btnPc08.setBackground(new java.awt.Color(255, 255, 204));
            lblPc8.setText("PC-08 LIGADO");
        }else{
            lblPc08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc08.setBackground(new java.awt.Color(102, 102, 102));
            lblPc8.setText("PC-08 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc09()) {
            lblPc09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_10.gif")));
            btnPc09.setBackground(new java.awt.Color(255, 255, 204));
            lblPc9.setText("PC-09 LIGADO");
        }else{
            lblPc09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc09.setBackground(new java.awt.Color(102, 102, 102));
            lblPc9.setText("PC-09 DESLIGADO");
        }
        
        if (((Computadores) ComputadoresObj).isPc10()) {
            lblPc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pc_01.gif")));
            btnPc10.setBackground(new java.awt.Color(255, 255, 204));
            lblPc010.setText("PC-10 LIGADO");
        }else{
            lblPc10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DESKTOP.png")));
            btnPc10.setBackground(new java.awt.Color(102, 102, 102));
            lblPc010.setText("PC-10 DESLIGADO");
        }
        
        //Condição do contador para mudar o texto do Botão LIGAR TUDO/DESLIGAR TUDO.
        if(this.contador == 13){
            btnLigarTudo.setText("DESLIGAR TUDO");
        }else{
            btnLigarTudo.setText("LIGAR TUDO");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtAr;
    private javax.swing.JToggleButton BtLuz;
    private javax.swing.JToggleButton BtPorta;
    private javax.swing.JButton btnLigarTudo;
    private javax.swing.JToggleButton btnPc01;
    private javax.swing.JToggleButton btnPc02;
    private javax.swing.JToggleButton btnPc03;
    private javax.swing.JToggleButton btnPc04;
    private javax.swing.JToggleButton btnPc05;
    private javax.swing.JToggleButton btnPc06;
    private javax.swing.JToggleButton btnPc07;
    private javax.swing.JToggleButton btnPc08;
    private javax.swing.JToggleButton btnPc09;
    private javax.swing.JToggleButton btnPc10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPEscritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAr;
    private javax.swing.JLabel lblAr2;
    private javax.swing.JLabel lblLuz;
    private javax.swing.JLabel lblLuz1;
    private javax.swing.JLabel lblLuz2;
    private javax.swing.JLabel lblLuz3;
    private javax.swing.JLabel lblLuz4;
    private javax.swing.JLabel lblPc01;
    private javax.swing.JLabel lblPc010;
    private javax.swing.JLabel lblPc02;
    private javax.swing.JLabel lblPc03;
    private javax.swing.JLabel lblPc04;
    private javax.swing.JLabel lblPc05;
    private javax.swing.JLabel lblPc06;
    private javax.swing.JLabel lblPc07;
    private javax.swing.JLabel lblPc08;
    private javax.swing.JLabel lblPc09;
    private javax.swing.JLabel lblPc1;
    private javax.swing.JLabel lblPc10;
    private javax.swing.JLabel lblPc2;
    private javax.swing.JLabel lblPc3;
    private javax.swing.JLabel lblPc4;
    private javax.swing.JLabel lblPc5;
    private javax.swing.JLabel lblPc6;
    private javax.swing.JLabel lblPc7;
    private javax.swing.JLabel lblPc8;
    private javax.swing.JLabel lblPc9;
    private javax.swing.JLabel lblPorta;
    private javax.swing.JLabel lblPorta2;
    // End of variables declaration//GEN-END:variables
}

package mvp;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIDesignFrame extends javax.swing.JFrame{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean running = false;
    private ArrayList<Productor> productores;
    private ArrayList<Consumidor> consumidores;

    public GUIDesignFrame() {
        initComponents();
        jScrollPane1.getViewport().setBackground(new Color(250,250,255));
        jScrollPane2.getViewport().setBackground(new Color(250,250,255));
        setColor(btn_menu_1); 
        ind_1.setOpaque(true);
        removeRunningValues();
        productores = new ArrayList<>();
        consumidores = new ArrayList<>();
        this.productores = new ArrayList<>();
        this.consumidores = new ArrayList<>();
        setPreferredSize(new Dimension(1020, 500));
        setMaximumSize(new Dimension(1020, 500));
        setSize(new Dimension(1020, 500));
    }


    private void initComponents() {
        btn_menu_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_menu_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(false);

        btn_menu_1.setBackground(new java.awt.Color(23, 35, 51));
        btn_menu_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Configuracion");

        javax.swing.GroupLayout btn_menu_1Layout = new javax.swing.GroupLayout(btn_menu_1);
        btn_menu_1.setLayout(btn_menu_1Layout);
        btn_menu_1Layout.setHorizontalGroup(
            btn_menu_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_menu_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        btn_menu_1Layout.setVerticalGroup(
            btn_menu_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_menu_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_menu_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );


        btn_menu_4.setBackground(new java.awt.Color(23, 35, 51));
        btn_menu_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); 
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Procesos");

        javax.swing.GroupLayout btn_menu_4Layout = new javax.swing.GroupLayout(btn_menu_4);
        btn_menu_4.setLayout(btn_menu_4Layout);
        btn_menu_4Layout.setHorizontalGroup(
            btn_menu_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_menu_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_menu_4Layout.setVerticalGroup(
            btn_menu_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_menu_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_menu_4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cardServerConfig = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valoresFinal = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        productorCantidad = new javax.swing.JSpinner();
        consumidorCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bufferCantidad = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        productorEspera = new javax.swing.JSpinner();
        consumidorEspera = new javax.swing.JSpinner();
        valoresInicial = new javax.swing.JSpinner();
        
                cardServerConfig.setBackground(new java.awt.Color(255, 255, 255));
                
                        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                        jLabel5.setText("Tiempo de Espera (ms)");
                        
                                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); 
                                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                jLabel6.setText("Rango de Valores (n, m)");
                                
                                        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
                                        jLabel1.setText("Productores");
                                        
                                                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
                                                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                                jLabel2.setText("Consumidores");
                                                
                                                        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
                                                        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                                        jLabel3.setText("Tamaño del Buffer");
                                                        
                                                                jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                                                                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                                                                jLabel4.setText("Cantidad");
                                                                
                                                                        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                                                                        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                                                                        jLabel11.setText("Cantidad");
                                                                        
                                                                                jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                                                                                jLabel14.setText("Tiempo de Espera (ms)");
                                                                                
                                                                                        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                                                                                        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                                                                                        jLabel15.setText("Cantidad");
                                                                                        
                                                                                                jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                                                                                                jLabel16.setText("Final");
                                                                                                
                                                                                                        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
                                                                                                        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                                                                                                        jLabel17.setText("Inicial");
                                                                                                        
                                                                                                        btnButton = new JButton("Iniciar");
                                                                                                        btnButton.addActionListener(new ActionListener() {
                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                        		btnButtonActionPerformed(e);
                                                                                                        	}
                                                                                                        });
                                                                                                        
                                                                                                                javax.swing.GroupLayout cardServerConfigLayout = new javax.swing.GroupLayout(cardServerConfig);
                                                                                                                cardServerConfigLayout.setHorizontalGroup(
                                                                                                                	cardServerConfigLayout.createParallelGroup(Alignment.TRAILING)
                                                                                                                		.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                			.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                				.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                					.addGap(36)
                                                                                                                					.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                                                                                						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                                                                                                						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                                                                                                                						.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                							.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.TRAILING)
                                                                                                                								.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                									.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                										.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                											.addGap(26)
                                                                                                                											.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                                                                                                											.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                											.addComponent(consumidorCantidad, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                                                                                                                										.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                											.addGap(28)
                                                                                                                											.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                                                                                                											.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                											.addComponent(productorCantidad, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                                                                                                									.addGap(31)
                                                                                                                									.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.TRAILING)
                                                                                                                										.addComponent(jLabel5)
                                                                                                                										.addComponent(jLabel14)))
                                                                                                                								.addComponent(jLabel16))
                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                							.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.TRAILING, false)
                                                                                                                								.addComponent(consumidorEspera, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                                                                                                								.addComponent(productorEspera)
                                                                                                                								.addComponent(valoresFinal, Alignment.LEADING)))
                                                                                                                						.addComponent(jLabel6)))
                                                                                                                				.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                					.addGap(62)
                                                                                                                					.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.TRAILING)
                                                                                                                						.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                							.addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                							.addComponent(valoresInicial, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
                                                                                                                						.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                							.addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                                                                                                							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                							.addComponent(bufferCantidad, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))))
                                                                                                                				.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                					.addGap(187)
                                                                                                                					.addComponent(btnButton)))
                                                                                                                			.addContainerGap(41, Short.MAX_VALUE))
                                                                                                                );
                                                                                                                cardServerConfigLayout.setVerticalGroup(
                                                                                                                	cardServerConfigLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                		.addGroup(cardServerConfigLayout.createSequentialGroup()
                                                                                                                			.addGap(33)
                                                                                                                			.addComponent(jLabel1)
                                                                                                                			.addGap(18)
                                                                                                                			.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                				.addComponent(productorCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                				.addComponent(jLabel4)
                                                                                                                				.addComponent(jLabel5)
                                                                                                                				.addComponent(productorEspera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                			.addGap(18)
                                                                                                                			.addComponent(jLabel2)
                                                                                                                			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                			.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                				.addComponent(jLabel11)
                                                                                                                				.addComponent(consumidorCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                				.addComponent(jLabel14)
                                                                                                                				.addComponent(consumidorEspera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                			.addGap(24)
                                                                                                                			.addComponent(jLabel3)
                                                                                                                			.addGap(18)
                                                                                                                			.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                				.addComponent(jLabel15)
                                                                                                                				.addComponent(bufferCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                			.addGap(31)
                                                                                                                			.addComponent(jLabel6)
                                                                                                                			.addGap(15)
                                                                                                                			.addGroup(cardServerConfigLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                				.addComponent(jLabel17)
                                                                                                                				.addComponent(jLabel16)
                                                                                                                				.addComponent(valoresFinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                                				.addComponent(valoresInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                                                			.addGap(41)
                                                                                                                			.addComponent(btnButton)
                                                                                                                			.addContainerGap(208, Short.MAX_VALUE))
                                                                                                                );
                                                                                                                cardServerConfig.setLayout(cardServerConfigLayout);
        cardServerProcess = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        labelTareasCompletadas = new javax.swing.JLabel();
        labelTareasPendientes = new javax.swing.JLabel();
        
                cardServerProcess.setBackground(new java.awt.Color(255, 255, 255));
                
                        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
                        
                                jTable1.setAutoCreateRowSorter(true);
                                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                    new Object [][]{},
                                    new String [] {
                                        "Product"
                                    }
                                ));
                                jTable1.setSelectionBackground(new java.awt.Color(229, 225, 238));
                                jScrollPane1.setViewportView(jTable1);
                                
                                        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
                                        
                                                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                                                    new Object [][]{},
                                                    new String [] {
                                                        "Product", "Result"
                                                    }
                                                ));
                                                jTable2.setSelectionBackground(new java.awt.Color(229, 225, 238));
                                                jScrollPane2.setViewportView(jTable2);
                                                
                                                        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); 
                                                        jLabel7.setText("Tareas por hacer");
                                                        
                                                                jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); 
                                                                jLabel9.setText("Tareas realizadas");
                                                                
                                                                        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); 
                                                                        jLabel26.setText("Cantidad Total: ");
                                                                                
                                                                                        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); 
                                                                                        jLabel28.setText("Tareas completadas:");
                                                                                        
                                                                                                labelTareasCompletadas.setText("0");
                                                                                                
                                                                                                        labelTareasPendientes.setText("0");
                                                                                                                
                                                                                                                        javax.swing.GroupLayout cardServerProcessLayout = new javax.swing.GroupLayout(cardServerProcess);
                                                                                                                        cardServerProcessLayout.setHorizontalGroup(
                                                                                                                        	cardServerProcessLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        		.addGroup(cardServerProcessLayout.createSequentialGroup()
                                                                                                                        			.addContainerGap()
                                                                                                                        			.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                                                        				.addGroup(cardServerProcessLayout.createSequentialGroup()
                                                                                                                        					.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                                                                                                        						.addGroup(cardServerProcessLayout.createSequentialGroup()
                                                                                                                        							.addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                                                                                                                        							.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        							.addComponent(labelTareasPendientes, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
                                                                                                                        					.addGap(0, 48, Short.MAX_VALUE)))
                                                                                                                        			.addPreferredGap(ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                                                                                                                        			.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        				.addGroup(cardServerProcessLayout.createSequentialGroup()
                                                                                                                        					.addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                                                                                        					.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        					.addComponent(labelTareasCompletadas, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
                                                                                                                        				.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.LEADING, false)
                                                                                                                        					.addGroup(cardServerProcessLayout.createSequentialGroup()
                                                                                                                        						.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                                                                                                        						.addGap(42))
                                                                                                                        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                                                                                                        			.addContainerGap())
                                                                                                                        );
                                                                                                                        cardServerProcessLayout.setVerticalGroup(
                                                                                                                        	cardServerProcessLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        		.addGroup(cardServerProcessLayout.createSequentialGroup()
                                                                                                                        			.addContainerGap()
                                                                                                                        			.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.LEADING)
                                                                                                                        				.addComponent(jLabel7)
                                                                                                                        				.addComponent(jLabel9, Alignment.TRAILING))
                                                                                                                        			.addPreferredGap(ComponentPlacement.RELATED)
                                                                                                                        			.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.LEADING, false)
                                                                                                                        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                                                                                                        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                                                                                        			.addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                                        			.addGroup(cardServerProcessLayout.createParallelGroup(Alignment.BASELINE)
                                                                                                                        				.addComponent(jLabel26)
                                                                                                                        				.addComponent(jLabel28)
                                                                                                                        				.addComponent(labelTareasCompletadas)
                                                                                                                        				.addComponent(labelTareasPendientes))
                                                                                                                        			.addContainerGap(331, Short.MAX_VALUE))
                                                                                                                        );
                                                                                                                        cardServerProcess.setLayout(cardServerProcessLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(16)
        			.addComponent(cardServerConfig, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(cardServerProcess, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(cardServerProcess, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cardServerConfig, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
        			.addGap(1117))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    @SuppressWarnings("deprecation")
	private void btnButtonActionPerformed(java.awt.event.ActionEvent evt) {
            if(running){   
                for (Productor productor : this.productores) {
                    productor.kill();
                }
                for (Consumidor consumidor : this.consumidores) {
                	consumidor.kill();
                }
               
               btnButton.setLabel("Iniciar");
               removeRunningValues();
               running = !running;
            }
            else {
                int bCantidad = Integer.parseInt(bufferCantidad.getValue().toString());
                int pCantidad = Integer.parseInt(productorCantidad.getValue().toString());
                int pEspera = Integer.parseInt(productorEspera.getValue().toString());
                int cCantidad = Integer.parseInt(consumidorCantidad.getValue().toString());
                int cEspera = Integer.parseInt(consumidorEspera.getValue().toString());
                
                int vInicial = Integer.parseInt(valoresInicial.getValue().toString());
                int vFinal = Integer.parseInt(valoresFinal.getValue().toString());
                
                
                if(bCantidad > 0 && pCantidad > 0 && cCantidad > 0 && pEspera >= 0 && cEspera >= 0 && vInicial<vFinal) {
                    try{
                        DefaultTableModel model1 = (DefaultTableModel) this.jTable1.getModel();
                        model1.setRowCount(0);
                        DefaultTableModel model2 = (DefaultTableModel) this.jTable2.getModel();
                        model2.setRowCount(0);
                    } catch(Exception e){
                        System.out.println(e);
                    }
                    labelTareasCompletadas.setText("0");
                    labelTareasPendientes.setText("0");
                    btnButton.setLabel("Parar");
               
                    
                                      
                    Buffer buffer = new Buffer(bCantidad, pEspera, cEspera, this);

                    for (int producers = 0; producers < pCantidad; producers++) {
                        Productor productor = new Productor(buffer, pEspera, vInicial, vFinal);
                        productor.start();
                        this.productores.add(productor);
                    }

                    for (int consumers = 0; consumers < cCantidad; consumers++) {
                        Consumidor consumidor = new Consumidor(buffer, cEspera);
                        consumidor.start();
                        this.consumidores.add(consumidor);
                    }

                    running = !running;
                }
            }
    }

    
    
     private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    
    private void removeRunningValues(){
    }
    private javax.swing.JPanel btn_menu_1;
    private javax.swing.JPanel btn_menu_4;
    private javax.swing.JSpinner bufferCantidad;
    private javax.swing.JPanel cardServerConfig;
    private javax.swing.JPanel cardServerProcess;
    private javax.swing.JSpinner consumidorCantidad;
    private javax.swing.JSpinner consumidorEspera;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JLabel labelTareasCompletadas;
    public javax.swing.JLabel labelTareasPendientes;
    private javax.swing.JSpinner productorCantidad;
    private javax.swing.JSpinner productorEspera;
    private javax.swing.JSpinner valoresFinal;
    private javax.swing.JSpinner valoresInicial;
    private JButton btnButton;
    
}

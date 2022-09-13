package sistemaVentaGUI;

import sistemaVentaDAL.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import sistemaVentaBL.*;


public class SistemaInterfaz extends javax.swing.JFrame {
    DefaultTableModel model;

    public SistemaInterfaz() {//constructor
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventana
        
        //------------------------
        //AÑADIR CLIENTES
        //------------------------
        //Colocar titulos a las columnas
        String[] titulosClientes = {"ID", "NOMBRE", "CÉDULA", "TELÉFONO", "CORREO"};
        model = new DefaultTableModel(null, titulosClientes);
        tblClientes.setModel(model);
        mostarDatosCliente();//llama al método de abajo para mostrar los datos
        
        //llama al método de abajo para mostrar los datos en Configuracion
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtClienteNombre = new javax.swing.JTextField();
        txtClienteId = new javax.swing.JTextField();
        txtClienteCorreo = new javax.swing.JTextField();
        txtClienteCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnClienteAnadir = new javax.swing.JButton();
        btnClienteEliminar = new javax.swing.JButton();
        btnClienteEditar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtClienteTelefono = new javax.swing.JTextField();
        btnClienteLimpiar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtConfigNombre = new javax.swing.JTextField();
        txtConfigCorreo = new javax.swing.JTextField();
        txtConfigDireccion = new javax.swing.JTextField();
        txtConfigNit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtConfigPostal = new javax.swing.JTextField();
        txtConfigCiudad = new javax.swing.JTextField();
        btnConfigGuardar = new javax.swing.JButton();
        btnConfigCancelar = new javax.swing.JButton();
        btnConfigEditar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btnConfiguracion = new javax.swing.JButton();
        btnNewVenta = new javax.swing.JButton();
        btnAddCliente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(98, 133, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconSystem.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 150));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel8);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Teléfono:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("Cedula:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setText("Correo:");

        txtClienteNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtClienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteNombreActionPerformed(evt);
            }
        });
        txtClienteNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteNombreKeyReleased(evt);
            }
        });

        txtClienteId.setBackground(new java.awt.Color(119, 117, 117));
        txtClienteId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtClienteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteIdActionPerformed(evt);
            }
        });
        txtClienteId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteIdKeyReleased(evt);
            }
        });

        txtClienteCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtClienteCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteCorreoKeyReleased(evt);
            }
        });

        txtClienteCedula.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtClienteCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCedulaActionPerformed(evt);
            }
        });
        txtClienteCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteCedulaKeyReleased(evt);
            }
        });

        tblClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CÉDULA", "TELÉFONO", "CORREO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblClientes.setRowHeight(25);
        tblClientes.setRowMargin(2);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        btnClienteAnadir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClienteAnadir.setForeground(new java.awt.Color(38, 73, 255));
        btnClienteAnadir.setText("AGREGAR");
        btnClienteAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteAnadir.setEnabled(false);
        btnClienteAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteAnadirActionPerformed(evt);
            }
        });

        btnClienteEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClienteEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnClienteEliminar.setText("ELIMINAR");
        btnClienteEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEliminarActionPerformed(evt);
            }
        });

        btnClienteEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClienteEditar.setForeground(new java.awt.Color(38, 73, 255));
        btnClienteEditar.setText("EDITAR");
        btnClienteEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEditarActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel16.setText("ID:");

        txtClienteTelefono.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtClienteTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteTelefonoKeyReleased(evt);
            }
        });

        btnClienteLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClienteLimpiar.setForeground(new java.awt.Color(38, 73, 255));
        btnClienteLimpiar.setText("LIMPIAR");
        btnClienteLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtClienteCorreo))))
                    .addComponent(jScrollPane1))
                .addGap(50, 50, 50))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnClienteAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnClienteEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClienteLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnClienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtClienteCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClienteAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClienteLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel9);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setText("Código:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel21.setText("Nombre:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setText("Precio:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setText("Cantidad:");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel24.setText("Descripción:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(38, 73, 255));
        jButton1.setText("GUARDAR");

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(38, 73, 255));
        jButton2.setText("EDITAR");

        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(38, 73, 255));
        jButton3.setText("LIMPIAR");

        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton1)
                .addGap(64, 64, 64)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton4)
                .addGap(90, 90, 90))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(45, 45, 45))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab3", jPanel10);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Datos de la Empresa");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setText("Correo:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("NIT:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("Ciudad:");

        txtConfigNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtConfigNombre.setEnabled(false);

        txtConfigCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtConfigCorreo.setEnabled(false);

        txtConfigDireccion.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtConfigDireccion.setEnabled(false);

        txtConfigNit.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtConfigNit.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Cod Postal");

        txtConfigPostal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtConfigPostal.setEnabled(false);

        txtConfigCiudad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtConfigCiudad.setEnabled(false);
        txtConfigCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfigCiudadActionPerformed(evt);
            }
        });

        btnConfigGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnConfigGuardar.setForeground(new java.awt.Color(38, 73, 255));
        btnConfigGuardar.setText("GUARDAR");
        btnConfigGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigGuardar.setEnabled(false);
        btnConfigGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigGuardarActionPerformed(evt);
            }
        });

        btnConfigCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnConfigCancelar.setForeground(new java.awt.Color(38, 73, 255));
        btnConfigCancelar.setText("CANCELAR");
        btnConfigCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigCancelar.setEnabled(false);
        btnConfigCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigCancelarMouseClicked(evt);
            }
        });
        btnConfigCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigCancelarActionPerformed(evt);
            }
        });

        btnConfigEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnConfigEditar.setForeground(new java.awt.Color(38, 73, 255));
        btnConfigEditar.setText("EDITAR");
        btnConfigEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigEditarMouseClicked(evt);
            }
        });
        btnConfigEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtConfigNombre)
                            .addComponent(txtConfigCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtConfigPostal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtConfigNit, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfigDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfigCiudad)))
                .addGap(77, 77, 77))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnConfigGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnConfigCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnConfigEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtConfigNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfigNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtConfigCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtConfigPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtConfigDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtConfigCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfigGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jTabbedPane2.addTab("tab4", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab5", jPanel12);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 850, 500));

        btnConfiguracion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(38, 73, 255));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 220, 40));

        btnNewVenta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNewVenta.setForeground(new java.awt.Color(38, 73, 255));
        btnNewVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shopping-cart.png"))); // NOI18N
        btnNewVenta.setText("Nueva Venta");
        btnNewVenta.setAlignmentY(0.0F);
        btnNewVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnNewVenta.setIconTextGap(1);
        btnNewVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 40));

        btnAddCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAddCliente.setForeground(new java.awt.Color(38, 73, 255));
        btnAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/client.png"))); // NOI18N
        btnAddCliente.setText("Añadir Cliente");
        btnAddCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, 40));

        btnSalir.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(38, 73, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        btnSalir.setText("     Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir.setIconTextGap(6);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 220, 40));

        btnProductos.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(38, 73, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 220, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Pc's y Componentes");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 850, 50));

        btnVentas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(38, 73, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cajas 1.png"))); // NOI18N
        btnVentas.setText("   Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        jTabbedPane2.setSelectedIndex(2);//Button move to windows / tabs
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        jTabbedPane2.setSelectedIndex(3);//Button move to windows / tabs
        mostarDatosConfiguracion();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed

        jTabbedPane2.setSelectedIndex(1);//Button move to windows / tabs
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnClienteAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAnadirActionPerformed
        //------------------------
        //AÑADIR CLIENTES
        //------------------------

        //creación de objetos
        conexion objtConexion = new conexion();
        clientesBL objtClientes = recuperarDatosGUICliente();
        
        //definir sentencia a enviar
        String strSentenciaInsertar = String.format(
                "INSERT INTO cliente (Id, Nombre, Cedula, Telefono, Correo) "
                        + "VALUES ('%s', '%s', '%s', '%s', '%s')", 
                objtClientes.getId(), objtClientes.getNombre(), objtClientes.getCedula(), objtClientes.getTelefono(), objtClientes.getCorreo());
        objtConexion.ejecutarSentenciaSQL(strSentenciaInsertar);
        
        this.mostarDatosCliente();
    }//GEN-LAST:event_btnClienteAnadirActionPerformed

    private void btnClienteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEliminarActionPerformed
        //------------------------
        //ELIMINAR CLIENTES
        //------------------------
        //creación de objetos
        conexion objtConexion = new conexion();
        clientesBL objtClientes = recuperarDatosGUICliente();
        
        //definir sentencia a enviar
        String strSentenciaEliminar = String.format(
                "DELETE FROM cliente WHERE Id = %d", objtClientes.getId());
        objtConexion.ejecutarSentenciaSQL(strSentenciaEliminar);
        
        //mostrar nuevamente datos
        this.mostarDatosCliente();
    }//GEN-LAST:event_btnClienteEliminarActionPerformed

    private void btnClienteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEditarActionPerformed

        //------------------------
        //EDITAR CLIENTES
        //------------------------
        //creación de objetos
        conexion objtConexion = new conexion();
        clientesBL objtClientes = recuperarDatosGUICliente();
        
        //definir sentencia a enviar
        String strSentenciaEditar = String.format(
                "UPDATE cliente SET Nombre = '%s', Cedula = '%s', Telefono = '%s', Correo = '%s' WHERE Id = %d", 
                objtClientes.getNombre(), objtClientes.getCedula(), objtClientes.getTelefono(), objtClientes.getCorreo(), objtClientes.getId());
        objtConexion.ejecutarSentenciaSQL(strSentenciaEditar);
        
        //mostrar nuevamente datos
        this.mostarDatosCliente();
    }//GEN-LAST:event_btnClienteEditarActionPerformed

    private void btnNewVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewVentaActionPerformed
        jTabbedPane2.setSelectedIndex(0);//Button move to windows / tabs
    }//GEN-LAST:event_btnNewVentaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);//finalizar software
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtClienteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteNombreActionPerformed

    private void txtClienteCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCedulaActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable)evt.getSource();
            txtClienteId.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtClienteNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtClienteCedula.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtClienteTelefono.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtClienteCorreo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtClienteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteIdActionPerformed
        
    }//GEN-LAST:event_txtClienteIdActionPerformed

    private void btnClienteLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteLimpiarActionPerformed
       txtClienteNombre.setText("");
       txtClienteCedula.setText("");
       txtClienteTelefono.setText("");
       txtClienteCorreo.setText("");
        
    }//GEN-LAST:event_btnClienteLimpiarActionPerformed

    private void btnConfigEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigEditarMouseClicked
        
    }//GEN-LAST:event_btnConfigEditarMouseClicked

    private void btnConfigCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigCancelarMouseClicked
        
    }//GEN-LAST:event_btnConfigCancelarMouseClicked

    private void txtClienteNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteNombreKeyReleased
        habilitarBotonCliente();
    }//GEN-LAST:event_txtClienteNombreKeyReleased

    private void txtClienteTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteTelefonoKeyReleased
        habilitarBotonCliente();
    }//GEN-LAST:event_txtClienteTelefonoKeyReleased

    private void txtClienteCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteCedulaKeyReleased
        habilitarBotonCliente();
    }//GEN-LAST:event_txtClienteCedulaKeyReleased

    private void txtClienteCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteCorreoKeyReleased
        habilitarBotonCliente();
    }//GEN-LAST:event_txtClienteCorreoKeyReleased

    private void txtClienteIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteIdKeyReleased
        habilitarBotonCliente();
    }//GEN-LAST:event_txtClienteIdKeyReleased

    private void btnConfigCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigCancelarActionPerformed
            mostarDatosConfiguracion();
            txtConfigNit.setEnabled(false);
            txtConfigNombre.setEnabled(false);
            txtConfigCorreo.setEnabled(false);
            txtConfigDireccion.setEnabled(false);
            txtConfigPostal.setEnabled(false);
            txtConfigCiudad.setEnabled(false);
            btnConfigGuardar.setEnabled(false);
            btnConfigCancelar.setEnabled(false);
            btnConfigEditar.setEnabled(true);
    }//GEN-LAST:event_btnConfigCancelarActionPerformed

    private void btnConfigEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigEditarActionPerformed
        
            txtConfigNit.setEnabled(true);
            txtConfigNombre.setEnabled(true);
            txtConfigCorreo.setEnabled(true);
            txtConfigDireccion.setEnabled(true);
            txtConfigPostal.setEnabled(true);
            txtConfigCiudad.setEnabled(true);
            btnConfigGuardar.setEnabled(true);
            btnConfigCancelar.setEnabled(true);
            btnConfigEditar.setEnabled(false);
        
    }//GEN-LAST:event_btnConfigEditarActionPerformed

    private void btnConfigGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigGuardarActionPerformed

        recuperarDatosGUIConfiguracion();
        conexion objtConexion = new conexion();
        empresaBL objtEmpresa = recuperarDatosGUIConfiguracion();
        String strSentenciaActualizar = String.format("UPDATE empresa SET Nit = %d, "
                + "Nombre = '%s', Correo = '%s', Direccion = '%s', Postal = %d, Ciudad = '%s'", 
                objtEmpresa.getNit(), objtEmpresa.getNombre(), objtEmpresa.getCorreo(), objtEmpresa.getDireccion(), 
                objtEmpresa.getPostal(), objtEmpresa.getCiudad());
        objtConexion.ejecutarSentenciaSQL(strSentenciaActualizar);
        this.mostarDatosConfiguracion();
        btnConfigCancelar.setEnabled(false);
        btnConfigGuardar.setEnabled(false);
        btnConfigEditar.setEnabled(true);
    }//GEN-LAST:event_btnConfigGuardarActionPerformed

    private void txtConfigCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfigCiudadActionPerformed

    }//GEN-LAST:event_txtConfigCiudadActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasActionPerformed

    //------------------------
    //Métodos para acceder a la información
    //------------------------
   
    public clientesBL recuperarDatosGUICliente(){
        //------------------------------------------------------------------
        //AÑADIR CLIENTES
        //------------------------------------------------------------------
        clientesBL objtClientes = new clientesBL();
        
        //***ENVIAR DATOS***
        objtClientes.setNombre(txtClienteNombre.getText());
        objtClientes.setCorreo(txtClienteCorreo.getText());
        
        //***CONVERTIR A LONG***
        //Operador ternario, obtener datos y guardarlos en variables
        int Id = (txtClienteId.getText().isEmpty()? 
                0 : Integer.parseInt(txtClienteId.getText()));//convertir a int
        objtClientes.setId(Id);
        
        long Cedula = (txtClienteCedula.getText().isEmpty()? 
                0 : Long.parseLong(txtClienteCedula.getText()));//convertir a int
        objtClientes.setCedula(Cedula);
        
        long Telefono = (txtClienteTelefono.getText().isEmpty()? 
                0 : Long.parseLong(txtClienteTelefono.getText()));//convertir a int
        objtClientes.setTelefono(Telefono);
            
        return objtClientes;//retorna el objeto creado que contiene toda la info
    }
    
    public void mostarDatosCliente(){
        while(model.getRowCount() >0 ){
            model.removeRow(0);
        }
        conexion objtConexion = new conexion();
        //try catch, para probar traida de datos
        try {
            ResultSet resultado = objtConexion.consultarRegistros("SELECT * from cliente");
            while (resultado.next()) {
                
                //Encapsular datos en un objeto
                Object[] cliente = {
                    resultado.getString("Id"), resultado.getString("Nombre"),resultado.getString("Cedula"),
                resultado.getString("Telefono"),resultado.getString("Correo")
                };
                //Mostrar datos en la tabla
                model.addRow(cliente);
                int cont = 1+Integer.parseInt(resultado.getString("Id"));
                txtClienteId.setText(cont+"");
                
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        
        
    }
    
    
    
    //------------------------------------------------------------------
    //CONFIGURACIÓN
    //------------------------------------------------------------------
    public empresaBL recuperarDatosGUIConfiguracion(){
        //------------------------------------------------------------------
        //CAMBIAR DATOS EMPRESA
        //------------------------------------------------------------------
        
        empresaBL objtEmpresa = new empresaBL();
        
        //***ENVIAR DATOS***
        objtEmpresa.setNombre(txtConfigNombre.getText());
        objtEmpresa.setCorreo(txtConfigCorreo.getText());
        objtEmpresa.setDireccion(txtConfigDireccion.getText());
        objtEmpresa.setCiudad(txtConfigCiudad.getText());
        
        //***CONVERTIR A INT Y LONG***
        //Operador ternario, obtener datos y guardarlos en variables
        int Nit = (txtConfigNit.getText().isEmpty()? 
                0 : Integer.parseInt(txtConfigNit.getText()));//convertir a int
        objtEmpresa.setNit(Nit);
        
        long postal = (txtConfigPostal.getText().isEmpty()? 
                0 : Integer.parseInt(txtConfigPostal.getText()));//convertir a int
        objtEmpresa.setPostal(postal);
            
        return objtEmpresa;//retorna el objeto creado que contiene toda la info
    }
    
    public void mostarDatosConfiguracion(){
        conexion objtConexion = new conexion();
        //try catch, para probar traida de datos
        
        try {
            ResultSet resultado = objtConexion.consultarRegistros("SELECT * from empresa");
                txtConfigNit.setText(resultado.getString("Nit"));
                txtConfigNombre.setText(resultado.getString("Nombre"));
                txtConfigCorreo.setText(resultado.getString("Correo"));
                txtConfigDireccion.setText(resultado.getString("Direccion"));
                txtConfigPostal.setText(resultado.getString("Postal"));
                txtConfigCiudad.setText(resultado.getString("Ciudad"));
                objtConexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
    
    
    
    
    
    //-------------------------
    
    public void habilitarBotonCliente(){
        if(!txtClienteId.getText().isEmpty() && !txtClienteNombre.getText().isEmpty() &&
                !txtClienteCedula.getText().isEmpty() && !txtClienteCorreo.getText().isEmpty() &&
                !txtClienteTelefono.getText().isEmpty()){
            
            btnClienteAnadir.setEnabled(true);
        }else{
           
            btnClienteAnadir.setEnabled(false);
        }
    }
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
            java.util.logging.Logger.getLogger(SistemaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnClienteAnadir;
    private javax.swing.JButton btnClienteEditar;
    private javax.swing.JButton btnClienteEliminar;
    private javax.swing.JButton btnClienteLimpiar;
    private javax.swing.JButton btnConfigCancelar;
    private javax.swing.JButton btnConfigEditar;
    private javax.swing.JButton btnConfigGuardar;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnNewVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtClienteCedula;
    private javax.swing.JTextField txtClienteCorreo;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteNombre;
    private javax.swing.JTextField txtClienteTelefono;
    private javax.swing.JTextField txtConfigCiudad;
    private javax.swing.JTextField txtConfigCorreo;
    private javax.swing.JTextField txtConfigDireccion;
    private javax.swing.JTextField txtConfigNit;
    private javax.swing.JTextField txtConfigNombre;
    private javax.swing.JTextField txtConfigPostal;
    // End of variables declaration//GEN-END:variables
}

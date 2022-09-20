package sistemaVentaGUI;

import Reportes.Excel;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import sistemaVentaDAL.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

import sistemaVentaBL.*;


public class SistemaInterfaz extends javax.swing.JFrame {
    DefaultTableModel model;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    private long var;
    int item;   
    double totalPagar = 0.00;
    
    public SistemaInterfaz() {//constructor
        initComponents();
        this.setLocationRelativeTo(null);//centrar ventana
        txtClienteId.setBackground(new java.awt.Color(0,0,0,1));
        pdf();
                
        
        //------------------------
        //AÑADIR CLIENTES
        //------------------------
        //Colocar titulos a las columnas
        String[] titulosClientes = {"ID", "NOMBRE", "CÉDULA", "TELÉFONO", "CORREO"};
        model = new DefaultTableModel(null, titulosClientes);
        tblClientes.setModel(model);
        
        
        //------------------------
        //PRODUCTOS
        //------------------------
        //Colocar titulos a las columnas
        String[] titulosProductos = {"CÓDIGO", "NOMBRE", "PRECIO", "CANTIDAD", "DESCRIPCIÓN"};
        model2 = new DefaultTableModel(null, titulosProductos);
        tblProductos.setModel(model2);
        
        //------------------------
        //MOSTRAR FECHA ACTUAL
        //------------------------
        txtVentaFecha.setText(this.fecha());
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblNuevaVenta = new javax.swing.JTable();
        txtVentaCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtVentaCantidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtVentaStock = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtVentaProducto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtVentaClienteCedula = new javax.swing.JTextField();
        txtVentaClienteNombre = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtVentaPrecio = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtVentaPrecioTotal = new javax.swing.JTextField();
        btnVentaPagar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnVentaImprimir = new javax.swing.JButton();
        btnVentaDelete = new javax.swing.JButton();
        btnVentaAdd = new javax.swing.JButton();
        txtVentaFecha = new javax.swing.JTextField();
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
        tblProductos = new javax.swing.JTable();
        txtProductosCodigo = new javax.swing.JTextField();
        txtProductosNombre = new javax.swing.JTextField();
        txtProductosPrecio = new javax.swing.JTextField();
        txtProductosCantidad = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtProductosDesc = new javax.swing.JTextArea();
        btnProductosGuardar = new javax.swing.JButton();
        btnProductosEditar = new javax.swing.JButton();
        btnProductosLimpiar = new javax.swing.JButton();
        btnProductosEliminar = new javax.swing.JButton();
        btnReporteExcel = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnPdf = new javax.swing.JButton();
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
        btnCambiarUsuario = new javax.swing.JButton();
        btnCambiarContra = new javax.swing.JButton();
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

        jTabbedPane2.setForeground(new java.awt.Color(0, 51, 255));

        tblNuevaVenta.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tblNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PRODUCTO", "CANTIDAD", "PRECIO UNITARIO", "PRECIO TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNuevaVenta.setRowHeight(35);
        tblNuevaVenta.setRowMargin(3);
        jScrollPane4.setViewportView(tblNuevaVenta);
        if (tblNuevaVenta.getColumnModel().getColumnCount() > 0) {
            tblNuevaVenta.getColumnModel().getColumn(0).setResizable(false);
            tblNuevaVenta.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblNuevaVenta.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        txtVentaCodigo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtVentaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVentaCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentaCodigoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Código:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("Cantidad:");

        txtVentaCantidad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtVentaCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVentaCantidadKeyPressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setText("en Stock:");

        txtVentaStock.setEditable(false);
        txtVentaStock.setBackground(new java.awt.Color(204, 204, 204));
        txtVentaStock.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setText("Producto:");

        txtVentaProducto.setEditable(false);
        txtVentaProducto.setBackground(new java.awt.Color(204, 204, 204));
        txtVentaProducto.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel19.setText("Precio:");

        jLabel25.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel25.setText("ID Cliente:");

        txtVentaClienteCedula.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtVentaClienteCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentaClienteCedulaKeyReleased(evt);
            }
        });

        txtVentaClienteNombre.setEditable(false);
        txtVentaClienteNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtVentaClienteNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtVentaClienteNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentaClienteNombreKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel26.setText("Nombre:");

        txtVentaPrecio.setEditable(false);
        txtVentaPrecio.setBackground(new java.awt.Color(204, 204, 204));
        txtVentaPrecio.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txtVentaPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setText("Total a Pagar:");

        txtVentaPrecioTotal.setEditable(false);
        txtVentaPrecioTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtVentaPrecioTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtVentaPrecioTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtVentaPrecioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVentaPrecioTotalKeyReleased(evt);
            }
        });

        btnVentaPagar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnVentaPagar.setText("PAGAR");
        btnVentaPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVentaPagar.setBorderPainted(false);
        btnVentaPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaPagarActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(177, 177, 182));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("|");

        btnVentaImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imprimir.png"))); // NOI18N
        btnVentaImprimir.setBorder(null);
        btnVentaImprimir.setBorderPainted(false);

        btnVentaDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        btnVentaDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaDeleteActionPerformed(evt);
            }
        });

        btnVentaAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        btnVentaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaAddActionPerformed(evt);
            }
        });

        txtVentaFecha.setBackground(new java.awt.Color(214, 217, 223));
        txtVentaFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtVentaFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVentaFecha.setText("12-12-2003 10:30");
        txtVentaFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(jLabel26))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(txtVentaClienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtVentaClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(86, 86, 86)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(76, 76, 76)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtVentaPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(btnVentaImprimir)
                                    .addGap(45, 45, 45)
                                    .addComponent(btnVentaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtVentaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtVentaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVentaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVentaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnVentaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVentaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtVentaFecha))))
                .addGap(18, 18, 18))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVentaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVentaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel17)
                            .addComponent(txtVentaStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(txtVentaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(txtVentaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVentaDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVentaClienteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtVentaPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtVentaClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26))
                            .addComponent(btnVentaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVentaImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel28)))
        );

        jTabbedPane2.addTab("1", jPanel8);
        jPanel8.getAccessibleContext().setAccessibleName("tab1");

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

        txtClienteId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtClienteId.setBorder(null);
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
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
        btnClienteEditar.setEnabled(false);
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

        jTabbedPane2.addTab("2", jPanel9);
        jPanel9.getAccessibleContext().setAccessibleName("tab1");

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

        tblProductos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductos.setIntercellSpacing(new java.awt.Dimension(0, 2));
        tblProductos.setRowHeight(25);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        txtProductosCodigo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtProductosCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductosCodigoKeyReleased(evt);
            }
        });

        txtProductosNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtProductosNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductosNombreKeyReleased(evt);
            }
        });

        txtProductosPrecio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtProductosPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductosPrecioKeyReleased(evt);
            }
        });

        txtProductosCantidad.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtProductosCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductosCantidadKeyReleased(evt);
            }
        });

        txtProductosDesc.setColumns(10);
        txtProductosDesc.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtProductosDesc.setLineWrap(true);
        txtProductosDesc.setRows(5);
        txtProductosDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtProductosDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductosDescKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtProductosDesc);

        btnProductosGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnProductosGuardar.setForeground(new java.awt.Color(38, 73, 255));
        btnProductosGuardar.setText("AGREGAR");
        btnProductosGuardar.setEnabled(false);
        btnProductosGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosGuardarActionPerformed(evt);
            }
        });

        btnProductosEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnProductosEditar.setForeground(new java.awt.Color(38, 73, 255));
        btnProductosEditar.setText("EDITAR");
        btnProductosEditar.setEnabled(false);
        btnProductosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosEditarActionPerformed(evt);
            }
        });

        btnProductosLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnProductosLimpiar.setForeground(new java.awt.Color(38, 73, 255));
        btnProductosLimpiar.setText("LIMPIAR");
        btnProductosLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosLimpiarActionPerformed(evt);
            }
        });

        btnProductosEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnProductosEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnProductosEliminar.setText("ELIMINAR");
        btnProductosEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosEliminarActionPerformed(evt);
            }
        });

        btnReporteExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excel.png"))); // NOI18N
        btnReporteExcel.setBorder(null);
        btnReporteExcel.setBorderPainted(false);
        btnReporteExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProductosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProductosPrecio)
                            .addComponent(txtProductosNombre)
                            .addComponent(txtProductosCodigo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnProductosGuardar)
                        .addGap(64, 64, 64)
                        .addComponent(btnProductosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnProductosLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnProductosEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReporteExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtProductosCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtProductosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtProductosPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtProductosCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProductosGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProductosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProductosLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProductosEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReporteExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("3", jPanel10);

        tblVentas.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÉDULA", "CLIENTE", "TOTAL", "FECHA"
            }
        ));
        tblVentas.setRowHeight(37);
        tblVentas.setRowMargin(3);
        jScrollPane5.setViewportView(tblVentas);
        if (tblVentas.getColumnModel().getColumnCount() > 0) {
            tblVentas.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblVentas.getColumnModel().getColumn(2).setPreferredWidth(17);
        }

        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pdf.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("4", jPanel12);

        jPanel11.setForeground(new java.awt.Color(51, 51, 255));

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

        btnCambiarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCambiarUsuario.setText("Cambiar Usuario");
        btnCambiarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarUsuario.setBorderPainted(false);
        btnCambiarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarUsuarioActionPerformed(evt);
            }
        });

        btnCambiarContra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCambiarContra.setText("Cambiar Contraseña");
        btnCambiarContra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarContra.setBorderPainted(false);
        btnCambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConfigNombre)
                                    .addComponent(txtConfigCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtConfigDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtConfigNit, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConfigPostal)
                                    .addComponent(txtConfigCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnConfigGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnConfigCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnConfigEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
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
                .addGap(51, 51, 51)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfigGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jTabbedPane2.addTab("5", jPanel11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

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
        mostarDatosProductos();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        jTabbedPane2.setSelectedIndex(4);//Button move to windows / tabs
        mostarDatosConfiguracion();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        
        mostarDatosCliente();
        jTabbedPane2.setSelectedIndex(1);//Button move to windows / tabs
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnClienteAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteAnadirActionPerformed
        //------------------------
        //AÑADIR CLIENTES
        //------------------------

        //creación de objetos
        Conexion objtConexion = new Conexion();
        ClientesBL objtClientes = recuperarDatosGUICliente();
        
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
        Conexion objtConexion = new Conexion();
        ClientesBL objtClientes = recuperarDatosGUICliente();
        
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
        Conexion objtConexion = new Conexion();
        ClientesBL objtClientes = recuperarDatosGUICliente();
        
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
        Conexion objtConexion = new Conexion();
        EmpresaBL objtEmpresa = recuperarDatosGUIConfiguracion();
        String strSentenciaActualizar = String.format("UPDATE empresa SET Nit = %d, "
                + "Nombre = '%s', Correo = '%s', Direccion = '%s', Postal = %d, Ciudad = '%s'", 
                objtEmpresa.getNit(), objtEmpresa.getNombre(), objtEmpresa.getCorreo(), objtEmpresa.getDireccion(), 
                objtEmpresa.getPostal(), objtEmpresa.getCiudad());
        objtConexion.ejecutarSentenciaSQL(strSentenciaActualizar);
        this.mostarDatosConfiguracion();
        txtConfigNit.setEnabled(false);
        txtConfigNombre.setEnabled(false);
        txtConfigDireccion.setEnabled(false);
        txtConfigPostal.setEnabled(false);
        txtConfigCiudad.setEnabled(false);
        txtConfigCorreo.setEnabled(false);
        btnConfigCancelar.setEnabled(false);
        btnConfigGuardar.setEnabled(false);
        btnConfigEditar.setEnabled(true);
    }//GEN-LAST:event_btnConfigGuardarActionPerformed

    private void txtConfigCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfigCiudadActionPerformed

    }//GEN-LAST:event_txtConfigCiudadActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        jTabbedPane2.setSelectedIndex(3);//Button move to windows / tabs
        mostarDatosVentas();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void txtProductosCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductosCodigoKeyReleased
        habilitarBotonProductos();
    }//GEN-LAST:event_txtProductosCodigoKeyReleased

    private void txtProductosNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductosNombreKeyReleased
        habilitarBotonProductos();
    }//GEN-LAST:event_txtProductosNombreKeyReleased

    private void txtProductosPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductosPrecioKeyReleased
        habilitarBotonProductos();
    }//GEN-LAST:event_txtProductosPrecioKeyReleased

    private void txtProductosCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductosCantidadKeyReleased
        habilitarBotonProductos();
    }//GEN-LAST:event_txtProductosCantidadKeyReleased

    private void txtProductosDescKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductosDescKeyReleased
        habilitarBotonProductos();
    }//GEN-LAST:event_txtProductosDescKeyReleased

    private void btnProductosLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosLimpiarActionPerformed
       txtProductosCodigo.setText("");
       txtProductosNombre.setText("");
       txtProductosCantidad.setText("");
       txtProductosPrecio.setText("");
       txtProductosDesc.setText("");
    }//GEN-LAST:event_btnProductosLimpiarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable)evt.getSource();
            txtProductosCodigo.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString());
            txtProductosNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString());
            txtProductosPrecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString());
            txtProductosCantidad.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString());
            txtProductosDesc.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString());
            var = Long.parseLong(txtProductosCodigo.getText());
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnProductosEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosEliminarActionPerformed
        //------------------------
        //ELIMINAR PRODUCTOS
        //------------------------
        //creación de objetos
        Conexion objtConexion = new Conexion();
        ProductosBL objtProductos = recuperarDatosGUIProducto();
        
        //definir sentencia a enviar
        String strSentenciaEliminar = String.format(
                "DELETE FROM producto WHERE Codigo = %d", objtProductos.getCodigo());
        objtConexion.ejecutarSentenciaSQL(strSentenciaEliminar);
        
        //mostrar nuevamente datos
        this.mostarDatosProductos();
    }//GEN-LAST:event_btnProductosEliminarActionPerformed

    private void btnProductosGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosGuardarActionPerformed
        //------------------------
        //AÑADIR PRODUCTOS
        //------------------------

        //creación de objetos
        Conexion objtConexion = new Conexion();
        ProductosBL objtProductos = recuperarDatosGUIProducto();
        
        //definir sentencia a enviar
        String strSentenciaInsertar = String.format(
                "INSERT INTO producto (Codigo, Nombre, Precio, Cantidad, Descripcion) "
                        + "VALUES ('%s', '%s', '%s', '%s', '%s')", 
                objtProductos.getCodigo(), objtProductos.getNombre(), objtProductos.getPrecio(), 
                objtProductos.getCantidad(), objtProductos.getDescripcion());
        objtConexion.ejecutarSentenciaSQL(strSentenciaInsertar);
        
        this.mostarDatosProductos();
    }//GEN-LAST:event_btnProductosGuardarActionPerformed
   
    private void btnProductosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosEditarActionPerformed
        //------------------------
        //EDITAR PRODUCTOS
        //------------------------
        //creación de objetos
        
        Conexion objtConexion = new Conexion();
        ProductosBL objtProductos = recuperarDatosGUIProducto();
        System.out.println(objtProductos.getCodigo());
        if(Long.parseLong(txtProductosCodigo.getText()) == this.var){
            //definir sentencia a enviar
            String strSentenciaEditar = String.format(
                "UPDATE producto SET Nombre = '%s', Precio = '%s', Cantidad = '%s', Descripcion = '%s' WHERE Codigo = %d", 
                objtProductos.getNombre(), objtProductos.getPrecio(), objtProductos.getCantidad(), 
                objtProductos.getDescripcion(), objtProductos.getCodigo());
            objtConexion.ejecutarSentenciaSQL(strSentenciaEditar);
        }else {
            JOptionPane.showMessageDialog(this, "El 'Código' no puede ser modificado\n INTENTE NUEVAMENTE!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //mostrar nuevamente datos
        this.mostarDatosProductos();
    }//GEN-LAST:event_btnProductosEditarActionPerformed

    private void btnCambiarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarUsuarioActionPerformed
        CambiarUsuarioInterfaz u = new CambiarUsuarioInterfaz();
        u.setVisible(true);
        
    }//GEN-LAST:event_btnCambiarUsuarioActionPerformed

    private void btnCambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraActionPerformed
        CambiarContraInterfaz c = new CambiarContraInterfaz();
        c.setVisible(true);
        
    }//GEN-LAST:event_btnCambiarContraActionPerformed

    private void txtVentaCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaCodigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtVentaCantidad.requestFocus();
        }
    }//GEN-LAST:event_txtVentaCodigoKeyPressed

    private void txtVentaCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaCodigoKeyReleased
        txtVentaProducto.setText("");
        txtVentaStock.setText("");
        txtVentaPrecio.setText("");
        
        Conexion objtConexion = new Conexion();
        //try catch, para probar traida de datos
        if (!this.buscar(txtVentaCodigo.getText(), "Codigo", "producto").isEmpty()) {
            try {
                ResultSet resultado = objtConexion.consultarRegistros("SELECT * from producto "
                        + "WHERE Codigo='" + this.buscar(txtVentaCodigo.getText(), "Codigo", "producto") + "'");
                txtVentaProducto.setText(resultado.getString("Nombre"));
                txtVentaStock.setText(resultado.getString("Cantidad"));
                txtVentaPrecio.setText(resultado.getString("Precio"));

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
            
        }
        objtConexion.cerrarConexion();
    }//GEN-LAST:event_txtVentaCodigoKeyReleased

    private void txtVentaClienteCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaClienteCedulaKeyReleased
        txtVentaClienteNombre.setText("");

        Conexion objtConexion = new Conexion();
        //try catch, para probar traida de datos
        if (!this.buscar(txtVentaClienteCedula.getText(), "Cedula", "cliente").isEmpty()) {
            try {
                ResultSet resultado = objtConexion.consultarRegistros("SELECT * from cliente "
                        + "WHERE cedula='" + this.buscar(txtVentaClienteCedula.getText(), "Cedula", "cliente") + "'");
                txtVentaClienteNombre.setText(resultado.getString("Nombre"));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        objtConexion.cerrarConexion();
    }//GEN-LAST:event_txtVentaClienteCedulaKeyReleased

    private void txtVentaCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtVentaCodigo.getText()) && !"".equals(txtVentaProducto.getText())) {
                if (!"".equals(txtVentaCantidad.getText())) {
                    String cod = txtVentaCodigo.getText();
                    String nombre = txtVentaProducto.getText();
                    int cantidad = Integer.parseInt(txtVentaCantidad.getText());
                    int stock = Integer.parseInt(txtVentaStock.getText());
                    double precio = Double.parseDouble(txtVentaPrecio.getText());
                    double precioTotal = cantidad * precio;
                    if (stock >= cantidad) {
                        item = item + 1;
                        ArrayList lista = new ArrayList();
                        model3 = (DefaultTableModel) tblNuevaVenta.getModel();
                        lista.add(item);
                        lista.add(cod);
                        lista.add(nombre);
                        lista.add(cantidad);
                        lista.add(precio);
                        lista.add(precioTotal);
                        Object[] O = new Object[5];
                        O[0] = lista.get(1);
                        O[1] = lista.get(2);
                        O[2] = lista.get(3);
                        O[3] = lista.get(4);
                        O[4] = lista.get(5);
                        model3.addRow(O);
                        tblNuevaVenta.setModel(model3);
                        this.totalPagar();
                        this.limpiarVenta();
                    } else {
                        JOptionPane.showMessageDialog(null, "Stock no disponible");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un producto");
            }
        }
    }//GEN-LAST:event_txtVentaCantidadKeyPressed

    private void btnVentaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaAddActionPerformed
        if (!"".equals(txtVentaCodigo.getText()) && !"".equals(txtVentaProducto.getText())) {
            if (!"".equals(txtVentaCantidad.getText())) {
                String cod = txtVentaCodigo.getText();
                String nombre = txtVentaProducto.getText();
                int cantidad = Integer.parseInt(txtVentaCantidad.getText());
                int stock = Integer.parseInt(txtVentaStock.getText());
                double precio = Double.parseDouble(txtVentaPrecio.getText());
                double precioTotal = (double)cantidad * precio;
                
                for (int i = 0; i < tblNuevaVenta.getRowCount(); i++) {
                    if(tblNuevaVenta.getValueAt(i, 1).equals(txtVentaProducto.getText())){
                        JOptionPane.showMessageDialog(null, "El producto ya esta registrado!");
                        return;
                    }  
                }
                if (stock >= cantidad) {
                    item = item + 1;
                    ArrayList lista = new ArrayList();
                    model3 = (DefaultTableModel) tblNuevaVenta.getModel();
                    lista.add(item);
                    lista.add(cod);
                    lista.add(nombre);
                    lista.add(cantidad);
                    lista.add(precio);
                    lista.add(this.EliminarNotaciónCientífica(precioTotal));
                    Object[] O = new Object[5];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    model3.addRow(O);
                    tblNuevaVenta.setModel(model3);
                    this.totalPagar();
                    this.limpiarVenta();
                    txtVentaCodigo.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Stock no disponible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un producto");
        }
    }//GEN-LAST:event_btnVentaAddActionPerformed

    private void btnVentaDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaDeleteActionPerformed
        model3 = (DefaultTableModel) tblNuevaVenta.getModel();
        model3.removeRow(tblNuevaVenta.getSelectedRow());//Elimina la fila seleccionada
        totalPagar();
        txtVentaCodigo.requestFocus();
        
    }//GEN-LAST:event_btnVentaDeleteActionPerformed

    private void btnVentaPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaPagarActionPerformed
        if (txtVentaPrecioTotal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese productos");
        } else if (txtVentaClienteNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el cliente");
        } else {
            //------------------------
            //NUEVA VENTA
            //------------------------
            //creación de objetos
            Conexion objtConexion = new Conexion();
            VentaBL objtVenta = recuperarDatosGUIVenta();

            //definir sentencia a enviar
            String strSentenciaInsertar = String.format(
                    "INSERT INTO ventas (Cliente, Total, Fecha, Cedula) "
                    + "VALUES ('%s', '%s', '%s', '%s')",
                    objtVenta.getCliente(), objtVenta.getTotal(), objtVenta.getFecha(),
                    objtVenta.getCedula());
            objtConexion.ejecutarSentenciaSQL(strSentenciaInsertar);
            actualizarStock();
            txtVentaCodigo.setText("");
            txtVentaCantidad.setText("");
            txtVentaClienteCedula.setText("");
            txtVentaClienteNombre.setText("");
            txtVentaPrecio.setText("");
            txtVentaPrecioTotal.setText("");
            txtVentaProducto.setText("");
            txtVentaStock.setText("");
            Clear_Table1();
        }
        
    }//GEN-LAST:event_btnVentaPagarActionPerformed

    private void txtVentaPrecioTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaPrecioTotalKeyReleased
        
    }//GEN-LAST:event_txtVentaPrecioTotalKeyReleased

    private void txtVentaClienteNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVentaClienteNombreKeyReleased
        
    }//GEN-LAST:event_txtVentaClienteNombreKeyReleased

    private void btnReporteExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteExcelActionPerformed
        Excel.reporte();
    }//GEN-LAST:event_btnReporteExcelActionPerformed
    
    private void Clear_Table1() {
        for (int i = 0; i < tblNuevaVenta.getRowCount(); i++) {
            model3.removeRow(i);
            i -= 1;
        }
    }

    public static String EliminarNotaciónCientífica(double número) {
        String d = "####################################";
        return new DecimalFormat("#." + d + d + d).format(número);
    }
    //------------------------------------------------------------------
    //AÑADIR CLIENTES
    //------------------------------------------------------------------
   
    public ClientesBL recuperarDatosGUICliente(){
        //------------------------
        //Método para acceder a la información
        //------------------------
        
        ClientesBL objtClientes = new ClientesBL();
        
        //***ENVIAR DATOS***
        objtClientes.setNombre(txtClienteNombre.getText());
        objtClientes.setCorreo(txtClienteCorreo.getText());
        
        //***CONVERTIR A LONG***
        //Operador ternario, obtener datos y guardarlos en variables
        int Id = (txtClienteId.getText().isEmpty()? 
                0 : Integer.parseInt(txtClienteId.getText()));//convertir a int
        objtClientes.setId(Id);
        
        long Cedula = (txtClienteCedula.getText().isEmpty()? 
                0 : Long.parseLong(txtClienteCedula.getText()));//convertir a long
        objtClientes.setCedula(Cedula);
        
        long Telefono = (txtClienteTelefono.getText().isEmpty()? 
                0 : Long.parseLong(txtClienteTelefono.getText()));//convertir a long
        objtClientes.setTelefono(Telefono);
            
        return objtClientes;//retorna el objeto creado que contiene toda la info
    }
    
    public void mostarDatosCliente(){
        while(model.getRowCount() >0 ){
            model.removeRow(0);
        }
        Conexion objtConexion = new Conexion();
        
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
    //AÑADIR PRODUCTOS
    //------------------------------------------------------------------
   
    public ProductosBL recuperarDatosGUIProducto(){
        //------------------------
        //Método para acceder a la información
        //------------------------
        
        ProductosBL objtProductos = new ProductosBL();
        
        //***ENVIAR DATOS***
        objtProductos.setNombre(txtProductosNombre.getText());
        objtProductos.setDescripcion(txtProductosDesc.getText());
        
        //***CONVERTIR A LONG***
        //Operador ternario, obtener datos y guardarlos en variables
        long Codigo = (txtProductosCodigo.getText().isEmpty()? 
                0 : Long.parseLong(txtProductosCodigo.getText()));//convertir a long
        objtProductos.setCodigo(Codigo);
        
        long Precio = (txtProductosPrecio.getText().isEmpty()? 
                0 : Long.parseLong(txtProductosPrecio.getText()));//convertir a long
        objtProductos.setPrecio(Precio);
        
        long Cantidad = (txtProductosCantidad.getText().isEmpty()? 
                0 : Long.parseLong(txtProductosCantidad.getText()));//convertir a long
        objtProductos.setCantidad(Cantidad);
            
        return objtProductos;//retorna el objeto creado que contiene toda la info
    }
    
    public void mostarDatosProductos(){
        while(model2.getRowCount() >0 ){
            model2.removeRow(0);
        }
        Conexion objtConexion = new Conexion();
        //try catch, para probar traida de datos
        try {
            ResultSet resultado = objtConexion.consultarRegistros("SELECT * from producto");
            while (resultado.next()) {
                
                //Encapsular datos en un objeto
                Object[] producto = {
                    resultado.getString("Codigo"), resultado.getString("Nombre"),resultado.getString("Precio"),
                resultado.getString("Cantidad"),resultado.getString("Descripcion")
                };
                //Mostrar datos en la tabla
                model2.addRow(producto);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        } 
    }
    
    //------------------------------------------------------------------
    //NUEVA VENTA
    //------------------------------------------------------------------
    public String buscar(String validar, String columna, String tabla){
        Conexion objtConexion = new Conexion();
        String key="";
        
        try {
            ResultSet resultado = objtConexion.consultarRegistros("SELECT * from "+tabla);
            bucle1:while (resultado.next()) {
                
                //Encapsular datos en un objeto
                Object[] table = {
                    resultado.getString(columna)
                };
                bucle2:for (int i = 0; i < table.length; i++) {
                    if(table[i].equals(validar)){
                        key =  String.valueOf(table[i]);
                        break bucle1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } 
        objtConexion.cerrarConexion();
        return key;
    }
    
    public void totalPagar(){
        this.totalPagar=0.00;
        int numFila = tblNuevaVenta.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tblNuevaVenta.getModel().getValueAt(i, 4)));
            totalPagar+=cal;
        }
        txtVentaPrecioTotal.setText(String.valueOf(this.EliminarNotaciónCientífica(this.totalPagar)));
    }
    
    public void limpiarVenta(){
        txtVentaCodigo.setText("");
        txtVentaProducto.setText("");
        txtVentaPrecio.setText("");
        txtVentaStock.setText("");
        txtVentaCantidad.setText("");
        txtVentaCodigo.setText("");
    }
    
    public String fecha(){
        Date fecha = new Date();
        SimpleDateFormat FechaAct = new SimpleDateFormat("dd-MM-yyyy");
        return FechaAct.format(fecha);
    }
    
    public String fecha2(){
        Date fecha = new Date();
        SimpleDateFormat FechaAct = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
        return FechaAct.format(fecha);
    }
    
    public VentaBL recuperarDatosGUIVenta(){
        //------------------------
        //Método para acceder a la información
        //------------------------
        
        VentaBL objtVenta = new VentaBL();
        
        //***ENVIAR DATOS***
        objtVenta.setCliente(txtVentaClienteNombre.getText());
        objtVenta.setFecha(this.fecha2());
        
        //***CONVERTIR A double***
        //Operador ternario, obtener datos y guardarlos en variables
        double total = (txtVentaPrecioTotal.getText().isEmpty()? 
                0 : Double.parseDouble(txtVentaPrecioTotal.getText()));//convertir a double
        objtVenta.setTotal(total);
        
        long cedula = (txtVentaClienteCedula.getText().isEmpty()? 
                0 : Long.parseLong(txtVentaClienteCedula.getText()));//convertir a long
        objtVenta.setCedula(cedula);
        
        
        
        return objtVenta;
    }
    
    public void mostarDatosVentas(){
        model4 = (DefaultTableModel) tblVentas.getModel();
        while(model4.getRowCount() >0 ){
            model4.removeRow(0);
        }
        
        Conexion objtConexion = new Conexion();
        //try catch, para probar traida de datos
        try {
            ResultSet resultado = objtConexion.consultarRegistros("SELECT * from ventas");
            while (resultado.next()) {
                //Encapsular datos en un objeto
                Object[] venta = {
                    resultado.getString("Cedula"), resultado.getString("Cliente"),resultado.getString("Total"),
                resultado.getString("Fecha")
                };
                //Mostrar datos en la tabla
                model4.addRow(venta);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        } 
    }
    
    public void actualizarStock() {
        //------------------------
        //Actualizar el Stock un producto
        //------------------------

        Conexion objtConexion = new Conexion();
        ProductosBL objtProductos = recuperarDatosGUIProducto();

        for (int i = 0; i < tblNuevaVenta.getRowCount(); i++) {
            //definir sentencia a enviar
            int cant = Integer.parseInt(buscarStock(tblNuevaVenta.getValueAt(i, 0).toString())) - Integer.parseInt(tblNuevaVenta.getValueAt(i, 2).toString());
            String strSentenciaEditar = String.format(
                    "UPDATE producto SET Cantidad = '%s' WHERE Codigo = '%s'", cant, tblNuevaVenta.getValueAt(i, 0).toString());
                    
            objtConexion.ejecutarSentenciaSQL(strSentenciaEditar);
        }
    }
    
    public String buscarStock(String cod){
        Conexion objtConexion = new Conexion();
        String res = "";
        //try catch, para probar traida de datos
        try {
                ResultSet resultado = objtConexion.consultarRegistros("SELECT * from producto "
                        + "WHERE Codigo='" + cod +"'");
                res =resultado.getString("Cantidad");

        } catch (Exception e) {
                System.out.println("Error: " + e);
        }
        objtConexion.cerrarConexion();
        return res;
    }

    
    
    
    //------------------------------------------------------------------
    //CONFIGURACIÓN
    //------------------------------------------------------------------
    public EmpresaBL recuperarDatosGUIConfiguracion(){
        //------------------------------------------------------------------
        //CAMBIAR DATOS EMPRESA
        //------------------------------------------------------------------
        
        EmpresaBL objtEmpresa = new EmpresaBL();
        
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
        Conexion objtConexion = new Conexion();
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
    private void pdf() {
        try {
            FileOutputStream archivo;
            File file = new File("src/pdf/venta.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image img = Image.getInstance("src/images/iconLogin.png");
            
            Paragraph fecha = new Paragraph();
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            Date date = new Date();
            fecha.add("Factura: 1\n"+"Fecha: "+new SimpleDateFormat("dd-mm-yyy").format(date)+"\n\n");
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            Encabezado.addCell(img);
            String nit = "1234";
            String nom = "Pcs y Componentes";
            String mail = "example@componentes.co";
            String dir = "Cr 8 Cll - 15 Sur";
            String ciudad = "Medellin";
            
            Encabezado.addCell("");
            Encabezado.addCell("Nit: "+nit+ "\nNombre: " +nom+ "\nCorreo: " +mail+ "\nDireccion: " +dir+ "\nCiudad: " +ciudad);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            doc.close();
            archivo.close();
        }catch(Exception e){
            
        }
    }
    
    public void habilitarBotonCliente(){
        if(!txtClienteId.getText().isEmpty() && !txtClienteNombre.getText().isEmpty() &&
                !txtClienteCedula.getText().isEmpty() && !txtClienteCorreo.getText().isEmpty() &&
                !txtClienteTelefono.getText().isEmpty()){
            
            btnClienteAnadir.setEnabled(true);
            btnClienteEditar.setEnabled(true);
        }else{
            btnClienteAnadir.setEnabled(false);
            btnClienteEditar.setEnabled(false);
        }
    }
    
    public void habilitarBotonProductos(){
        if(!txtProductosCodigo.getText().isEmpty() && !txtProductosNombre.getText().isEmpty() &&
                !txtProductosPrecio.getText().isEmpty() && !txtProductosCantidad.getText().isEmpty() &&
                !txtProductosDesc.getText().isEmpty()){
            btnProductosGuardar.setEnabled(true);
            btnProductosEditar.setEnabled(true);
        }else{
            btnProductosGuardar.setEnabled(false);
            btnProductosEditar.setEnabled(false);
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
    private javax.swing.JButton btnCambiarContra;
    private javax.swing.JButton btnCambiarUsuario;
    private javax.swing.JButton btnClienteAnadir;
    private javax.swing.JButton btnClienteEditar;
    private javax.swing.JButton btnClienteEliminar;
    private javax.swing.JButton btnClienteLimpiar;
    private javax.swing.JButton btnConfigCancelar;
    private javax.swing.JButton btnConfigEditar;
    private javax.swing.JButton btnConfigGuardar;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnNewVenta;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductosEditar;
    private javax.swing.JButton btnProductosEliminar;
    private javax.swing.JButton btnProductosGuardar;
    private javax.swing.JButton btnProductosLimpiar;
    private javax.swing.JButton btnReporteExcel;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentaAdd;
    private javax.swing.JButton btnVentaDelete;
    private javax.swing.JButton btnVentaImprimir;
    private javax.swing.JButton btnVentaPagar;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblNuevaVenta;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblVentas;
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
    private javax.swing.JTextField txtProductosCantidad;
    private javax.swing.JTextField txtProductosCodigo;
    private javax.swing.JTextArea txtProductosDesc;
    private javax.swing.JTextField txtProductosNombre;
    private javax.swing.JTextField txtProductosPrecio;
    private javax.swing.JTextField txtVentaCantidad;
    private javax.swing.JTextField txtVentaClienteCedula;
    private javax.swing.JTextField txtVentaClienteNombre;
    private javax.swing.JTextField txtVentaCodigo;
    private javax.swing.JTextField txtVentaFecha;
    private javax.swing.JTextField txtVentaPrecio;
    private javax.swing.JTextField txtVentaPrecioTotal;
    private javax.swing.JTextField txtVentaProducto;
    private javax.swing.JTextField txtVentaStock;
    // End of variables declaration//GEN-END:variables
}

package GUI_R3;
import Form_Pkg.EcommercessData;
import Form_Pkg.InventorydClass;
import java.util.LinkedList;
import static javax.swing.JOptionPane.*;
import javax.swing.DefaultListModel;


/**
 *
 * @author 
 */
public class Pro_Pedidos extends javax.swing.JFrame {

    
    LinkedList <EcommercessData> CustomerObjectList = new LinkedList <> ();
    LinkedList <InventorydClass> ProductsObjectList = new LinkedList <> ();
    
    public Pro_Pedidos() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField15 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Form = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_product_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_product_line = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_product_quantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_product_price = new javax.swing.JTextField();
        cb_section_product = new javax.swing.JComboBox<>();
        cb_lenght_product = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        btn_add_product = new javax.swing.JButton();
        btn_modify_product = new javax.swing.JButton();
        btn_delete_product = new javax.swing.JButton();
        btn_send_pro_inv = new javax.swing.JButton();
        txt_product_code = new javax.swing.JTextField();
        Código = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_cust_name_buy = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_cust_lastname_buy = new javax.swing.JTextField();
        btn_total_price = new javax.swing.JButton();
        btn_send_count = new javax.swing.JButton();
        btn_send_product = new javax.swing.JButton();
        btn_add_car = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txt_cust_count_buy = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_available_money = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_product_buy = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_total_price = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_available_quant = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txt_product_price_sale = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txt_quantity_buy = new javax.swing.JTextField();
        btn_delete_car = new javax.swing.JButton();
        txt_code_buy = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txt_unit_product = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        customer_list = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        products_list = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        shopping_list = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        txt_customer_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_customer_lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_customer_adress = new javax.swing.JTextField();
        txt_customer_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rb_credit = new javax.swing.JRadioButton();
        rb_debit = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txt_customer_count_number = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_send = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_monthly_money = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField15.setEditable(false);

        jLabel26.setText("Precio Total");

        jLabel28.setText("Precio de venta");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setText("Inventario de Productos");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel9.setText("Producto");

        txt_product_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_nameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel10.setText("Sección");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel11.setText("Cantidad");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel12.setText("Medida");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel13.setText("Precio");

        txt_product_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_priceActionPerformed(evt);
            }
        });

        cb_section_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Aseo Hogar", "Aseo Personal", "Carne ", "Pollos", "Cerdo", "Carnes Frías", "Refigerados", "Ferreteria/Electricidad", "Lacteos", "Licores", "Panadería", "Papeleria", "Viveres" }));
        cb_section_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_section_productActionPerformed(evt);
            }
        });

        cb_lenght_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Unidad", "Gramos", "Kilogramo", "Mililitro", "Litro", "Libra" }));
        cb_lenght_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lenght_productActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel14.setText("Linea");

        btn_add_product.setText("Ingresar Producto");
        btn_add_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_productActionPerformed(evt);
            }
        });

        btn_modify_product.setText("Modificar Producto");
        btn_modify_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modify_productActionPerformed(evt);
            }
        });

        btn_delete_product.setText("Eliminar Producto");
        btn_delete_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_productActionPerformed(evt);
            }
        });

        btn_send_pro_inv.setText("Consultar Descripción");
        btn_send_pro_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_send_pro_invActionPerformed(evt);
            }
        });

        Código.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        Código.setText("Código");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Código)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_section_product, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_line, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_product_price, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(34, 34, 34)
                                        .addComponent(cb_lenght_product, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_delete_product, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(btn_add_product)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_modify_product)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_send_pro_inv)))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_product_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Código)
                    .addComponent(jLabel12)
                    .addComponent(cb_lenght_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txt_product_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_product_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_product_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_section_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete_product)
                    .addComponent(btn_send_pro_inv)
                    .addComponent(btn_modify_product)
                    .addComponent(btn_add_product))
                .addGap(26, 26, 26))
        );

        Form.addTab(" Productos", jPanel3);

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel15.setText("Nº Cuenta");

        txt_cust_name_buy.setEditable(false);
        txt_cust_name_buy.setBackground(new java.awt.Color(204, 204, 204));
        txt_cust_name_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cust_name_buyActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel16.setText("Nombre");

        txt_cust_lastname_buy.setEditable(false);
        txt_cust_lastname_buy.setBackground(new java.awt.Color(204, 204, 204));

        btn_total_price.setText("Calcular ");
        btn_total_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_total_priceActionPerformed(evt);
            }
        });

        btn_send_count.setText("Consultar Cuenta");
        btn_send_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_send_countActionPerformed(evt);
            }
        });

        btn_send_product.setText("Consulta Catálogo");
        btn_send_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_send_productActionPerformed(evt);
            }
        });

        btn_add_car.setText("Agregar ");
        btn_add_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_carActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel17.setText("Apellidos");

        txt_cust_count_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cust_count_buyActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel18.setText("Saldo Disponible");

        txt_available_money.setEditable(false);
        txt_available_money.setBackground(new java.awt.Color(204, 204, 204));
        txt_available_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_available_moneyActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel19.setText("Agregar al Carrito");

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel20.setText("Producto");

        txt_product_buy.setEditable(false);
        txt_product_buy.setBackground(new java.awt.Color(204, 204, 204));
        txt_product_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_buyActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel21.setText("Precio Total");

        txt_total_price.setEditable(false);
        txt_total_price.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel23.setText("Disponibles");

        txt_available_quant.setEditable(false);
        txt_available_quant.setBackground(new java.awt.Color(204, 204, 204));
        txt_available_quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_available_quantActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel24.setText("Cantidad");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Datos de Cliente");

        txt_product_price_sale.setEditable(false);
        txt_product_price_sale.setBackground(new java.awt.Color(204, 204, 204));
        txt_product_price_sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_product_price_saleActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel27.setText("Precio Venta");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Producto");

        txt_quantity_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantity_buyActionPerformed(evt);
            }
        });

        btn_delete_car.setText("Eliminar ");
        btn_delete_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_carActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel29.setText("Código");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("/");

        txt_unit_product.setEditable(false);
        txt_unit_product.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_send_count)
                .addGap(18, 18, 18)
                .addComponent(btn_send_product)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel20)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_quantity_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_product_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txt_code_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cust_name_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cust_count_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_total_price, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(txt_available_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(txt_unit_product, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_product_price_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 137, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_available_money, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_cust_lastname_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add_car)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete_car, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_total_price)
                .addGap(9, 9, 9))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_cust_count_buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_available_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cust_name_buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txt_cust_lastname_buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_code_buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_available_quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_unit_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel29)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txt_product_buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(txt_product_price_sale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_total_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_quantity_buy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addComponent(jLabel24))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_send_count)
                    .addComponent(btn_send_product))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_car)
                    .addComponent(btn_delete_car)
                    .addComponent(btn_total_price))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Form.addTab("Mercado", jPanel5);

        jPanel4.setForeground(new java.awt.Color(255, 255, 0));

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));
        jPanel8.setForeground(new java.awt.Color(204, 0, 0));

        jScrollPane4.setViewportView(customer_list);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Form.addTab(" Clientes", jPanel4);

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));

        jScrollPane3.setViewportView(products_list);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        Form.addTab("Inventario", jPanel7);

        jPanel10.setBackground(new java.awt.Color(153, 0, 0));

        jScrollPane5.setViewportView(shopping_list);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Form.addTab("Historial", jPanel9);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        txt_customer_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_nameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Cuenta de pagos");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setText("Nombres(s)");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Correo ");

        txt_customer_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_emailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Tarjeta");

        rb_credit.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rb_credit);
        rb_credit.setText("Crèdito");
        rb_credit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_creditActionPerformed(evt);
            }
        });

        rb_debit.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(rb_debit);
        rb_debit.setText("Debito");
        rb_debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_debitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel7.setText("Nº de cuenta");

        txt_customer_count_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_customer_count_numberActionPerformed(evt);
            }
        });

        btn_add.setText("Crear");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_send.setText("Consultar");
        btn_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendActionPerformed(evt);
            }
        });

        btn_modify.setText("Modificar");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });

        btn_delete.setText("Eliminar");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel22.setText("Saldo Total");

        txt_monthly_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_monthly_moneyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_customer_adress, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_customer_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_modify)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_customer_count_number, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel22))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btn_delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_send))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rb_debit)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rb_credit))
                                .addComponent(txt_monthly_money, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_customer_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_customer_count_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_customer_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_monthly_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_customer_adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rb_debit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rb_credit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modify)
                    .addComponent(btn_delete)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_add)
                        .addComponent(btn_send)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Form.addTab("Formulario", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_quantity_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantity_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantity_buyActionPerformed

    private void txt_product_price_saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_price_saleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_price_saleActionPerformed

    private void txt_available_quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_available_quantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_available_quantActionPerformed

    private void txt_product_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_buyActionPerformed

    private void txt_available_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_available_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_available_moneyActionPerformed

    private void txt_cust_count_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cust_count_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cust_count_buyActionPerformed

    private void btn_add_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_carActionPerformed
        // TODO add your handling code here:
        try{
            int product_pay = Integer.parseInt(txt_code_buy.getText());
            int pay_price = Integer.parseInt(txt_total_price.getText());
            int budget = Integer.parseInt(txt_available_money.getText());
            int quantity_dis= Integer.parseInt(txt_available_quant.getText());
            int quantity_input =Integer.parseInt(txt_quantity_buy.getText());
            for(EcommercessData customer : CustomerObjectList){
                if(budget>=pay_price && quantity_input<=quantity_dis){
                    budget=budget-pay_price;
                    quantity_dis=quantity_dis-quantity_input;
                    String new_budget = Integer.toString(budget);
                    String new_quantity = Integer.toString( quantity_dis);
                    txt_available_money.setText(new_budget);
                    txt_available_quant.setText(new_quantity);
                    CustomerObjectList.add(customer);
                    this.Shopping_list();
                    showMessageDialog(null, "Pedido Realizado,Gracias por su compra","Información",INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception e){
            showMessageDialog(null, "Producto NO añadido al Carro","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_add_carActionPerformed

    private void btn_send_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_send_productActionPerformed
        // TODO add your handling code here:
        int product_code = Integer.parseInt(txt_code_buy.getText());
        boolean found_5 = false;
        for(InventorydClass find_pro : ProductsObjectList){
            if(find_pro.getProduct_code()!= product_code){    
                showMessageDialog(null, "Producto NO disponible","Advertencia",WARNING_MESSAGE);
            }
            else{
                txt_product_buy.setText(find_pro.getProduct_name());
                txt_available_quant.setText(find_pro.getProduct_quantity()+"");
                txt_product_price_sale.setText(find_pro.getProduct_price()+"");
                txt_unit_product.setText(find_pro.getProduct_lenght());
                found_5 = true;
                break;
            }
        }
    }//GEN-LAST:event_btn_send_productActionPerformed

    private void btn_send_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_send_countActionPerformed
        // TODO add your handling code here:
        int customer_count_buy = Integer.parseInt(txt_cust_count_buy.getText());
        boolean found_4=false;
        for(EcommercessData buy : CustomerObjectList){
            if(customer_count_buy!=buy.getCustomer_count_num()||txt_cust_count_buy.equals("")){
                showMessageDialog(null,"Esta cuenta NO esta asociada","Advertencia",WARNING_MESSAGE);
            }
            else{
                //CUSTOMER DATA
                txt_cust_name_buy.setText(buy.getCustomer_name());
                txt_cust_lastname_buy.setText(buy.getCustomer_lastname());
                txt_available_money.setText(buy.getMonthly_money()+"");
                found_4 = true;
                break;
            }
        }
    }//GEN-LAST:event_btn_send_countActionPerformed

    private void btn_total_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_total_priceActionPerformed
        try{
            int quantity_buy = Integer.parseInt(txt_quantity_buy.getText()) ;
            boolean found_6 = false;
            if(quantity_buy<=0){
                showMessageDialog(null, "Cantidad Invalida, ingrese de nuevo la cantidad","Advertencia",WARNING_MESSAGE);
            }
            else{
                for(InventorydClass shop : ProductsObjectList){
                    if(quantity_buy>shop.getProduct_quantity() ){
                      showMessageDialog(null, "cantidad no disponible","Advertencia",WARNING_MESSAGE);  
                    }
                    else{
                        int product_price = Integer.parseInt(txt_product_price_sale.getText());
                        int f_price = quantity_buy * product_price;
                        String total_pay = Integer.toString(f_price);
                        txt_total_price.setText(total_pay);
                        found_6=true;
                        break;
                    }
                }
            }
        }
        catch(Exception e){
            showMessageDialog(null, "Cantidad NO disponible","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_total_priceActionPerformed

    private void txt_cust_name_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cust_name_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cust_name_buyActionPerformed

    private void btn_delete_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_productActionPerformed
        // TODO add your handling code here:
        int product_code = Integer.parseInt(txt_product_code.getText());
        boolean found_2 = false;
        for(InventorydClass pro_inv : ProductsObjectList){
            if(pro_inv.getProduct_code()== product_code){
                this.ProductsObjectList.remove(pro_inv);
                this.ClearProductsForm();
                this.Products_list();
                showMessageDialog(null, "El producto fue eleiminado ","Information",INFORMATION_MESSAGE);
                found_2 =true;
                break;
            }
        }
        if (!found_2){
            showMessageDialog(this, "Producto NO disponible","Advertencia",WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_delete_productActionPerformed

    private void btn_modify_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modify_productActionPerformed
        // TODO add your handling code here:
        int product_code = Integer.parseInt(txt_product_code.getText());
        boolean found_2 = false;
        for(InventorydClass pro_inv : ProductsObjectList){
            if(pro_inv.getProduct_code()==product_code){
                String product_name = txt_product_name.getText();
                String product_line = txt_product_line.getText();
                int product_price = Integer.parseInt(txt_product_price.getText());
                int product_quantity = Integer.parseInt(txt_product_quantity.getText());
                String product_section = cb_section_product.getSelectedItem().toString();
                String product_lenght = cb_lenght_product.getSelectedItem().toString();

                pro_inv.setProduct_name(product_name);
                pro_inv.setProduct_line(product_line);
                pro_inv.setProduct_price(product_price);
                pro_inv.setProduct_quantity(product_quantity);
                pro_inv.setProduct_section(product_section);
                pro_inv.setProduct_lenght(product_lenght);
                this.ClearProductsForm();
                showMessageDialog(null,"Se han modificado los datos del producto exitosamente","Information",INFORMATION_MESSAGE);
                this.Products_list();

            }
        }
    }//GEN-LAST:event_btn_modify_productActionPerformed

    private void btn_add_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_productActionPerformed
        // TODO add your handling code here:
        try{
            int product_code = Integer.parseInt(txt_product_code.getText());
            String product_name = txt_product_name.getText();
            String product_line = txt_product_line.getText();
            int product_price = Integer.parseInt(txt_product_price.getText());
            int product_quantity = Integer.parseInt(txt_product_quantity.getText());
            String product_section = cb_section_product.getSelectedItem().toString();
            String product_lenght = cb_lenght_product.getSelectedItem().toString();

            

            if(product_name.equals("") || product_line.equals("")){
                showMessageDialog(null,"Producto no ingresado ","ERROR",ERROR_MESSAGE);
            }
            else{
                InventorydClass invent_pro = new InventorydClass(product_name, product_line, product_section, product_lenght, product_price, product_quantity, product_code);
                ProductsObjectList.add(invent_pro);
                this.Products_list();
                showMessageDialog(null,"Producto Ingresado Exitosamente","Message",INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            showMessageDialog(null, "Ingrese el producto correctamente","Warning",WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_add_productActionPerformed

    private void cb_lenght_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lenght_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_lenght_productActionPerformed

    private void cb_section_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_section_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_section_productActionPerformed

    private void txt_product_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_priceActionPerformed

    private void txt_product_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_product_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_product_nameActionPerformed

    private void txt_monthly_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_monthly_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_monthly_moneyActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int customer_count_num = Integer.parseInt(txt_customer_count_number.getText());
        boolean found = false;
        System.out.println(customer_count_num);
        for(EcommercessData cust : CustomerObjectList){
            if(cust.getCustomer_count_num()==customer_count_num){
                this.CustomerObjectList.remove(cust);
                this.ClearCustomerForm();
                this.Customer_list();
                showMessageDialog(null,"El cliente fue eliminado con exito","Information",INFORMATION_MESSAGE);
                found=true;
                break;
            }
        }
        if (!found){
            showMessageDialog(null,"NO se encontro el cliente ","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
        // TODO add your handling code here:
        int customer_count_num = Integer.parseInt(txt_customer_count_number.getText());
        boolean found_2 = false;
        for(EcommercessData cust : CustomerObjectList){
            if(cust.getCustomer_count_num()== customer_count_num){
                int monthly_money = Integer.parseInt(txt_monthly_money.getText());
                String customer_name = txt_customer_name.getText();
                String customer_lastname = txt_customer_lastname.getText();
                String customer_adress = txt_customer_adress.getText();
                String customer_email = txt_customer_email.getText();
                char credit_card;
                if(rb_credit.isSelected()){
                    credit_card='C';
                }
                else{
                    credit_card='D';
                }
                cust.setCustomer_name(customer_name);
                cust.setCustomer_lastname(customer_lastname);
                cust.setCustomer_adress(customer_adress);
                cust.setCustomer_email(customer_email);
                cust.setMonthly_money(monthly_money);
                this.ClearCustomerForm();
                showMessageDialog(null,"Se ha editado los datos exitosamente","Information",INFORMATION_MESSAGE);
                this.Customer_list();
                found_2= true;
                break;
            }
        }
        if(!found_2){
                showMessageDialog(null,"NO se encontro el cliente","Error",ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btn_modifyActionPerformed

    private void btn_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendActionPerformed
        // TODO add your handling code here:
       
        int CountCustomer = Integer.parseInt(txt_customer_count_number.getText());
        boolean found_3 = false;
        for(EcommercessData cust : CustomerObjectList){
            if(cust.getCustomer_count_num() == CountCustomer){
                txt_customer_name.setText(cust.getCustomer_name());
                txt_customer_lastname.setText(cust.getCustomer_lastname());
                txt_monthly_money.setText(cust.getMonthly_money()+"");
                txt_customer_adress.setText(cust.getCustomer_adress());
                txt_customer_email.setText(cust.getCustomer_email());
                if(rb_credit.isSelected()){
                    rb_credit.setSelected(true);
                }
                else{
                    rb_credit.setSelected(false);
                }
                if(rb_debit.isSelected()){
                    rb_debit.setSelected(true);
                }
                else{
                    rb_debit.setSelected(false);
                }
                found_3 = true;
                break;
            }
        }
        if(!found_3){
            showMessageDialog(null, "El Cliente no existe ","Error",ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_sendActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        try{
            int customer_count_num = Integer.parseInt(txt_customer_count_number.getText());
            int monthly_money = Integer.parseInt(txt_monthly_money.getText());
            String customer_name = txt_customer_name.getText();
            String customer_lastname = txt_customer_lastname.getText();
            String customer_adress = txt_customer_adress.getText();
            String customer_email = txt_customer_email.getText();
            char credit_card;
            if(rb_credit.isSelected()){
                credit_card='C';
            }
            else{
                credit_card='D';
            }
            //System.out.println("Nº Cuenta:  "+customer_count_num+" Nombres y Apellidos: "+customer_name+" "+customer_lastname+" Dirección: "+customer_adress+" .Correo electrónico"+customer_email);

            if (customer_name.equals("")|| customer_lastname.equals("")|| customer_adress.equals("")||
                customer_email.equals("")){
                showMessageDialog(null,"Nombre(s) y/o Apellido(s) del ciente no fueron ingresados","Information",INFORMATION_MESSAGE);
            }

            else{
                EcommercessData cust_ecom = new EcommercessData(customer_name, customer_lastname, customer_email, customer_adress, customer_count_num, monthly_money, credit_card);
                CustomerObjectList.add(cust_ecom);
                this.Customer_list();
                showMessageDialog(null,"Se ha creeado el cliente exitosamente","Information",INFORMATION_MESSAGE);   
         }
        }catch (Exception e) {
            showMessageDialog(null, "Ingrese el numero de cuenta ","Warning",WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_customer_count_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_count_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_count_numberActionPerformed

    private void rb_debitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_debitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_debitActionPerformed

    private void rb_creditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_creditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_creditActionPerformed

    private void txt_customer_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_emailActionPerformed

    private void txt_customer_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_customer_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_customer_nameActionPerformed

    private void btn_delete_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_carActionPerformed
        // TODO add your handling code here:
        int option=showConfirmDialog(null,"Desea Sacar este producto del Carro","Eliminar",OK_CANCEL_OPTION);
        switch(option){
            case OK_OPTION:
                int product_code = Integer.parseInt(txt_code_buy.getText());  
                int pay_price = Integer.parseInt(txt_total_price.getText());
                for(InventorydClass del_pro : ProductsObjectList){
                    if(del_pro.getProduct_code()== product_code && del_pro.getProduct_quantity() >= pay_price){
                        txt_product_buy.setText(del_pro.getProduct_name());   
                        txt_product_price_sale.setText(del_pro.getProduct_price()+"");
                        int budget = Integer.parseInt(txt_available_money.getText());
                        int quantity_dis= Integer.parseInt(txt_available_quant.getText());
                        int quantity_input =Integer.parseInt(txt_quantity_buy.getText());
                        budget=budget + pay_price;
                        quantity_dis = quantity_dis + quantity_input;
                        String new_budget = Integer.toString(budget);
                        String new_quantity = Integer.toString( quantity_dis);
                        txt_available_money.setText(new_budget);
                        txt_available_quant.setText(new_quantity);
                        this.ProductsObjectList.remove(del_pro);
                        this.ClearProductsForm();
                        this.Products_list();
                        showMessageDialog(null,"Producto eliminado del Carro","Eliminar",INFORMATION_MESSAGE);
                    } 
                    else {
                        showMessageDialog(null,"Complete los campos de manera correcta, por favor","Mensaje",WARNING_MESSAGE);
                    }
                    break;
                }
            case CANCEL_OPTION:
                showMessageDialog(null,"El producto no ha sido retirado del carro, gracias");
                 break;
            default:
                showMessageDialog(null,"Movimiento no realizado","Information",INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_delete_carActionPerformed

    private void btn_send_pro_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_send_pro_invActionPerformed
        // TODO add your handling code here:
        int product_code = Integer.parseInt(txt_product_code.getText());
        boolean found_5 = false;
        for(InventorydClass prod : ProductsObjectList){
            if(prod.getProduct_code()== product_code){
                txt_product_name.setText(prod.getProduct_name());
                txt_product_line.setText(prod.getProduct_line());
                cb_section_product.setSelectedItem(prod.getProduct_section());
                cb_lenght_product.setSelectedItem(prod.getProduct_lenght());
                txt_product_price.setText(prod.getProduct_price()+"");
                txt_product_quantity.setText(prod.getProduct_quantity()+"");
                
                found_5=true;
                break;
            }
        } 
        if(!found_5){
            showMessageDialog(null,"Producto no encontrado","Advertencia",WARNING_MESSAGE);
        }    
        
    }//GEN-LAST:event_btn_send_pro_invActionPerformed

    public void ClearCustomerForm(){
        txt_customer_name.setText("");
        txt_customer_lastname.setText("");
        txt_customer_adress.setText("");
        txt_customer_email.setText("");
        txt_customer_count_number.setText("");
        txt_monthly_money.setText("");
        rb_credit.setSelected(false);
        rb_debit.setSelected(false);
    }
    
     public void ClearProductsForm(){
        txt_product_name.setText("");
        txt_product_line.setText("");
        cb_section_product.setSelectedItem(0);
        cb_lenght_product.setSelectedItem(0);
        txt_product_price.setText("");
        txt_product_quantity.setText("");
    }
     
    public void ClearShippingCar(){
        txt_product_buy.setText("");
        txt_available_quant.setText("");
        txt_product_price_sale.setText("");
        txt_quantity_buy.setText("");
        txt_total_price.setText("");
    }
    
    
    
    public void Customer_list(){
         DefaultListModel list = new DefaultListModel();
         int list_index = 0,con_cus=1;
         for(EcommercessData cust: CustomerObjectList){
             String customer_reg = "Registro #"+con_cus+":"+cust.getCustomer_name()+" - "+cust.getCustomer_lastname()+" - "+cust.getCustomer_email()+" - "+cust.getCustomer_adress()
                     +" - "+cust.getCredit_card()+" - "+cust.getMonthly_money()+" - "+cust.getCustomer_count_num();
             list.add(list_index,customer_reg);
             list_index++;
             con_cus++;
         }
         customer_list.setModel(list);
    }
    
     public void Products_list(){
         DefaultListModel list_2 = new DefaultListModel();
         int list_index_2 = 0;
         for(InventorydClass pro: ProductsObjectList){
             String product_reg_2 = "Código:"+pro.getProduct_code()+" del producto: "+pro.getProduct_name()+" linea "+pro.getProduct_line()+"-"+pro.getProduct_section()+"-"+pro.getProduct_quantity()+"-"+pro.getProduct_price()
                                    +"-"+pro.getProduct_lenght();
             list_2.add(list_index_2,product_reg_2);
             list_index_2++;
         }
         products_list.setModel(list_2);
    }
     
     public void Shopping_list(){
         DefaultListModel list_3 = new DefaultListModel();
         int list_index_3=0;
          for(EcommercessData cust: CustomerObjectList){
              String Buy_product ="El Cliente: "+cust.getCustomer_name()+"  "+cust.getCustomer_lastname()+" Ha invertido en la tienda con su cuenta: "
                      +cust.getCustomer_count_num();
              list_3.add(list_index_3,Buy_product);
              list_index_3++;
          }
         shopping_list.setModel(list_3);
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
            java.util.logging.Logger.getLogger(Pro_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pro_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pro_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pro_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pro_Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Código;
    private javax.swing.JTabbedPane Form;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add_car;
    private javax.swing.JButton btn_add_product;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete_car;
    private javax.swing.JButton btn_delete_product;
    private javax.swing.JButton btn_modify;
    private javax.swing.JButton btn_modify_product;
    private javax.swing.JButton btn_send;
    private javax.swing.JButton btn_send_count;
    private javax.swing.JButton btn_send_pro_inv;
    private javax.swing.JButton btn_send_product;
    private javax.swing.JButton btn_total_price;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_lenght_product;
    private javax.swing.JComboBox<String> cb_section_product;
    private javax.swing.JList<String> customer_list;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JList<String> products_list;
    private javax.swing.JRadioButton rb_credit;
    private javax.swing.JRadioButton rb_debit;
    private javax.swing.JList<String> shopping_list;
    private javax.swing.JTextField txt_available_money;
    private javax.swing.JTextField txt_available_quant;
    private javax.swing.JTextField txt_code_buy;
    private javax.swing.JTextField txt_cust_count_buy;
    private javax.swing.JTextField txt_cust_lastname_buy;
    private javax.swing.JTextField txt_cust_name_buy;
    private javax.swing.JTextField txt_customer_adress;
    private javax.swing.JTextField txt_customer_count_number;
    private javax.swing.JTextField txt_customer_email;
    private javax.swing.JTextField txt_customer_lastname;
    private javax.swing.JTextField txt_customer_name;
    private javax.swing.JTextField txt_monthly_money;
    private javax.swing.JTextField txt_product_buy;
    private javax.swing.JTextField txt_product_code;
    private javax.swing.JTextField txt_product_line;
    private javax.swing.JTextField txt_product_name;
    private javax.swing.JTextField txt_product_price;
    private javax.swing.JTextField txt_product_price_sale;
    private javax.swing.JTextField txt_product_quantity;
    private javax.swing.JTextField txt_quantity_buy;
    private javax.swing.JTextField txt_total_price;
    private javax.swing.JTextField txt_unit_product;
    // End of variables declaration//GEN-END:variables

 
}

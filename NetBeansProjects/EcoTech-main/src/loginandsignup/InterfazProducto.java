package loginandsignup;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.ini4j.Wini;

public class InterfazProducto extends javax.swing.JFrame {

    public InterfazProducto() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("PRODUCTO");
        modelo.addColumn("PRECIO");
        modelo.addColumn("STOCK");
        jTable1.setModel(modelo);
        
        productosPorCategoria=new HashMap<>();
        
        BoxBusqueda.removeAllItems();
        BoxBusqueda.addItem("Parlantes");
        BoxBusqueda.addItem("Auriculares");
        BoxBusqueda.addItem("Cables");
        BoxBusqueda.addItem("Computadoras");
        BoxBusqueda.addItem("Componentes");
        BoxBusqueda.addItem("Celulares");
        
        cargarIni();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BoxBusqueda = new javax.swing.JComboBox<>();
        ButEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("LISTA DE PRODUCTOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PRODUCTO", "PRECIO", "STOCK"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carrito");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setText("PRODUCTO");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("PRECIO");

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("STOCK");

        jButton2.setText("GUARDAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel5.setText("ECOTECH");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setText("<html>   <h2>Agregar Productos al Catálogo</h2>   <p>Para agregar <strong>PRODUCTOS</strong> nuevos al <strong>CATÁLOGO</strong>:</p>   <p>Completa los parámetros agregando <strong>\"Nombre de Producto\"</strong>, <strong>Precio</strong> y <strong>Stock Disponible</strong> y presiona el <strong>BOTÓN GRABAR</strong>.</p>   <p>Si deseas agregar aún más productos, presiona el <strong>BOTÓN \"NUEVO\"</strong>.</p> </html>");

        BoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auriculares", "Cables", "Computadoras", "Componentes", "Celulares", "Parlantes" }));
        BoxBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBusquedaActionPerformed(evt);
            }
        });

        ButEliminar.setText("Eliminar");
        ButEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 24, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ButEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(42, 42, 42))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(ButEliminar))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String producto = jTextField1.getText();
    String precio = jTextField2.getText();
    String stock = jTextField3.getText();

    if (producto.isEmpty() || precio.isEmpty() || stock.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
    }

    try {
        Double.parseDouble(precio);
        Integer.parseInt(stock);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un número decimal y el stock un número entero.");
        return;
    }

    modelo.addRow(new Object[]{producto, precio, stock});

    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String producto = jTextField1.getText().trim();
        String precio = jTextField2.getText().trim();
        String stock = jTextField3.getText().trim();
        String categoria = (String) BoxBusqueda.getSelectedItem();

        if (producto.isEmpty() || precio.isEmpty() || stock.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        try {
            Double.parseDouble(precio);
            Integer.parseInt(stock);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El precio debe ser un número decimal y el stock un número entero.");
            return;
        }

        Object[] fila = new Object[]{producto, precio, stock};

        modelo.addRow(fila);

        productosPorCategoria.computeIfAbsent(categoria, k -> new java.util.ArrayList<>()).add(fila);

        guardarEnIni(producto, precio, stock, categoria);

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        Login SignUpFrame = new Login();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BoxBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBusquedaActionPerformed
        String categoriaSeleccionada = (String) BoxBusqueda.getSelectedItem();

        // Borrar tabla
        modelo.setRowCount(0);

        // Agregar productos filtrados
        if (productosPorCategoria.containsKey(categoriaSeleccionada)) {
            for (Object[] producto : productosPorCategoria.get(categoriaSeleccionada)) {
                modelo.addRow(producto);
            }
        }
    }//GEN-LAST:event_BoxBusquedaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CarritoInterfaz SignUpFrame = new CarritoInterfaz();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ButEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccioná un producto para eliminar.");
            return;
        }

        String nombreProducto = (String) jTable1.getValueAt(filaSeleccionada, 0);
        String precio = (String) jTable1.getValueAt(filaSeleccionada, 1);
        String stock = (String) jTable1.getValueAt(filaSeleccionada, 2);
        String categoria = (String) BoxBusqueda.getSelectedItem();

        // Eliminar de la tabla visual
        modelo.removeRow(filaSeleccionada);

        // Eliminar de la estructura interna
        if (productosPorCategoria.containsKey(categoria)) {
            productosPorCategoria.get(categoria).removeIf(p ->
                p[0].equals(nombreProducto) && p[1].equals(precio) && p[2].equals(stock));
        }

        // Eliminar del archivo ini
        try {
            File archivoIni = new File("productos.ini");
            if (!archivoIni.exists()) return;

            Wini ini = new Wini(archivoIni);
            ArrayList<String> seccionesAEliminar = new ArrayList<>();

            for (String seccion : ini.keySet()) {
                if (seccion.equals("global")) continue;

                String nom = ini.get(seccion, "nombre");
                String pre = ini.get(seccion, "precio");
                String sto = ini.get(seccion, "stock");
                String cat = ini.get(seccion, "categoria");

                if (nom.equals(nombreProducto) && pre.equals(precio) && sto.equals(stock) && cat.equals(categoria)) {
                    seccionesAEliminar.add(seccion);
                }
            }

            for (String sec : seccionesAEliminar) {
                ini.remove(sec);
            }

            ini.store();
            JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al eliminar del archivo INI: " + e.getMessage());
        }
    }//GEN-LAST:event_ButEliminarActionPerformed

    
    private void guardarEnIni(String producto, String precio, String stock, String categoria) {
    try {
        
        File archivoIni = new File ("productos.ini");
        if(!archivoIni.exists()){
            archivoIni.createNewFile();
        }
        
        Wini ini = new Wini(new java.io.File("productos.ini"));
        
        if(ini.get("global") == null){
            ini.add("global");
            ini.put("global", "contador", 0);
        }
        
        String contadorStr = ini.get("global", "contador");
        int contador;
        try {
            contador = Integer.parseInt(contadorStr);
        } catch (Exception e) {
            contador = 0;
        }

        contador++; 
      
        String seccion = "producto" + contador;

        ini.put(seccion, "nombre", producto);
        ini.put(seccion, "precio", precio);
        ini.put(seccion, "stock", stock);
        ini.put(seccion, "categoria", categoria);
        ini.put("global", "contador", contador);

        ini.store(); // guarda el archivo
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar en archivo INI: " + e.getMessage());
    }
}
    private void cargarIni() {
    try {
        File archivoIni = new File("productos.ini");
        if (!archivoIni.exists()) {
            return; // si no existe, no hacemos nada
        }

        Wini ini = new Wini(archivoIni);

        for (String seccion : ini.keySet()) {
            if (seccion.equals("global")) continue; // ignorar sección global

            String producto = ini.get(seccion, "nombre");
            String precio = ini.get(seccion, "precio");
            String stock = ini.get(seccion, "stock");
            String categoria = ini.get(seccion, "categoria");

            Object[] fila = new Object[]{producto, precio, stock};

            // Guardar en estructura
            productosPorCategoria.computeIfAbsent(categoria, k -> new ArrayList<>()).add(fila);
        }

        // Mostrar por defecto los productos de la primera categoría
        if (BoxBusqueda.getItemCount() > 0) {
            String categoriaInicial = (String) BoxBusqueda.getItemAt(0);
            modelo.setRowCount(0);
            if (productosPorCategoria.containsKey(categoriaInicial)) {
                for (Object[] fila : productosPorCategoria.get(categoriaInicial)) {
                    modelo.addRow(fila);
                }
            }
            BoxBusqueda.setSelectedItem(categoriaInicial);
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar productos desde INI: " + e.getMessage());
    }
}
    
private DefaultTableModel modelo;
private java.util.Map<String, java.util.List<Object[]>> productosPorCategoria = new java.util.HashMap<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxBusqueda;
    private javax.swing.JButton ButEliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

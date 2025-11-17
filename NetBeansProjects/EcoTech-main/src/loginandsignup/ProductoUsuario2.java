package loginandsignup;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.ini4j.Wini;

public class ProductoUsuario2 extends javax.swing.JFrame {
    
    private static CarritoInterfaz carritoGlobal = new CarritoInterfaz();
    
    public ProductoUsuario2() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();
        productosPorCategoria = new java.util.HashMap<>();
        cargarIni();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BoxBusqueda = new javax.swing.JComboBox<>();
        butAgregar = new javax.swing.JButton();
        butCarrito = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auriculares", "Cables", "Computadoras", "Componentes", "Celulares", "Parlantes" }));
        BoxBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBusquedaActionPerformed(evt);
            }
        });

        butAgregar.setText("Agregar al carrito");
        butAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAgregarActionPerformed(evt);
            }
        });

        butCarrito.setText("Ir al carrito");
        butCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCarritoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(BoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(butAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(butCarrito)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAgregar)
                    .addComponent(BoxBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCarrito))
                .addGap(58, 58, 58))
        );

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

    private void butAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAgregarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto.");
            return;
        }

        String nombre = (String) jTable1.getValueAt(filaSeleccionada, 0);
        String precioStr = (String) jTable1.getValueAt(filaSeleccionada, 1);

        double precio;
        try {
            precio = Double.parseDouble(precioStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Precio inválido.");
            return;
        }

        String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese la cantidad:", "1");
        int cantidad = 1;
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida.");
            return;
        }

        int stock = Integer.parseInt((String) jTable1.getValueAt(filaSeleccionada, 2));
        Producto producto = new Producto(nombre, precio, stock);

        carritoGlobal.setVisible(true);
        carritoGlobal.agregarProducto(producto, cantidad);
    }//GEN-LAST:event_butAgregarActionPerformed

    private void butCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCarritoActionPerformed
         int filaSeleccionada = jTable1.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un producto.");
        return;
    }

    String nombre = (String) jTable1.getValueAt(filaSeleccionada, 0);
    String precioStr = (String) jTable1.getValueAt(filaSeleccionada, 1);
    String stockStr = (String) jTable1.getValueAt(filaSeleccionada, 2);

    double precio;
    int stock;
    try {
        precio = Double.parseDouble(precioStr);
        stock = Integer.parseInt(stockStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error en los datos del producto.");
        return;
    }

    String cantidadStr = JOptionPane.showInputDialog(this, "Ingrese la cantidad:", "1");
    int cantidad = 1;
    try {
        cantidad = Integer.parseInt(cantidadStr);
        if (cantidad <= 0 || cantidad > stock) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida o mayor al stock disponible.");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Cantidad inválida.");
        return;
    }

    Producto producto = new Producto(nombre, precio, stock);

    carritoGlobal.setVisible(true);
    carritoGlobal.agregarProducto(producto, cantidad);
    }//GEN-LAST:event_butCarritoActionPerformed

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
    private javax.swing.JButton butAgregar;
    private javax.swing.JButton butCarrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

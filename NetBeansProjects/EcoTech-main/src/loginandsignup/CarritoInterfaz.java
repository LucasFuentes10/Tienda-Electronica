package loginandsignup;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CarritoInterfaz extends javax.swing.JFrame {

    private CarritoTableModel model = new CarritoTableModel();
    public CarritoInterfaz() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        BotEliminar = new javax.swing.JButton();
        BotFinCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(model
        );
        jScrollPane1.setViewportView(tabla);

        BotEliminar.setText("Eliminar seleccionado");
        BotEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotEliminarActionPerformed(evt);
            }
        });

        BotFinCompra.setText("Finalizar compra");
        BotFinCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotFinCompraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Total:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(BotEliminar)
                        .addGap(81, 81, 81)
                        .addComponent(BotFinCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotFinCompra)
                            .addComponent(BotEliminar))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotEliminarActionPerformed
        eliminarSeleccionado();
    }//GEN-LAST:event_BotEliminarActionPerformed

    private void BotFinCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotFinCompraActionPerformed
        finalizarCompra();
    }//GEN-LAST:event_BotFinCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
  
    public void agregarProducto(Producto p, int cantidad) {
        model.agregarItem(p, cantidad);
        actualizarTotal();
    }

    
    private void eliminarSeleccionado() {
        int row = tabla.getSelectedRow();
        if (row != -1) {
            model.eliminar(row);
            actualizarTotal();
        }
    }

    private void finalizarCompra() {
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío");
            return;
        }

        JOptionPane.showMessageDialog(this, "Compra realizada con éxito");
        model.vaciar();
        actualizarTotal();
    }

    private void actualizarTotal() {
        total.setText(String.format("Total: $%.2f", model.calcularTotal()));
    }

    // ====== Modelo de tabla ======
    private static class CarritoTableModel extends AbstractTableModel {
        private final String[] columns = {"Producto", "Cantidad", "Precio Unit.", "Subtotal"};
        private final List<Item> items = new ArrayList<>();

        @Override public int getRowCount() { return items.size(); }
        @Override public int getColumnCount() { return columns.length; }
        @Override public String getColumnName(int column) { return columns[column]; }

        @Override public Object getValueAt(int rowIndex, int columnIndex) {
            Item item = items.get(rowIndex);
            switch (columnIndex) {
                case 0: return item.producto.getNombre();
                case 1: return item.cantidad;
                case 2: return item.producto.getPrecio();
                case 3: return item.getSubtotal();
            }
            return null;
        }

        public void agregarItem(Producto p, int cantidad) {
            for (Item it : items) {
                if (it.producto.equals(p)) {
                    it.cantidad += cantidad;
                    fireTableDataChanged();
                    return;
                }
            }
            items.add(new Item(p, cantidad));
            fireTableDataChanged();
        }

        public void eliminar(int index) {
            items.remove(index);
            fireTableDataChanged();
        }

        public void vaciar() {
            items.clear();
            fireTableDataChanged();
        }

        public double calcularTotal() {
            return items.stream().mapToDouble(Item::getSubtotal).sum();
        }

        private static class Item {
            Producto producto;
            int cantidad;
            Item(Producto p, int c) { this.producto = p; this.cantidad = c; }
            double getSubtotal() { return producto.getPrecio() * cantidad; }
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotEliminar;
    private javax.swing.JButton BotFinCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}

package loginandsignup;

//------------------------------------------------------------------------------
import javax.swing.table.DefaultTableModel;
import org.ini4j.Wini;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

//------------------------------------------------------------------------------

public class Tienda_electronica_Interfaz extends javax.swing.JFrame {

    String [] id = new String[100];
    String [] nombre = new String[100];
    String [] contraseña = new String [100];
    
    int indice = 0;

    //--------------------------------------------------------------------------
    
    public Tienda_electronica_Interfaz() {
        initComponents();
         
        cargarUsuarios();
        
        configTabla();   
        
    }
    
    //--------------------------------------------------------------------------
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spCategoria = new javax.swing.JComboBox<>();
        TexID = new javax.swing.JTextField();
        TexNombre = new javax.swing.JTextField();
        ButGrabar = new javax.swing.JButton();
        ButNuevo = new javax.swing.JButton();
        ButEliminar = new javax.swing.JButton();
        ButProducto = new javax.swing.JButton();
        ButSalir = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Contraseña");

        spCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Empleado", "Admin" }));

        ButGrabar.setText("Grabar");
        ButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButGrabarActionPerformed(evt);
            }
        });

        ButNuevo.setText("Nuevo");
        ButNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButNuevoActionPerformed(evt);
            }
        });

        ButEliminar.setText("Eliminar");
        ButEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEliminarActionPerformed(evt);
            }
        });

        ButProducto.setText("Productos");
        ButProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButProductoActionPerformed(evt);
            }
        });

        ButSalir.setText("Salir");
        ButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSalirActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ButGrabar)
                                .addGap(56, 56, 56)
                                .addComponent(ButNuevo))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TexID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(ButEliminar)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButProducto)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButProducto)
                    .addComponent(ButSalir))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TexID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TexNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(spCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButGrabar)
                    .addComponent(ButNuevo)
                    .addComponent(ButEliminar))
                .addGap(19, 19, 19))
        );

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Contraseña", "Nivel gerarquico"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //--------------------------------------------------------------------------
    
    private void ButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButGrabarActionPerformed
       DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
       
       id[indice] = TexID.getText();
       nombre[indice] = TexNombre.getText();
       contraseña[indice] = jPasswordField1.getText();
       
       String categoria = spCategoria.getSelectedItem().toString();
       
       model.addRow(new Object[]{id[indice], nombre[indice], contraseña[indice], categoria});
       
       indice++;
       
       try {
           String ruta = "Usuarios.ini";
           File archivo = new File(ruta);
           if (!archivo.exists()){
               archivo.createNewFile();
           }
            Wini ini = new Wini(archivo);
    
            String seccion = "usuario" + (indice - 1);
    
            ini.put(seccion, "id", id[indice - 1]);
            ini.put(seccion, "nombre", nombre[indice - 1]);
            ini.put(seccion, "contraseña", contraseña[indice - 1]);
            ini.put(seccion, "categoria", categoria);
    
            ini.store();
            JOptionPane.showMessageDialog(this, "Usuario guardado correctamente.");
            
        }catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo INI.");
        }

    }//GEN-LAST:event_ButGrabarActionPerformed
    
    //--------------------------------------------------------------------------
    
    private void ButNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButNuevoActionPerformed
        
        TexID.setText("");
        TexNombre.setText("");
        jPasswordField1.setText("");
        spCategoria.setSelectedIndex(0);       
        
    }//GEN-LAST:event_ButNuevoActionPerformed

    //--------------------------------------------------------------------------
    
    private void ButEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEliminarActionPerformed
      int fila = Tabla.getSelectedRow();
    
        if (fila >= 0) {
            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        
            for (int i = fila; i < indice - 1; i++) {
                id[i] = id[i + 1];
                nombre[i] = nombre[i + 1];
                contraseña[i] = contraseña[i + 1];
            }
            indice--;
        
            model.removeRow(fila);

            try {
                String ruta = "Usuarios.ini";
                File archivo = new File(ruta);
                if (!archivo.exists()) {
                archivo.createNewFile();
            }
            Wini ini = new Wini(archivo);
            ini.clear();  

            for (int i = 0; i < indice; i++) {
                String seccion = "usuario" + i;
                ini.put(seccion, "id", id[i]);
                ini.put(seccion, "nombre", nombre[i]);
                ini.put(seccion, "contraseña", contraseña[i]);
                ini.put(seccion, "categoria", model.getValueAt(i, 3).toString());  
            }

            ini.store();
            JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.");

            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al eliminar el usuario del archivo.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        }
    }//GEN-LAST:event_ButEliminarActionPerformed

    private void ButProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButProductoActionPerformed
        // TODO add your handling code here:
       InterfazProducto InterfazProductoFrame = new InterfazProducto();
        InterfazProductoFrame.setVisible(true);
        InterfazProductoFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButProductoActionPerformed

    private void ButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSalirActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ButSalirActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

  //----------------------------------------------------------------------------

    private void configTabla(){
         
        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.setColumnIdentifiers(new String[] {"id","nombre","contraseña","categoria"});
         
    }
    private void cargarUsuarios(){
        try{
            File archivo = new File("Usuarios.ini");
            if (!archivo.exists()){
                System.out.println("No existe el archivo");
                System.out.println("Ruta absoluta: " + new File("Usuarios.ini").getAbsolutePath());
                return;
            }
            Wini ini = new Wini (archivo);
            
            for(int i = 0; ;i++){
                String seccion = "usuario" + i;
                
                if(!ini.containsKey(seccion)){
                    indice = i;
                    break;
                }
                String idLeido = ini.get(seccion, "id");
                String nombreLeido = ini.get(seccion, "nombre" );
                String contraseñaLeido = ini.get(seccion, "contraseña" );
                String categoriaLeido = ini.get(seccion, "categoria" );
                
                System.out.println("ID"+idLeido);
                System.out.println("Nombre"+nombreLeido);
                System.out.println("Contraseña"+contraseñaLeido);
                System.out.println("Categoria"+categoriaLeido);
                
                DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
                model.addRow(new Object[]{idLeido, nombreLeido, contraseñaLeido, categoriaLeido});
                indice++;
            }
        }catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo");
        }
    }
 
    //-------------------------------------------------------------------------- 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButEliminar;
    private javax.swing.JButton ButGrabar;
    private javax.swing.JButton ButNuevo;
    private javax.swing.JButton ButProducto;
    private javax.swing.JButton ButSalir;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TexID;
    private javax.swing.JTextField TexNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> spCategoria;
    // End of variables declaration//GEN-END:variables
}

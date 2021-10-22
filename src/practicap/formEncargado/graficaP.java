/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicap.formEncargado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Chaka
 */
public class graficaP extends javax.swing.JInternalFrame {

    /**
     * Creates new form graficaP
     */
    public graficaP() {
        initComponents();
        select.removeAllItems();
        select.addItem("Cosulta de Examenes ");
        select.addItem("Consulta de Compañias de Seguros");

        
        
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        select = new javax.swing.JComboBox<>();

        setVisible(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //Consultamos la db para contar y obtener las causas y sus valores
        comTabla();
        //Cargamos los procentajes y porcentajes acumulados
        comTablaS();

        
        
        /// Creamos el dataset
        
        DefaultPieDataset pieGrafica = new DefaultPieDataset();
        
        ////Añadimos los elementos       
        DefaultTableModel tabVar = (DefaultTableModel) tabla.getModel();
        
        double porcentaje;
        String dato;
        String dVariable;
        
        for (int i = 0; i < tabVar.getRowCount(); i++) {
            
            dato=String.valueOf(tabVar.getValueAt(i, 1));
            
            dVariable=String.valueOf(tabVar.getValueAt(i, 2));
            
            porcentaje=Double.valueOf(dVariable);
            
            pieGrafica.setValue(dato, porcentaje);

        }
        
   
        
        ///Creamos el grafico
        
        JFreeChart ch = ChartFactory.createPieChart("grafico",pieGrafica, true, true, false);
         
        /// Lo mostramos en pantalla
        ChartPanel cp = new ChartPanel(ch);
        add(cp);
        cp.setBounds(500,40,500,400);
        
        /////FIN
        //LAS PELOTAS :D
        //AHORA MODIFICAMOS EL EXEL CON LOS VALORES
        

       
        
    }//GEN-LAST:event_jButton1ActionPerformed


    
    public void comTablaS(){
        DefaultTableModel tabVar = (DefaultTableModel) tabla.getModel();
        int ctFilas=tabla.getRowCount();
        double porCons=0;
        int varTabla;
        
        //Sacamos el valor del 1% sumando todos los valores
        
        for (int i = 0; i < tabVar.getRowCount(); i++) {
            String a=String.valueOf(tabVar.getValueAt(i, 0));
            varTabla=Integer.valueOf(a);
            porCons=porCons+varTabla;
        }
        
        porCons=porCons/100;
        
        //Con el valor del 1% calculamos el porcentaje de cada elemento y su porcentaje total
    
        int porVari;
        double porFin;
        double porTotal=0;
        
        
        for (int i = 0; i < tabVar.getRowCount(); i++) {
            String a=String.valueOf(tabVar.getValueAt(i, 0));         
            porVari=Integer.valueOf(a);
            porFin=porVari/porCons;
            porTotal=porTotal+porFin;
            tabVar.setValueAt(porFin, i, 2);
            tabVar.setValueAt(porTotal, i, 3);     
        }
        
        //Cargamos el nuevo modelo de tabla ya modificado
        
        tabla.setModel(tabVar);
    }
    
    public void comTabla(){
            String sql = null;
            if (select.getSelectedIndex() == 0) {
                sql="SELECT count(TExamen),tipoExamen from examen,catalogotarifa where TExamen=id group by TExamen;";
            }else{
                sql="SELECT count(Compañia),Nombre from formaseguro,listadocompanias where Compañia=idCompanias group by Compañia;";
            }
            
            try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantCol = rsMD.getColumnCount();
            modelo.addColumn("Datos Recolectados");
            modelo.addColumn("Causa/Problema/Fenomeno");          
            modelo.addColumn("Porcentaje");
            modelo.addColumn("Porcentaje Acumulado");

            while (rs.next()) {

                Object[] filas = new Object[cantCol];
                for (int i = 0; i < cantCol; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                
                modelo.addRow(filas);
            }     

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
            
        
    }
    
    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            
        DefaultTableModel tabVar = (DefaultTableModel) tabla.getModel();
        try {
            
            
            FileInputStream exel = new FileInputStream(new File("E:\\pareto.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(exel);
            XSSFSheet sheet = wb.getSheetAt(0);
            
            
            
            String cant;
            String causa;
            
            for (int i = 0; i < tabVar.getRowCount(); i++) {
                
                cant=String.valueOf(tabVar.getValueAt(i, 0));
                causa=String.valueOf(tabVar.getValueAt(i, 1));
                
                XSSFRow fila = sheet.getRow(i+2);     
                XSSFCell celda = fila.createCell(0);
                
                celda.setCellValue(causa);
                
                XSSFRow fila2 = sheet.getRow(i+2);     
                XSSFCell celda2 = fila.createCell(1);
                
                celda2.setCellValue(Integer.valueOf(cant));

                
            }
            
            
            
            exel.close();
            
            FileOutputStream exelModificado = new FileOutputStream("E:\\paretoM.xlsx");
            wb.write(exelModificado);
            exelModificado.close();

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(graficaP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(graficaP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
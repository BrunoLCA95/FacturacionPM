/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicap.formEmpleado;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Chaka
 */
public class plantillaFactura {
    
    String nombreP;
    String direccionP;
    String numeroF;
    String fecha;
    String compSeguro;
    String totalFactura;
    String descripcion;
    String tarifaP;
    String tarifaS;
    Document documento;
    FileOutputStream fichero;
    Paragraph titulo;
    

    public plantillaFactura(String nombreP, String direccionP, String numeroF, String fecha, String compSeguro, String totalFactura, String descripcion, String tarifaP, String tarifaS) {
        this.nombreP = nombreP;
        this.direccionP = direccionP;
        this.numeroF = numeroF;
        this.fecha = fecha;
        this.compSeguro = compSeguro;
        this.totalFactura = totalFactura;
        this.descripcion = descripcion;
        this.tarifaP = tarifaP;
        this.tarifaS = tarifaS;
        
        documento = new Document();
        titulo  = new Paragraph("Factura");
        
        
    }
    
    public void crearPDF(){
        try {
            fichero = new FileOutputStream(numeroF+".pdf");
            PdfWriter.getInstance(documento, fichero);
            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);
            documento.add(new Paragraph("Nombre del Paciente: "+nombreP));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Direccion del Paciente: "+direccionP));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Numero de Factura: "+numeroF));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha :"+fecha));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Compañia Aseguradora :"+compSeguro));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Total de la Factura: "+totalFactura));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Descripcion :"+descripcion));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Tarifa a Pagar el paciente: "+tarifaP));
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Tarifa a Pagar la Compañia de Seguro: "+tarifaS));
            
            
            documento.close();
            
        } catch (Exception e) {
        }
    }
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicap.formEmpleado;

import practicap.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Chaka
 */
public class consultasFactura {
    
    static String sql;
    
    public consultasFactura(){
        
    }
    
    public String consultaS(String consulta){
        String resultado = null;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConection();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                resultado=rs.getNString(1);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return resultado;
    }
    
    public int consultaI(String consulta){
        int resultado = 0;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConection();
            ps = con.prepareStatement(consulta);
            rs = ps.executeQuery();
            while (rs.next()) {
                resultado=rs.getInt(1);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return resultado;
    }    
    
    
    public int numeroPaciente(int numeroExamen){
        int numeroP;
        sql="select NPaciente from examen where NExamen="+numeroExamen;      ///NUMERO PACIENTE
        numeroP=consultaI(sql); 
        return numeroP;
    }
    
    public String nombrePaciente (int numeroPaciente){
        String nombreP;
        sql="select nombre from paciente where NPaciente="+numeroPaciente;     ///NOMBRE PACIENTE
        nombreP=consultaS(sql);
        return nombreP;
    }
    
    public String direccionPaciente (int numeroPaciente){
        String direccionP;
        sql="select direccion from paciente where NPaciente="+numeroPaciente;  ///DIRECCION PACIENTE
        direccionP=consultaS(sql);
        return direccionP;
    }
    
    public int numeroCompania (int numeroPaciente){
        int companiaN;
        sql="select Compañia from formaseguro where NPaciente="+numeroPaciente; ///NUMERO COMPAÑIA
        companiaN=consultaI(sql);
        return companiaN;
    }
    
    public String nombreCompania (int numeroCompania){
        String companiaNom;
        sql="select Nombre from listadocompanias where idCompanias="+numeroCompania; ///NOMBRE COMPAÑIA
        companiaNom=consultaS(sql);
        return companiaNom;
    }
    
    public String direccionCompania (int numeroCompania){
        String companiaD;
        sql="select Direccion from listadocompanias where idCompanias="+numeroCompania; ///DIRECCION COMPAÑIA
        companiaD=consultaS(sql);
        return companiaD;
    }
    
    public int planSeguro (int numeroCompania){
        int planS;
        sql="select Plan from listadocompanias where idCompanias="+numeroCompania;
        planS=consultaI(sql);
        return planS;
    }
    
    public int numeroMedico (int numeroExamen){
        int numeroM;
        sql="select NMedico from examen where NExamen="+numeroExamen;    ///NUMERO MEDICO
        numeroM=consultaI(sql);
        return numeroM;
    }
    
    public String nombreMedico(int numeroMedico){
        String nombreM;
        sql="select nombre from medico where NMedico="+numeroMedico;     ///NOMBRE MEDICO
        nombreM=consultaS(sql);
        return nombreM;
    }
    
    public int credencialMedico(int numeroMedico){
        int credencialM;
        sql="select credencial from medico where NMedico="+numeroMedico; ///CREDENCIAL MEDICO
        credencialM=consultaI(sql);
        return credencialM;
    }
    
    public int numeroTE(int numeroExamen){
        int tipoE;
        sql="select TExamen from examen where NExamen="+numeroExamen;    ///NUMERO DE TIPO DE EXAMEN
        tipoE=consultaI(sql);
        return tipoE;
    }
    
    public String nombreTExamen(int numeroTE){
        String nombreTE;
        sql="select tipoExamen from catalogotarifa where id="+numeroTE;   /////NUmero del tipo de examen
        nombreTE=consultaS(sql);
        return nombreTE;
    }
    
    public int tarifaExamen (int numeroTE){
        int tarifa;
        sql="select tarifa from catalogotarifa where id="+numeroTE;    ///TARIFA DE EXAMEN
        tarifa=consultaI(sql);
        return tarifa;
    }
    
    public int generarUpdate(String consulta){
        int numexamen = 0;    
        try {
            PreparedStatement ps = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConection();
            ps = con.prepareStatement(consulta,Statement.RETURN_GENERATED_KEYS);
            int rs = ps.executeUpdate();
            ResultSet nexamen = ps.getGeneratedKeys();
             if (nexamen.next()) {
                 numexamen=nexamen.getInt(1);
             }
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
        return numexamen;
    }
    
}

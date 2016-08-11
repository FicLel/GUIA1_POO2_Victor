/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sv.udb.utilidades;
import java.sql.*;
/**
 *
 * @author Casa
 */
public class Conexion {
    String url = "jdbc:mysql://localhost:3306/regivisitas";
    public Connection getconexion(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, "mysql","");
        }
        catch(Exception ex){
        }
        return cn;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.functions;
import com.microsoft.sqlserver.jdbc.*;
import br.com.infotech.connection.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gilberto
 */
public class login {
 
    
    public static Boolean logar(String Usuarios, String Senha) {
    
    String query = "select * from Usuario where userLogin ='"+Usuarios+"' and senha ='"+Senha+"';";

try{
        Connection conn=    br.com.infotech.connection.conn.obterConexão();
        
        Statement stmt = conn.createStatement();  
            
         
            ResultSet log = stmt.executeQuery(query);
        
            if(log.next()){
            
                   
                    return true;
            } 
            else {
                
                return false;
            }   
        }            
        catch(SQLException error){
                 JOptionPane.showMessageDialog(null,"Ocorreu Um Erro Na Conexao\n"+error.getLocalizedMessage()+" \n" +error.getSQLState()+"\n "+error.getMessage());
                 
        return false;
                }        
        
        
    }
          
}

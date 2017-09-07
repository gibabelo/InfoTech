/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotech.functions;

/**
 *
 * @author glber
 */
public class autenticadorAcesso {
    
    
   private  boolean  autenticLogin(int valor ){
   
       int val = valor;

       if(valor == 0){
       
       return true;
       
       }
       else {
        
          return false;
       
       }      
   }
    
  public boolean autencuadorDeLogin(int valor){
      return autenticLogin(valor);  
  } 
    
}

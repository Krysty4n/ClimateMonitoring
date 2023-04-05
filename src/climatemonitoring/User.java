/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climatemonitoring;
import java.io.*;
/**
 *
 * @author christianperri
 */
public class User {
        
   String nome;
   String cognome; 
   String codiceFiscale;
   String email; 
   String userName;
   String password;
   String centroMonitoraggio; 
   
   public User(String nome, String cognome, String codiceFiscale, String email, String userName, String password, String centroMonitoraggio) {
       this.nome = nome; 
       this.cognome = cognome; 
       this.codiceFiscale = codiceFiscale; 
       this.email= email;
       this.userName = userName; 
       this.password = password; 
       this.centroMonitoraggio = centroMonitoraggio; 
       
    
}
   public static void saveUser(User user){
       try{ 
           BufferedWriter bw = new BufferedWriter(new FileWriter("../data/OperatoriRegistrati.dati.txt", true));
           bw.write(user.userName + ":" + user.password+","+ user.nome+"," + user.cognome+","+ user.codiceFiscale+"," + user.email+";"+user.centroMonitoraggio +"\n");
                   bw.close();
       }catch(IOException e){
           e.printStackTrace(); 
       }
       
   }
   public static boolean userEmpty(User user){
       boolean condition = false; 
       if(user.nome.isBlank()){
           condition = true; 
           
       }
       if(user.cognome.isBlank()){
           condition = true;
           
       }
       if(user.codiceFiscale.isBlank()){
           condition = true;
           
       }
       if(user.email.isBlank()){
       condition = true; 
   }
        if(user.userName.isBlank()){
        condition = true;
     }
        if(user.password.isBlank()){
        condition = true; 
        
            
        }
        if(user.centroMonitoraggio.isBlank()){
            condition = true;
        }
        return condition;
   }
}

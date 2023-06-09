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
   
   public static boolean userContainSpace(User user){
       return user.userName.contains(" ");
      
   }
   public static boolean usernameCheck(User user){
   String line; 
   boolean condition = false; 
   try{
       BufferedReader br = new BufferedReader(new FileReader("../data/OperatoriRegistrati.dati.csv"));
       while((line = br.readLine())!= null){
           String[] sepLine = line.split(":");
           if(sepLine[0].equals(user.userName)){
               condition = true;
               break; 
               
           }
       }
   }catch (IOException e){
       e.printStackTrace();
   }
    return condition; 
    
   }
   public static void saveUser(User user){
       try{
           BufferedWriter bw = new BufferedWriter(new FileWriter("../data/OperatoriRegistrati.dati.txt",true));
           String str = user.userName + ":" + user.password + ":" + user.nome + "," + user.cognome+ "," + user.codiceFiscale+ "," + user.email+ "," + user.centroMonitoraggio + "\n";
           bw.write(str);
           bw.flush();
         
           bw.close();
       }catch (IOException e){
           e.printStackTrace();
           
       }
   }
}

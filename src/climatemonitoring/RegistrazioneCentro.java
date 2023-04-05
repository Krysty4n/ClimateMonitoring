/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climatemonitoring;

/**
 *
 * @author greta
 */
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class RegistrazioneCentro {

    private String nome;
    private String indirizzo;
    private List<String> aree;

    public RegistrazioneCentro(String nome, String indirizzo, List<String> aree) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.aree = aree;
    }


    public static void registraCentroAree(String nome, String indirizzo, List<String> aree) {
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("..data/OperatoriRegistrati.dati"));
            bw.write(nome + ";" + indirizzo + ";" + aree);
        bw.close();
        } catch(IOException e) {
            e.printStackTrace();  
        }
    }
}

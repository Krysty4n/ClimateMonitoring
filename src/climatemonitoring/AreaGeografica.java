/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climatemonitoring;

/**
 *
 * @author greta
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AreaGeografica {
    //campi
    private String area;
    private String stato;
    private String coord;

    //costruttori

    public AreaGeografica(String area, String stato, String coord) {
        this.area = area;
        this.stato = stato;
        this.coord = coord;
    }

    //metodi 

    public String cercaAreaGeografica(String area, String stato, String coord) {
            String line;
            try{
                BufferedReader br = new BufferedReader(new FileReader("../data/ClimateMonitoring.dati.csv"));
                while((line = br.readLine())!= null){
                    String[] splitLine = line.split(";");
                    if(splitLine[1].toLowerCase().contains(area.toLowerCase()) || splitLine[5].contains(coord)) {
                        stato = splitLine[4];
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            return stato;
        }
        
        
    }


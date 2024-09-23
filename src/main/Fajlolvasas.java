
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Fajlolvasas {
    public static void main(String[] args) throws IOException {
//        List<String> abszolut = Files.readAllLines(Path.of("C:\\Mappa\\fajl.txt"));
//        System.out.println("abszolut" + abszolut);
//        
//        List<String> relativ = Files.readAllLines(Path.of("relativ.txt"));
//        System.out.println("relativ" + relativ);
//        
        //List<String> res = Files.readAllLines(Path.of("relativ.txt"));
        //System.out.println("relativ" + relativ);
        InputStream is = Fajlolvasas.class.getClassLoader().getResourceAsStream("res/res.txt");
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        String sor;
        while((sor  = bf.readLine()) != null){
             System.out.println("sor:" + sor);
        }
       
    }
}

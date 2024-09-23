
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Kollekciok {
    static ArrayList<Integer> lista;
    static HashSet<Integer> kulonbozok;
    static HashMap<Integer, Integer> statisztika;
    
    public static void main(String[] args) {
        lista = new ArrayList<>();
        kulonbozok = new HashSet<>();
        statisztika = new HashMap<>();
        feltolt();
        System.out.println("Páros és páratlan:");
        kiir();
        System.out.println("\nCsak páros:");
        csakParos();
        kiir();
        System.out.println("\nKülönbözőek:");
        kulonbozoek();
        kulonbozoKiir();
        mibolmennyi();
    }

    private static void csakParos() {
        for (int i = lista.size()-1; i >= 0; i--) {
            if(lista.get(i) % 2 != 0){   
                lista.remove(i);
            }
        }
    }

    private static void feltolt() {
        for (int i = 0; i < 20; i++) {
            int veletlenSzam = (int) (Math.random()*21)+10;
            lista.add(veletlenSzam);
        }
    }

    private static void kiir() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
    }

    private static void kulonbozoKiir() {
        for (int szam : kulonbozok){
            System.out.print(szam + " ");
        }
        System.out.println("");
    }

    private static void kulonbozoek() {
        kulonbozok = new HashSet<>(lista);
    }
    
    private static void mibolmennyi(){
        
        for (int kulcs : lista) {
            if(statisztika.containsKey(kulcs)){
                int ertek = statisztika.get(kulcs);
                statisztika.put(kulcs, ++ertek);
            }else{
                statisztika.put(kulcs, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : statisztika.entrySet()) {
            int kulcs = entry.getKey();
            int ertek = entry.getValue();
            String s = "[%d] = %d%n".formatted(kulcs, ertek);
            System.out.printf(s);
        }
    }
    
}

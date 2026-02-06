package adapter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LecteurCSV {
    private List<String> lignes;
    
    public LecteurCSV(String nomFichier) {
        try {
            lignes = Files.readAllLines(Paths.get(nomFichier));
        } catch (IOException e) {
            throw new RuntimeException("Erreur lecture CSV", e);
        }
    }
    
    public String getLigne(int index) {
        if (index < 0 || index >= lignes.size()) {
            throw new IndexOutOfBoundsException("Index ligne hors limites: " + index);
        }
        return lignes.get(index);
    }
    
    public int getNbLignes() {
        return lignes.size();
    }
    
    public String[] getColonnes(int ligneIndex) {
        return getLigne(ligneIndex).split(",");
    }
}

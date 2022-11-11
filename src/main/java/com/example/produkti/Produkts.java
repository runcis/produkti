package com.example.produkti;

public class Produkts {

    public Produkts(String nosaukums, Double cena, String kategorija, String filename) {
        this.nosaukums = nosaukums;
        this.cena = cena;
        this.kategorija = kategorija;
        this.filename = filename;
    }

    public String getNosaukums() {
        return nosaukums;
    }

    public void setNosaukums(String nosaukums) {
        this.nosaukums = nosaukums;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String nosaukums;
    public String apraksts;
    public Double cena;
    public String kategorija;//augli-un-darzeni,gala-un-zivis,piena-produkti,konditoreja,uzkodas,dzerieni,saldumi,saldeti-edieni
    public String filename;
}

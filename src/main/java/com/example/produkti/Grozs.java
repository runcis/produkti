package com.example.produkti;

import java.util.List;

public class Grozs {
    public Grozs() {
    }

    public List<Produkts> getProdukti() {
        return produkti;
    }

    public void addProdukts(Produkts produkts) {
        this.produkti.add(produkts);
    }

    public List<Produkts> produkti;


}

package com.example.produkti;

import java.util.List;

public class Veikals {
    public Veikals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Produkts> getProdukti() {
        return produkti;
    }

    public void setProdukti(List<Produkts> produkti) {
        this.produkti = produkti;
    }

    public String name;
    public List<Produkts> produkti;

}

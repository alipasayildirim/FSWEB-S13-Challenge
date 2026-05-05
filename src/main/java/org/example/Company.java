package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
       setGiro(giro);
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro < 0 ? 0 : giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz index. Dizi sınırları dışında! (İstenen: " + index + ")");
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println(name + " developerNames dizisine eklendi.");
        } else {
            System.out.println("Hata: İlgili index (" + index + ") zaten dolu! Mevcut değer: " + developerNames[index]);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + java.util.Arrays.toString(developerNames) +
                '}';
    }
}

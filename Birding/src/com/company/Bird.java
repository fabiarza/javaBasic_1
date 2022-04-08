package com.company;

public class Bird {
    private String name;
    private String nameLatin;
    private int observations;

    public Bird(String name, String getNameLatin, int observations){
        this.name = name;
        this.nameLatin = getNameLatin;
        this.observations = observations;

    }

    public String getName() {
        return name;
    }

    public String getNameLatin() {
        return nameLatin;
    }

    public int getObservations() {
        return observations;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public void addObservation() {
        this.observations ++;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", nameLatin='" + nameLatin + '\'' +
                ", observations=" + observations +
                '}';
    }
}

package com.mycompany;

public class Zbozi {

    public String name;
    public String type;
    public String description;
    public String date;
    public Integer id;

    public Zbozi(
        Integer id,
        String name,
        String type,
        String description,
        String date
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString() {
        return (
            "Id: " +
            this.id +
            ", name: " +
            this.name +
            ", type: " +
            this.type +
            ", description: " +
            this.description +
            ", date: " +
            this.date
        );
    }
}

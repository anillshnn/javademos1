package Entities;

public class Coursier {
    private int id;
    public String name;
    public String lastName;


    public Coursier(){}
    public Coursier(int id,String name,String lastName){
        this.id=id;
        this.name=name;
        this.lastName=lastName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

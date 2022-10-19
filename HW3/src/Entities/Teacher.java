package Entities;

public class Teacher extends Coursier{
    String description; // about teachers lessons
    public Teacher(){}
    public Teacher(int id,String name,String lastName,String description){
        super(id,name,lastName);
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

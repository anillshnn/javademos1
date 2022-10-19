package Entities;

public class Course {
    private int id;
    public String name;
    String description;
    Category category;
    Teacher teacher;
    double price;

    public Course() {
    }

    public Course(int id, String name, String description, Category category, Teacher teacher, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.teacher = teacher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

package kodlama.io.rentACar.entities.concretes;

public class Brand {
    private int id;
    private String name;

    public Brand(int i, String audi) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Brand() {

    }
}

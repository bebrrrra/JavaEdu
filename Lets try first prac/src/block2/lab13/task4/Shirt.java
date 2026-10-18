package block2.lab13.task4;

public class Shirt {

    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirt) {
        String[] parts = shirt.split(",");

        id = parts[0];
        name = parts[1];
        color = parts[2];
        size = parts[3];
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nColor: " + color +
                "\nSize: " + size;
    }
}

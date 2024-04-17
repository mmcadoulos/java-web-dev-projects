package technology;

public abstract class AbstractEntity {
    private int id;
    private static int idCounter = 1000;
    public AbstractEntity(){
        this.id = idCounter;
        idCounter++;
    }

    public int getId() {
        return id;
    }
    public static int getIdCounter(){
        return idCounter;
    }
}

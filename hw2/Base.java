public abstract class Base implements Printable {
    private final int ID;

    public Base() {
        this.ID = IdGenerator.generateId();
    }

    public int getID() {
        return this.ID;
    }

}


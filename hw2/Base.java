public abstract class Base {
    protected int ID;

    public void print() {
        System.out.println("print content in console");
    };

    protected void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

}

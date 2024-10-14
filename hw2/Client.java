import enums.UserRole;

public class Client extends UserBase {
    public Client() {
        setRole(String.valueOf(UserRole.CLIENT));
    }

    public void getTicket(Ticket t) {
        System.out.println("Ticket " + t.getID() + " received by USER" + this.getID());
    }
}

import enums.UserRole;

public class Admin extends UserBase {
    public Admin() {
        setRole(String.valueOf(UserRole.ADMIN));
    }

    public void checkTicket(Ticket t) {
        System.out.println(
                "Ticket with ID " +
                t.getID() +
                " is checked by " +
                this.getRole() +
                " with ID" + this.getID()
        );
    }
}

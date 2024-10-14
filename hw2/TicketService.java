import java.util.HashMap;
import java.util.Map;

public class TicketService {
    private static Map<Integer, Ticket> tickets = new HashMap<>();

    public static void addTicket(Ticket ticket) {
        tickets.put(ticket.getID(), ticket);
    }

    public static Ticket getTicket(int id) {
        return tickets.get(id);
    }


    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(1, "Arena1", 101, System.currentTimeMillis(), false, 'A', 75.0f);
        Ticket ticket2 = new Ticket(2, "Arena2", 102, System.currentTimeMillis(), true, 'B', 80.0f);
        Ticket ticket3 = new Ticket(3, "Arena3", 103, System.currentTimeMillis(), false, 'C', 85.0f);

        addTicket(ticket1);
        addTicket(ticket2);
        addTicket(ticket3);

        ticket1.shared("88888");
        ticket2.shared("88888", "email@example.com");
        Client client = new Client();
        Admin admin = new Admin();
        client.getTicket(ticket1);
        admin.checkTicket(ticket2);
        admin.checkTicket(ticket3);

        System.out.println(ticket1);

        Ticket ticket = new Ticket();
    }
}

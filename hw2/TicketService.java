import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketService {
    private static Map<String, Ticket> tickets = new HashMap<>();

    public static void addTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }

    public static void main(String[] args) {
        Ticket empty = new Ticket();
        Ticket limited = new Ticket("Astana", 124, 14);
        Ticket full = new Ticket("145", "Astana", 412, 14, true, 'B', 12);

        addTicket(new Ticket("145", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("146", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("147", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("148", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("149", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("144", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("143", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("142", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("141", "Astana", 412, 14, true, 'B', 12));
        addTicket(new Ticket("140", "Astana", 412, 14, true, 'B', 12));

        empty.getInfo();
        limited.getInfo();
        full.getInfo();
    }
}

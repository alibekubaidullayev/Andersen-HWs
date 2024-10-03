public class TicketService {
    public static void main(String[] args) {
        Ticket empty = new Ticket();
        Ticket limited = new Ticket("Astana", 124, 14);
        Ticket full = new Ticket(
               "145", "Astana", 412, 14, true, 'B', 12);

        empty.getInfo();
        limited.getInfo();
        full.getInfo();
    }
}

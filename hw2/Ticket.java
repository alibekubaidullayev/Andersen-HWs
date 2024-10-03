public class Ticket {
    private String id;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private float maxAllowedWeight;
    private long createdAt;
    private double price;

    public Ticket() {
        setCreatedAt();
    }

    public Ticket(
            String id,
            String concertHall,
            int eventCode,
            long time,
            boolean isPromo,
            char stadiumSector,
            float maxAllowedWeight
    ) {

        setCreatedAt();
        setId(id);
        setHall(concertHall);
        setEventCode(eventCode);
        setTime(time);
        setIsPromo(isPromo);
        setStadiumSector(stadiumSector);
        setMaxAllowedWeight(maxAllowedWeight);
    }

    public Ticket(
            String concertHall,
            int eventCode,
            long time
    ) {

        setCreatedAt();
        setHall(concertHall);
        setEventCode(eventCode);
        setTime(time);
    }

    private void setCreatedAt() {
        this.createdAt = System.currentTimeMillis();
    }

    private void setId(String newId) {
        if(newId.length() > 4) {
            throw new IllegalArgumentException("ID should be no longer than 4 characters");
        } else {
            this.id = newId;
        }
    }

    private void setHall(String hall) {
        if(hall.length() > 10) {
            throw new IllegalArgumentException("Hall should be no longer than 10 characters");
        } else {
            this.concertHall = hall;
        }
    }

    private void setEventCode(int newEventCode) {
        if(newEventCode < 100 || newEventCode > 999) {
            throw new IllegalArgumentException("Event code should have 3 digits");
        }
        else {
            this.eventCode = newEventCode;
        }
    }

    private void setTime(long newTime) {
        this.time = newTime;
    }

    private void setIsPromo(boolean isPromo) {
        this.isPromo = isPromo;
    }

    private void setStadiumSector(char stadiumSector) {
        if(stadiumSector < 'A' || stadiumSector > 'C') {
            throw new IllegalArgumentException("Stadium sector should be in range 'A' and 'C'");
        }
        else {
            this.stadiumSector = stadiumSector;
        }
    }

    private void setMaxAllowedWeight(float maxAllowedWeight) {
        this.maxAllowedWeight = maxAllowedWeight;
    }


    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public void getInfo() {
        System.out.println("");
        System.out.println("ID: " + this.id);
        System.out.println("Concert Hall: " + this.concertHall);
        System.out.println("Event Code: " + this.eventCode);
        System.out.println("Time: " + this.time);
        System.out.println("IsPromo: " + this.isPromo);
        System.out.println("Stadium Sector: " + this.stadiumSector);
        System.out.println("Max Allowed Weight: " + this.maxAllowedWeight);
        System.out.println("Price: " + this.price);
        System.out.println("Created At: " + this.createdAt);
    }

}

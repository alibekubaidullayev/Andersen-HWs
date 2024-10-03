
public class Ticket {
    private String id;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private float maxAllowedWeight;

    public Ticket() {}

    public Ticket(
            String id,
            String concertHall,
            int eventCode,
            long time,
            boolean isPromo,
            char stadiumSector,
            float maxAllowedWeight
    ) {

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
        setHall(concertHall);
        setEventCode(eventCode);
        setTime(time);
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

}

public class Event implements Comparable<Event> {

    private String eventName, type;
    private int rating;

    public Event(String eventName, String type, int rating) {
        this.eventName = eventName;
        this.type = type;
        this.rating = rating;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%s %s with %d ", eventName, type, rating);
    }

    @Override
    public int compareTo(Event event) {
        if (this.getType().compareToIgnoreCase(event.getType()) == 0)
            return
                    this.getEventName().compareToIgnoreCase(event.getEventName());
        else
            return getType().compareToIgnoreCase(event.getType());

    }
}

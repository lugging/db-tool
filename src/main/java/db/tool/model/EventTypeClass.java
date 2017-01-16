package db.tool.model;

import javax.persistence.*;

@Table(name = "event_type_class")
public class EventTypeClass {
    @Id
    @Column(name = "EVENT_CLASS")
    private String eventClass;

    /**
     * @return EVENT_CLASS
     */
    public String getEventClass() {
        return eventClass;
    }

    /**
     * @param eventClass
     */
    public void setEventClass(String eventClass) {
        this.eventClass = eventClass == null ? null : eventClass.trim();
    }
}
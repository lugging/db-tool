package db.tool.model;

import javax.persistence.*;

public class Counter {
    @Id
    @Column(name = "COUNTER")
    private String counter;

    @Column(name = "COUNTER_TYPE")
    private String counterType;

    /**
     * @return COUNTER
     */
    public String getCounter() {
        return counter;
    }

    /**
     * @param counter
     */
    public void setCounter(String counter) {
        this.counter = counter == null ? null : counter.trim();
    }

    /**
     * @return COUNTER_TYPE
     */
    public String getCounterType() {
        return counterType;
    }

    /**
     * @param counterType
     */
    public void setCounterType(String counterType) {
        this.counterType = counterType == null ? null : counterType.trim();
    }
}
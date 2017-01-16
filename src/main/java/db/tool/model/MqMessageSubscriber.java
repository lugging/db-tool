package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mq_message_subscriber")
public class MqMessageSubscriber {
    @Id
    @Column(name = "MESSAGE_ID")
    private String messageId;

    @Column(name = "ROUTE_BO_TYPE")
    private String routeBoType;

    @Column(name = "ROUTE_BO_ID")
    private String routeBoId;

    @Column(name = "TIME_CREATED")
    private Date timeCreated;

    /**
     * @return MESSAGE_ID
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @param messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    /**
     * @return ROUTE_BO_TYPE
     */
    public String getRouteBoType() {
        return routeBoType;
    }

    /**
     * @param routeBoType
     */
    public void setRouteBoType(String routeBoType) {
        this.routeBoType = routeBoType == null ? null : routeBoType.trim();
    }

    /**
     * @return ROUTE_BO_ID
     */
    public String getRouteBoId() {
        return routeBoId;
    }

    /**
     * @param routeBoId
     */
    public void setRouteBoId(String routeBoId) {
        this.routeBoId = routeBoId == null ? null : routeBoId.trim();
    }

    /**
     * @return TIME_CREATED
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * @param timeCreated
     */
    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}
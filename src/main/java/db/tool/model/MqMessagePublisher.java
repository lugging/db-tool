package db.tool.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mq_message_publisher")
public class MqMessagePublisher {
    @Id
    @Column(name = "MESSAGE_ID")
    private String messageId;

    @Column(name = "DOCKER_ID")
    private String dockerId;

    @Column(name = "ROUTE_BO_TYPE")
    private String routeBoType;

    @Column(name = "ROUTE_BO_ID")
    private String routeBoId;

    @Column(name = "MESSAGE_TEXT")
    private String messageText;

    @Column(name = "TIME_CREATED")
    private Date timeCreated;

    @Column(name = "DESTINATION")
    private String destination;

    @Column(name = "MESSAGE_MODE")
    private Integer messageMode;

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
     * @return DOCKER_ID
     */
    public String getDockerId() {
        return dockerId;
    }

    /**
     * @param dockerId
     */
    public void setDockerId(String dockerId) {
        this.dockerId = dockerId == null ? null : dockerId.trim();
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
     * @return MESSAGE_TEXT
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * @param messageText
     */
    public void setMessageText(String messageText) {
        this.messageText = messageText == null ? null : messageText.trim();
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

    /**
     * @return DESTINATION
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    /**
     * @return MESSAGE_MODE
     */
    public Integer getMessageMode() {
        return messageMode;
    }

    /**
     * @param messageMode
     */
    public void setMessageMode(Integer messageMode) {
        this.messageMode = messageMode;
    }
}
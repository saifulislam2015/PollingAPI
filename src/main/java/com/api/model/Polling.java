package com.api.model;

import com.api.model.PollingPK;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "POLLING_STATUS")
public class Polling {

    private PollingPK pK;
    private int latency;
    private String type;
    private String status;
    private String message;


    @EmbeddedId
    @AttributeOverrides(value = {
            @AttributeOverride(name = "_deviceId", column = @Column(name = "DeviceId")),
            @AttributeOverride(name = "_dateTime", column = @Column(name = "CreatedTime")),
            @AttributeOverride(name = "_data", column = @Column(name = "Data"))
    })
    public PollingPK get_pK() {
        return pK;
    }
    public void set_pK(PollingPK pK) {
        this.pK = pK;
    }

    @Column(name = "Latency")
    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    @Column(name = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Polling() {
    }
}


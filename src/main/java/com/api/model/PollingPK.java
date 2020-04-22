package com.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PollingPK  implements Serializable {
    private String _deviceId;
    private String _dateTime;
    private String _data;

    @Column(name = "DeviceId")
    public String get_deviceId() {
        return _deviceId;
    }

    public void set_deviceId(String _deviceId) {
        this._deviceId = _deviceId;
    }
    @Column(name = "CreatedTime")
    public String get_dateTime() {
        return _dateTime;
    }

    public void set_dateTime(String _dateTime) {
        this._dateTime = _dateTime;
    }
    @Column(name = "Data")
    public String get_data() {
        return _data;
    }

    public void set_data(String _ChannelId) {
        this._data = _ChannelId;
    }

    public PollingPK() {
    }

    public PollingPK(String id, String dt, String cid) {
        this._deviceId = id;
        this._dateTime = dt;
        this._data = cid;
    }

}

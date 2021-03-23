package io.invest_api.invest_api;

public class ResponseRegistrer {
    private String trackingId;
    private String status;
    private PayloadRegistar payload;


    public ResponseRegistrer (String trackingId, String status, PayloadRegistar payload){
        this.trackingId = trackingId;
        this.status = status;
        this.payload = payload;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PayloadRegistar getPayload() {
        return payload;
    }

    public void setPayload(PayloadRegistar payload) {
        this.payload = payload;
    }
}

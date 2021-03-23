package io.invest_api.invest_api;

public class PayloadRegistar {
    private String brokerAccountType;
    private String brokerAccountId;

    public PayloadRegistar(String brokerAccountType, String brokerAccountId){
        this.brokerAccountType = brokerAccountType;
        this.brokerAccountId = brokerAccountId;
    }

    public String getBrokerAccountId() {
        return brokerAccountId;
    }

    public String getBrokerAccountType() {
        return brokerAccountType;
    }

    public void setBrokerAccountId(String brokerAccountId) {
        this.brokerAccountId = brokerAccountId;
    }

    public void setBrokerAccountType(String brokerAccountType) {
        this.brokerAccountType = brokerAccountType;
    }
}

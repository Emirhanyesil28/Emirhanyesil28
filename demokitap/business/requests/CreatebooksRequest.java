package com.example.demokitap.business.requests;

public class CreatebooksRequest {
    private double okuyucudeger;

    public CreatebooksRequest(double okuyucudeger) {
        this.okuyucudeger = okuyucudeger;
    }

    public double getOkuyucudeger() {
        return okuyucudeger;
    }

    public void setOkuyucudeger(double okuyucudeger) {
        this.okuyucudeger = okuyucudeger;
    }
}

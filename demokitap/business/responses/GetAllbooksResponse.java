package com.example.demokitap.business.responses;

public class GetAllbooksResponse {
    private int kitapid;
    private String kitapadi;
    private String yazar;
    private int yayinyili;
    private double okuyucudeger;
    private String tur;

    public GetAllbooksResponse() {
        this.kitapid = kitapid;
        this.kitapadi = kitapadi;
        this.yazar = yazar;
        this.yayinyili = yayinyili;
        this.okuyucudeger = okuyucudeger;
        this.tur = tur;
    }

    public int getKitapid() {
        return kitapid;
    }

    public void setKitapid(int kitapid) {
        this.kitapid = kitapid;
    }

    public String getKitapadi() {
        return kitapadi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYayinyili() {
        return yayinyili;
    }

    public void setYayinyili(int yayinyili) {
        this.yayinyili = yayinyili;
    }

    public double getOkuyucudeger() {
        return okuyucudeger;
    }

    public void setOkuyucudeger(double okuyucudeger) {
        this.okuyucudeger = okuyucudeger;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}

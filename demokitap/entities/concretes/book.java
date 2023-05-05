package com.example.demokitap.entities.concretes;

import jakarta.persistence.*;

@Table(name = "books")
@Entity
public class book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int kitapid;
    @Column(name = "kitapadi")
    private String kitapadi;
    @Column(name = "yazar")
    private String yazar;
    @Column(name = "yayinyili")
    private int yayinyili;
    @Column(name = "okuyucudeger")
    private double okuyucudeger;
    @Column(name = "tur")
    private String tur;





    public book(int kitapid, String kitapadi, String yazar, int yayinyili, double okuyucudeger, String tur) {
        this.kitapid = kitapid;
        this.kitapadi = kitapadi;
        this.yazar = yazar;
        this.yayinyili = yayinyili;
        this.okuyucudeger = okuyucudeger;
        this.tur = tur;
    }

    public book() {

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

    public int getKitapid() {
        return kitapid;
    }

    public void setKitapid(int kitapid) {
        this.kitapid = kitapid;
    }




}

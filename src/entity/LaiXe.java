/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class LaiXe implements Serializable{
    private int maLX;
    private String hten, dchi, trinhdo;

    public LaiXe() {
    }

    public LaiXe(int maLX, String hten, String dchi, String trinhdo) {
        this.maLX = maLX;
        this.hten = hten;
        this.dchi = dchi;
        this.trinhdo = trinhdo;
    }

    public int getMaLX() {
        return maLX;
    }

    public void setMaLX(int maLX) {
        this.maLX = maLX;
    }

    public String getHten() {
        return hten;
    }

    public void setHten(String hten) {
        this.hten = hten;
    }
    public String getDchi() {
        return dchi;
    }


    public void setDchi(String dchi) {
        this.dchi = dchi;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public Object[] toObject(){
        return new Object[]{maLX, hten, dchi, trinhdo};
    }
}

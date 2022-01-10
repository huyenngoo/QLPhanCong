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
public class QuanLy implements Serializable{
    private int maLX, maT, soluot;

    public QuanLy() {
    }

    public QuanLy(int maLX, int maT, int soluot) {
        this.maLX = maLX;
        this.maT = maT;
        this.soluot = soluot;
    }

    public int getMaLX() {
        return maLX;
    }

    public void setMaLX(int maLX) {
        this.maLX = maLX;
    }

    public int getMaT() {
        return maT;
    }

    public void setMaT(int maT) {
        this.maT = maT;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }
    public Object[] toObject(){
        return new Object[]{maLX, maT, soluot};
    }
}

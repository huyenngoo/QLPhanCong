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
public class Tuyen implements Serializable{
    private int maT, khoangcach, sodiemdung;

    public Tuyen() {
    }

    public Tuyen(int maT, int khoangcach, int sodiemdung) {
        this.maT = maT;
        this.khoangcach = khoangcach;
        this.sodiemdung = sodiemdung;
    }

    public int getMaT() {
        return maT;
    }

    public void setMaT(int maT) {
        this.maT = maT;
    }

    public int getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(int khoangcach) {
        this.khoangcach = khoangcach;
    }

    public int getSodiemdung() {
        return sodiemdung;
    }

    public void setSodiemdung(int sodiemdung) {
        this.sodiemdung = sodiemdung;
    }
    public Object[] toObject(){
        return new Object[]{maT, khoangcach, sodiemdung};
    }
   
}

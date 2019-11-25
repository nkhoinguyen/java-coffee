/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

import java.io.Serializable;

/**
 *
 * @author MT
 */
public class DoUong implements Serializable {
    private int maDoUong;
    private int maLoaiDoUong;
    private String tenDoUong;
    private int gia;
    private int soLuong;

    public DoUong() {
    }

    public DoUong(int maDoUong, int maLoaiDoUong, String tenDoUong, int gia, int soLuong) {
        this.maDoUong = maDoUong;
        this.maLoaiDoUong = maLoaiDoUong;
        this.tenDoUong = tenDoUong;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getMaDoUong() {
        return maDoUong;
    }

    public void setMaDoUong(int maDoUong) {
        this.maDoUong = maDoUong;
    }

    public int getMaLoaiDoUong() {
        return maLoaiDoUong;
    }

    public void setMaLoaiDoUong(int maLoaiDoUong) {
        this.maLoaiDoUong = maLoaiDoUong;
    }

    public String getTenDoUong() {
        return tenDoUong;
    }

    public void setTenDoUong(String tenDoUong) {
        this.tenDoUong = tenDoUong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}

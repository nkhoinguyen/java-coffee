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
public class LoaiDoUong implements Serializable {
    private int maLoaiDoUong;
    private String tenLoaiDoUong;

    public LoaiDoUong() {
    }

    public LoaiDoUong(int maLoaiDoUong, String tenLoaiDoUong) {
        this.maLoaiDoUong = maLoaiDoUong;
        this.tenLoaiDoUong = tenLoaiDoUong;
    }

    public int getMaLoaiDoUong() {
        return maLoaiDoUong;
    }

    public void setMaLoaiDoUong(int maLoaiDoUong) {
        this.maLoaiDoUong = maLoaiDoUong;
    }

    public String getTenLoaiDoUong() {
        return tenLoaiDoUong;
    }

    public void setTenLoaiDoUong(String tenLoaiDoUong) {
        this.tenLoaiDoUong = tenLoaiDoUong;
    }
}

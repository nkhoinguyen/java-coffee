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
public class Ban implements Serializable {
    private int maBan;
    private boolean tinhTrang;
    private ListDoUong list;

    public Ban() {
        tinhTrang = false;
        list = new ListDoUong();
    }

    public Ban(int maBan, boolean tinhTrang, ListDoUong list) {
        this.maBan = maBan;
        this.tinhTrang = tinhTrang;
        this.list = list;
    }

    public int getMaBan() {
        return maBan;
    }

    public void setMaBan(int maBan) {
        this.maBan = maBan;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public ListDoUong getList() {
        return list;
    }

    public void setList(ListDoUong list) {
        this.list = list;
    }
}

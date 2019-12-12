/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon implements Serializable {
    private String maHD;
    private Ban ban;
    private String ngay;
    
    public HoaDon(String maHD, Ban ban) {
        this.maHD = maHD;
        this.ban = ban;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        LocalDateTime now = LocalDateTime.now();   
        this.ngay = dtf.format(now);
    }

    public HoaDon() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        LocalDateTime now = LocalDateTime.now();   
        this.ngay = dtf.format(now);
    }

    public Ban getBan() {
        return ban;
    }

    public String getNgay() {
        return ngay;
    }

    public void setBan(Ban ban) {
        this.ban = ban;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
     
}

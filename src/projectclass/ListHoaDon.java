/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class ListHoaDon {
    private ArrayList<HoaDon> list;
    final String fileName = "HoaDon.txt";

    public ListHoaDon(ArrayList<HoaDon> list) {
        this.list = list;
    }

    public ListHoaDon() {
        list = new ArrayList<>();
    }

    public ArrayList<HoaDon> getList() {
        return list;
    }

    public void setList(ArrayList<HoaDon> list) {
        this.list = list;
    }
    
    public void insert(HoaDon hd){
        list.add(hd);
    }
    
    public void delete(HoaDon hd){
        for (HoaDon hoaDon : list) {
            if(hoaDon.getMaHD().equals(hd.getMaHD())) {
                list.remove(hoaDon);
                return;
            }
        }
    }
    
    public void update(HoaDon hd){
        for (HoaDon hoaDon : list) {
            if(hoaDon.getMaHD().equals(hd.getMaHD())) {
                hoaDon.setBan(hd.getBan());
                return;
            }
        }
    }
    
//    public void timkiem(HoaDon hd){
//        for (HoaDon hoaDon : list) {
//            if(hoaDon.getMaHD().equals(hd.getMaHD())) {
//                hoaDon.setBan(hd.getBan());
//                return;
//            }
//        }
//    }
    
    public String findTen(String ma) {
        for (HoaDon hoaDon : list) {
            if (hoaDon.getMaHD().equals(ma)) {
                return hoaDon.getMaHD();
            }
        }
        return "";
    }
    
    public ListHoaDon findDate(String date) {
        ListHoaDon lhd = new ListHoaDon();
        for (HoaDon hoaDon : list) {
            if (hoaDon.getNgay().split(" ")[0].equals(date)) {
                lhd.insert(hoaDon);
            }
        }
        return lhd;
    }
    
    public void ghiFile(){
        ReadWriteHoaDon rd = new ReadWriteHoaDon();
        rd.Write(list,fileName);
    }
    
    public void docFile() {
        ReadWriteHoaDon rw = new ReadWriteHoaDon();
        list = rw.Read(fileName);
    }
}

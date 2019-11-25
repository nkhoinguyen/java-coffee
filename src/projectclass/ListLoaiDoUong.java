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
 * @author MT
 */
public class ListLoaiDoUong {
    private ArrayList<LoaiDoUong> list;
    final String fileName = "LoaiDoUong.txt";

    public ListLoaiDoUong() {
        list = new ArrayList<LoaiDoUong>();
    }

    public ListLoaiDoUong(ArrayList<LoaiDoUong> list) {
        this.list = list;
    }

    public ArrayList<LoaiDoUong> getList() {
        return list;
    }

    public void setList(ArrayList<LoaiDoUong> list) {
        this.list = list;
    }
    
    public ArrayList<LoaiDoUong> select() {
        return list;
    }
    
    public void insert(LoaiDoUong loai) {
        list.add(loai);
    }
    
    public void delete(LoaiDoUong loai) {
        for (LoaiDoUong loaiDoUong : list) {
            if (loaiDoUong.getMaLoaiDoUong() == loai.getMaLoaiDoUong()) {
                list.remove(loaiDoUong);
            }
        }
    }
    
    public void update(LoaiDoUong loai) {
        for (LoaiDoUong loaiDoUong : list) {
            if (loaiDoUong.getMaLoaiDoUong() == loai.getMaLoaiDoUong()) {
                loaiDoUong.setTenLoaiDoUong(loai.getTenLoaiDoUong());
            }
        }
    }
    
    public int findMa(String ten) {
        for (LoaiDoUong loaiDoUong : list) {
            if (loaiDoUong.getTenLoaiDoUong() == ten) {
                return loaiDoUong.getMaLoaiDoUong();
            }
        }
        return -1;
    }
    
    public String findTen(int ma) {
        for (LoaiDoUong loaiDoUong : list) {
            if (loaiDoUong.getMaLoaiDoUong()== ma) {
                return loaiDoUong.getTenLoaiDoUong();
            }
        }
        return "";
    }
    
    public void ghiFile() {
        ReadWriteLoaiDoUong rw = new ReadWriteLoaiDoUong();
        rw.Write(list, fileName);
    }
    
    public void docFile() {
        ReadWriteLoaiDoUong rw = new ReadWriteLoaiDoUong();
        list = rw.Read(fileName);
    }
    
    public void sortByName() {
        Collections.sort(list, new Comparator<LoaiDoUong>() {
            public int compare(LoaiDoUong loai1, LoaiDoUong loai2) {
                return loai1.getTenLoaiDoUong().compareTo(loai2.getTenLoaiDoUong());
            }
        });
    }
    
    public void sortByMa() {
        Collections.sort(list, new Comparator<LoaiDoUong>() {
            public int compare(LoaiDoUong loai1, LoaiDoUong loai2) {
                int ma1 = loai1.getMaLoaiDoUong();
                int ma2 = loai2.getMaLoaiDoUong();
                if (ma1 == ma2) return 0;
                else if (ma1 > ma2) return 1;
                else return -1;
            }
        });
    }
}

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
public class ListDoUong {
    private ArrayList<DoUong> list;
    final  String fileName = "DoUong.txt";

    public ListDoUong() {
        list = new ArrayList<>();
    }

    public ListDoUong(ArrayList<DoUong> list) {
        this.list = list;
    }

    public ArrayList<DoUong> getList() {
        return list;
    }

    public void setList(ArrayList<DoUong> list) {
        this.list = list;
    }
    
    public ArrayList<DoUong> select() {
        return list;
    }
    
    public void insert(DoUong loai) {
        list.add(loai);
    }
    
    public void delete(DoUong loai) {
        for (DoUong doUong : list) {
            if (doUong.getMaDoUong()== loai.getMaDoUong()) {
                list.remove(doUong);
                return;
            }
        }
    }
    
    public void update(DoUong loai) {
        for (DoUong doUong : list) {
            if (doUong.getMaDoUong()== loai.getMaDoUong()) {
                doUong.setTenDoUong(loai.getTenDoUong());
                doUong.setMaDoUong(loai.getMaDoUong());
                doUong.setSoLuong(loai.getSoLuong());
                doUong.setGia(loai.getGia());
            }
        }
    }
    
    public ListDoUong findByLoai(int maLoai) {
        ListDoUong ldu = new ListDoUong();
        for (DoUong doUong : list) {
            if (doUong.getMaLoaiDoUong() == maLoai) {
                ldu.insert(doUong);
            }
        }
        return ldu;
    }
    
    public void ghiFile() {
        ReadWriteDoUong rw = new ReadWriteDoUong();
        rw.Write(list, fileName);
    }
    
    public void docFile() {
        ReadWriteDoUong rw = new ReadWriteDoUong();
        list = rw.Read(fileName);
    }
    
    public void sortByName() {
        Collections.sort(list, new Comparator<DoUong>() {
            public int compare(DoUong loai1, DoUong loai2) {
                return loai1.getTenDoUong().compareTo(loai2.getTenDoUong());
            }
        });
    }
    
    public void sortByMa() {
        Collections.sort(list, new Comparator<DoUong>() {
            public int compare(DoUong loai1, DoUong loai2) {
                int ma1 = loai1.getMaDoUong();
                int ma2 = loai2.getMaDoUong();
                if (ma1 == ma2) return 0;
                else if (ma1 > ma2) return 1;
                else return -1;
            }
        });
    }
}

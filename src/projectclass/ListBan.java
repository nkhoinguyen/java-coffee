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
public class ListBan {
    private ArrayList<Ban> list;
    final String fileName = "Ban.txt";

    public ListBan() {
        list = new ArrayList<>();
    }

    public ListBan(ArrayList<Ban> list) {
        this.list = list;
    }
    public void insert(Ban ban) {
        list.add(ban);
    }
    
    public void delete(Ban ban) {
        for (Ban item : list) {
            if (item.getMaBan() == (ban.getMaBan())) {
                list.remove(item);
                return;
            }
        }
    }
    
    public void update(Ban ban) {
        for (Ban item : list) {
            if (item.getMaBan()== ban.getMaBan()) {
                item.setMaBan(ban.getMaBan());
                item.setTinhTrang(ban.isTinhTrang());
            }
        }
    }
    public ArrayList<Ban> getList() {
        return list;
    }

    public void setList(ArrayList<Ban> list) {
        this.list = list;
    }
    
    public void sortByMa() {
        Collections.sort(list, new Comparator<Ban>() {
            public int compare(Ban loai1, Ban loai2) {
                int ma1 = loai1.getMaBan();
                int ma2 = loai2.getMaBan();
                if (ma1 == ma2) return 0;
                else if (ma1 > ma2) return 1;
                else return -1;
            }
        });
    }
    
    public void ghiFile() {
        ReadWriteBan rw = new ReadWriteBan();
        rw.Write(list, fileName);
    }
    
    public void docFile() {
        ReadWriteBan rw = new ReadWriteBan();
        list = rw.Read(fileName);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author MT
 */
public class ReadWriteLoaiDoUong {
     public void Write(ArrayList<LoaiDoUong > list, String fileName) {
        try {
            // Tạo dòng và liên kết file dữ liệu
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            // Ghi file
            oos.writeObject(list);
            
            // Đóng dòng
            fos.close();
            oos.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<LoaiDoUong > Read(String fileName) {
        // Khởi tạo array list
        ArrayList<LoaiDoUong > list = new ArrayList<LoaiDoUong >();
        try {
            // Tạo dòng và liên kết file dữ liệu
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            // Doc file
            list = (ArrayList<LoaiDoUong >) ois.readObject();
            
            // Đóng dòng
            fis.close();
            ois.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}

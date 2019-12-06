/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectclass;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private Ban ban;
    private ArrayList<DoUong> list;
    
    public HoaDon(){
        list = new ArrayList<>();
    }
    
    public HoaDon(Ban ban){
        list = new ArrayList<DoUong>();
        this.ban = ban;
    }
    
    public  ArrayList<DoUong> getListDoUong(){
        return list;
    }
    
     public void setList(ArrayList<DoUong> list) {
        this.list = list;
    }
     
     public Ban getBan() {
        return ban;
    }

    public void setBan(Ban ban) {   
        this.ban = ban;
    }
    
    public void add(DoUong dUong){
        list.add(dUong);
    }
    public void delete(DoUong doUong){
        list.remove(doUong);
    }
    
    public double getTongCong(){
        double dTong = 0;
        for(DoUong item : list)
        {
            dTong += item.getTong();
        }
        return dTong;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrengineer
 */
public class BasketbolcuClass extends Sporcu{
    int ikilik;
    int ucluk;
    int serbestAtis;

    
    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
    public BasketbolcuClass(){
        
    }
    public BasketbolcuClass(String basketbolcuAdi,String basketbolcuTakim){
        super(basketbolcuAdi,basketbolcuTakim);
        
    }
    
    
    @Override
    String sporcuPuaniGoster(int a,int b,int c){
       
        return "ikilik: "+ikilik+"\n"+"ucluk:  "+ucluk+"\n"+"serbest atış:  "+serbestAtis;
      
       
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrengineer
 */
public class FutbolcuClass extends Sporcu {
    int penalti;
    int serbestAtis;
    int kaleciKarsiKarsiya;

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
    
    public FutbolcuClass(){
        
    }
    public FutbolcuClass(String futbolcuAdi,String futbolcuTakim){
        super(futbolcuAdi,futbolcuTakim);
    }
    @Override
    String sporcuPuaniGoster(int penalti,int serbestAtis,int kaleciKarsiKarsiya){
        return "penaltı: "+penalti+"serbestatış: "+serbestAtis+"kalecikarşıkarşıya: "+kaleciKarsiKarsiya;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrengineer
 */
public class Sporcu {
     String sporcuIsim,sporcuTakim;

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    
    
        public Sporcu() {

        }

        public Sporcu(String sporcuIsim, String sporcuTakim) {
            this.sporcuIsim=sporcuIsim;
            this.sporcuTakim=sporcuTakim;
          
        }

          String sporcuPuaniGoster(int p1, int p2, int p3) {
            
            return "   " + p1 +"\n"+ "  " + p2 +"\n"+ "  " + p3;
        }
    
}

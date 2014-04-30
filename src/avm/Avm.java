/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zeynep
 */
public class Avm {
    private static Avm avm = new Avm();
    private static String isim="PAU AVM";
    private List<Magaza> magazalar= new ArrayList();
    private List<Calisan> calisanlar= new ArrayList();
    private static double bakiye;
    
    
    private Avm(){}
    
    public static Avm getInstance(){
        System.out.println(Avm.getIsim()+"'ye hoşgeldiniz.");
        return avm;
    }
    
    public void magazaEkle(Magaza m){
        magazalar.add(m);
        System.out.println(m.getIsim()+" magazası avmye eklendi.");
    }
    
    public void magazaCıkart(Magaza m){
        magazalar.remove(m);
        System.out.println(m.getIsim()+" magazası avmden çıkarıldı.");

    }
    
    public void calisanEkle(Calisan c){
        calisanlar.add(c);
        System.out.println(c.getIsim()+" calisani avmde işe başladı.");

    }
    
    public void calisanCıkart(Calisan c){
        calisanlar.remove(c);
        System.out.println(c.getIsim()+" çalışanı avmdeki işinden ayrıldı.");

    }
    
    
    /**
     * @return the isim
     */
    public static String getIsim() {
        return isim;
    }

    /**
     * @param aIsim the isim to set
     */
    public static void setIsim(String aIsim) {
        isim = aIsim;
    }

    /**
     * @return the bakiye
     */
    public static double getBakiye() {
        return bakiye;
    }

    /**
     * @param aBakiye the bakiye to set
     */
    public static void setBakiye(double aBakiye) {
        bakiye = aBakiye;
    }
    

    /**
     * @return the magazalar
     */
    public List<Magaza> getMagazalar() {
        return magazalar;
    }

    /**
     * @param magazalar the magazalar to set
     */
    public void setMagazalar(List<Magaza> magazalar) {
        this.magazalar = magazalar;
    }

    /**
     * @return the calisanlar
     */
    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }

    /**
     * @param calisanlar the calisanlar to set
     */
    public void setCalisanlar(List<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }
  
    
}

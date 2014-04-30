/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */
public class Calisan {
    private String isim;
    private String soyisim;
    private String unvan;
    private double maas;
    private Magaza magaza;

    public Calisan(String isim, String soyisim,String unvan,double maas){
        this.isim= isim;
        this.soyisim=soyisim;
        this.unvan = unvan;
        this.maas=maas;
    }
    
    
    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the soyisim
     */
    public String getSoyisim() {
        return soyisim;
    }

    /**
     * @param soyisim the soyisim to set
     */
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    /**
     * @return the unvan
     */
    public String getUnvan() {
        return unvan;
    }

    /**
     * @param unvan the unvan to set
     */
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    /**
     * @return the maas
     */
    public double getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(double maas) {
        this.maas = maas;
    }

    /**
     * @return the magaza
     */
    public Magaza getMagaza() {
        return magaza;
    }

    /**
     * @param magaza the magaza to set
     */
    public void setMagaza(Magaza magaza) {
        this.magaza = magaza;
    }
}

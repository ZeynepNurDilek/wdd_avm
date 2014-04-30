/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */
public class UGiysi extends Urun{
    private String isim;
    private String beden;
    private String renk;
    private String cins;
    private Sezonlar sezon;
    

    public UGiysi(String urunkodu,double fiyat,Sezonlar sezon,String isim,String beden,String renk,String cins){
        super(urunkodu,fiyat);
        System.out.println("Giysi oluşturuluyor");
        this.isim=isim;
        this.beden=beden;
        this.renk=renk;
        this.cins=cins;
        this.sezon=sezon;
        super.setIndirim(sezon.getIndirim());
    }
    
    /**
     * @return the sezon
     */
    public Sezonlar getSezon() {
        return sezon;
    }

    /**
     * @param sezon the sezon to set
     */
    public void setSezon(Sezonlar sezon) {
        this.sezon = sezon;
        super.setIndirim(sezon.getIndirim());
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
     * @return the beden
     */
    public String getBeden() {
        return beden;
    }

    /**
     * @param beden the beden to set
     */
    public void setBeden(String beden) {
        this.beden = beden;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the cins
     */
    public String getCins() {
        return cins;
    }

    /**
     * @param cins the cins to set
     */
    public void setCins(String cins) {
        this.cins = cins;
    }
    
    
    
    
    @Override
    public double getIndirim(){
        return sezon.getIndirim();
    }
    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */
public class UTeknoloji extends Urun {
    private String marka;
    private String model;
    private String ozellikler;

    public UTeknoloji(String urunkodu,double fiyat,String mrk, String mdl,String ozellikler){
        super(urunkodu,fiyat);
        System.out.println("Teknoloji ürünü oluşturuluyor");
        this.marka=mrk;
        this.model=mdl;
        this.ozellikler=ozellikler;
        
    }
    
    
    
    
    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretim_yili
     */
    public String getOzellikler() {
        return ozellikler;
    }

    /**
     * @param uretim_yili the uretim_yili to set
     */
    public void setOzellikler(String ozellikler) {
        this.ozellikler = ozellikler;
    }
    
}

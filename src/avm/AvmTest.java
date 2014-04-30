/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package avm;

/**
 *
 * @author zeynep
 */
public class AvmTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Avm oluşturuluyor
        
        Avm avm = Avm.getInstance();
        
        Magaza m1 = new Magaza("Flormar",500);
        Magaza m2 = new Magaza("Watsons",600);
        Magaza m3 = new Magaza("Magaza",1000);
        
        Calisan c1 = new Calisan("Zeynep","Dilek","kasiyer",1000);
        Calisan c2 = new Calisan("Nur","Dilek","kasiyer",1000);
        Calisan c3 = new Calisan("Zeynep","Nur","mudur",2000);
        Calisan c4 = new Calisan("Nur","Zeynep","satis sorumlusu",1500);
        Calisan c5 = new Calisan("Dilek","Nur","kasiyer",1000);
        Calisan c6 = new Calisan("Zeynep Nur","Dilek","avm sahibi :P",0);
        
        
        Urun y1 = new UYiyecek("12563",5.95,"01.12.16",4);
        Urun y2 = new UYiyecek("12578",12.98,"01.12.14",1);
        Urun y3 = new UYiyecek("12545",3.55,"01.12.13",1);
        Urun y4 = new UYiyecek("12512",2.85,"01.12.18",1);
        
        Urun t1 = new UTeknoloji("12512",1600,"acer","aspire","ekran kartı : asda, ram: 4gb,");
        Urun t2 = new UTeknoloji("12514",250,"samsung","harddisk","boyut:1 tb");
        Urun t3 = new UTeknoloji("12519",3500,"apple","macbook","asdfa");
        Urun t4 = new UTeknoloji("12511",39.90,"asd","mause","bluetooth mause");
        
        Urun g1 = new UGiysi("1354",59.90,Sezonlar.KIS,"pantolon","36","siyah","dar paça");
        Urun g2 = new UGiysi("1354",59.90,Sezonlar.SONBAHAR,"hırka","36","siyah","dar paça");
        Urun g3 = new UGiysi("1354",59.90,Sezonlar.YAZ,"tşört","36","siyah","dar paça");
        Urun g4 = new UGiysi("1354",59.90,Sezonlar.ILKBAHAR,"gömlek","36","siyah","dar paça");
        Urun g5 = new UGiysi("1354",59.90,Sezonlar.KIS,"mont","36","siyah","dar paça");
        
        Musteri mus1= new Musteri("Z","n",3000);
        Musteri mus2= new Musteri("n","d",5000);
        Musteri mus3= new Musteri("d","z",10000);
        
        
        //Atamalar yapılıyor.
        
        avm.magazaEkle(m1);
        avm.magazaEkle(m2);
        avm.magazaEkle(m3);
        
        avm.calisanEkle(c6);
        
        m1.calisanEkle(c1);
        m1.calisanEkle(c2);
        m2.calisanEkle(c3);
        m2.calisanEkle(c4);
        m3.calisanEkle(c5);
        //m2.calisanCıkart(c3);
        m3.calisanEkle(c3);
        
        
        
      
        //enum types sezona göre indirim oranı değiştiriliyor
        Urun u1= new UGiysi("urun1",10.5,Sezonlar.ILKBAHAR,"","","","");
        System.out.println(u1.getIndirim());
        u1.setSezon(Sezonlar.SONBAHAR);
        System.out.println(u1.getIndirim());
        u1.setSezon(Sezonlar.KIS);
        System.out.println(u1.getIndirim());
        
        
    }
}

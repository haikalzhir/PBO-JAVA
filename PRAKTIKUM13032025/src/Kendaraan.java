/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asaaa
 */
public class Kendaraan {
       String jenis;
    int tahun;
    String warna;
    
    //constructor
    public Kendaraan(String j, int t, String w){
        this.jenis=j;
        this.tahun=t;
        this.warna=w;
    }
    //.Method untuk menampilkan data
    public void TampilData(){
        System.out.println("Jenis Kendaraan = "+jenis);
        System.out.println("Tahun Kendaraan = "+tahun);
        System.out.println("Warna Kendaraan = "+warna);
    }
    ///method dengan parameter
    public void TipeKendaraan(int kec){
            System.out.println("Tipe Kendaraan anda "+kec);
            if (kec<20){
                System.out.println("Anda Membuat macet saja");
                System.out.println("Ganti Kendaraan Saja");           
            }   
            else if(kec<40){
                 System.out.println("Lama banget woe");
            }     
            else if(kec<80){
                  System.out.println("Santai dulu broo");
            }
            else if(kec<100){
                 System.out.println("Pelan pelan pak supirr");
            }
             else {
                  System.out.println("P Balap");
              }
                  
} 
           
    
            
}


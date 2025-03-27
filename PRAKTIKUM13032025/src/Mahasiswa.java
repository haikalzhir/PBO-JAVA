/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asaaa
 */
public class Mahasiswa {
    String nama;
    int nim;
    int tugas;
    int uts;
    int uas;
    int quiz;
    double NilaiAkhir;
    
    //constructor
    public Mahasiswa(String n, int nm, int t, int uas, int uts, int q){
        this.nama=n;
        this.nim=nm;
        this.tugas=t;
        this.uts=uts;
        this.uas=uas;
        this.quiz=q;
    } 
        //method tampil data mahasiswa
        public void TampilData(){
        System.out.println("Nama Mahasiswa = "+nama);
        System.out.println("NIM Mahasiswa = "+nim);
        System.out.println("Tugas = "+tugas);
        System.out.println("UTS = "+uts);
        System.out.println("UAS = "+uas);
        System.out.println("QUIZ = "+quiz);
        }
        
        
        //method untuk menentukan nilai akjir =>nilai akhir[rumus]
        public void NilaiAkhir(){
        NilaiAkhir= tugas*1.5+uts*0.3+uas*2.5+quiz*02;
        
        System.out.println("Nilai Akhir Anda (angka): " + NilaiAkhir);
        }
        
        public void KonversiNilai(int nilai){
            System.out.println("Nilai Anda "+nilai);
            if (nilai<=40){
                System.out.println(" E ");         
            }   
            else if(nilai<=49){
                 System.out.println(" D ");
            }     
            else if(nilai<=64){
                  System.out.println(" C ");
            }
            else if(nilai<=80){
                 System.out.println(" B ");
            }
            else {
                  System.out.println("A");
              }
       }     
          
}

    


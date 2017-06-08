/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.model;

/**
 *
 * @author Enggar R S
 */
public class m_hitung {
     public String bulan_gaji, nama_pegawai, tgl_lahir, status, jumlah_anak, gaji_pokok, jabatan_struktural, keluarga, anak, total; 
    public String nip; 
    
    public String getbulan() {
        return bulan_gaji; 
    }
    
    public String getnama() {   
        return nama_pegawai; 
    }
    
    public String gettgl_lhr() { 
        return tgl_lahir;
    }
    
    public String getstatus() {   
        return status;
    }
    
    public String getjml_anak() {  
        return jumlah_anak; 
    }
      public String getpokok() {  
        return gaji_pokok; 
    }
        public String getstruktural() {  
        return jabatan_struktural; 
    }
          public String getkeluarga() {  
        return keluarga; 
    }
              public String getanak() {  
        return anak; 
    }
                  public String getnip() {  
        return nip; 
    }
                  public String gettotal() {  
        return total; 
    }
    
    //method set 
    public void setnip(String nip) { 
        this.nip= nip;
    } 
    
    public void setnama(String nama) { 
        this.nama_pegawai= nama;
    } 
    
    public void setbulan(String bulan){ 
        this.bulan_gaji=bulan;
    } 
    
    public void settgl_lhr(String tgl_lhr) { 
        this.tgl_lahir= tgl_lhr; 
    }
     public void setstatus(String status) { 
        this.status = status; 
    }
    
    public void setjml_anak(String jml_anak) {  
        this.jumlah_anak= jml_anak;
    } 
     public void setpokok(String pokok) {  
        this.gaji_pokok= pokok;
    } 
       public void setstruktural(String struktural) {  
        this.jabatan_struktural= struktural;
    } 
       public void setkeluarga(String keluarga) {  
        this.keluarga= keluarga;
    } 
          public void setanak(String anak) {  
        this.anak= anak;
    } 
            public void settotal(String total) {  
        this.total= total;
    } 

    public void settgl(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

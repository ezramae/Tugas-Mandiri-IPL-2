/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasm2;

/**
 *
 * @author acer
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
       return alamat;
    }
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}

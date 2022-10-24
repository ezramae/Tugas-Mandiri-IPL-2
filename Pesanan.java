/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasm2;

import java.util.Random;

/**
 *
 * @author acer
 */
public class Pesanan {
    private Pelanggan pelanggan;
    private String idPesanan;
    private String namaItem;
    private int jumlah;
    private int totalTagihan;
    
    public Pelanggan getPelanggan(){
        return pelanggan;
    }
    public void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    public String getIdPesanan(){
        return idPesanan;
    }
    public void setIdPesanan(String idPesanan){
        Random random = new Random();
        this.idPesanan = idPesanan + "-" + random.nextInt(500);
    }
    public String getNamaItem(){
        return namaItem;
    }
    public void setNamaItem(String namaItem){
        this.namaItem = namaItem;
        setIdPesanan(namaItem);
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public int getTotalTagihan(){
        return totalTagihan;
    }
    public void setTotalTagihan(int totalTagihan){
        this.totalTagihan = totalTagihan;
    }
    
    public void membuatPesanan(){
        System.out.println("Menyiapkan pesanan untuk " + this.getPelanggan().getNama() + ", memesan : " + this.getNamaItem());
    }
}

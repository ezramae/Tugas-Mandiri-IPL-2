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
public class PesanAntar {
    private Pesanan pesanan;
    public PesanAntar(Pesanan pesanan){
        this.pesanan = pesanan;
    }
    
    public void kirim(){
        System.out.println("Mengirim pesanan");
        System.out.println("Id pesanan " + this.pesanan.getIdPesanan() + "telah diantar ke pelanggan "
        + this.pesanan.getPelanggan().getNama());
        System.out.println("Pesanan telah sampai di alamat : " + this.pesanan.getPelanggan().getAlamat());
    }
}

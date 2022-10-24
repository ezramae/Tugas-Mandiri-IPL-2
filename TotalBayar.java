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
public class TotalBayar {
    private Pesanan pesanan;
    public TotalBayar(Pesanan pesanan){
        this.pesanan = pesanan;
    }
    
    public void hitungTotal(){
        Random random = new Random();
        int totalTagihan = random.nextInt(200) * this.pesanan.getJumlah();
        
        this.pesanan.setTotalTagihan(totalTagihan);
        System.out.println("Id pesanan " + this.pesanan.getIdPesanan() + "total tagihan " + this.pesanan.getTotalTagihan());
    }
}

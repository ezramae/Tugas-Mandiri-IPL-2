/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasm2;

/**
 *
 * @author ezra mae
 */
public class Tugasm2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.setNama("Ezra");
        pelanggan1.setAlamat("Cimahi");
        Pesanan pesanan1 = new Pesanan();
        pesanan1.setNamaItem("Ayam Goreng");
        pesanan1.setJumlah(2);
        pesanan1.setPelanggan(pelanggan1);
        
        pesanan1.membuatPesanan();
        
        TotalBayar totalBayar = new TotalBayar(pesanan1);
        totalBayar.hitungTotal();
        
        PesanAntar pesanAntar = new PesanAntar(pesanan1);
        pesanAntar.kirim();
                
    }
    
}

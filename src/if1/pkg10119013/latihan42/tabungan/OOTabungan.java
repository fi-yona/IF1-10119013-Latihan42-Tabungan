/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan42.tabungan;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;


public class OOTabungan {
    
    Scanner scan = new Scanner(System.in);
    
    private int saldo;
    
    public void tabungan(int saldo){
        System.out.print("Masukkan saldo awal : ");
        this.saldo = scan.nextInt();
    }
    
    public int ambilUang(int jumlah){
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = scan.nextInt();
        int saldoAkhir = saldo - jumlah;
        System.out.println("Saldo anda sekarang : " + saldoAkhir);
        return saldoAkhir;
    }
    
    public static void main(String[] args) {
        OOTabungan oo = new OOTabungan();
        
        System.out.println("====Program Penarikan Saldo====");
        int saldo = 0;
        int jumlah = 0;
        oo.tabungan(saldo);
        oo.ambilUang(jumlah);
        
        System.out.pritnln();
        System.out.println("by. Fiona Avila");
    }
    
}

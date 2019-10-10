/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan36.objectorientedtargetsaldotabungan;

/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung saldo tabungan dengan bunga 8% dengan target tertentu
 */
public class Saldo {
    private int saldoAwal;
    private int saldo;
    private double bunga;
    private int targetSaldo;
    private int i;
    
    private int hitungBunga(int parSaldoAwal, double parBunga) {
        return (int) ((int) parSaldoAwal * parBunga);
    }
    
    public void hitungSaldo(int parSaldoAwal, double parBunga, int parTagetSaldo) {
        
        saldoAwal = parSaldoAwal;
        bunga = parBunga;
        saldo = saldoAwal;
        targetSaldo = parTagetSaldo;
        i = 1;
        do {
            saldo = saldo + hitungBunga(saldo, bunga);
            System.out.printf("Saldo di bulan ke-"+i+" Rp.%,10d%n",saldo);
            i++;
        } while (saldo < targetSaldo);
    }
}

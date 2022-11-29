/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3070;

/**
 *
 * @author ASUS
 */
public class CommissionEmployee_3070 extends Employess_3070{
    public float Komisi_3070;
    public float TotalPenjualan_3070;
    public float Totalgaji_3070;
    
    public CommissionEmployee_3070(){
        
    }
    
    public float TotalGaji_3070(){
        Totalgaji_3070 = GajiPokok_3070 + (Komisi_3070 * TotalPenjualan_3070);
        return Totalgaji_3070;
    }
    
    public void TampilData_3070(){
        System.out.println("Commission Employee");
        Tampil_3070();
        System.out.println("Total Gaji: " + Totalgaji_3070);
    }
}

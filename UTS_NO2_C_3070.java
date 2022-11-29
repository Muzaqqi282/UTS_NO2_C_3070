/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_c_3070;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class UTS_NO2_C_3070 {

    public static void main(String[] args) {
        SalariedEmployee_3070 se_3070 = new SalariedEmployee_3070();
        CommissionEmployee_3070 ce_3070 = new CommissionEmployee_3070();
        ProjectPlanner_3070 pp_3070 = new ProjectPlanner_3070();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        try{
            System.out.println("Data Pegawai");
            System.out.print("Nama: ");
            se_3070.Nama_3070 = br.readLine();
            System.out.print("NIP: ");
            se_3070.NIP_3070 = br.readLine();
            System.out.print("Gaji Pokok: ");
            se_3070.GajiPokok_3070 = Float.parseFloat(br.readLine());
            se_3070.TampilData_3070();
            
            System.out.print("Nama: ");
            ce_3070.Nama_3070 = br.readLine();
            System.out.print("NIP: ");
            ce_3070.NIP_3070 = br.readLine();
            System.out.print("GajiPokok: ");
            ce_3070.GajiPokok_3070 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            ce_3070.Komisi_3070 = Float.parseFloat(br.readLine());
            System.out.print("Total Penjualan: ");
            ce_3070.TotalPenjualan_3070 = Float.parseFloat(br.readLine());
            ce_3070.TotalGaji_3070();
            ce_3070.TampilData_3070();
            
            System.out.print("Nama: ");
            pp_3070.Nama_3070 = br.readLine();
            System.out.print("NIP: ");
            pp_3070.NIP_3070 = br.readLine();
            System.out.print("Gaji Pokok: ");
            pp_3070.GajiPokok_3070 = Float.parseFloat(br.readLine());
            System.out.print("Komisi: ");
            pp_3070.Komisi_3070 = Float.parseFloat(br.readLine());
            System.out.print("Total Hasil Proyek: ");
            pp_3070.TotalHslProyek_3070 = Float.parseFloat(br.readLine());
            pp_3070.TotalGaji_3070();
            pp_3070.TampilData_3070();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}


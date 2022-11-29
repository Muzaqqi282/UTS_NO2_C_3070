/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_c_3070;

/**
 *
 * @author ASUS
 */
 public class ProjectPlanner_3070 extends Employess_3070{
    public float Komisi_3070;
    public float TotalHslProyek_3070;
    public double Totalgaji_3070;
    
    public ProjectPlanner_3070(){
        
    }
            
    public double TotalGaji_3070(){
        Totalgaji_3070 = GajiPokok_3070 + (Komisi_3070 * TotalHslProyek_3070) - (GajiPokok_3070 *5/100);
        return Totalgaji_3070;
    }
    
    public void TampilData_3070(){
        System.out.println("Project Plannner");
        Tampil_3070();
        System.out.println("Total Gaji: " + Totalgaji_3070);
    }
}

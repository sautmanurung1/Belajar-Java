/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author NITRO
 */
public class AC implements InterfaceAC{
int statusAC;

    @Override
    public void hidupkan() {
        if(statusAC == KEADAAN_MATI){
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC HIDUP");
        }
        else{
            System.out.println("Hidupkan AC! --> AC SUDAH HIDUP KOK");
        }
    }

    @Override
    public void dinginkan() {
       if(statusAC == KEADAAN_PANAS){
            statusAC = KEADAAN_DINGIN;
            System.out.println("Dinginkan AC! --> AC DINGIN");
        }
        else{
            System.out.println("Dinginkan AC! --> AC SUDAH DINGIN KOK");
        }
    }

    @Override
    public void matikan() {
        if(statusAC == KEADAAN_HIDUP){
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC MATI");
        }
        else{
            System.out.println("Matikan AC! --> AC SUDAH MATI KOK");
        }
    }

    @Override
    public void panaskan() {
        if(statusAC == KEADAAN_DINGIN){
            statusAC = KEADAAN_PANAS;
            System.out.println("Panaskan suhu AC! --> SUHU AC PANAS");
        }
        else{
            System.out.println("Panaskan suhu AC! --> SUHU AC SUDAH PANAS KOK");
        }
    }
    
}

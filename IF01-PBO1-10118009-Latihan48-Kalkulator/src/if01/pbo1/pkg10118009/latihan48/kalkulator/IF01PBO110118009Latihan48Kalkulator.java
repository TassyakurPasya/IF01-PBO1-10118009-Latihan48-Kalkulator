/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan48.kalkulator;

/**
 *Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = Kalkulator
 * @author LENOVO
 */
public class IF01PBO110118009Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        System.out.println("VALUE 1 = "+kalkulator.getValue1());
        System.out.println("VALUE 2 = "+kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result Add is = "+kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = "+kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is = "+kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division = "+kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
    
}

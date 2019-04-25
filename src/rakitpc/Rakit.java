/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakitpc;

/**
 *
 * @author HNDRWN
 */
public class Rakit {
    public static void main(String[] args) {
        // TODO code application logic here
        CPU amd1 = new AMD(3);
        CPU intel1 = new Intel(2);
        Komputer komputer1 = new Komputer(intel1);
        
        komputer1.cetakInfo();
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo();
    }
}

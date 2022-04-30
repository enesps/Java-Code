/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BaglıListe;

/**
 *
 * @author User
 */

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BListe l1 = new BListe();
       BListe l2=new BListe();
       
       //l1 linked listeye eleman ekleme
       l1.initialize(1);
       l1.add(2);
       l1.add(3);    
       l1.printLinkedList();
        
       //l1 linked listeye eleman ekleme
       l2.initialize(5);
       l2.add(6);
       l2.printLinkedList();
        
       //l1 ve l2 birleştirme 
       l1.concatenate(l1, l2);
       l1.printLinkedList();
        
       //eklenen yeni değerin linked liste küçükten büyüğe doğru sıralanması ile eklenir
       l1.addAndSort(4);
       l1.printLinkedList();
       
       // median değeri linked listin ortanca değerini bulmaya yarar.
       //reverse methodu linked listeyi ters çevirir.
       l1.median();
       l1.reverse();
       l1.printLinkedList();
        
    }
    
}


package mystack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class MyStack {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws mystack.LinkedListEmptyException
     */
    public static void main(String[] args) throws IOException, LinkedListEmptyException {
       BListe b1=new BListe();
       BListe b2=new BListe();
             BufferedReader inputStream = null;
		
                //dosya okuma işlemi
		try {   
			inputStream = new BufferedReader(new FileReader("ödev.txt"));
			
 
			String satir;
                        //dosya okuma işlemi satır satır
			while ((satir = inputStream.readLine()) != null) {
				
                                satir=satir.replace(" ", "").replace("!", "").replace(".","").replace(",", "").toLowerCase();
                                //satırlardaki char karakterleri linked liste ekleme
                                for(int i=0;i<satir.length();i++){
                                    
                                    b1.push(satir.charAt(i));
                                }
                                
                                b1.printLinkedList();
                                //linked listi ayırarak başka bir linked liste ekleme
                                b1.split(b2);
                                b2.printLinkedList();
                                //linked listleri karşılaştırarak palindrom mu değil mi kontrol etme
                                b1.karsılastırma(b2);  	
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			
		}
    }
    
}

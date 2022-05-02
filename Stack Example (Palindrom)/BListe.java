
package mystack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class BListe 
{

    /**
     *
     */
    Node head = null;

  
    
    
    /**
     * linked listleri ayırıp ekleme
     * @param list
     * @throws LinkedListEmptyException
     */
    public void split(BListe list) throws LinkedListEmptyException{
     Node temp = head;
     String data = null;
    for(int i=0;i<elementCount()/2+1;i++){
       list.push(temp.data);
       pop();
       temp=temp.next;
       
       
    }
   
    
    
}

    /**
     * linked listleri karşılaştırma
     * @param b2
     * @throws LinkedListEmptyException
     */
    public void karsılastırma(BListe b2) throws LinkedListEmptyException{
                                    //ayırılan linked listin eleman sayısı aynı ise aynı olma durumunda palindrom özelliği katma yoksa paliindrom olmadığını belirtme
                                   if(elementCount()==b2.elementCount()){
                                   if(stringPrint().equals(b2.stringPrint())){
                                       System.out.println("palindrom");
                                   }else{
                                       System.out.println("palindrom değildir.");
                                   }
                                  
                               }
                                   else {
                                  String a="";
                                  //linked listi string ifade içerisine atma. ilk char ifadesini çıkararak
                                  for(int i=0;i<stringPrint().length();i++){
                                           
                                         if(i>0){
                                              a+=stringPrint().charAt(i);
                                         }
                                     
                                  }
                                  //eğer karşılaştırılan linked listlerdeki string ifadeler aynı ise palindrom özelliğini belirtme.yoksa palindrom olmadığını belirtme
                                  if(a.equals(b2.stringPrint())){
                                      System.out.println("palindrom");
                                  }else{
                                      System.out.println("palindrom değildir");
                                  }
                               }
                               
                                //karşılaştırıldıktan sonra linked listin içini boşaltma
                                while(head!=null){
                                    pop();
                                    
                                }
                                
                                
                               
                                    //karşılaştırıldıktan sonra linked listin içini boşaltma
                                    while(b2.head!=null){
                                        b2.pop();
                                    }
                                    
                                
                               
    
}
//linked listi String bir şekilde birleştirme

    /**
     * string biçimde yazdırma
     * @return
     */
public String stringPrint(){
        String write="";
       Node temp = head;       
       while(temp != null)
       {
           write+=temp.data;
           
           temp = temp.next;
       }
        return write;
}
//linked listin eleman sayısını hesaplama

    /**
     * eleman sayma
     * @return
     */
public int elementCount()
 {
       Node temp = head;
       int count = 0;
       while(temp != null)
       {
           count++;
           temp = temp.next;
       }
      return count;               
 }


//linked listi yazdırma

    /**
     *linked list yazdırma
     */
public void printLinkedList()
    {
       Node temp = head;       
       while(temp != null)
       {
           System.out.print(temp.data +" => ");
           temp = temp.next;
       }
        System.out.println("Null");               
    }
//linked liste stack yapısı gibi üstüne ekleme

    /**
     * eleman ekleme
     * @param data
     */
public void push(char data)
 {
          
        Node oldHead = head;
        head = new Node();
        head.data = data;
        head.next = oldHead;
    
                    
}

//linked listten eleman silme işleme.(yukarıdan)

    /**
     * silme
     * @return
     * @throws LinkedListEmptyException
     */
public char pop() throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException();
		}
		char data = head.data;
		head = head.next;

		return data;
	}


}

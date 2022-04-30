/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaglıListe;


/**
 *BListe Class : Concatenate(BListe a,Bliste b),addAndSort(int data),
 * addAndSort(int data),initialize(int data), median(),reverse(),
 * add(int data),printLinkedList(),elementCount() 
 * has methods
 * @author User
 */
public class BListe {

    /**
     *
     */
    Node head = null;
      //concatenate methodunda iki tane linked list parametresi yolluyoruz.
      
    /**
     *
     * @param a
     * @param b
     */
    public void concatenate(BListe a,BListe b){
          Node newNode = new Node();
           Node newNode1 = new Node();
           //yeni bir node oluşturarak parametre olan linked list leri etkilemesini önlüyoruz.
           
           newNode = a.head;
            newNode1 = b.head;
           
        int count=0;
        //ilk parametredeki linked list'in sonuna gelerek ikinci parametreyi eklemeye hazırlanıyor.
        if(isEmpty()){
                    while(newNode.next != null  ) {
            
        newNode = newNode.next;
        count++;

      }

          
         //iki linked listi birleştirme
          while(newNode1.next != null){
              newNode.next = newNode1;
              newNode = newNode.next;
              newNode1 = newNode1.next;

          }
        }
          
      }
    
    
    //linked liste ilk eleman atama
    /**
     *
     * @param data
     */
    public void initialize(int data)
    {
      head = new Node();
      head.data = data;
      head.next = null;
    }

    /**
     *
     * @param data
     */
    // İlk başta eklenecek elemanın linked liste deki konumu belli olur sonra ekleme işlemi yapılır.
    public void addAndSort(int data){
        
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = null;       
       Node temp = head;
       Node temp2;
       
       // linked list içinde pointer ile ilerleme
        if (isEmpty()){
           while(temp.next!=null){
           boolean flag=true;
           
            
               
                //eklenecek elemanın bulunacak yer kontrolü
               if(newNode.data>temp.data && temp.next.data>newNode.data ){
                    temp2=temp.next;
                    temp.next=newNode;
                    temp=temp.next;
                    temp.next=temp2;
                    
                    
                    flag=false;                
           }
                 if(flag){
                     temp=temp.next;
                 }
                   
       
              
               
              
       
      
        }
}
    }

    /**
     *
     */
    // ortanca değer
    public void median(){
    Node temp = head;
       int count = 0;
       //linked listin eleman sayısını bulma
       while(temp != null)
       {
           count++;
           temp = temp.next;
       }
       temp=head;
       // eğer eleman sayısı çiftse 
    if(isEmpty()){
        if(count%2==0){
        
        double sum;
        
        int a=(count/2)-1;
        
        for(int i=1;i<count;i++){
        //linked list içinde eleman sayısı çift olduğu için eleman kontrolü yapma
        if(i==a+1 ){
            sum=temp.next.data+temp.data;
           
            
            System.out.println("median: "+sum/2);
                
            
            
        }
        else{
            temp=temp.next;
        }
        
    }
    }
    //eğer eleman sayısı tek ise
    else if(count%2==1){
        int a=(count-1)/2;
        for(int i=0;i<count-1;i++){
        //linked list içinde eleman sayısı çift olduğu için eleman kontrolü yapma
        if(i==a){
            System.out.println("median: "+temp.data);
            temp=temp.next;
        }else{
            temp = temp.next;
        }
    }
    }
}
    
}

    /**
     * linked listi ters çevirme
     */
    public void reverse(){
    Node temp =head;
    Node previous=null;
    Node next=null;
       if(isEmpty()){
        while(temp!=null){
        next=temp.next;
        temp.next=previous;
        previous=temp;
        temp=next;
    }
    head=previous;
    }
}
    
    /**
     *
     * @param data
     * eleman ekleme
     */
    
    public void add(int data)
 {
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = null;       
       Node temp = head;
       //sona eleman ekleme
       while(temp.next != null)
       {
          temp = temp.next;
       }
       temp.next = newNode;               
 }

    /**
     * 
     */
    public void printLinkedList()
    {
       Node temp = head;     
       //linked list'deki elemanları yazdırma
       while(temp != null)
       {
           System.out.print(temp.data +" => ");
           temp = temp.next;
       }
        System.out.println("Null");               
    }

    /**
     * 
     * @return
     * eleman sayma
     */
    
    //Linked list'deki eleman sayısı hesaplama
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
    //linked list boş mu? 
    //boolean bir değer gönderir gönderir.
    public boolean isEmpty(){
        
      Node temp=head;
      if(temp.next==null){
          return false;
      }
      else{
          return true;
      }
    }



}

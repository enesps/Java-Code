
package queue;

/**
 *
 * @author User
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       QueueList e=new QueueList();
       e.enqueue("enes");
       e.enqueue("cemre");
       e.enqueue("ismail");
       e.enqueue("emir");
       e.enqueue("yağmur");
       e.dequeue();
       e.dequeue();
       e.peek();
       e.isEmpty();

       
       

       e.println();

    }
    
}

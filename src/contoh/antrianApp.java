
package contoh;
public class antrianApp {
    public static void main(String[] args){
		Antrian antrian = new Antrian(10);
        antrian.enqueue(73);
        antrian.display();
        antrian.enqueue(45);
        antrian.display();
        antrian.enqueue(80);
        antrian.display();
        System.out.println("yang diambil dari antrian="+ antrian.dequeue());
        antrian.display();
        System.out.println("yang diambil dari antrian="+ antrian.dequeue());
        antrian.display();
    }
    
}
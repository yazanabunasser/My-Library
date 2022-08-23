
public class MyLinked<H> {
    Node head;
    long size;

    MyLinked(){
        head = null;

    }

    public MyLinked(MyList[] l) {
    }

    public void printLinked(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.user.getName()+ " --> ");
            temp = temp.getNext();
        }

        System.out.println();
    }

    public void add(Node n){
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while (temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(n);
    }
    public void remove(Node r){
        Node temp = head;
        while (temp.getNext()!= r){
            temp= temp.getNext();
        }
        temp.setNext(r.getNext());


    }

    @Override
    public String toString() {
        return "MyLinked{" +
                "head=" + head +
                '}';
    }
}
//    private String next;
//    private MyList head;
//    private String temp ;
//    int i ;
//    MyList List[];
//
//
//     public MyLinked(){
//         List[0] =head;
//         List[1]=null;
//         i = 1;
//
//     }
//     public void add(User u){
//         List[i] = u ;
//     }
//     public void Next(int i){
//         next[]
//
//     }
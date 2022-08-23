import java.util.Scanner;

public class Library {
    static int n = 0;
    static MyList library = new MyList();
    static MyList person = new MyList();
    static Scanner in = new Scanner(System.in);
    static TNode p;
    User user = new User();
    Book book =new Book();
    Employee employee = new Employee();



    public void login() {
        System.out.println("1.User:");
        System.out.println("2.Employee:");
        System.out.println("3.Library:");

        int x = in.nextInt();
        if (x == 1) {
            user();
        } else if (x == 2) {
            employee();
        } else if (x == 3) {
            Mylibrary();
        }
    }

    public static void Mylibrary() {
        library.print();
        person.print();
    }

    public void employee() {
        int y;
        Employee e = new Employee();
        Book b1 = new Book();
        String employeeName , bookName;
        System.out.println("Enter your name:");
        e.setName(in.next());
        System.out.println("Enter ,your id");
        e.setId(in.nextDouble());
        System.out.println("Enter your gender");
        e.setGender(in.next());
        System.out.println("1.add book :");
        System.out.println("2.buy book :");
        y = in.nextInt();
        this.employee = e;
        this.book = b1;
        if (y == 1) {
            System.out.println("book name: ");
            b1.setName(in.next());
            b1.setPerson(e.getName());
            System.out.println("book size");
            b1.setSize(in.nextInt());
            this.book = b1;
//            library.add(bookName);
//            person.add(employeeName);
            n++;
        }
//        else if (y == 2) {
//            System.out.println("book name: ");
//            bookName = in.nextLine();
//            library.remove(bookName);
//            person.remove(employeeName);
//            n--;
//        }
    }


    public void user() {
        String name, bookName;
        int y = 0;
        User u1 = new User();
        Book b = new Book();
        MyTree t = new MyTree();

        System.out.println("Enter your name:");
        u1.setName(in.next());
        System.out.println("Enter ,your id");
        u1.setId(in.nextDouble());
        System.out.println("Enter your gender");
        u1.setGender(in.next());
        System.out.println("1.add book :");
        System.out.println("2.buy book :");
        this.user = u1;

        y = in.nextInt();
        if (y == 1) {
            System.out.println("book name: ");
            b.setName(in.next());
            b.setPerson(u1.getName());
            System.out.println("book size");
            b.setSize(in.nextInt());
//            library.add(bookName + name);
            this.book = b;
//            p.setBook(b);
//           t.add(p);
            n++;

//            System.out.println("book name: ");
//            bookName = in.nextLine();
//            library.remove(bookName);
//            n--;
//        }
//    }

//    public int know(){
//        int q=0 , m =0;
//        String name;
//        System.out.println("you have 1.book 2.person");
//        q = in.nextInt();
//        if(q==1){
//            System.out.println("enter name of the person");
//            name = in.nextLine();
//            for(int w= 0 ; w<n-1;w++){
//                if(person.getName1(w) == name){
//                    break;
//                }
//                m =w;
//            }
//        }else if(q==2){
//            System.out.println("enter name of the book");
//            name = in.nextLine();
//            for(int w= 0 ; w<n-1;w++){
//                if(library.getName1(w) == name){
//                    break;
//                }
//                m =w;
//            }
//        }
//        return m;
//    }
//    public void bookOrperson(){
//        System.out.println(library.getName1(know()) + person.getName1(know()));
//    }
        }
    }
}



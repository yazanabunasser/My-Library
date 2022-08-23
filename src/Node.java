public class Node extends Object {
    User user;
    Employee employee;
    Node next;
    Book book;

    public Node() {

    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Node(User s, Node n) {
        user = s;
        next = n;
    }
    public Node(Book b ){
        book = b ;
    }

    public User getUser() {

        return user;
    }
    public Node getNext() {

        return next;
    }
    public Book getBook() {
        return book;
    }


    public void setBook(Book book) {
        this.book = book;
    }
    public void setUser(User newuser) {
        this.user = newuser;
    }
    public void setNext(Node newNext) {
        this.next = newNext;
    }

    @Override
    public String toString() {
        Object a=1;
        return "Node{" +
                "user=" + user +
                '}';
    }
}

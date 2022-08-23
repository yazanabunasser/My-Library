public class TNode {
    Book book;
    TNode root;
    TNode leftNext;
    TNode rightNext;
    TNode(MyTree t){

    }
    TNode(Book n){

    }


    public TNode(MyTree T , Book book) {
        this.book= new Book();
    }

    public TNode(TNode b) {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public TNode getLeftNext() {
        return leftNext;
    }

    public void setLeftNext(TNode leftNext) {
        this.leftNext = leftNext;
    }

    public TNode getRightNext() {
        return rightNext;
    }

    public void setRightNext(TNode rightNext) {
        this.rightNext = rightNext;
    }


}

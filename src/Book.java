
public class Book implements Comparable<Book>{
    private  String name;
    private double id ;
    private String person;
    private int size;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setName(String BookName){
        name = BookName;
    }
    public void setId(double Id){
        id = Id;
    }
    public void setPerson(String PersonName){
        person = PersonName;
    }
    public String getName(){
        return name;
    }
    public  double getId(){
        return id;
    }
    public String getPerson(){
        return person;
    }


    @Override
    public int compareTo(Book book) {
        if(this.size > book.size){
            return 1;
        }else if(this.size < book.size){
            return -1;
        }
        return 0;
    }
    public int compareTo(int id) {
        if(this.id > id){
            return 1;
        }else if(this.id < id){
            return -1;
        }
        return 0;
    }
}

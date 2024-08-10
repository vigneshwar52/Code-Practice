public class member extends Person{

    private int memberId;

    public member(String name, String email, int memberId) {
        super(name, email);
        this.memberId = memberId;
    }
    

    @Override
    public void showDetails() {
        System.out.println("Member Name: " + getName());
        System.out.println("Member Email: " + getEmail());
        System.out.println("Member ID: " + memberId);
    }


    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void borrowBook(Book book){
        book.checkOut();
    }
    public void borrowBook(Book book,int days){
        book.checkOut();
    }

    public void returnBook(Book book){
        book.returnItem();
    }
    
}

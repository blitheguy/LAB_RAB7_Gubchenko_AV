public class Main {
    public static void main(String[] args) {

        Role user = new Reader("Андрей", "Достоевский - Война и Мир", "Взял");
        user.takeBook();
        Role.statusBook();
        Role user3 = new Worker("Библиотекарь", "Вторник");
        user3.orderBook();
        Role user2 = new Worker("Поставщик", "Среду");
        user2.bringBook();
        Role user1 = new Worker("Администратор", "Четверг");
        user1.issue();

    }
}
interface Role {
    static void statusBook(){
        System.out.println("Ствтистика движения книги:");
    }
    void takeBook();  //Читатель взял книгу
    void returnBook();//Читатель отдал книгу
    void search();    //Администратор ищет книгу
    void issue();     //Администратор выдает книгу
    void delay();     //Администратор выставил дату просрочки
    void orderBook(); //Библиотекарь заказал книгу
    void bringBook(); //Поставщик привез книгу
}
class Reader implements Role {
    String nameReader;
    String author;
    String getBook;

    public Reader(String nameReader, String author, String getBook) {
        this.nameReader = nameReader;
        this.author = author;
        this.getBook = getBook;
    }

    public void takeBook() {
        System.out.println("Читатель: " + nameReader + "\tКнига: " + author +"\tСтатус - "+ getBook);
    }
    public void returnBook() {
        System.out.println("Читатель вернул книгу");
    }
    public void search() {
    }
    public void issue() {
    }
    public void delay() {
    }
    public void orderBook() {

    }
    public void bringBook() {

    }
}
class Worker implements Role{
    String name;
    String date;

    public Worker(String name, String date){
        this.name = name;
        this.date = date;
    }

    public void search() {
    System.out.println();
    }
    public void issue() {
        System.out.println(name+" выдал книгу в "+ date);
    }
    public void delay() {
        System.out.println();
    }
    public void orderBook() {
        System.out.println(name + " заказал книгу во " + date);
    }
    public void takeBook() {
        System.out.println();
    }
    public void returnBook() {
        System.out.println(name+" вернул книгу в ");
    }

    public void bringBook(){
        System.out.println(name + " привез книгу в " + date);
    }
}


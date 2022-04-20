package LibraryApp;

import java.util.Scanner;

class Main {

  static Scanner scan = new Scanner(System.in);
  static Library library = new Library();

  public static void main(String[] args) {
    initLibraryData();

    String isContinue = "y";

    while (isContinue.equals("y")) {
      showMenu();
      int selectedMenu = chooseMenu();

      if (selectedMenu == 1) {
        showBooks();
      } else if (selectedMenu == 2) {
        showMembers();
      } else if (selectedMenu == 3) {
        addMember();
      } else if (selectedMenu == 4) {
        borrowBook();
      } else if (selectedMenu == 5) {
        returnBook();
      } else {
        System.out.println("wrong input");
      }

      System.out.print("continue ? ");
      isContinue = scan.next();
    }
  }

  public static void showMenu() {
    System.out.println("================================");
    System.out.println("1. show books list");
    System.out.println("2. show members list");
    System.out.println("3. add member");
    System.out.println("4. borrow book");
    System.out.println("5. return book");
    System.out.println("================================");
  }

  public static void initLibraryData() {
    Book book1 = new Book();
    book1.setId("1");
    book1.setTitle("Clean Code: A Handbook of Agile Software Craftsmanship");

    Book book2 = new Book();
    book2.setId("2");
    book2.setTitle("Design Patterns: Elements of Reusable Object-Oriented Software");

    Book book3 = new Book();
    book3.setId("3");
    book3.setTitle("Refactoring: Improving the Design of Existing Code");

    Reader member1 = new Reader();
    member1.setId("1");
    member1.setName("Ada Lovelace");

    Reader member2 = new Reader();
    member2.setId("2");
    member2.setName("Linus Torvalds");

    Reader member3 = new Reader();
    member3.setId("3");
    member3.setName("James Gosling");
    
    library.books.add(book1);
    library.books.add(book2);
    library.books.add(book3);

    library.members.add(member1);
    library.members.add(member2);
    library.members.add(member3);
  }

  public static int chooseMenu() {
    System.out.print("choose menu : ");
    int pilihan = scan.nextInt();
    return pilihan;
  }

  public static void showBooks() {
    for (Book book : library.books) {
      System.out.println(book.getId() + " " + book.getTitle());
    }
  }

  public static void showMembers() {
    for (Reader member : library.members) {
      System.out.println(member.getId() + " " + member.getName());
    }
  }

  public static void addMember() {
    Reader member = new Reader();

    System.out.print("id : ");
    member.setId(scan.next());

    System.out.print("name : ");
    member.setName(scan.next());

    library.addMember(member);
  }

  public static void borrowBook() {
    System.out.print("id member : ");
    String memberId = scan.next();

    System.out.print("id book : ");
    String bookId = scan.next();

    library.giveBook(memberId, bookId);
  }

  public static void returnBook() {
    System.out.print("id member : ");
    String memberId = scan.next();

    System.out.print("id book : ");
    String bookId = scan.next();

    library.receiveBook(memberId, bookId);
  }
}
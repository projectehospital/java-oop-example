package LibraryApp;

import java.util.ArrayList;

class Reader {
  private String id;
  private String name;
  private ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    @Override
    public String toString() {
        return "Reader{" + "id=" + id + ", name=" + name + ", borrowedBooks=" + borrowedBooks + '}';
    }

  public void receiveBook(Book book) {
      this.getBorrowedBooks().add(book);
  }

  public void giveBook(Book book) {
      this.getBorrowedBooks().remove(book);
  }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the borrowedBooks
     */
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    /**
     * @param borrowedBooks the borrowedBooks to set
     */
    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
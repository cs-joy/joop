package org.neutral_networks.opp1;

public class Books {
    private String bookName;
    private String bookCategory;
    private String accessNumber;
    private String bookAuthor;
    private String booksDepartment;

    // create constructor
    public Books(String bookName, String bookCategory, String accessNumber, String bookAuthor, String booksDepartment) {
        this.bookName = bookName;
        this.bookCategory = bookCategory;
        this.accessNumber = accessNumber;
        this.bookAuthor = bookAuthor;
        this.booksDepartment = booksDepartment;
    }

    // we can create multiple constructor in the class
    public Books(String bName, String author) {
        this.bookName = bName;
        this.bookAuthor = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBooksDepartment() {
        return booksDepartment;
    }

    public void setBooksDepartment(String booksDepartment) {
        this.booksDepartment = booksDepartment;
    }
}

package pl.coderslab.web;

public class Quote {

    private String author;
    private String content;


    public Quote(String author, String content) {
        this.author = author;
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }


    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }






}

import java.io.Serializable;

public class Quote implements Serializable {
    private long id;

    private String content;
    private String author;



    public Quote(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Quote(long id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

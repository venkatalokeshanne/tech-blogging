package fr.blogging.www.Model;

public class BlogEntity {
    
    private Integer id;
    private String title;
    private String link;
    private String date;
    private String author;
    private String src;
    private String description;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSrc() {
        return this.src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public BlogEntity() {
    }


    public BlogEntity(Integer id, String title, String link, String date, String author, String src, String description) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.date = date;
        this.author = author;
        this.src = src;
        this.description = description;
    }
    
}
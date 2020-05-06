package fr.blogging.www.Model;

public class WorldNews {
    private String id;
    private String status;
    private News[] articles;


    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public News[] getArticles() {
        return this.articles;
    }

    public void setArticles(News[] articles) {
        this.articles = articles;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
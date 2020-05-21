package fr.blogging.www.Model;

public class Store {
    private Integer id;
    private String name;
    private String slug;
    private String domain;
    private Integer games_count;
    private String image_background;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getGames_count() {
        return this.games_count;
    }

    public void setGames_count(Integer games_count) {
        this.games_count = games_count;
    }

    public String getImage_background() {
        return this.image_background;
    }

    public void setImage_background(String image_background) {
        this.image_background = image_background;
    }

}
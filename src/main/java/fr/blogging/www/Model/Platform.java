package fr.blogging.www.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Platform {
   private Integer id;
   private String name;
   private String slug;
   private String image;
   @JsonIgnore
   private Integer year_end;
   @JsonIgnore
   private Integer year_start;
   @JsonIgnore
   private Integer games_count;
   @JsonIgnore
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

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getYear_end() {
        return this.year_end;
    }

    public void setYear_end(Integer year_end) {
        this.year_end = year_end;
    }

    public Integer getYear_start() {
        return this.year_start;
    }

    public void setYear_start(Integer year_start) {
        this.year_start = year_start;
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
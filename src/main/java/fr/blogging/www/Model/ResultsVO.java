package fr.blogging.www.Model;

public class ResultsVO {
    private Integer id;
    private String slug;
    private String name;
    private String released;
    private Boolean tba;
    private String background_image;
    private Double rating;
    private String short_description;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleased() {
        return this.released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public Boolean isTba() {
        return this.tba;
    }

    public Boolean getTba() {
        return this.tba;
    }

    public void setTba(Boolean tba) {
        this.tba = tba;
    }

    public String getBackground_image() {
        return this.background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public Double getRating() {
        return this.rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
    

    public String getShort_description() {
        return this.short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

}
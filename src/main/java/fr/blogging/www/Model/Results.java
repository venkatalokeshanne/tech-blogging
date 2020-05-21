package fr.blogging.www.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Results {

    private Integer id;
    private String slug;
    private String name;
    private String released;
    private Boolean tba;
    private String background_image;
    private Double rating;
    private Integer rating_top;
    private Ratings[] ratings;
    private Integer ratings_count;
    private Integer reviews_text_count;
    private Integer added;
    private Added_by_status added_by_status;
    private Integer metacritic;
    private Integer playtime;
    private String user_game;
    private String reviews_count;
    private Integer suggestions_count;
    private Integer community_rating;
    private String saturated_color;
    private String dominant_color;
    private Platforms[] platforms;
    private Parent_platforms[] parent_platforms;
    private Genres[] genres;
    private Stores[] stores;
    @JsonIgnore
    private Clip clip;
    private Tags[] tags;
    private Short_screenshots[] short_screenshots;
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

    public Integer getRating_top() {
        return this.rating_top;
    }

    public void setRating_top(Integer rating_top) {
        this.rating_top = rating_top;
    }

    public Ratings[] getRatings() {
        return this.ratings;
    }

    public void setRatings(Ratings[] ratings) {
        this.ratings = ratings;
    }

    public Integer getRatings_count() {
        return this.ratings_count;
    }

    public void setRatings_count(Integer ratings_count) {
        this.ratings_count = ratings_count;
    }

    public Integer getReviews_text_count() {
        return this.reviews_text_count;
    }

    public void setReviews_text_count(Integer reviews_text_count) {
        this.reviews_text_count = reviews_text_count;
    }

    public Integer getAdded() {
        return this.added;
    }

    public void setAdded(Integer added) {
        this.added = added;
    }

    public Added_by_status getAdded_by_status() {
        return this.added_by_status;
    }

    public void setAdded_by_status(Added_by_status added_by_status) {
        this.added_by_status = added_by_status;
    }

    public Integer getMetacritic() {
        return this.metacritic;
    }

    public void setMetacritic(Integer metacritic) {
        this.metacritic = metacritic;
    }

    public Integer getPlaytime() {
        return this.playtime;
    }

    public void setPlaytime(Integer playtime) {
        this.playtime = playtime;
    }

    public String getUser_game() {
        return this.user_game;
    }

    public void setUser_game(String user_game) {
        this.user_game = user_game;
    }

    public String getReviews_count() {
        return this.reviews_count;
    }

    public void setReviews_count(String reviews_count) {
        this.reviews_count = reviews_count;
    }

    public Integer getSuggestions_count() {
        return this.suggestions_count;
    }

    public void setSuggestions_count(Integer suggestions_count) {
        this.suggestions_count = suggestions_count;
    }

    public Integer getCommunity_rating() {
        return this.community_rating;
    }

    public void setCommunity_rating(Integer community_rating) {
        this.community_rating = community_rating;
    }

    public String getSaturated_color() {
        return this.saturated_color;
    }

    public void setSaturated_color(String saturated_color) {
        this.saturated_color = saturated_color;
    }

    public String getDominant_color() {
        return this.dominant_color;
    }

    public void setDominant_color(String dominant_color) {
        this.dominant_color = dominant_color;
    }

    public Platforms[] getPlatforms() {
        return this.platforms;
    }

    public void setPlatforms(Platforms[] platforms) {
        this.platforms = platforms;
    }

    public Parent_platforms[] getParent_platforms() {
        return this.parent_platforms;
    }

    public void setParent_platforms(Parent_platforms[] parent_platforms) {
        this.parent_platforms = parent_platforms;
    }

    public Genres[] getGenres() {
        return this.genres;
    }

    public void setGenres(Genres[] genres) {
        this.genres = genres;
    }

    public Stores[] getStores() {
        return this.stores;
    }

    public void setStores(Stores[] stores) {
        this.stores = stores;
    }

    public Clip getClip() {
        return this.clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public Tags[] getTags() {
        return this.tags;
    }

    public void setTags(Tags[] tags) {
        this.tags = tags;
    }

    public Short_screenshots[] getShort_screenshorts() {
        return this.short_screenshots;
    }

    public void setShort_screenshots(Short_screenshots[] short_screenshots) {
        this.short_screenshots = short_screenshots;
    }

    public String getShort_description() {
        return this.short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }
    
    
}
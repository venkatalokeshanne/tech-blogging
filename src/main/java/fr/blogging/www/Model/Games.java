package fr.blogging.www.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Games {

    private Integer count;
    private String next;
    private String previous;
    private Results[] results;
    private String updated;
    private String seo_text;
    
    


    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return this.next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return this.previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public Results[] getResults() {
        return this.results;
    }

    public void setResults(Results[] results) {
        this.results = results;
    }

    public String getUpdated() {
        return this.updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getSeo_text() {
        return this.seo_text;
    }

    public void setSeo_text(String seo_text) {
        this.seo_text = seo_text;
    }
    

    
}
package fr.blogging.www.Model;

public class Stores {
  private Integer id;
  private Store store;
  private String url_en;
  private String url_ru;  


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getUrl_en() {
        return this.url_en;
    }

    public void setUrl_en(String url_en) {
        this.url_en = url_en;
    }

    public String getUrl_ru() {
        return this.url_ru;
    }

    public void setUrl_ru(String url_ru) {
        this.url_ru = url_ru;
    }

}
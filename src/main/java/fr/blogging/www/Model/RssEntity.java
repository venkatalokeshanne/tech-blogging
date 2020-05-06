package fr.blogging.www.Model;


public class RssEntity {

    private Integer id;
    private String title;
    private String link;
    private String date;
    private String author;

    public void setId(Integer id){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setLink(String link){
        this.link=link;
    }
    public String getLink(){
        return link;
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

    public RssEntity(String title,String link,String date,String author){
        this.title=title;
        this.link=link;
        this.date=date;
        this.author=author;
    }
	public RssEntity() {
	}
}
package fr.blogging.www.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import fr.blogging.www.Model.BlogEntity;
import fr.blogging.www.Model.RssEntity;
import fr.blogging.www.Model.WorldNews;
import fr.blogging.www.service.BlogService;
import fr.blogging.www.service.TechNewsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class TechNewsController {

    @Autowired
    private TechNewsService techNewsService;

    @Autowired
    private BlogService blogService;

    final static Logger log = Logger.getLogger(TechNewsController.class);

    @GetMapping("/rssData")
    public String saveRssData() throws SAXException, IOException, DOMException, ParseException 
    {
        RssEntity rss = new RssEntity();
        techNewsService.saveRssData(rss);
        return "Rss Data added";
    }
    
    @GetMapping("/listOfRssData")
    public List<RssEntity> getListOfRss()
    {
        List<RssEntity> rssList=null;
        try
        {
        rssList = techNewsService.getListOfRss(rssList);
        }
        catch(Exception e){
        }
        return rssList;
    }

    @PostMapping("/saveBlog")
    public String saveBlog(@RequestBody BlogEntity blog){
        try {
         blogService.saveBlog(blog);
        } catch (Exception e) {
            
        }
        return "Blog Added successfully";
    }

    @GetMapping("/worldData")
    public String worldData()
    {
        WorldNews worldNews = new WorldNews();
        techNewsService.worldData(worldNews);
        return "World Data added";
    }
    
}
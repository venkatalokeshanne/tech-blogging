package fr.blogging.www.controllers;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import fr.blogging.www.Model.BlogEntity;
import fr.blogging.www.Model.Games;
import fr.blogging.www.Model.Results;
import fr.blogging.www.Model.ResultsVO;
import fr.blogging.www.Model.RssEntity;
import fr.blogging.www.Model.WorldNews;
import fr.blogging.www.VO.WorldNewsVO;
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

    @GetMapping("/listOfNews")
    public List<WorldNewsVO> getListOfNews()
    {
        List<WorldNewsVO> newsList=null;
        try
        {
        newsList = techNewsService.getListOfNews(newsList);
        }
        catch(Exception e){
        }
        return newsList;
    }



    @GetMapping("/games")
    public List<ResultsVO> getListOfGames()
    {
        List<ResultsVO> gamesList= new ArrayList<>();
        Games game = new Games();
        try
        {
            RestTemplate restTemplate = new RestTemplate();
            
            System.setProperty("https.protocols", "TLSv1.2,TLSv1.1,SSLv3");
            ObjectMapper objectMapper = new ObjectMapper();
            game = objectMapper.readValue(new File("src/main/resources/test.json"), Games.class);
            
            for(int i=0;i<game.getResults().length;i++){
                ResultsVO resultsVO = new ResultsVO();
            resultsVO.setId(game.getResults()[i].getId());
            resultsVO.setName(game.getResults()[i].getName());
            resultsVO.setBackground_image(game.getResults()[i].getBackground_image());
            log.debug("image::"+resultsVO.getBackground_image());
            resultsVO.setRating(game.getResults()[i].getRating());
            resultsVO.setReleased(game.getResults()[i].getSlug());
            resultsVO.setTba(game.getResults()[i].getTba());
            resultsVO.setShort_description(game.getResults()[i].getShort_description());

            gamesList.add(resultsVO);
            }

        }
        catch(Exception e){
            log.debug("exception::"+e);
        }
        return gamesList;
    }




    
}
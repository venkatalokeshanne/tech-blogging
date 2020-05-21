package fr.blogging.www.serviceImplimentation;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.blogging.www.DAO.TechNewsDAO;
import fr.blogging.www.Model.News;
import fr.blogging.www.Model.RssEntity;
import fr.blogging.www.Model.WorldNews;
import fr.blogging.www.VO.WorldNewsVO;
import fr.blogging.www.service.TechNewsService;

@Service
public class TechNewsServiceImpl implements TechNewsService {

    final static Logger log = Logger.getLogger(TechNewsServiceImpl.class);

    @Autowired
    TechNewsDAO techNewsDAO;

    public void saveRssData(RssEntity rss) throws SAXException, IOException, DOMException, ParseException {
        String url = "https://code.tutsplus.com/posts.atom";
        DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            DocumentBuilder builder = doc.newDocumentBuilder();
            Document docment = builder.parse(url);

            NodeList entityList = docment.getElementsByTagName("entry");
            for (int i = 0; i <= entityList.getLength(); i++) {
                Node entity = entityList.item(i);
                if (entity != null) {
                    if (entity.getNodeType() == Node.ELEMENT_NODE) {
                        Element e = (Element) entity;
                        date = inputFormat.parse(e.getElementsByTagName("updated").item(0).getTextContent());
                        String formattedDate = outputFormat.format(date);
                        // Date formatDate = outputFormat.parse(formattedDate);
                        rss.setTitle(e.getElementsByTagName("title").item(0).getTextContent());
                        rss.setLink(e.getElementsByTagName("link").item(0).getAttributes().getNamedItem("href")
                                .getNodeValue());
                        rss.setAuthor(e.getElementsByTagName("author").item(0).getTextContent().trim());
                        log.debug("author is::" + rss.getAuthor().trim());
                        rss.setDate(formattedDate);
                        techNewsDAO.saveRssData(rss);
                        log.debug("Title is::" + rss);
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<RssEntity> getListOfRss(List<RssEntity> rssList) {
        rssList = techNewsDAO.getListOfRss(rssList);
        return rssList;
    }

    @Override
    public void worldData(WorldNews worldNews) {
       
        RestTemplate restTemplate = new RestTemplate();
        worldNews = restTemplate.getForObject("http://newsapi.org/v2/top-headlines?country=us&apiKey=2b67fc6d87944e0a8dc0c8ba33465881", WorldNews.class);
       
        for (News news : worldNews.getArticles()) {
         techNewsDAO.worldDataAdd(news,worldNews.getStatus(),worldNews.getId());
        log.debug("get author::"+news.getAuthor());
}
    }

    @Override
    public List<WorldNewsVO> getListOfNews(List<WorldNewsVO> newsList) {
        newsList = techNewsDAO.getListOfNews(newsList);
        return newsList;
    }

}
package fr.blogging.www.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import fr.blogging.www.Model.RssEntity;
import fr.blogging.www.Model.WorldNews;

public interface TechNewsService {

    void saveRssData(RssEntity rss) throws SAXException, IOException, DOMException, ParseException;

	List<RssEntity> getListOfRss(List<RssEntity> rssList);

	void worldData(WorldNews worldNews);
    
}
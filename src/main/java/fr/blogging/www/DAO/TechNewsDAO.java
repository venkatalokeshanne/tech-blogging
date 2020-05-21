package fr.blogging.www.DAO;

import java.util.List;

import fr.blogging.www.Model.News;
import fr.blogging.www.Model.RssEntity;
import fr.blogging.www.Model.WorldNews;
import fr.blogging.www.VO.WorldNewsVO;

public interface TechNewsDAO {

    void saveRssData(RssEntity rss);

	List<RssEntity> getListOfRss(List<RssEntity> rssList);

	void worldDataAdd(News news, String status, String id);

	List<WorldNewsVO> getListOfNews(List<WorldNewsVO> newsList);

    
}
package fr.blogging.www.DAOimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.blogging.www.DAO.TechNewsDAO;
import fr.blogging.www.Model.News;
import fr.blogging.www.Model.RssEntity;
import fr.blogging.www.Model.WorldNews;
import fr.blogging.www.VO.WorldNewsVO;

@Repository
public class TechNewsDAOimpl implements TechNewsDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    final static Logger log = Logger.getLogger(TechNewsDAOimpl.class);

    @Override
    public void saveRssData(RssEntity rss) {

        String sql = "Insert into rssTech(title,link,date,author) values('" + rss.getTitle() + "','" + rss.getLink()
                + "','" + rss.getDate() + "','" + rss.getAuthor() + "')";
        log.debug("sql::" + sql);
        jdbcTemplate.update(sql);
    }

    @Override
    public List<RssEntity> getListOfRss(List<RssEntity> rssList) {
        String sql = "Select * from rssTech";
        rssList = jdbcTemplate.query(sql, new RowMapper<RssEntity>() {

            @Override
            public RssEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
                RssEntity rssEntity = new RssEntity();
                rssEntity.setTitle(rs.getString("title"));
                rssEntity.setLink(rs.getString("link"));
                rssEntity.setDate(rs.getString("date"));
                rssEntity.setAuthor(rs.getString("author"));
                log.debug("pojo ::" + rssEntity);
                return rssEntity;
            }
        });
        log.debug("list of pojo ::" + rssList);
        return rssList;
    }

    @Override
    public void worldDataAdd(News news, String status, String id) {
        try {
            if (news.getContent() != null) {
                String sql = "Insert into world_news(source,status,author,content,description,publishedAt,title,url,urlToImage) values('"
                        + news.getSource().getName() + "','" + status + "','" + news.getAuthor().replace("'", "''")
                        + "','" + news.getContent().replace("'", "''") + "','"
                        + news.getDescription().replace("'", "''") + "','" + news.getPublishedAt().replace("'", "''")
                        + "','" + news.getTitle().replace("'", "''") + "','" + news.getUrl().replace("'", "''") + "','"
                        + news.getUrlToImage().replace("'", "''") + "')";
                log.debug("sql::" + sql);
                jdbcTemplate.update(sql);
            }
        } catch (NullPointerException e) {

        }
    }

    @Override
    public List<WorldNewsVO> getListOfNews(List<WorldNewsVO> newsList) {
        String sql = "Select * from world_news";
        newsList = jdbcTemplate.query(sql, new RowMapper<WorldNewsVO>() {

            @Override
            public WorldNewsVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                WorldNewsVO newsEntity = new WorldNewsVO();
                newsEntity.setTitle(rs.getString("title"));
                newsEntity.setUrl(rs.getString("url"));
                newsEntity.setPublishedAt(rs.getString("publishedAt"));
                newsEntity.setAuthor(rs.getString("author"));
                newsEntity.setDescription(rs.getString("description"));
                newsEntity.setName(rs.getString("source"));
                newsEntity.setUrlToImage(rs.getString("urlToImage"));
                log.debug("pojo ::" + newsEntity);
                return newsEntity;
            }
        });
        log.debug("list of pojo ::" + newsList);
        return newsList;
    }
    
}
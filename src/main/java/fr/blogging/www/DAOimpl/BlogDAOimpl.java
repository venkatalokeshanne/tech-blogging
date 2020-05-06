package fr.blogging.www.DAOimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.blogging.www.DAO.BlogDAO;
import fr.blogging.www.Model.BlogEntity;

@Repository
public class BlogDAOimpl implements BlogDAO {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public void saveBlog(BlogEntity blog) {
       String sql = "Insert into blog(title,link,date,author,src,description) values('"+blog.getTitle()+"','"+blog.getLink()+"','"+blog.getDate()+"','"+blog.getAuthor()+"','"+blog.getSrc()+"','"+blog.getDescription()+"')";
        jdbcTemplate.update(sql);
    }

    
    
}
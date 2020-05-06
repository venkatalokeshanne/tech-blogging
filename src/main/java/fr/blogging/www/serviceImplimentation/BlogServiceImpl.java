package fr.blogging.www.serviceImplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.blogging.www.DAO.BlogDAO;
import fr.blogging.www.Model.BlogEntity;
import fr.blogging.www.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    public BlogDAO blogDAO;

    @Override
    public void saveBlog(BlogEntity blog) {
       blogDAO.saveBlog(blog);
    }
    
}
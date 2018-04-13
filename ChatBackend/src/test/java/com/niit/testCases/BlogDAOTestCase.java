package com.niit.testCases;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.BlogDAO;
import com.niit.model.Blog;

import junit.framework.Assert;

public class BlogDAOTestCase {
	static BlogDAO blogDAO;

	@BeforeClass
    public static void initialize()
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.niit");
    	context.refresh();
    	
    	 blogDAO = (BlogDAO)context.getBean("blogDAO");
    	
    }
	@Ignore
	@Test
    public void addBlogTest()
    {
    	Blog blog=new Blog();
    	blog.setBlogName("Selen testing");
    	blog.setBlogContent("Blog specific to Selenium");
    	blog.setLikes(2);
    	blog.setLoginname("Rony");
    	blog.setStatus("A");
    	blog.setCreateDate(new java.util.Date());
    	
    	assertTrue("problem in blog insertion", blogDAO.addBlog(blog));
    	
    }
@Ignore	
@Test
public void deleteBlogTest()
{
	assertTrue("Problem in blog deletion",blogDAO.deleteBlog(959));
}

/*@Test
public void updateBlogTest()
{
	assertTrue("Problem in blog deletion",blogDAO.updateBlog(955));
}
/*@Test
public void deleteBlogTest() 
{
	Blog blogId = blogDAO.getBlog(953);
	Assert.assertEquals(true, blogDAO.deleteBlog(blogId));
	
}*/



@Ignore
@Test
public void rejectBlogTest()
{
	Blog blog=blogDAO.getBlog(954);
	assertTrue("Problem in blog rejection",blogDAO.rejectBlog(blog));
}
@Ignore
@Test
public void approveBlogTest()
{
	Blog blog=blogDAO.getBlog(954);
	assertTrue("Problem in blog rejection",blogDAO.approveBlog(blog));
}
//@Ignore
@Test
public void listBlogsByUserTest()
{
	List<Blog> listBlogs=blogDAO.listBlogs("Meghna");
	assertTrue("Problem in listing the Blog",listBlogs.size()>0);
	
	for(Blog blog:listBlogs)
	{
		System.out.println(blog.getBlogName()+":::");
		System.out.println(blog.getBlogContent()+":::");
		System.out.println(blog.getLoginname());
	}
	
}
@Ignore
@Test
public void increamentBlogLikeTest()
{
	Blog blog=blogDAO.getBlog(954);
	assertTrue("Problem in blog rejection",blogDAO.incrementLikes(blog));
}



}


package io.egen.rentalflix;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {

	@BeforeClass
	public  static void beforeClass(){
		System.out.print("Starting JUNIT");
	}
	MovieService ms = new MovieService();
	Movie m = new Movie(1,"Hero",1999,"English");
	Movie m1 = new Movie(2,"SpiderMan",2000,"English");
	Movie m2=  new Movie(3,"Judwa",1996,"Hindi");
	Movie m3 = new Movie(4,"X-Men",2006,"English");
	Movie m4 = new Movie(5,"Paa",2008,"Hindi");
	
	
	
	@Test
	public void findAll()
	{
		MovieService ms = new MovieService();
		MovieService.mov.add(m);
		MovieService.mov.add(m1);
		MovieService.mov.add(m2);
		MovieService.mov.add(m3);
		MovieService.mov.add(m4);
		List<Movie> u = ms.findAll();
		for(Movie d:u){
			Assert.assertEquals(true,MovieService.mov.contains(d));
		}
		
	}
	@Test
	public void findbyName(){
		MovieService ms = new MovieService();
		List<Movie> u = ms.findByName("Hero");
		for(Movie d:u){
			Assert.assertEquals(true,MovieService.mov.contains(d));
		}
	}
	@Test
	public void create(){
		MovieService ms = new MovieService();
		Movie i = new Movie(6,"ZNMD",2012,"Hindi");
		Movie m = ms.create(i);
		Assert.assertEquals(true,MovieService.mov.contains(m));

	}
	@Test
	public void update(){
		MovieService ms = new MovieService();
		Movie i = new Movie(2,"ZNMD",2012,"Hindi");
		Movie m = ms.update(i);
		Assert.assertEquals(m,i);
	}
	@Test(expected=IllegalArgumentException.class)
	public void updateEx(){
		Movie it = new Movie(8,"ZNMD",2012,"Hindi");
		Movie m = ms.update(it);
	}
	@Test
	public void delete(){
		MovieService mst = new MovieService();
		Movie i = mst.delete(5);
		Assert.assertEquals(true,i.getId()==m4.getId());
	}
	@Test(expected=IllegalArgumentException.class)
	public void deleteEx(){
		MovieService mst = new MovieService();
		Movie i = mst.delete(7);
	}
	@Test
	public void rent(){
		MovieService mst = new MovieService();
		boolean t = mst.rentMovie(4,"Harmeet");
		Assert.assertEquals(true,t);
	}
	@Test(expected=IllegalArgumentException.class)
	public void rented(){
		MovieService mst = new MovieService();
		mst.hm.put(4,"Harry");
		boolean t = mst.rentMovie(4,"Harmeet");
	}
}

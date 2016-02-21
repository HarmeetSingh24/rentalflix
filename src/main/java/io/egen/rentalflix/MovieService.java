package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */

public class MovieService implements IFlix {
	//MovieService ms = new MovieService();
	
	static HashMap<Integer,String> hm = new HashMap<Integer,String>();
	public static List<Movie> mov = new ArrayList<Movie>();
	
	public List<Movie> findAll() {
		List<Movie> y = new ArrayList<Movie>();
		for(Movie k : mov){
			y.add(k);
		}

		// TODO Auto-generated method stub
		return mov;
	}

	public List<Movie> findByName(String name) {
		// TODO Auto-generated method stub
		System.out.print(mov.size());
		List<Movie> t = new ArrayList<Movie>();
		for(Movie m:mov){
			if(m.getTitle().equals(name)){
				t.add(m);
			}
		}
		return t;
	}

	public Movie create(Movie movie) {
		// TODO Auto-generated method stub
		mov.add(movie);
		return movie;
	}

	public Movie update(Movie movie) {
		// TODO Auto-generated method stub
		boolean b= false;

		for(Movie m:mov){
			if(m.getId()==movie.getId()){
				mov.remove(m);
				mov.add(movie);
				b = true;
				break;
			}
		}
		if(b==false){
			throw new IllegalArgumentException("No such movie found");
		}
		return movie;
	}

	public Movie delete(int id) {
		
		// TODO Auto-generated method stub
		Movie movie = null;
		boolean bt= false;
		System.out.print(mov.size());
		for(Movie m:mov){
			if(m.getId()==id){
				System.out.print("JEL");
				movie = m;
				mov.remove(m);
				bt = true;
				break;
			}
		}
		if(bt==false){
			throw new IllegalArgumentException("No such movie found");
		}
		return movie;

	}

	public boolean rentMovie(int movieId, String user) {
		// TODO Auto-generated method stub
		boolean b = false;
		if(hm.get(movieId)==null){
			hm.put(movieId, user);
			b = true;
		}
		else{
			throw new IllegalArgumentException("No such movie found");
		}
		return b;
	}

	

}
/*
@Override
public List<Movie> findAll() {
	List<Movie> y = new ArrayList<Movie>();
	for(Movie k : mov){
		y.add(k);
	}
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Movie> findByName(String name) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Movie create(Movie movie) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Movie update(Movie movie) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Movie delete(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean rentMovie(int movieId, String user) {
	// TODO Auto-generated method stub
	return false;
}
*/
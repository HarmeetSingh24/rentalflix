package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {
	//POJO IMPLEMENTATION GOES HERE
	static int id;
	static String title;
	static int year;
	static String language;
	Movie(int id,String title,int year,String language){
		Movie.id =id;
		Movie.title=title;
		Movie.year=year;
		Movie.language=language;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Movie.id = id;
	}
	public static String getTitle() {
		return title;
	}
	public static void setTitle(String title) {
		Movie.title = title;
	}
	public static int getYear() {
		return year;
	}
	public static void setYear(int year) {
		Movie.year = year;
	}
	public static String getLanguage() {
		return language;
	}
	public static void setLanguage(String language) {
		Movie.language = language;
	}
}


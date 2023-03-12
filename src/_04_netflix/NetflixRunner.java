package _04_netflix;

public class NetflixRunner {
public static void main(String[] args) {
	Movie movie1 = new Movie("Why your mom is fat", 2);
	Movie movie2 = new Movie("Why your docter diagnosed you with chronic depression", 1);
	Movie movie3 = new Movie("Why you are schizophrenic", 14);
	Movie movie4 = new Movie("You are depressed", -4);
	Movie movie5 = new Movie("Why your father left you",1);
	System.out.println(movie1.getTicketPrice());
	System.out.println(movie2.getTicketPrice());
	System.out.println(movie3.getTicketPrice());
	System.out.println(movie4.getTicketPrice());
	System.out.println(movie5.getTicketPrice());
	NetflixQueue movieQueue = new NetflixQueue();
	movieQueue.addMovie(movie1);
	movieQueue.addMovie(movie2);
	movieQueue.addMovie(movie3);
	movieQueue.addMovie(movie4);
	movieQueue.addMovie(movie5);
}
}

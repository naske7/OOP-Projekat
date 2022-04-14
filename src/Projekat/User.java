package Projekat;

public class User {

	private String firstname;
	private String lastname;
	private String favoriteclub;

	public User(String firstname, String lastname, String favoriteclub) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.favoriteclub = favoriteclub;
	}
	
	@Override
	public String toString() {
			return "Full name: " + firstname + " " + lastname + "\nFavorite club: " + favoriteclub;
	}
}

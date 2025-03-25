package one_to_many;

public class User {
	Post[] posts;
	String userName;
	static int count = 0;
	public User(int size, String userName) {
		this.posts = new Post[size];
		this.userName = userName;
	}
	public void addPost(Post post) {
		if(count  < posts.length) {
			posts[count++] = post;
			System.out.println("Posts added");
		}
		else {
			System.out.println("Cannot add Posts, the array is filled");
		}
	}
	public void displayPosts() {
		for(int i = 0; i < count; i++) {
			Post p = posts[i];
			System.out.println(p.postId + " " + p.description);
		}
	}

}

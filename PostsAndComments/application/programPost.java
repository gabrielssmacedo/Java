package application;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Post;

public class programPost {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Post> posts = new ArrayList<>();

		char newPost = 'p';
		char newComment = 'c';
		boolean continued = false;
		do {
			while(newPost == 'p') {
				System.out.println("Make a new post: ");
				
				System.out.print("Enter: ");
				String content = sc.nextLine();
				System.out.print("Title: ");
				String title = sc.nextLine();
				posts.add(new Post(Instant.now(), title, content));
				System.out.println("Do you want make a another post (p/n)?");
				newPost = sc.next().charAt(0);
				sc.nextLine();
			}

			System.out.println("Find a post:");
			showPosts(posts);
			
			while(newComment == 'c') {
				System.out.print("\nWhat post do you want to comment? ");
				int numberPost = sc.nextInt();
				for (int i = 0; i < posts.size(); i++) {
					if (numberPost - 1 == i) {
						System.out.print("\nMake a comment: ");
						sc.nextLine();
						String comment = sc.nextLine();
						posts.get(i).addComment(comment);
						System.out.println("Do you want add a like (y/n)? ");
						char resp = sc.next().charAt(0);
						if (resp != 'n')
							posts.get(i).addLike();
					}
				}
				System.out.println("Do you want make a new comment (c/n)? ");
				newComment = sc.next().charAt(0);
			}

			showPosts(posts);
			
			System.out.println("Do you make a new post, comment or exit (p/c/e)? ");
			char response = sc.next().charAt(0);
			
			if(response == 'c'){
				newPost = 'c';
				newComment = 'c';
				continued = true;
			}
			else if(response == 'p') {
				newPost = 'p';
				continued = true;
			}
			else {
				continued = false;
			}
		} while (continued);

		System.out.println("\nFim do Programa");

		sc.close();
	}

	public static void showPosts(List<Post> posts) {
		for (int i = 0; i < posts.size(); i++) {
			System.out.printf("\nPost #%d:\n", i + 1);
			System.out.print(posts.get(i) + "\n");
		}
	}
}

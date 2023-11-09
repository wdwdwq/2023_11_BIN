import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);

		int articleCount = 0;

		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.printf("명령어) ");
			String cmd = sc.nextLine().trim();

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}

			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("article write")) {

				articleCount++;

				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String content = sc.nextLine();

				Article article = new Article(articleCount, title, content);

				articles.add(article);

				System.out.println(articleCount + "번 게시물이 생성되었습니다");
			} else if (cmd.equals("article list")) {

				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다");
					continue;
				}

				System.out.println("번호	/	제목");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					System.out.printf("%d	/	%s\n", article.id, article.title);
				}

			} else {

				System.out.println("올바른 명령어를 입력해주세요");
			}
		}

		System.out.println("== 프로그램 끝 ==");

		sc.close();

	}
}

class Article {
	int id;
	String title;
	String content;

	Article(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
}
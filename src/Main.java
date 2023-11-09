import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);
		int articleCount = 0;

		while (true) {
			System.out.println("명령어)");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("exit")) {
				break;
			} else if (cmd.equals("article write")) {
				System.out.println("제목: ");
				String title = sc.nextLine();
				System.out.println("내용: ");
				String content = sc.nextLine();
				articleCount++;
				System.out.println(articleCount + "번 게시물이 생성되었습니다");

			} else {
				System.out.println("올바른 명령어를 입력해주세요");
			}

		}

		System.out.println("==프로그램 끝==");

		sc.close();
	}

}

import java.util.Scanner;
public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String txt="";
        for (int i = 0; i < n; i++) {
            int code = Integer.parseInt(scanner.nextLine());
            int count = 0;
            int number = 0;
            while (code != 0) {
                count++;
                number = code % 10;
                code /= 10;
            }
            if (number == 0) {
                txt += " ";
            } else {
                int otm = (number - 2) * 3;
                if (number == 9 || number == 8) {
                    otm++;
                }
                int index = (otm + count - 1);
                int word = 97 + index;
                char finalWord = (char) word;
                txt += finalWord;
            }
        }
        System.out.println(txt);
    }
}


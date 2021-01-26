/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.Scanner;
import java.io.File;

public class ReadHelloFile {
    public static void main(String[] args) {
        try {        
            Scanner sc = new Scanner(new File("hello.txt"));
            while (sc.hasNext()) { // 파일에 데이터가 남았는지 확인
                String line = sc.nextLine(); 
                System.out.println(line);
            }
            sc.close();    
        }
        catch (Exception e) { e.printStackTrace(); }
    }
}

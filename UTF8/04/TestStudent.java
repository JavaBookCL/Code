/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("김규상", 4.1, 3);
        Student s2 = new Student("김민재", 3.71, 5);
        Student s3 = new Student("김용하", 3.93, 7);

        if (s1.getGPA() >= 3.5 && s1.getIncomeLevel() <= 5) {
            System.out.printf("%s학생은 장학생 후보입니다\n", s1.getName());
        }
        if (s2.getGPA() >= 3.5 && s2.getIncomeLevel() <= 5) {
            System.out.printf("%s학생은 장학생 후보입니다\n", s2.getName());
        }
        if (s3.getGPA() >= 3.5 && s3.getIncomeLevel() <= 5) {
            System.out.printf("%s학생은 장학생 후보입니다\n", s3.getName());
        }
    }
}

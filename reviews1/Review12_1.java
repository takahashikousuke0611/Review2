package reviews.reviews1;

public class Review12_1 {
    public static void main(String[] args) {
        int age = 105;
        if (age <= 17){
        System.out.println("未成年");
    } else if(age <=64){
        System.out.println("成人");
    } else if(age >=65) {
            System.out.println("高齢者");
        }else {
            System.out.println("この年齢は無効です。");
        }
    }
}

package reviews.reviews3;

public class Reviw28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力>");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body = br.readLine();
        Email email = new Email;
        if(subject.isEmpty()) {
            send(to, body);
        } else {
            send(to,subject,body);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        {
            post.birthdate = new FormDate();
            post.birthdate.day = 13;
            post.birthdate.month = 6;
            post.birthdate.year = 1999;
        }
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}

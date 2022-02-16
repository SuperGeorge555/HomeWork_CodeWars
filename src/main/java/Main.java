public class Main {
    public static void main(String[] args) {

        Office[] offices = new Office[]{
                new Office("Ivan", 5),
                new Office("Stacy", 6),
                new Office("Nikolay", 1),
                new Office("Lead", 6)
        };
        System.out.println(Office.happinesRating(offices));

        Person[] person = new Person[]{
                new Person("Ivan", ""),
                new Person("Mikhail", "Ivanov"),
                new Person("Sergey", "Petrov"),
                new Person("Natalya", "Fedorova"),
                new Person("Alina", "Sergeeva-Ostpyeva"),
                new Person("Inna", "Nikiforova")
        };
        for (int i = 0; i < person.length; i++) {
            System.out.println(Person.getFullName(person[i]));
        }

    }
}

public class Office {
    final String name;
    final int happines;

    public Office(String name, int happines) {
        this.happines = happines;
        this.name = name;
    }

    public static String happinesRating(Office[] offices) {
        int averageSum = 0;
        for (int i = 0; i < offices.length; i++) {
            if (offices[i].getName().equals("Lead")) averageSum += offices[i].getHappines() * 2;
            else averageSum += offices[i].getHappines();
        }
        if (averageSum / offices.length <= 5) return "Get Out Now!";
        else return "Nice Work Champ!";
    }

    public String getName() {
        return name;
    }

    public int getHappines() {
        return happines;
    }
}

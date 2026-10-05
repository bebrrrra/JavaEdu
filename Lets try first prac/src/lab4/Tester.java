package lab4;

public class Tester {
    public static void main(String[] args) {

        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + myFavoriteSeason.getDescription());
        System.out.println();

        printSeasonMessage(myFavoriteSeason);
        printSeasonMessage(Season.WINTER);
        System.out.println();

        System.out.println("=== Все времена года ===");
        for (Season season : Season.values()) {
            System.out.printf("%-6s | Средняя температура: %3d°C | Описание: %s%n",
                    season, season.getAverageTemperature(), season.getDescription());
        }
    }


    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}

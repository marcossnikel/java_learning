//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Screen Match!");
        System.out.println("Filme : Top gun");

        int year = 2022;
        System.out.println("Launch: " + year);
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Action movie with beauty from 80's";
        System.out.println(sinopse);
        int rating = (int) (media/2);
        System.out.println(rating);
        double celsiusTemperature = 36.5;

        System.out.println(convertCelciusToFahrenheit(celsiusTemperature));
    }

    public static double convertCelciusToFahrenheit(double celcius) {
        return celcius * 1.8 + 32;
    }
}
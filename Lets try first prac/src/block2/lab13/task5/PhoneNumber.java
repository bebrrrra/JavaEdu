package block2.lab13.task5;

public class PhoneNumber {

    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String formatNumber() {
        String countryCode;
        String phone;

        if (number.startsWith("+")) {
            countryCode = number.substring(0, number.length() - 10);
            phone = number.substring(number.length() - 10);
        } else {
            countryCode = "+7";
            phone = number.substring(1);
        }

        return countryCode + "-"
                + phone.substring(0, 3) + "-"
                + phone.substring(3, 6) + "-"
                + phone.substring(6, 10);
    }
}

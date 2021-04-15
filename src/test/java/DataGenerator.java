import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static class Registration {
        private Registration() {
        }

        public static ClientData generateClientPersonalData(String locale) {
            Faker faker = new Faker(new Locale("ru"));
            return new ClientData(
                    generateRandomCityFromTheList(),
                    faker.name().fullName(),
                    faker.phoneNumber().phoneNumber()
            );
        }
    }
}

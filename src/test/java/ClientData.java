import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

public class ClientData {
    public ClientData(String fullName, String cellPhone, String cityName) {
    }

    @Data
    @RequiredArgsConstructor
    public class RegistrationByCardInfo {
        private final String name;
        private final String card;
        private final LocalDate cardExpire;
    }
}

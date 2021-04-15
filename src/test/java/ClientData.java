import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

public class ClientData {
    @Data
    @RequiredArgsConstructor
    public class RegistrationByCardInfo {
        private final String name;
        private final String card;
        private final LocalDate cardExpire;
    }

}

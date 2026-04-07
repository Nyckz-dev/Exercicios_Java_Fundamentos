void main() {


    LocalDateTime now = LocalDateTime.now();
    ZonedDateTime brt = now.atZone(ZoneId.of("America/Sao_Paulo"));
    ZonedDateTime utc = brt.withZoneSameInstant(ZoneId.of("UTC"));
    System.out.println("Horário brt: " + brt);
    System.out.println("Horário utc: " + utc);
}

/*
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        ZonedDateTime brt = agora.atZone(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime utc = brt.withZoneSameInstant(ZoneId.of("UTC"));

        System.out.println("Hora em BRT: " + brt);
        System.out.println("Hora em UTC: " + utc);
    }
}

 */
package Task13_13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task17_18 {
	 public static void main(String[] args) {
	        ZoneId zone1 = ZoneId.of("Zulu");
	        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
	        System.out.println(ZonedDateTime.now(zone1));
	        System.out.println(ZonedDateTime.now(zone2));

	        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
	        System.out.println(time);
	    }

	    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
	        ZonedDateTime timeOfZone1 = ZonedDateTime.of(fromDateTime, fromZone);
	        ZonedDateTime timeOfZone2 = timeOfZone1.withZoneSameInstant(toZone);
	        LocalDateTime toZone2 = timeOfZone2.toLocalDateTime();
	        return toZone2;
	    }
	}


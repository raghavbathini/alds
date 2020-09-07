package corejava.practice;

import java.sql.Timestamp;
import java.time.ZoneId;

public class RandomeTimestamps {

	public static void main(String[] args) {
		long offset = Timestamp.valueOf("2012-08-06 00:00:00").getTime();
		long end = Timestamp.valueOf("2013-08-10 00:00:00").getTime();
		long diff = end - offset + 1;
		Timestamp rand = new Timestamp(offset + (long)(Math.random() * diff));
		System.out.println(rand);
		System.out.println(rand.getTime());
//		Long.toString(rand.atZone(ZoneId.of("UTC")).toInstant().toEpochMilli()));

	}

}

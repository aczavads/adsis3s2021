package aula20210524.uuids;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class AppUUIDs {
	
	public static void main(String[] args) {
		Set<String> ids = new HashSet<>();
		
		for (int i = 0; i < 1000000; i++) {
			ids.add(UUID.randomUUID().toString());
		}
		
		System.out.println(ids.size());
	}

}

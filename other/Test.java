package other;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		sortMapByVaues();
		findCommonElementInTwoList();
		
	}

	private static void findCommonElementInTwoList() {
		List<Integer> list1 = List.of(1, 2, 3, 4, 5);
		List<Integer> list2 = List.of(4, 5, 6, 7, 8);
		
		List<Integer> list =list1.stream().filter(n-> Collections.frequency(list2, n)>=1).collect(Collectors.toList());
		System.out.println(list);
	}

	private static void sortMapByVaues() {
		Map<String, Integer> scores = Map.of(
		        "Amit", 85,
		        "Ravi", 92,
		        "Raj", 75,
		        "Suresh", 89
		);
		
		
		Map<Object, Object> map = scores.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
		
		System.out.println(map);
		
	}
}

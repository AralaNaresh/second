package imn.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="prcicvaccy";
		Map<String, Long>map= Arrays.stream(st.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}

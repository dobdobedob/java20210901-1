package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
	public ArrayList<Integer> evenList(List<Integer> list) {
		
		// list의 짝수 아이템들만 모은 새 ArrayList를 만들어서 리턴
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int item : list) {
			if ((item % 2) == 0) {
				result.add(item);
			}
		}
		
		return result;
	}
}

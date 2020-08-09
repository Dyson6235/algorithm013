import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca =  s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        // 忘记了hashmap还有一个values()方法
        return new ArrayList(ans.values());
    }
}

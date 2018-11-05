package algorithms.hashtable.easy.SubdomainVisitCount;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : cpdomains) {
        	String[] split = str.split(" ");
        	int cnt = Integer.valueOf(split[0]);
        	String domain = split[1];
        	String[] subDomain = domain.split("\\.");
        	if(subDomain.length == 2) {
        		map.put(domain, map.getOrDefault(domain, 0)+cnt);
        		map.put(subDomain[1], map.getOrDefault(subDomain[1], 0)+cnt);
        	} else {
        		map.put(domain, map.getOrDefault(domain, 0)+cnt);
        		map.put(subDomain[1]+"."+subDomain[2], map.getOrDefault(subDomain[1]+"."+subDomain[2], 0)+cnt);
        		map.put(subDomain[2], map.getOrDefault(subDomain[2], 0)+cnt);
        	}
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
        	res.add(entry.getValue() + " " + entry.getKey());
        }
        return res;
    }
}

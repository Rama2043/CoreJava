package Assignments.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount811 {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        Solution s = new Solution();
        System.out.println(s.subdomainVisits(cpdomains));
    }
}

class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        ArrayList<String> output = new ArrayList<>();
        HashMap<String,Integer> domains = new HashMap<>();
        ArrayList<String> subDomain = new ArrayList<>();
        for(int i = 0; i < cpdomains.length;i++){
           String[] value = cpdomains[i].split(" ");
           domains.put(value[1],Integer.parseInt(value[0]));
           subDomain.add(value[1]);
        }
        for(String domain:subDomain){
            String newDomain = domain;
            while(newDomain.contains(".")){
                int index = newDomain.indexOf(".");
                int visit = domains.get(domain);
                newDomain = newDomain.substring(index + 1);
                if(domains.containsKey(newDomain)){
                    int visited = domains.get(newDomain) + visit;
                    domains.replace(newDomain,visited);
                }
                else{
                    domains.put(newDomain,visit);
                }
            }
        }
        for(String domain:domains.keySet())
        {
            output.add(Integer.toString(domains.get(domain)) + " " + domain);
        }
        return output;
    }
}

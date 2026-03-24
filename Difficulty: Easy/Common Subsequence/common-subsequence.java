
class Sol {
    Boolean commonSubseq(String a, String b) {
        // your code here
        Set<Character> set= new HashSet<>();
        for(char ch: a.toCharArray())
        {
            set.add(ch);
        }
        for(char ch: b.toCharArray()){
            if(set.contains(ch)){
                return true;
            }
        }
        return false;
    }
}
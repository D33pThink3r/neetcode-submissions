class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
       for(String s:strs){
        sb.append(s.length());
        sb.append("#");
        sb.append(s);
       }
        return sb.toString();
    }
    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        char[] st=str.toCharArray();
        int i=0;
        int start=0;
        while(i<st.length){
            int j=i;
            while(st[j]!='#')j++;
            int length=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+length);
            res.add(word);
            i=j+1+length;
        }
        return res;
    }
}

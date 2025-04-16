class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                word = word + s.charAt(i);
            }
            else if(s.charAt(i)==' '){
                if(!word.trim().isEmpty()){
                    list.add(word);
                }
                word = "";
            }
            if(i==s.length()-1 && !word.trim().isEmpty()){
                list.add(word);
            }
        }
        word = "";
        for(int i=list.size()-1; i>=0; i--){
            word = word + list.get(i);
            if(i!=0){
                word = word + " ";
            }
        }
        return word;
    }
}
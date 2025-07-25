class Solution {
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        return RS(s);
    }
    public static ArrayList<Character> RS(ArrayList<Character> s){
        int p1=0;
        int p2=s.size()-1;
        while(p1<p2){
            char temp=s.get(p1);
            s.set(p1,s.get(p2));
            s.set(p2,temp);
            p1++;
            p2--;
        }
        return s;
    }
}
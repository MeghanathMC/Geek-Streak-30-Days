package Day 6;

public class RemoveDuplicate {
      // code here
        //take input string str
        //first method
        StringBuilder sb=new StringBuilder();
        
        HashSet<Character> set=new HashSet<>();
        
        for(char ch:str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        
        return sb.toString();
        
        
        
        //2nd method
        
        boolean ans[]=new boolean[26];
        
        String s1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ans[ch-'a']==false){
                s1+=ch;
                ans[ch-'a']=true;
                
            }
        }
        
        return s1;
        
}

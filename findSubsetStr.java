public class findSubsetStr {
    public static void subsets(String str,String ans,int i) {
        // Base case
           if (i==str.length()){
            System.out.println(ans);
            return;
           }
        // yes
         subsets(str, ans+str.charAt(i), i+1);

        // no
        subsets(str, ans, i+1);
    }
    
    public static void main(String[] args) {
        String str ="abc";
        subsets(str, " ", 0);
    }
}

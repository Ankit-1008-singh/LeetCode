// import java.util.*;
import java.util.Arrays;
//14. Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
public class probelm14 {
    
    public static void main(String[] args) {
       String[] strs={"Club", "Clutch", "Clunk", "Clum"};
       System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs){
        StringBuilder result=new StringBuilder();
        //sort the array
        Arrays.sort(strs);
        //get first and last string
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        //compare both string
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}

public class problem28 {
    public static void main(String[] args) {
        String str="sadbutsad";
        String str2="sad";
        for(int i=0;i<=str.length()-str2.length();i++){
            if(str.substring(i, i+str2.length()).equals(str2)){
                System.out.println(i);
                //here we return i instead of printing.
            }
        }
        // if we reached here then we simply return -1.
    }
}

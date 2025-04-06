public class problem12 {
    public String intToRoman(int num) {
        String str="";
        int[] n={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX","V", "IV", "I"};
        int i=0;
        while(num>0){
            if(num>=n[i]){
                str=str+s[i];
                num=num-n[i];
            }else{
                i++;
            }
        }
        return str;
    }
}

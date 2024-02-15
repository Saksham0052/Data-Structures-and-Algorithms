public class Practise {
    public static void main(String[] args) {
        String[] words = {"notapalindrome","racecar"} ;
        System.out.println(firstPalindrome(words));
    }

    private static String firstPalindrome(String[] words) {
        for(int i = 0; i< words.length-1; i++){
            if(words[i].equals(reversed(words[i]))){
                return words[i];
            }
        }
        return "";
    }

    private static String reversed(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int  end = charArray.length-1;
        while(start < end ){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}

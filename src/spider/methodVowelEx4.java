package spider;

public class methodVowelEx4 {
    public static void main(String[] args){
//        String  res = vowelOrConsonant('a');
//        System.out.println(res);
        System.out.println(vowelOrConsonant('p'));
    }
    public static String vowelOrConsonant(char ch){
        if (ch == 'a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            return "Its a Vowel";
        }else {
            return "Its a consonant";
        }
    }
}

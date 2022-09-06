package practice;

public class Palindrome {
    static boolean validatePalindrome(char word[])
    {
        int c = word.length;
        for (int i = 0; i < c / 2; i++)
        {
            if (word[i] != '?' && word[c - i - 1] != '?' && word[i] != word[c - i - 1])
                return false;
        }
        return true;
    }

    static void palindrome(char word[])
    {
        if (!validatePalindrome(word))
            System.out.println("No");

        int n = word.length;

        for (int i = 0; i < n; i++)
        {
            if (word[i] == '?')
            {
                if (word[n - i - 1] != '?')
                    word[i] = word[n - i - 1];
                else
                    word[i] = word[n - i - 1] = aleatoryWord();
            }
        }

        for(char c:word)
            System.out.print(c);
    }

    public static char aleatoryWord(){
        char valueAleatoryWord = 0;

        int caracteres = (int)(Math.random()*1)+2;

        for (int i=0; i<caracteres; i++){
            int codeAscii = (int)Math.floor(Math.random()*(122 - 97)+97);
            valueAleatoryWord = (char)codeAscii;
        }
        return valueAleatoryWord;
    }

    public static void main(String[] args) {
        String word = "??a";
        char[] a = word.toCharArray();
        palindrome(a);
    }

}

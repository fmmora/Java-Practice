package practice;

public class Main {

    static boolean isPossiblePalindrome(char str[])
    {
        int n = str.length;
        for (int i = 0; i < n / 2; i++)
        {
    /* If both left and right character
        are not dot and they are not
        equal also, then it is not
        possible to make this string a
        palindrome */
            if (str[i] != '?' &&
                    str[n - i - 1] != '?' &&
                    str[i] != str[n - i - 1])
                return false;
        }

        return true;
    }

    public static char generarPalabra(){
//La variable palabra almacena el resultado final
        char palabra = 0;
//La variable caracteres es un número aleatorio entre 2 y 20 que define la
//longitud de la palabra.
        int caracteres = (int)(Math.random()*1)+2;
//Con un bucle for, que recorreremos las veces que tengamos almacenadas en la
//variable caracteres, que será como mínimo 2, iremos concatenando los
//caracteres aleatorios.
        for (int i=0; i<caracteres; i++){
//Para generar caracteres aleatorios hay que recurrir al valor numérico de estos
//caracteres en el alfabeto Ascii. En este programa vamos a generar palabras con
//letras minúsculas, que se encuentran en el rango 97-122. El método floor
//devuelve el máximo entero.
            int codigoAscii = (int)Math.floor(Math.random()*(122 -
                    97)+97);
//para pasar el código a carácter basta con hacer un cast a char
            palabra = (char)codigoAscii;
        }
        return palabra;
    }

    // Returns lexicographically smallest
// palindrome string, if possible
    static void smallestPalindrome(char str[])
    {
        if (!isPossiblePalindrome(str))
            System.out.println("No");


        int n = str.length;

// loop through character of string
        for (int i = 0; i < n; i++)
        {
            if (str[i] == '?')
            {
                // if one of character is dot,
                // replace dot with other character
                if (str[n - i - 1] != '?')
                    str[i] = str[n - i - 1];

                    // if both character are dot,
                    // then replace them with
                    // smallest character 'a'
                else
                    str[i] = str[n - i - 1] = generarPalabra();
            }
        }

// return the result
        for(int i = 0; i < n; i++)
            System.out.print(str[i] + "");
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "o?o";
        char[] s = str.toCharArray();
        smallestPalindrome(s);
    }

}

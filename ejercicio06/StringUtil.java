package ejercicio06;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena += c;
        }
        return cadena;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        String prefix = replicate(c, n - s.length());
        return prefix + s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }
        return strArr;
    }

    // Retorna un int[] conteniendo los elementos de arr
    // representados como enteros
    public static int[] toIntArray(String arr[]) {
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
            }
        }
        return maxLength;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int longitud = maxLength(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i], longitud, c);
        }
    }

    // ***** NEW METHODS *****

    // agrega caracteres a la derecha (hasta completar la longitud n deseada)
    public static String rpad(String s, int n, char c) {
        String sufix = replicate(c, n - s.length());
        return s + sufix;
    }

    // elimina espacios a la izquierda de la cadena
    public static String ltrim(String s) {
        boolean leftSpace = s.substring(0, 1).equals(" ");
        while (leftSpace) {
            s = s.substring(1);
            leftSpace = s.substring(0, 1).equals(" ");
        }
        return s;
    }

    // elimina espacios a la derecha de la cadena
    public static String rtrim(String s) {
        boolean rightSpace = s.substring(s.length() - 1).equals(" ");
        while (rightSpace) {
            s = s.substring(0, s.length() - 1);
            rightSpace = s.substring(s.length() - 1).equals(" ");
        }
        return s;
    }

    // elimina espacios a ambos lados de la cadena
    public static String trim(String s) {
        s = ltrim(s);
        s = rtrim(s);
        return s;
    }

    // retorna la posicion N de la ocurrencia n-esima del caracter c en una cadena s
    public static int indexOfN(String s, char c, int n) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
            if (n == count) {
                return i;
            }
        }
        return -1;
    }


}

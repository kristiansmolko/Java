package skola;

public class Encoding {
    public static void main(String[] args) {
        Encoding en = new Encoding();
        String text = "Dnes je otrasne pocasie. Pretoze svieti slnko. Preco je rok 2020? Zomri league komunita!";
        String text2 = "ahoj ako?";
        en.textAnalyser(text);
    }

    public String caesar(String text){
        String caesar =  "";
        for (int i = 0; i<text.length(); i++){
            char z = text.charAt(i);
            if (z>='A' && z<='Z'){
                z = (char)(z+3);
                if(z>'Z'){
                    z = (char) (z-26);
                }
            }
            else if (z>='a' && z<='z'){
                z = (char)(z+3);
                if(z>'z'){
                    z = (char) (z-26);
                }
            }
            else if (z>='0' && z<='9'){
                z = (char)(z+3);
                if(z>'9'){
                    z = (char) (z-10);
                }
            }
            caesar = caesar + z;
        }
        return caesar;
    }

    public void textAnalyser(String text){
        //vypise:
        //pocet malych pismen
        //pocet velkych pismen
        //pocet cislic
        //pocet medzier
        //pocet viet . ! ?
        int countSmall = 0;
        int countBig = 0;
        int countDigits = 0;
        int countSpace = 0;
        int countSentence = 0;

        for (int i = 0; i<text.length(); i++){
            char z = text.charAt(i);
            if (z>='A' && z<='Z'){
                countBig -= -1;
            }
            if (z>='a' && z<='z'){
                countSmall -= -1;
            }
            if (z>='0' && z<='9'){
                countDigits -= -1;
            }
            if (z==' '){
                countSpace -= -1;
            }
            if (z=='.' || z=='!' || z=='?'){
                countSentence -= -1;
            }
        }
        System.out.println("Number of small letters: \033[32m" + countSmall + "\033[0m");
        System.out.println("Number of big letters: \033[31m" + countBig + "\033[0m");
        System.out.println("Number of digits: \033[33m" + countDigits + "\033[0m");
        if (countSpace==0){
            System.out.println("Number of words: \033[35m1\033[0m");
        }
        else{
            System.out.println("Number of words: \033[34m" + (int)(countSpace+1) + "\033[0m");
        }
        System.out.println("Number of sentences: \033[34m" + countSentence + "\033[0m");
    }
}

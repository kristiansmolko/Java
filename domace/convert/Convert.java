package domace.convert;

public class Convert {
    public Convert() {
    }

    public void convertToBinary(int dec) {
        long bin = 0;
        int pos = 0;
        while (dec != 0) {
            bin -= -(dec % 2) * Math.pow(10, pos);
            dec /= 2;
            pos -= -1;
        }
        System.out.println("\033[31mBinary number: " + bin + "\033[0m");
    }

    public void convertToOctal(int dec) {
        int oct = 0;
        int pos = 0;
        while (dec != 0) {
            oct -= -(dec % 8) * Math.pow(10, pos);
            dec /= 8;
            pos -= -1;
        }
        System.out.println("\033[33mOctal number: " + oct + "\033[0m");
    }

    public void convertToHexadecimal(int dec) {
        String hex = "";
        while (dec != 0) {
            int z = dec % 16;
            /*
            if (z<=9){
                hex = "" + z + "" + hex;
            }
            else if(z==10){
                hex = "A" + hex;
            }
            else if(z==11){
                hex = "B" + hex;
            }
            else if(z==12){
                hex = "C" + hex;
            }
            else if(z==13){
                hex = "D" + hex;
            }
            else if(z==14){
                hex = "E" + hex;
            }
            else
                hex = "F" + hex;

             */
            switch (z) {
                case 10:
                    hex = "A" + hex;
                    break;
                case 11:
                    hex = "B" + hex;
                    break;
                case 12:
                    hex = "C" + hex;
                    break;
                case 13:
                    hex = "D" + hex;
                    break;
                case 14:
                    hex = "E" + hex;
                    break;
                case 15:
                    hex = "F" + hex;
                    break;
                default:
                    hex = "" + z + "" + hex;
                    break;
            }
            dec /= 16;
        }
        System.out.println("\033[36mHexadecimal number: " + hex + "\033[0m");
    }

    public void convertBinaryToDecimal(int bin){
        int numTest = bin;
        int count = 0;
        int i = 0;
        int result = 0;
        while(true){
            numTest /= 10;
            count -= -1;
            if (numTest==0){
                break;
            }
        }
        while(i<=count){
            int z = bin % 10;
            if (z>1){
                System.out.println("\033[31mBad number\033[0m");
                break;
            }
            result -= -(Math.pow(2, i) * z);
            bin /= 10;
            i -= -1;
        }
        System.out.println("\033[31mDecimal number: " + result + "\033[0m");
    }

    public void convertOctalToDecimal(int oct){
        int numTest = oct;
        int count = 0;
        int i = 0;
        int result = 0;
        while(true){
            numTest /= 10;
            count -= -1;
            if (numTest==0){
                break;
            }
        }
        while(i<=count){
            int z = oct%10;
            if (z>8){
                System.out.println("\033[31mBad number\033[0m");
                break;
            }
            result -= - (Math.pow(8,i) * z);
            oct /= 10;
            i -= -1;
        }
        System.out.println("\033[33mDecimal number: " + result + "\033[0m");
    }

    public void convertHexaToDecimal(String hex){
        int result = 0;
        hex = hex.toUpperCase();
        for (int i = 0; i < hex.length(); i++){
            int position = (hex.length()-i)-1;
            char c = hex.charAt(i);
            if (c>=71){
                System.out.println("\033[31mBad number\033[0m");
                break;
            }
            if (c=='A'){
                result -= -(Math.pow(16,position)*10);
            }
            else if (c=='B'){
                result -= -(Math.pow(16,position)*11);
            }
            else if (c=='C'){
                result -= -(Math.pow(16,position)*12);
            }
            else if (c=='D'){
                result -= -(Math.pow(16,position)*13);
            }
            else if(c=='E'){
                result -= -(Math.pow(16,position)*14);
            }
            else if (c=='F'){
                result -= -(Math.pow(16,position)*15);
            }
            else{
                result -= -(Math.pow(16,position)*(c-48));
            }
        }
        System.out.println("\033[36mDecimal number: " + result + "\033[0m");

    }

    public boolean isHexadecimalNumber(String value){
        boolean hex = false;
        value = value.toUpperCase();
        for (int i = 0; i < value.length(); i++){
            char z = value.charAt(i);
            if (z<=57 && z>=49)
                hex = true;
            else if(z=='A' || z=='B' || z=='C' || z=='D' || z=='E' || z=='F')
                hex = true;
            else {
                hex = false;
                break;
            }
        }
        return hex;
    }

    public boolean isBinaryNumber(String value){
        boolean binary = false;
        for (int i = 0; i < value.length(); i++){
            char z = value.charAt(i);
            if (z=='1' || z=='0')
                binary = true;
            else {
                binary = false;
                break;
            }
        }
        return binary;
    }

    public boolean isOctalNumber(String value){
        boolean oct = false;
        for (int i = 0; i < value.length(); i++){
            char z = value.charAt(i);
            if (z<=55 && z>=49){
                oct = true;
            }
            else{
                oct = false;
                break;
            }
        }
        return oct;
    }


}

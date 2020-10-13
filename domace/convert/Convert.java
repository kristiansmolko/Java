package domace.convert;

public class Convert {
    public Convert(){
    }

    public void convertToBinary(int dec){
        long bin = 0;
        int pos = 0;
        while (dec!=0) {
            bin -= -(dec % 2) * Math.pow(10, pos);
            dec /= 2;
            pos -= -1;
        }
        System.out.println("\033[31mBinary number: " + bin + "\033[0m");
    }

    public void convertToOctal(int dec){
        int oct = 0;
        int pos = 0;
        while (dec!=0){
            oct -= -(dec%8)*Math.pow(10, pos);
            dec /= 8;
            pos -= -1;
        }
        System.out.println("\033[33mOctal number: " + oct + "\033[0m");
    }

    public void convertToHexadecimal(int dec){
        String hex = "";
        while (dec != 0){
            int z = dec%16;
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
            switch(z){
                case 10: hex = "A" + hex; break;
                case 11: hex = "B" + hex; break;
                case 12: hex = "C" + hex; break;
                case 13: hex = "D" + hex; break;
                case 14: hex = "E" + hex; break;
                case 15: hex = "F" + hex; break;
                default: hex = "" + z + "" + hex; break;
            }
            dec /= 16;
        }
        System.out.println("\033[36mHexadecimal number: " + hex + "\033[0m");

    }
}

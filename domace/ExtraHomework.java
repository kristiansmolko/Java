package domace;

public class ExtraHomework {
    public static void main(String[] args) {
        String address = "1.2.3.x";
        ExtraHomework find = new ExtraHomework();
        System.out.println(find.isIPAddress(address));

    }

    public boolean isIPAddress(String ip){
        boolean address = true;
        int add = 0;
        int exp = 0;
        int dot = 0;

        for (int i = ip.length()-1; i>=0; i--){
            if (ip.length()>15){   //if more than 15digits = 255.255.255.2555
                address = false;
                break;            //break
            }
            char z = ip.charAt(i);
            if (z == '.') {
                dot -= -1;
                add = 0;
                exp = 0;
            }
            else if(z>=48 && z<=57){
                add -= -(int) (z - '0') * (int) (Math.pow(10, exp));
                exp -= -1;
            }
            else{
                address = false;
                break;
            }

            if (add<256){
                address = true;
            }
            else{
                address = false;
                break;
            }
        }
        if (dot<3){
            address = false;
        }
        return address;
    }
}

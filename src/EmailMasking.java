 public class EmailMasking {
    public static void main(String[] args) {
        String email = "isayevvv.999@gmail.com" ;
        String ilkHisse = email.substring(0, 3);
        int atIndex = email.indexOf('@');
        String domainHissesi =  email.substring(atIndex);
        String netice = ilkHisse.concat("***").concat(domainHissesi);
        System.out.println(netice);
    }
}


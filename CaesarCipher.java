

public class CaesarCipher {
    public static void main(String [] args) {

    String s = "Ciphering.";
    String sOld = s;
    s = s.toLowerCase();
    String alpha = "abcdefghijklmnopqrstuvwxyz";
    int k = 26 % alpha.length();
    String alphaKey = alpha.substring(k,alpha.length()).concat(alpha.substring(0, k));
    String newCaesar = "";
    System.out.print(alpha + "\n" + alphaKey);
    
    for(int i = 0; i < s.length(); i++){
            int newIndex = alpha.indexOf(s.substring(i, i + 1));
            if(newIndex != -1){
            newCaesar = newCaesar + alphaKey.substring(newIndex, newIndex + 1);
        } 
        else{
            newCaesar = newCaesar + s.substring(i, i + 1);
        }
    }
    StringBuffer newBufferCeaser = new StringBuffer();
    newBufferCeaser.append(newCaesar);
    for(int c = 0; c < s.length(); c++){
        Character ch = sOld.charAt(c);
        Character cn = newCaesar.charAt(c);
            if(Character.isUpperCase(ch)){
                newBufferCeaser.replace(c, c + 1, Character.toUpperCase(cn)+ "");
            }      
    }
    System.out.println("\n" + newBufferCeaser);
    }
}
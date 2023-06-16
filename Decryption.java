//Encrytion of text
import java.util.Scanner;
public class Decryption     //File name
{
    public static void main(String... args)
    {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Enter Encrypted message : ");
        String input = ipt.nextLine();
        StringBuilder Decrypt = new StringBuilder(input);
      
        String lower_alpha = "abcdefghijklmnopqrstuvwxyz";    //If the character is lower cipher converts into lower actual text
        String upper_alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    //If the character is upper cipher converts into upper actual text
      
        String upper_converted_text="",lower_converted_text="";
        System.out.print("Enter a private key : ");
        int private_key = ipt.nextInt();
      
        upper_converted_text = upper_alpha.substring(private_key)+upper_alpha.substring(0,private_key);   //Shifting the lower case alphabets using private key
        lower_converted_text = lower_alpha.substring(private_key)+lower_alpha.substring(0,private_key);   //Shifting the upper case alphabest using private key
      
        System.out.println("Message before decryption : "+Decrypt);
      
        //Converting the cipher text into actual text.
        for(int chr=0;chr<Decrypt.length();chr++)
        {
            char pointer = Decrypt.charAt(chr);
            //If the character is upper case
            if(Character.isUpperCase(pointer))
            {
                int index = upper_converted_text.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = upper_alpha.charAt(index);
                    Decrypt.setCharAt(chr,new_pointer);
                }
            }
            //If the character is lower case
            else if(Character.isLowerCase(pointer))
            {
                int index = lower_converted_text.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = lower_alpha.charAt(index);
                    Decrypt.setCharAt(chr,new_pointer);
                }
            }
        }
        System.out.println("Message after decryption : "+Decrypt);
    }
}

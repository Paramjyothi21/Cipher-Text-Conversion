//Encrytion of text
import java.util.Scanner;
public class Encryption     //File name
{
    public static void main(String... args)
    {
        Scanner ipt = new Scanner(System.in);
        System.out.print("Enter a private message : ");
        String input = ipt.nextLine();
        StringBuilder Encrypt = new StringBuilder(input);
      
        String lower_alpha = "abcdefghijklmnopqrstuvwxyz";    //If the character is lower converts into lower cipher text
        String upper_alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    //If the character is upper converts into upper cipher text
      
        String upper_converted_text="",lower_converted_text="";
        System.out.print("Enter a private key : ");
        int private_key = ipt.nextInt();
      
        upper_converted_text = upper_alpha.substring(private_key)+upper_alpha.substring(0,private_key);   //Shifting the lower case alphabets using private key
        lower_converted_text = lower_alpha.substring(private_key)+lower_alpha.substring(0,private_key);   //Shifting the upper case alphabest using private key
      
        System.out.println("Message before encryption : "+Encrypt);
      
        //Converting the actual text into cipher text.
        for(int chr=0;chr<Encrypt.length();chr++)
        {
            char pointer = Encrypt.charAt(chr);
            //If the character is upper case
            if(Character.isUpperCase(pointer))
            {
                int index = upper_alpha.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = upper_converted_text.charAt(index);
                    Encrypt.setCharAt(chr,new_pointer);
                }
            }
            //If the character is lower case
            else if(Character.isLowerCase(pointer))
            {
                int index = lower_alpha.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = lower_converted_text.charAt(index);
                    Encrypt.setCharAt(chr,new_pointer);
                }
            }
        }
        System.out.println("Message after encryption : "+Encrypt);
    }
}

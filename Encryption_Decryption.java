//Encrytion of text
import java.util.Scanner;
public class Encryption_Decryption    //File name
{
    
    public static String Encrytion(String message,String low,String up,String lower,String upper)
    {
        StringBuilder Encrypt = new StringBuilder(message);
        for(int chr=0;chr<Encrypt.length();chr++)
        {
            char pointer = Encrypt.charAt(chr);
            //If the character is upper case
            if(Character.isUpperCase(pointer))
            {
                int index = up.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = upper.charAt(index);
                    Encrypt.setCharAt(chr,new_pointer);
                }
            }
            //If the character is lower case
            else if(Character.isLowerCase(pointer))
            {
                int index = low.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = lower.charAt(index);
                    Encrypt.setCharAt(chr,new_pointer);
                }
            }
        }
        return Encrypt.toString();
    }
    
    
    public static void Decryption(String message,String low,String up,String lower,String upper)
    {
        System.out.println("\n\nMessage before Decryption : "+Encrytion(message, low, up, lower, upper));
        StringBuilder Decrypt = new StringBuilder(message);
        for(int chr=0;chr<Decrypt.length();chr++)
        {
            char pointer = Decrypt.charAt(chr);
            //If the character is upper case
            if(Character.isUpperCase(pointer))
            {
                int index = upper.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = up.charAt(index);
                    Decrypt.setCharAt(chr,new_pointer);
                }
            }
            //If the character is lower case
            else if(Character.isLowerCase(pointer))
            {
                int index = lower.indexOf(pointer);
                if(index!=-1)
                {
                    char new_pointer = low.charAt(index);
                    Decrypt.setCharAt(chr,new_pointer);
                }
            }
        }
        System.out.println("Message after decryption : "+Decrypt);
    }
    
    public static void Conversion(String input,String lower,String upper,int private_key)
    {
        Scanner ipt = new Scanner(System.in);
        String upper_converted_text = upper.substring(private_key)+upper.substring(0,private_key);   
        //Shifting the lower case alphabets using private key
        
        String lower_converted_text = lower.substring(private_key)+lower.substring(0,private_key); 
        //Shifting the upper case alphabest using private key
        
        System.out.println("Message after encryption : "+Encrytion(input,lower,upper,lower_converted_text,upper_converted_text));
        
        System.out.print("\n\nDo you want to decrypt the data ?? Press 1 : ");
        int press = ipt.nextInt();
        if(press==1)
        {
            System.out.print("Enter the private key : ");
            int key = ipt.nextInt();

            if(key>26)
            {
                key = key%26;
            }
            if(key==26)
            {
                key = 21;
            }

            if(key==private_key)
            Decryption(Encrytion(input,lower,upper,lower_converted_text,upper_converted_text),lower,upper,lower_converted_text,upper_converted_text);
            else
            {
                System.out.println("Sorry, Wrong key entered. Please start from the beggining");
            }
        }


        System.out.println("\n\n\t\t======Thank you======\n\n");
        
    }
    
    
    public static void main(String... args)
    {
        System.out.println("\n\n\t\tCeaser Cipher Algorithm\n");
        Scanner ipt = new Scanner(System.in);
        System.out.print("\nEnter a private message : ");
        String input = ipt.nextLine();
      
        String lower_alpha = "abcdefghijklmnopqrstuvwxyz";    //If the character is lower converts into lower cipher text
        String upper_alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    //If the character is upper converts into upper cipher text
      
        System.out.print("Enter a private key : ");
        int private_key = ipt.nextInt();

        if(private_key>26)
        {
            private_key = private_key%26;
        }
        if(private_key==26)
        {
            private_key = 21;
        }
        
        System.out.println("\n\nMessage before encryption : "+input);
        
        Conversion(input,lower_alpha,upper_alpha,private_key);
        
    }
}

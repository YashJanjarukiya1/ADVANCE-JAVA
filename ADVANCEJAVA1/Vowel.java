import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    { 
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the character:");
        char ch=ob.next().charAt(0);
     


        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': 
            case 'a':    
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            System.out.println("is a vowel character:"+ch);
            break;

            default :
            System.out.println(" is a non-vowel character:"+ch);


        }
    }
}

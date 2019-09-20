import java.util.Scanner;
import java.io.*;

class MAIN
{
    //Scanner in = new Scanner(System.in);
    //System.out.print("Input a number: ");
    //int num = in.nextInt(); in.nextLine() - read the entire line

    public static void main (String args [])
    {
        System.out.println ("Choose operating mode:\n");
        System.out.println ("Enter '-i' if you want Interactive mode;\n");      //не забудь переработать
        System.out.println ("Enter '-md5' or '-sha256' for single conversion;\n");

        String AfterF = "";
        //int F_index = 0;
        int exit = 0;
        Scanner in = new Scanner (System.in);
        //String command = in.nextLine();
        //String[] Flags = command.split(" ");    //разбили входную команду на слова, чтобы найти -f; -md5 и т.д.
        //int I_index = command.indexOf("-i");
        //int MD_index = command.indexOf("-md5");         //поиск во входной команде флагов
        //int SH_index = command.indexOf("-sha256");
        //for (int i = 0; i < Flags.length; i++)
        //    if (Flags[i].equals("-f"))
        //    {
        //        F_index = i + 1;
        //        break;
        //    }
        //if (I_index != -1)                              //если есть флаг "-i"
        if (args[1].equals("-f")) AfterF = args[2];
        if (args[0].equals("-i"))
        {
            Interactive IntMode = new Interactive();    //входим в интерактивный режим
            IntMode.Menu(AfterF);
        }
        //else if(MD_index != -1)                         //если есть флаг "-md5"
        else if (args[0].equals("-md5"))
        {
            Single SinMode = new Single();
            //String mode = command.substring(MD_index, MD_index+4);
            String mode = "-md5";
            SinMode.Menu(AfterF, mode);                                     //входим в режим "вычислить один md5 хэш"
        }
        //else if(SH_index != -1)                           //если есть флаг "-sha256"
        else if(args[0].equals("-sha256"))
        {
            Single SinMode = new Single();
            //String mode = command.substring(SH_index, SH_index+7);
            String mode = "-sha256";
            SinMode.Menu(AfterF, mode);                                     //входим в режим "вычислить один sha256 хэш"
        }
    /* do{
            String mode = in.nextLine();
            if (mode.equals("-i"))
                {
                    Interactive IntMode = new Interactive();
                    IntMode.Menu();
                    exit = 1;
                }
            if (mode.equals("-md5") | mode.equals("-sha256"))
                {
                    Single SinMode = new Single();
                    SinMode.Menu(mode);
                    exit = 1;
                }
            if (exit == ) System.out.println ("Please, re-enter\n")
          }while (exit != 1)    */

    }
}

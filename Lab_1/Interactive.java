import java.util.Scanner;
import java.io.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;

class Interactive
{
    int safe(int a, int b)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number '1' if you want to continue;\n ");
        System.out.print("Input a number '0' if you want to exit;\n");
        int num = in.nextInt();

        while (num < a || num > b)
        {
            //cin.clear();
            //cin.ignore(32767,'\n');
            System.out.print ("Error! Enter the correct num: ");
            num = in.nextInt();
        }
        return num;
    }

    public void Menu (String AfterF)
    {
        String content = null;
        int MODE;
        //int F_index = command.indexOf("-f");
        String path = AfterF;
        //if (F_index != -1) path = command.substring(F_index+3);
        File file = new File(path);
        Scanner in = new Scanner(System.in);
        do {
            MODE = safe (0, 1);             //выход или продолжаем
            if (MODE != 0)
            {
                int exit = 0;
                if (file.isFile()) exit = 1;    //проверка на то, что изначально в консоль введен верный путь
               // Scanner in = new Scanner (System.in);
                while (exit != 1)
                {
                    if (exit == 0)
                    {
                        System.out.println("Enter the correct path to the file\n");
                        path = in.nextLine();            //вводим новый путь до искомого файла
                        file = new File(path);
                        if (file.isFile()) exit =1;
                    }
                }
                try {
                    content = FileUtils.readFileToString(file, "utf-8");
                } catch (IOException e){
                    System.out.println("Exception: " + "WRONG FILE PATH\n");
                }
                String MHash = DigestUtils.md5Hex(content);
                System.out.println("MD5: " + MHash);
                String SHash = DigestUtils.shaHex(content);
                System.out.println("SHA256: " + SHash);
                path = "";
                file = new File(path);

            }

        }while (MODE != 0);
    }
}

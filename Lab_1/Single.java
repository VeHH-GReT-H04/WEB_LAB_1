import java.util.Scanner;
import java.io.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.FileUtils;

class Single
{
    public void Menu (String AfterF, String mode)
    {
        //System.out.println(command);
        //int F_index = command.indexOf("-f");
       // System.out.println(F_index);
        String path = AfterF;
       //if (F_index != -1) path = command.substring(F_index+3);
        File file = new File(path);
        int exit = 0;
        if (file.isFile()) exit = 1;    //проверка на то, что изначально в консоль введен верный путь
        Scanner in = new Scanner (System.in);
        //while (exit != 1)
        if (exit == 0)
        {
            //System.out.println("Enter the correct path to the file\n");
            //path = in.nextLine();
            //file = new File(path);
            //if (file.isFile()) exit =1;
            System.out.println(path); System.out.println(" - Incorret file path\n");
        }
        if (exit == 1)
        {
            System.out.println(path); System.out.println(" - Correct file path");
            file = new File(path);
            SingleHash (mode, file);
        }
    }

    public void SingleHash (String mode, File file)
    {
        String content = null;
        try {
            content = FileUtils.readFileToString(file, "utf-8");
        } catch (IOException e){
            System.out.println("Exception: " + "WRONG FILE PATH\n");
        }
        if (mode.equals("-md5"))
        {
            String hash = DigestUtils.md5Hex(content);
            System.out.println("MD5: " + hash + "\n");
        }
        if (mode.equals ("-sha256"))
        {
            String hash = DigestUtils.shaHex(content);
            System.out.println("SHA256: " + hash + "\n");
        }
    }


}

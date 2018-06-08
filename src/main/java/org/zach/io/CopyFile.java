package org.zach.io;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        int i;

        try (FileInputStream fin = new FileInputStream("source.txt");
             FileOutputStream fout = new FileOutputStream("dest.txt")) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exp) {
            System.out.println(exp);
        }
    }
}

class CopyBinaryFile {
    public static void main(String[] args) {

        int i = 10;
        double d = 12.12;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.txt"));
             DataInputStream datain = new DataInputStream(new FileInputStream("data.txt"))) {
            dataOut.writeInt(i);
            dataOut.writeDouble(d);
            dataOut.writeBoolean(b);

            i = datain.readInt();
            d = datain.readDouble();
            b = datain.readBoolean();

            System.out.println("i, d, b: " + i + " " + d + " " + b);

        } catch (IOException exc) {
            System.out.println("io exception");
        }
    }
}

class FileUtil {
    public static void main(String[] agrs) {
        String s = "http://192.168.1.17:8008/upload/helle.txt";

//        try(FileInputStream fin = new FileInputStream("source.txt")) {
//            FileUtils.copyInputStreamToFile(fin, new File( "hello.txt"));
//        } catch(IOException exp) {
//
//        }



        try {

            URL url = new URL(s);
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true);

            OutputStreamWriter out = new OutputStreamWriter(
                    connection.getOutputStream());
            out.write("string=");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

        }
    }
}

class Loop {
    public static void main(String[] args) {

        String s1 = Paths.get("/Users").normalize().toString();
        String s2 = Paths.get("/Users/Zach").toString();
        System.out.println(s1);
        System.out.println("*************");
        System.out.println(s2);
    }

    static boolean test() {
        do {
            do {

                return true;
            } while (true);
        } while (true);
    }
}
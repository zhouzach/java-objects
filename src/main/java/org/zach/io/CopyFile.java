package org.zach.io;

import org.apache.commons.io.FileUtils;

import java.io.*;

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
            System.out.println(exp.getLocalizedMessage());
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

        try (FileInputStream fin = new FileInputStream("source.txt")) {
            FileUtils.copyInputStreamToFile(fin, new File("hello.txt"));
        } catch (IOException exp) {
            System.out.println(exp.getLocalizedMessage());
        }
    }
}
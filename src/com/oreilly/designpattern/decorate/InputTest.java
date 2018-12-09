package com.oreilly.designpattern.decorate;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/11/18.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream
                            (new BufferedInputStream
                                    (new FileInputStream("d:/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}

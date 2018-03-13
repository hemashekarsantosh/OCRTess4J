package com.sansol;

import net.sourceforge.tess4j.*;
import java.io.File;
/*
@author Santosh Hemashekar
@Date   13-Mar-2018
 */
public class TessaractExample {

    public static void main(String args[]) {
        File imageFile = new File("D:\\\\OCRTest\\sample3.jpg");
        ITesseract instance = new Tesseract1();
        try {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
}

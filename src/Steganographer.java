
import java.io.*;
import java.util.Scanner;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.awt.image.DataBufferByte;

public class Steganographer {

    private static int bytesForTextLengthData = 4;
    private static int bitsInByte = 8;

// MAIN FUNCTIONS

    public static boolean encode(String imagePath, String textPath) {

        //TODO here Kabo
    }

    public static String decode(String imagePath) {

         //TODO here Kabo
         
    }

//ENCODING FUNCTIONS
    
    private static byte[] encodeImage(byte[] image, byte[] addition, int offset) {

        if (addition.length + offset > image.length) {
            throw new IllegalArgumentException("Image file is not long enough to store provided text");
        }
        for (int i = 0; i < addition.length; i++) {
            int additionByte = addition[i];
            for (int bit = bitsInByte - 1; bit >= 0; --bit, offset++) {
                int b = (additionByte >>> bit) & 0x1;
                image[offset] = (byte) ((image[offset] & 0xFE) | b);
            }
        }
        return image;

    }//ENCODE

    private static void saveImageToPath(BufferedImage image, File file, String extension) {

        try {
            file.delete();
            ImageIO.write(image, extension, file);
        } catch (Exception exception) {
            System.out.println("Image file could not be saved. Error: " + exception);
        }

    }//ENCODE

    private static BufferedImage getImageFromPath(String path) {

        BufferedImage image = null;
        File file = new File(path);
        try {
            image = ImageIO.read(file);
        } catch (Exception exception) {
            System.out.println("Input image cannot be read. Error: " + exception);
        }
        return image;

    } //ENCODE

    private static String getTextFromTextFile(String textFile) {
        String text = "";
        try {
            Scanner scanner = new Scanner(new File(textFile));
            text = scanner.useDelimiter("\\A").next();
            scanner.close();
        } catch (Exception exception) {
            System.out.println("Couldn't read text from file. Error: " + exception);
        }
        return text;
    }//ENCODE
    
    private static BufferedImage getImageInUserSpace(BufferedImage image) {

        //TODO here dod
    } //ENCODE

    private static byte[] getBytesFromImage(BufferedImage image) {

         //TODO here dod
        
    }//ENCODE

    private static byte[] getBytesFromInt(int integer) {

        //TODO here Enas

    }//ENCODE
    
//END OF ENCODING 
    
//DECODING FUNCTIONS
    
    private static byte[] decodeImage(byte[] image) {

        //TODO here Enas
    }//DECODE

    private static void saveTextToPath(String text, File file) {
       
        //TODO here Enas
       
    }//DECODE

//END OF DECODING

}

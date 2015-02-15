package com.glassgaze;

import android.util.Log;

import java.security.MessageDigest;
import java.util.Arrays;

public class Utils {

    private final static String TAG = "android-btxfr/Utils";

    public static byte[] intToByteArray(int a) {
        byte[] ret = new byte[4];
        ret[3] = (byte) (a & 0xFF);
        ret[2] = (byte) ((a >> 8) & 0xFF);
        ret[1] = (byte) ((a >> 16) & 0xFF);
        ret[0] = (byte) ((a >> 24) & 0xFF);
        return ret;
    }

    public static int GetIndicator(byte[] a)
    {
        return byteArrayToInt(a , 0);
    }
    public static int GetX(byte[] a)
    {

        return byteArrayToInt(a , 4);

    }

    public static int GetY(byte[] a)
    {

        return byteArrayToInt(a , 8);

    }

    public static int byteArrayToInt(byte[] b , int offset)
    {
		int ret = 0;
		for (int i=offset; i<offset+4; i++) {
			ret <<= 8;
			ret |= (int)b[i] & 0xFF;
		}
		return ret;

    }
    public static int byteArrayToInt_reverse(byte[] b)
    {
        return   b[0] & 0xFF |
                (b[1] & 0xFF) << 8 |
                (b[2] & 0xFF) << 16 |
                (b[3] & 0xFF) << 24;
    }

    public static boolean digestMatch(byte[] digestData1, byte[] digestData2) {
        return Arrays.equals(digestData1, digestData2);
    }

    public static byte[] getDigest(byte[] imageData) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return messageDigest.digest(imageData);
        } catch (Exception ex) {
            Log.e(TAG, ex.toString());
            throw new UnsupportedOperationException("MD5 algorithm not available on this device.");
        }
    }


}

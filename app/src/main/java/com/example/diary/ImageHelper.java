package com.example.diary;

import android.content.Context;
import android.graphics.Bitmap;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageHelper {
    public static String saveImageToInternalStorage(Context context, Bitmap bitmap, String filename) {
        File file = new File(context.getFilesDir(), filename);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
            return file.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

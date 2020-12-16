package com.para.file;


import java.io.File;

/**
 * 递归删除带内容的目录
 */
public class FileDemo1 {

    public static void main(String[] args) {
        File srcFolder = new File("com");
        deleteFolder(srcFolder);
    }

    private static void deleteFolder(File srcFolder) {
        File[] files = srcFolder.listFiles();
        for (File file : files) {
            if(file.isDirectory()) {
                deleteFolder(file);
            } else {
                System.out.println(file.getName() + "---" + file.delete());
            }
        }
        System.out.println(srcFolder.getName() + "---" + srcFolder.delete());
    }
}

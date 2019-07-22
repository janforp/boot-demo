package com.janita.design.c3装饰者;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 类说明：
 *
 * @author zhucj
 * @since 2019-07-18 - 17:20
 */
public class LowerCaseInputeStream extends FilterInputStream {

    public LowerCaseInputeStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputeStream(new BufferedInputStream(new FileInputStream("text.txt")));
        while (( c = in.read()) >=0) {
            System.out.println((char)c);
        }
    }
}

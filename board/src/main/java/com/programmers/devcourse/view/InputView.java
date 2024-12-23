package com.programmers.devcourse.view;

import com.programmers.devcourse.model.Saying;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String command() throws IOException {
        System.out.print("명령) ");
        return br.readLine();
    }

    public Saying inputSaying() throws IOException {
        System.out.print("명언 : ");
        String contents = br.readLine();
        System.out.print("작가 : ");
        String author = br.readLine();
        return new Saying(author,contents);
    }

    public String inputNewContent() throws IOException {
        System.out.print("명언 : ");
        return br.readLine();
    }

    public String inputNewAuthor() throws IOException {
        System.out.print("작가 : ");
        return br.readLine();
    }
}

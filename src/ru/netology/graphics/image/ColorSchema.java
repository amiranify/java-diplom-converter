package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {

    final private char[] chars = {'#', '$', '@', '%', '*', '+', '-', '.'};

    @Override
    public char convert(int color) {
        return chars[color / 32];
    }
}

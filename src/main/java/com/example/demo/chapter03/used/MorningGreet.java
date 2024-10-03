package com.example.demo.chapter03.used;

/**
 * Greet 実装クラス
 * 朝の挨拶
 */

// ComponetアノテーションでSprinにインスタンス生成させる
//@Component
public class MorningGreet implements Greet {

    @Override
    public void greeting() {
        System.out.println("--------------------");
        System.out.println("おはようございます！");
        System.out.println("--------------------");
    }

}

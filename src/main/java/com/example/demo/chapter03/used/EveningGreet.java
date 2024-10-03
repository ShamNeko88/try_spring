package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

/**
 * Greet 実装クラス
 * 夕方の挨拶
 */

//ComponetアノテーションでSprinにインスタンス生成させる
@Component
public class EveningGreet implements Greet {

    @Override
    public void greeting() {
        System.out.println("--------------------");
        System.out.println("こんばんは。");
        System.out.println("--------------------");
    }

}

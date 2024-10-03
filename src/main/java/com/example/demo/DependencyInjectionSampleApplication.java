package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter03.used.Greet;

/**
 * SrpintBoot 起動クラス
 * 「Spring スターター・プロジェクト」開始で自動生成される
 */

@SpringBootApplication
public class DependencyInjectionSampleApplication {
    /**
     * mainメソッド
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionSampleApplication.class, args)
        .getBean(DependencyInjectionSampleApplication.class).execute();
        
    }

    /**
     * 注入される箇所（インターフェース）
     * Componentを付与したクラスのインスタンスを生成する
     */
    @Autowired
    Greet greet;

    /**
     * 実行メソッド
     * @param args
     */
    private void execute() {
        greet.greeting();
    }

}

package com.xueyou.demo;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Optional.of(123).isPresent();
        //最后一个参数可以输入异常的内容（可不填）,最后的参数也可以是%s，然后填参数的
        String a = Preconditions.checkNotNull("123","String不能为null");
        int[] ints = new int[2];
        Preconditions.checkPositionIndex(1,ints.length-1);
        Preconditions.checkArgument(true,"argument wrong");


        boolean flag = Objects.equal("a",null);
        System.out.println(flag);

        String str = "a";
        System.out.println(Objects.equal("a",str));

        Student student = new Student(1,"s");
        System.out.println(student.hashCode());


        Student student2 = new Student(1,"s");
        System.out.println(student2.hashCode());

        System.out.println(Objects.equal(student,student2));

    }
}


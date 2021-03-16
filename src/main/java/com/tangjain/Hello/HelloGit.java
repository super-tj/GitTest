package com.tangjain.Hello;

/**
 * @Author 60206
 * @Create 2021/3/11 - 9:50
 * @Description
 */
public class HelloGit {

    public String show(){
        return "HelloGit";
    }

    public int add(int x, int y){
        return (x+y);
    }
    public static void main(String[] args) {
        HelloGit helloGit = new HelloGit();
        System.out.println(helloGit.show());
    }

}

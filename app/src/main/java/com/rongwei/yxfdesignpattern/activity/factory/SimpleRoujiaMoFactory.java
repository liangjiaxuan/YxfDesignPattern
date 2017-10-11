package com.rongwei.yxfdesignpattern.activity.factory;

/**
 * Created by Administrator on 2017/10/10.
 */

public class SimpleRoujiaMoFactory {
    public static RouJiaMo createRouJiaMo(String type){
        RouJiaMo roujiaMo=null;
        switch (type) {
            case "Suan":
                roujiaMo = new SuanRouJiaMO();
                break;
            case "La":
                roujiaMo = new LaRoujiaMo();
                break;
            case "Xian":
                roujiaMo = new XianRoujiaMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new SuanRouJiaMO();
                break;
        }
        return roujiaMo;
    }

}

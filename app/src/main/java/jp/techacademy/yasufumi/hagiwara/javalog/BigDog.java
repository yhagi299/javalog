package jp.techacademy.yasufumi.hagiwara.javalog;

import android.util.Log;

/**
 * Created by hagiwara on 2018/02/08.
 */

public class BigDog extends Dog {
    static String to_jp ="大型犬";

    public BigDog(String name, int age){
        super(name, age);
    }

    public static void introduce(){
        Log.d("javatest", "これは大型犬クラスです。　");
    }

}

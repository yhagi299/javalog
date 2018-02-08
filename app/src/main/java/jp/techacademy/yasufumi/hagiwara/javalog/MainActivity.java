package jp.techacademy.yasufumi.hagiwara.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎",12, "漫画");

        human.say();
        human.think();

        /*
        dog.say();
        Log.d("javatest", "犬の名前は" + dog.name + "です。　");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。　");

        BigDog bigdog = new BigDog("ユーゼフ",25);

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。　");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。　");
        */
    }
}

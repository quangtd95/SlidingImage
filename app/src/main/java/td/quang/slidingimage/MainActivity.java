package td.quang.slidingimage;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> imageList = new ArrayList();
        imageList.add("http://www.nolavape.com/wp-content/uploads/2013/04/honey-blossom-e-liquid-new-orleans.jpg");
        imageList.add("http://cooldigital.photography/wp-content/uploads/2014/02/Blue-Flowers-620x444.jpg");
        imageList.add("https://s-media-cache-ak0.pinimg.com/236x/1c/71/39/1c7139d1d7c8f54afd73ff063a4c39c3.jpg");
        imageList.add("http://cooldigital.photography/wp-content/uploads/2014/02/Beautiful-purple-flowers-620x410.jpg");
        imageList.add("https://s-media-cache-ak0.pinimg.com/736x/2f/ee/5f/2fee5fe4861236e8e5516c20b1da7da3.jpg");

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        CustomPagerAdapter pagerAdapter = new CustomPagerAdapter(this,imageList);
        pager.setAdapter(pagerAdapter);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.indicator);


    }
}

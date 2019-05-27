package com.example.intenttest2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText web_site;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web_site = (EditText)findViewById(R.id.web_site);
        Button btn_web = (Button) findViewById(R.id.btn_web);

        btn_web.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("name", web_site.getText().toString());
        startActivity(intent);

        /*Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(web_site.getText().toString()));
        startActivity(intent);*/
    }
}

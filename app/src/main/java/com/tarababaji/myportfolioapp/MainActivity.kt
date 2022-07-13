package com.tarababaji.myportfolioapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        insta.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/tarachand1904"));
            startActivity(intent);
        };
        github.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/tara122333"));
            startActivity(intent);
        };
        linkedin.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com/in/tara-chand-kumawat-5544a2216/"));
            startActivity(intent);
        };
        leetcode.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://leetcode.com/tarachand122333/"));
            startActivity(intent);
        };
        facebook.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/tarachandkumawat478"));
            startActivity(intent);
        };
        share.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
            startActivity(intent);
        }
    }
}
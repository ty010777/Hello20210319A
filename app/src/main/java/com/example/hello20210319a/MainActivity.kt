package com.example.hello20210319a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener,View.OnLongClickListener{

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv.setOnClickListener(this)
        txv.setOnLongClickListener(this)
        img.setOnLongClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }

        })

    }

//    fun add(v: View) {
////        if(v.id == R.id.btn1){
//        if(v == btn){
//            counter +=1
//        }else{
//            counter +=2
//        }
//
//        txv.text = counter.toString()
//    }

    override fun onClick(v: View?) {

        if(v == btn1 || v == txv){
            counter +=1
        }else if(v == btn2){
            counter +=2
        }else if(v == btn3){
            counter = 0
        }

        txv.text = counter.toString()
    }

    override fun onLongClick(v: View?): Boolean {
        if(v == img){
            counter --
        }else{
            counter+=10
        }
        txv.text = counter.toString()
        return true
    }
}


package com.neppplus.condition_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
//            val age = inputEdt.text.toString().toInt()
//
//            if (age < 10) {
////                if문이 true일 경우 실행
//                answerTxt.text = "유아입니다."
//            }
//            else if (age < 20) {
////                else if 문이 true일 경우 실행
//                answerTxt.text = "청소년입니다."
//            }
//            else {
////                if문이 false일 경우 실행
//                answerTxt.text = "성인입니다."
//            }
            val inputData : String = inputEdt.text.toString()

            if (inputData == "김민철") {
                answerTxt.text = "김민철이 맞습니다."
            }
            else {
//                조건식 : inputData != "김민철"
                answerTxt.text = "김민철이 아닙니다."
            }

        }
    }
}
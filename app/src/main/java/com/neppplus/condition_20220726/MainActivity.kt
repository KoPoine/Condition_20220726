package com.neppplus.condition_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variationTestBtn.setOnClickListener {
            val myBirthYear = 1990
            val myAge = 2022 - myBirthYear + 1

            if (myAge < 10) {
                Log.d("나이 검사", "유아입니다.")
            }
            else if (myAge < 20) {
                Log.d("나이 검사", "청소년입니다.")
            }
            else {
                Log.d("나이 검사", "성인입니다.")
            }
        }


        conditionBtn2.setOnClickListener {
//        장기 근속 1. 연봉, 2. 야근 유무, 거리
            val income = 3800
            val dayNight = true
            val distance = 4

//        1. 연봉이 4000이상이거나 or 거리가 5분 이내거나 (OR 연산자 활용)
            if (income >= 4000 || distance <= 5) {
                Log.d("입사 여부", "취업 OK")
            }
            else {
                Log.d("입사 여부", "다른 회사 지원")
            }

//        2. 연봉이 3000이상 이거나 or 야근이 없거나(Nor 연산자 OR 연산자)
            if (income >= 3000 || !dayNight) {
                Log.d("입사 여부", "취업 OK")
            }
            else {
                Log.d("입사 여부", "다른 회사 지원")
            }

//        3. 야근이 없어야하고 and 거리가 10분 이내(AND 연산자 활용)
            if (!dayNight && distance < 10) {
                Log.d("입사 여부", "취업 OK")
            }
            else {
                Log.d("입사 여부", "다른 회사 지원")
            }
        }


    }
}
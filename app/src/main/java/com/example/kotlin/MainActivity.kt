package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String? = MainActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = 1;
        val i1 = 1;

        var i2: Int
        var str: String;
        //삼항연산자 대신 When else
        test1()
        //자동 컴파일 에러 확인
        test2()
        //유형 검사, 컨트렉트
        test3()
        //단일 표현식
        test4()
        //함수내 함수 표현 (익명함수)
        test5()
        //고차함수
        test6()
        //속성
        test7()
    }


    private fun test7() {

    }

    class Car (val wheels: List<Wheel>) {
        private val doorLock: DoorLock = DoorLock()
        class DoorLock
        class Wheel
        class Key
        fun unlockDoor(key: Key): Boolean {
            // Return true if key is valid for door lock, false otherwise
            return false;
        }
    }

    //고차함수
    private fun test6() {
        stringMapper("콜백 테스트 해보자", { input ->
            Log.d(TAG, "length: ${input.length}")
        })
    }

    //고차함수 콜백을 사용할 때 유용하다.
    fun stringMapper(str: String, mapper: (String) -> Int): Int {
        return mapper(str)
    }

    //익명함수
    private fun test5() {
        val stringLengthFunc: (String) -> Int = { input ->
            input.length
        }
        val strLength: Int = stringLengthFunc("How my Length")
    }

    //단일 표현식
    private fun test4() {
        generateAnswerString(30)
        generateAnswerString2(31)
    }


    //단일 표현식일 경우 함수에 포함된 if else의 결과값을 바로 반활 할 수 있다
    val count = 30
    fun generateAnswerString2(countThreshold: Int): String = if (count == countThreshold) {
        "I have the answer."
    } else {
        "the answer eludes me."
    }

    fun generateAnswerString(countThreshold: Int): String {
        val result = if (count == countThreshold) {
            "I have the Answer."
        } else {
            "I have the Answer."
        }
        return result;
    }

    private fun test3() {
        val languageName: String? = null
        if (languageName != null) {
            println(languageName.uppercase())
        }
    }

    private fun test2() {
        val languageName = "Kotlin"
//        val languageName = 1 //compile error
        val upperCaseName = languageName.uppercase()
    }

    private fun test1() {
        val languageName = 1

        val count: Int = 42
        val answerString = when {
            count == 42 -> "i Have answer."
            count > 35 -> "The answer is close"
            else -> {
                "The answer eludes me"
            }
        }
    }

}
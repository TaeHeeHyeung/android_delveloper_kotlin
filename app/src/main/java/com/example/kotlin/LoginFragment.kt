package com.example.kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {

    // lateinit을 사용할경우 UninitializedPropertyAccessException 에러가 발생할 수 있다.
    // => Android Jetpack의 데이터 결합을 사용
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var statusTextView: TextView

    // 초기화 방법
//    val index: Int = 12
//    val index:Int
//    init {
//        index =1
//    }

    //동반 객체 (자바의 static 과 유사함)
    companion object {
        private val TAG =LoginFragment.javaClass.simpleName
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, //?: null 허용
        savedInstanceState: Bundle? //?: null 허용
    ): View? {

        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    //화면이 보이기전 초기화 작업
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //화면이 보일 떄 작업
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        usernameEditText = view.findViewById(R.id.username_edit_text)
        passwordEditText = view.findViewById(R.id.password_edit_text)
        loginButton = view.findViewById(R.id.login_button)
        statusTextView = view.findViewById(R.id.status_text_view)
        //SAM 변환 single abstract method
        loginButton.setOnClickListener {
            //? => null 일 경우 매소드를 실행하지 않고 null 을 반환한다.
            //?: "" =>  null 일 경우 빈값을 반환한다.
            var userName = usernameEditText.text?.trim()?.toString() ?: ""
            var password = passwordEditText.text?.trim()?.toString() ?: ""
        }
    }

    fun validateAccount(account: Account?) {
        val accountName = account?.name?.trim() ?: "Default name"
        // account cannot be null beyond this point
        account ?: return
    }
}
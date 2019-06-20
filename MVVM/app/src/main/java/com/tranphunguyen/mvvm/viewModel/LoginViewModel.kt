package com.tranphunguyen.mvvm.viewModel

import android.content.Context
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.tranphunguyen.mvvm.BR
import com.tranphunguyen.mvvm.EventViewModel.InterfaceLoginViewModel
import com.tranphunguyen.mvvm.model.User

class LoginViewModel(var context: Context) : BaseObservable(), InterfaceLoginViewModel {

    private val myUser = User()

    var user: User? = null

    @get: Bindable
    var result1: String = "T"
        set(value) {
            field = value
            notifyPropertyChanged(BR.result1)
        }

    override fun checkLogin() {
        user = User().getUser()
        Log.d("checkMVVM",myUser.name + ":" + myUser.password)
        if (user?.name == myUser.name && user?.password == myUser.password) {

            result1 = "Chúc mừng ${myUser.name} đã đăng nhập thành công!"
            Toast.makeText(context, "Đăng nhập thành công!", Toast.LENGTH_LONG).show()
        } else {
            result1 = "Đăng nhập thất bại!"
            Toast.makeText(context, "Đăng nhập thất bại!", Toast.LENGTH_LONG).show()
        }
    }

    fun getUserName(edUserName: Editable) {
        myUser.name = edUserName.toString()
    }

    fun getPassword(edPassword: Editable) {
        myUser.password = edPassword.toString()
    }
}
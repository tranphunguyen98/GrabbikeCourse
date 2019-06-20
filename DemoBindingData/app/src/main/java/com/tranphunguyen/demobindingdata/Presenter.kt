package com.tranphunguyen.demobindingdata

import android.text.Editable

class Presenter {

    fun changeName(editable : Editable,user : UserBinable) {
     user.name = editable.toString()
    }
}


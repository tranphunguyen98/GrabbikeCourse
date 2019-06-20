package com.tranphunguyen.demobindingdata

import android.databinding.BaseObservable
import android.databinding.Bindable

class UserBinable : BaseObservable() {
    var name: String? = null
        @Bindable get() = field
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}
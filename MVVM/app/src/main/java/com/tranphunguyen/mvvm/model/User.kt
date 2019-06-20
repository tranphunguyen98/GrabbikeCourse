package com.tranphunguyen.mvvm.model

class User {
    var name : String? = null
    var password : String? = null

    constructor() {
        this.name = ""
        this.password = ""
    }

    constructor(name : String, password: String) {
        this.name = name
        this.password = password
    }

    fun getUser() : User {
        val name = "nguyen"
        val password = "1234"

        return User(name, password)
    }
}
package com.example.mdpgroupproject.DAO

import android.telecom.Call



interface dao {

        annotation class Insert
//Holds data for username and password
        @Insert
        fun insertUsernameAndPassword(userName: Username, password: Password)

        class Password {
                var password = ""


        }

        class Username {
                var username = ""
        }

}



package com.example.mdpgroupproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mdpgroupproject.UI.*
//import androidx.lifecycle.ViewModelProviders
import com.example.mdpgroupproject.UI.LoginFragment
import com.example.mdpgroupproject.UI.MainFragment
import com.example.mdpgroupproject.UI.AddBillFragment


class MainActivity : AppCompatActivity() {

    private lateinit var AddNewBillFragment: AddBillFragment
    private lateinit var LoginFragment: LoginFragment
    private lateinit var MainFragment: MainFragment
    private lateinit var activeFragment: Fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AddNewBillFragment = AddBillFragment.newInstance()
        MainFragment = MainFragment.newInstance()
        LoginFragment = LoginFragment.newInstance()
        val MainViewModel = MainViewModel()
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment())
                .commitNow()
            activeFragment = LoginFragment()
        }



    }
}



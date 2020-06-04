package com.example.mdpgroupproject.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mdpgroupproject.DAO.dao


class MainViewModel : ViewModel() {
    var Bills = MutableLiveData<string>()
private var _bill: MutableLiveData<ArrayList<Bills>> = MutableLiveData<ArrayList<Bills>>()
    private var _Password: MutableLiveData<ArrayList<dao.Password>> = MutableLiveData<ArrayList<dao.Password>>()
private var _Username: MutableLiveData<ArrayList<dao.Username>> = MutableLiveData<ArrayList<dao.Username>>()


    internal var bill:MutableLiveData<ArrayList<Bills>>
        get() {return _bill}
        set(value) {_bill = value}

    internal var password :MutableLiveData<ArrayList<dao.Password>>
        get() { return _Password}
        set(value) {_Password = value}

    internal var username : MutableLiveData<List<dao.Username>>
        get() { return _Username}
        set(value) {_Username = value}




}
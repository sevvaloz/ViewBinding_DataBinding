package com.example.viewbindingexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.viewbindingexample.databinding.ActivityNewBinding


class NewActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val binding: ActivityNewBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_new)

        //binding.userinformation = UserInformation("NameTest", "AgeTest",false)


        val user: UserInformation = intent.getSerializableExtra("KeyUser") as UserInformation
        binding.userinformation = UserInformation(user.isim, user.yas, user.check)
        if(user.check){
            binding.icon.setImageResource(R.drawable.yesil)
        }
        if(!user.check){
            binding.icon.setImageResource((R.drawable.kirmizi))
        }



    }
}
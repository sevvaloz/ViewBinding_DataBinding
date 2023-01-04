package com.example.viewbindingexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.viewbindingexample.databinding.ActivityNewBinding


class NewActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val binding: ActivityNewBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_new)

        //binding.userinformation = UserInformation("NameTest", "AgeTest",false)

        val tik: String = "https://www.pngitem.com/pimgs/m/144-1449392_true-false-icon-png-transparent-png.png"
        val carpi: String = "https://flyclipart.com/thumb2/false-icon-with-png-and-vector-format-for-free-unlimited-download-438606.png"


        val user: UserInformation = intent.getSerializableExtra("KeyUser") as UserInformation
        binding.userinformation = UserInformation(user.isim, user.yas, user.check)
        if(user.check){
            //binding.icon.setImageResource(R.drawable.yesil)
            Glide.with(this)
                .load(tik)
                .circleCrop()
                .into(binding.icon)
        }
        if(!user.check){
            //binding.icon.setImageResource((R.drawable.kirmizi))
            Glide.with(this)
                .load(carpi)
                .circleCrop()
                .into(binding.icon)
        }



    }
}
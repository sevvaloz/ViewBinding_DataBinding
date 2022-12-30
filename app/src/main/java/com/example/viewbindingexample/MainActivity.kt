package com.example.viewbindingexample

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonIlerle.setOnClickListener {
            if(binding.editTxtName.text.toString().isBlank() || binding.editTxtAge.text.toString().isBlank()) {
                Toast.makeText(this, "Eksik bilgilerinizi kontrol ediniz!", Toast.LENGTH_SHORT).show()
            }

            else{
                Toast.makeText(this, "Sayfa açılıyor..", Toast.LENGTH_SHORT).show()

                //veri gönderme
                val user = UserInformation(binding.editTxtName.text.toString(),binding.editTxtAge.text.toString(), binding.switchOnay.isChecked)
                val intent: Intent = Intent(this, NewActivity::class.java)
                intent.putExtra("KeyUser", user)
                startActivity(intent)
            }
        }






    }
}
package com.example.dataclasspractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dataclasspractice.databinding.ActivityMainBinding
import com.example.dataclasspractice.dataclasses.History
import com.example.dataclasspractice.dataclasses.MedicalCard
import com.example.dataclasspractice.dataclasses.bolezni
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var medicalCard:MedicalCard? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        var medicalCard = MedicalCard(id = "first",fullname = "11", birthDate = Date(), gender = "11", blood = "11", address = "11",
//            vacHistory = listOf(History(vacName = "11", date = Date(), address = "11")),
//        bolezniHistory = arrayListOf()
//        )
//     medicalCard.bolezniHistory?.add(bolezni(name = "болен",date = Date(), status = "болен крч", endDate = null))
        binding.btn.setOnClickListener {
            var id = binding.edId.text.toString()
            var fullName = binding.edFullName.text.toString()
            var birthDate = binding.edBirth.text.toString()
            var gender = binding.edGender.text.toString()
            var blood = binding.edBlood.text.toString()
            var address = binding.edAddress.text.toString()


            var medicalCard = MedicalCard(id, fullName, birthDate, gender, blood, address)
//            Log.i("medicalCard", medicalCard.toString())
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("text", medicalCard.toString())
            startActivity(intent)
        }
    }
}
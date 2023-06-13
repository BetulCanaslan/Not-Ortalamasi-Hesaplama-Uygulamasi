package com.example.notortalamasihesaplamauygulamasi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.notortalamasihesaplamauygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonHesapla.setOnClickListener {
            if (binding.editTextNumber1.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
                val sinav1 = binding.editTextNumber1.text.toString().toInt()
                val sinav2 = binding.editTextNumber2.text.toString().toInt()
                var ortalama: Double = (sinav1 + sinav2) / 2.toDouble()
                if (ortalama>=50){
                    binding.sonucText.text = "Not Ortalamanız"+" "+ortalama.toString()+" "+"Geçtiniz!"
                    binding.sonucText.setTextColor(getColor(R.color.green))
                }else{
                    binding.sonucText.text = "Not Ortalamanız"+" "+ortalama.toString()+" "+"Kaldınız."
                    binding.sonucText.setTextColor(getColor(R.color.red))
                }
            } else {
                binding.sonucText.text = "Sınav notunuzu giriniz."
                binding.sonucText.setTextColor(getColor(R.color.red))
            }
        }
    }
}
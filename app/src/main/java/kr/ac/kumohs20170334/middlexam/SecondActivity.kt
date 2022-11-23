package kr.ac.kumohs20170334.middlexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumohs20170334.middlexam.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_second)
    }
}
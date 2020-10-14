package io.github.dzulfikar68.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText?.addTextChangedListener {
            var answer = it.toString().trim()
            answer = answer.replace("[^A-Za-z]", "")
            val re = Regex("[^A-Za-z]")
            answer = re.replace(answer, "")
            if (isPalindrome(answer)) {
                textView?.text = "Palindrome"
            } else {
                textView?.text = "Not Palindrome"
            }
        }
    }

    fun isPalindrome(string: String): Boolean {
        val testString = string.toLowerCase(Locale.ROOT)
                .replace("""[\W+]""".toRegex(), "")
        return testString == testString.reversed()
    }
}
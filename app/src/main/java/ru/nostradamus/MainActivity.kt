package ru.nostradamus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    private lateinit var magikButtonYes: Button
    private lateinit var magikButtonMaybe: Button
    private lateinit var magikButtonNo: Button

    private lateinit var ansverText: TextView
    private lateinit var titleText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        magikButtonYes = findViewById(R.id.magikButtonYes)
        magikButtonMaybe = findViewById(R.id.magikButtonMaybe)
        magikButtonNo = findViewById(R.id.magikButtonNo)

        ansverText = findViewById(R.id.ansverTextView)
        titleText = findViewById(R.id.textView)

    }

    fun clickMagikButtonYes(view: View) {
        ansverText.text = "Мой ответ = ДА!"
        clearBugaga()
    }

    fun clickMagikButtonMaybe(view: View) {
        ansverText.text = "Сейчас я не могу ответить на этот вопрос"
        clearBugaga()
    }

    fun clickMagikButtonNo(view: View) {
        ansverText.text = "Однозначно НЕТ!"
        clearBugaga()
    }

    fun bugaga(view: View) {
        ansverText.text = "Не туда тыкаешь, кнопка находится выше"
    }

    fun clickAnswer(view: View) {
        ansverText.text = "Тут будет мой ответ на твой вопрос"
    }

    fun clearBugaga() {
        titleText.text = "Данное приложение может ответить на любой ваш вопрос, достаточно честно. Попробуйте"
    }

}
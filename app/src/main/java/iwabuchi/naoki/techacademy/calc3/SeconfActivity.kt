package iwabuchi.naoki.techacademy.calc3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seconf.*
import kotlinx.android.synthetic.main.content_main.*
import android.view.View

class SeconfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seconf)

        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button3 -> textView.text.toString()
            R.id.button4 -> textView1.text.toString()
            R.id.button5 -> textView2.text.toString()
            R.id.button6 -> textView3.text.toString()

        val value1 = intent.getIntExtra("VALUE1")
        val value2 = intent.getIntExtra("VALUE2")

        textView.text = "${value1 + value2}"

        val value1 = intent.getIntExtra("VALUE1")
        val value2 = intent.getIntExtra("VALUE2")

        textView1.text = "${value1 - value2}"

        val value1 = intent.getIntExtra("VALUE1")
        val value2 = intent.getIntExtra("VALUE2")

        textView2.text = "${value1 * value2}"

        val value1 = intent.getIntExtra("VALUE1")
        val value2 = intent.getIntExtra("VALUE2")

        textView3.text = "${value1 / value2}"







    }
}

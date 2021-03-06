package iwabuchi.naoki.techacademy.calc3

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() ,View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button3.setOnClickListener(this){

            override fun onClick(v: View?) {
                val intent = Intent(this,SeconfActivity::class.java)
                intent.putExtra("VALUE1")
                intent.putExtra("VALUE2")
                startActivity(intent)
        }
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "数字を入れてください", Snackbar.LENGTH_LONG)
                .setAction("戻る", null).show()

            // fun onButton(v: View) {
            //   tv1.text = ed1.text.toString()
            // tv2.text = ed2.text.toString()

            //        tv1.text = ed1.text.toString()
            //      button2.setOnClickListener {
            //        tv2.text = ed2.text.toString()

        }
//                    button1.nClicklistener(this)
//                    button2.setOnClicklistener(this)


        //     fun onClick(v:View) {
        //    if (v.id == R.id.button1) {
        //      tv1.text = ed1.text.toString()
        //    } else if (v.id == R.id.button2) {
        //       tv2.text = ed2.text.toString()


           button1.setOnClickListener {
            tv1.text = ed1.text.toString()

            button2.setOnClickListener {
                tv2.text = ed2.text.toString()

            }
            //private fun onClick(v: View) {
            //  when (v.id) {
            //   R.id.button1 -> tv1.text = ed1.text.toString()
            //   R.id.button2 -> tv2.text = ed2.text.toString()

        }
    }
        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate the menu; this adds items to the action bar if it is present.
            menuInflater.inflate(R.menu.menu_main, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            return when (item.itemId) {
                R.id.action_settings -> true
                else -> super.onOptionsItemSelected(item)
            }
        }
}



package es.tiernoparla.preferencias

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nombre = leer()
        if (nombre != null) {
            val txtNombre = findViewById<TextView>(R.id.txtName)
            txtNombre.setText(nombre)
        }
    }

    fun guardar(view: View) {
        val nombre = findViewById<TextView>(R.id.txtName).text
        val sharedPref = getSharedPreferences("Login", MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString("nombre", nombre.toString())
        editor.apply()

        val intent = Intent(this, Details::class.java)
        startActivity(intent)
    }

    fun leer(): String? {
        val sharedPref = getSharedPreferences("Login", MODE_PRIVATE)
        return sharedPref.getString("nombre", "")
    }

}

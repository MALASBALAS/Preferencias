package es.tiernoparla.preferencias

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val nombre = leer()
        val txtNombre = findViewById<TextView>(R.id.txtNameRecibir)
        txtNombre.setText(nombre)
    }

    fun leer(): String? {
        val sharedPref = getSharedPreferences("Login",MODE_PRIVATE)
        val nombre = sharedPref.getString("nombre", "")
        return nombre
    }

    fun navegar(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}

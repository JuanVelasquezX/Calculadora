package cr.ac.calculadora

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression


class MainActivity : AppCompatActivity() {

    var texto: TextView? = null
    var firstClick: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnZeroClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("0")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "0"
        }

    }

    fun btnOneClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("1")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "1"
        }

    }

    fun btnTwoClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("2")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "2"
        }

    }

    fun btnThreeClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("3")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "3"
        }

    }

    fun btnFourClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("4")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "4"
        }

    }

    fun btnFiveClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("5")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "5"
        }

    }

    fun btnSixClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("6")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "6"
        }

    }

    fun btnSevenClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("7")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "7"
        }

    }

    fun btnEightClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("8")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "8"
        }

    }

    fun btnNineClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("9")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "9"
        }

    }

    fun btnPlusClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("+")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "+"
        }
    }

    fun btnMinusClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("-")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "-"
        }
    }

    fun btnMultiplyClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("*")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "*"
        }
    }

    fun btnDivideClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("/")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "/"
        }
    }

    fun btnPercentClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText("%")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "%"
        }
    }

    fun btnPointClick(view: View) {
        if (!firstClick) {
            firstClick = true
            texto = findViewById(R.id.calcText)
            texto?.setText(".")
        } else {
            texto = findViewById(R.id.calcText)
            texto?.text = texto?.text.toString() + "."
        }
    }

    fun btnClearClick(view: View) {
        firstClick = false
        texto = findViewById(R.id.calcText)
        texto?.setText("0")
    }

    fun btnEqualClick(view: View) {
        texto = findViewById(R.id.calcText)
        val expresion = Expression(texto?.text.toString())
        texto?.setText(expresion.calculate().toString())
    }
}


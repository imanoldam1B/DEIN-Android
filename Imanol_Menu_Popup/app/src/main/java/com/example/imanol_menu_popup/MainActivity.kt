package com.example.imanol_menu_popup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moreButton: ImageView = findViewById(R.id. more_actions_button)
        moreButton.setOnClickListener { view ->
            showMoreActionsMenu(view)
        }
    }

    private fun showMoreActionsMenu(button: View) {
        val popupMenu = PopupMenu(this, button)
        menuInflater.inflate(R.menu.main_menu, popupMenu.menu)
        popupMenu.show()
    }
}
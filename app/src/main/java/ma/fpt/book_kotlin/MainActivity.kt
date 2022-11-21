package ma.fpt.book_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerViewBooks : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewBooks= findViewById(R.id.recycleview);
        val items = listof(
            Book(
                "The Guernsey Literary and Potato Peel Pie Society",
                "I wonder how the book got to Guernsey? Perhaps there is some sort of secret homing instinct in books that brings them to their perfect readers.\" January 1946: London is emerging from the shadow of the Second World War, and writer Juliet Ashton is looking for her next book subject.",
                R.drawable.img10,
                4.18F,
                "Annie Barrows"),

        )
        recyclerViewBooks.apply{
            layoutManager = LinearLayoutManager(this)
            recyclerViewBooks.adapter= BookAdapter(items)

        }
    }
}
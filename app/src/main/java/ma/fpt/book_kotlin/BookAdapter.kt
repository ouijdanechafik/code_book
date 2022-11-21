package ma.fpt.book_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(var items : List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {

    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book,parent,false)
    return  BookViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = items[position]
        holder.bind(book)

    }

    override fun getItemCount()= items.size


   inner class BookViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
         var tvTitle: TextView
         var tvSummary: TextView
         var tvAuthor : TextView
         var imageBook : ImageView
         var ratingBar : RatingBar

        init{
            tvTitle = itemView.findViewById(R.id.tvtitle)
            tvSummary = itemView.findViewById(R.id.tvsummaray)
            tvAuthor = itemView.findViewById(R.id.tvauthorHint)
            imageBook = itemView.findViewById(R.id.imaga_book)
            ratingBar = itemView.findViewById(R.id.rating)

        }
        fun bind(book: Book){
            tvTitle.text = book.title
            tvSummary.text = book.summary
            tvAuthor.text = book.author
            imageBook.setImageResource(book.image)
            ratingBar.rating=book.rating

        }
    }

}
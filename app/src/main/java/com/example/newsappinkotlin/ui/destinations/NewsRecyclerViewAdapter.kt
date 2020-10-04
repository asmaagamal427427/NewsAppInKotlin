package com.example.newsappinkotlin.ui.destinations
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsappinkotlin.NewsModel
import com.example.newsappinkotlin.R
import kotlinx.android.synthetic.main.item.view.*

class NewsRecyclerViewAdapter(private var NewsArrayList : ArrayList<NewsModel>) :
    RecyclerView.Adapter<NewsRecyclerViewAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(newsModel: NewsModel){
            itemView.image.setImageResource(newsModel.imageID)
            itemView.title.text = newsModel.title
            itemView.website.text = newsModel.website
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item,
            parent,
            false
        ))
    override fun getItemCount(): Int = NewsArrayList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var NewsItem = NewsArrayList[position]
        holder.onBind(NewsItem)
    }

}
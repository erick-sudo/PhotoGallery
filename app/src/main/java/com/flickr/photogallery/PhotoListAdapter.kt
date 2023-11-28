package com.flickr.photogallery

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.flickr.photogallery.databinding.ListItemGalleryBinding

class PhotoViewHolder(
    private val binding: ListItemGalleryBinding
) : RecyclerView.ViewHolder(
    binding.root
) {
    fun bind(galleryItem: GalleryItem, onItemClicked: (Uri) -> Unit) {
        // val urlPlaceHolder = "http://10.0.2.2:3000/${listOf("1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.png", "6.png", "7.jpg", "8.jpg", "9.jpg", "10.jpg", "11.jpg", "12.png", "13.jpg").random()}"
        binding.itemImageView.load(galleryItem.url) {
            placeholder(R.drawable.placeholder_giphy)
        }
        binding.root.setOnClickListener { onItemClicked(Uri.parse(galleryItem.url)) }
    }
}

class PhotoListAdapter(
    private val galleryItems: List<GalleryItem>,
    private val onItemClicked: (Uri) -> Unit
) : RecyclerView.Adapter<PhotoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(ListItemGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = galleryItems.size

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(galleryItems[position], onItemClicked)
    }

}
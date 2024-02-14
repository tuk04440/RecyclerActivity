package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(_numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* Step 3a: Provide Adapter Parent */ {

    private val numbers = _numbers
    class NumberViewHolder(val numberView: TextView) : RecyclerView.ViewHolder(numberView)

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        // Create a new view
        val textView = TextView(parent.context).apply {
            layoutParams = ViewGroup.LayoutParams(300, 300)
        }
        return NumberViewHolder(textView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.numberView.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}
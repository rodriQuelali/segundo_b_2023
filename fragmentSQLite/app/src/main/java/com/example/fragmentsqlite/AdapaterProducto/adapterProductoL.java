package com.example.fragmentsqlite.AdapaterProducto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentsqlite.R;
import com.example.fragmentsqlite.model.Producto;

import java.util.List;

public class adapterProductoL extends RecyclerView.Adapter<adapterProductoL.ViewProductoHolder> {

    private List<Producto> listPro;

    public adapterProductoL(List<Producto> listPro) {
        this.listPro = listPro;
    }

    @NonNull
    @Override
    public adapterProductoL.ViewProductoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.diseproductorecycleview, null, false);
        return new ViewProductoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterProductoL.ViewProductoHolder holder, int position) {

        holder.tvC.setText(String.valueOf(listPro.get(position).getCod()));
        holder.tvP.setText(String.valueOf(listPro.get(position).getDescripcion()));
        holder.tvPre.setText(String.valueOf((int) listPro.get(position).getPrecio()));
    }

    @Override
    public int getItemCount() {
        return listPro.size();
    }

    public class ViewProductoHolder extends RecyclerView.ViewHolder {
        TextView tvC, tvP, tvPre;
        public ViewProductoHolder(@NonNull View itemView) {
            super(itemView);
            tvC=itemView.findViewById(R.id.tvCodigo);
            tvP=itemView.findViewById(R.id.tvDescripcion);
            tvPre = itemView.findViewById(R.id.tvPrecio);

        }
    }
}

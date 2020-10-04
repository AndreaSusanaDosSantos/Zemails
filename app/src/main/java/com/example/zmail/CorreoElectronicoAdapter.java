package com.example.zmail;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zmail.models.CorreoElectronico;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CorreoElectronicoAdapter extends BaseAdapter {
private List<CorreoElectronico> ListaDeCorreos;
    private int position;

    public CorreoElectronicoAdapter(List<CorreoElectronico> listaDeCorreos) {
        ListaDeCorreos = listaDeCorreos;
    }

    @Override
    public int getCount() {
        return ListaDeCorreos.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaDeCorreos.get(position);
    }

    @Override
    public long getItemId(int position) {
        this.position = position;
        return ListaDeCorreos.get(position).getId();
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        View view;
        if (convertView==null) {

            view = LayoutInflater.from(parent.getContext( )).inflate(R.layout.item_lista_emails, parent, false);
        }else {
            view = convertView;
        }
        CorreoElectronico email= (CorreoElectronico)getItem(position);

        TextView NombreRemitente= view.findViewById(R.id.txtNombreRemitente);
        TextView AsuntoMensaje= view.findViewById(R.id.txtAsuntoMensaje);
        TextView CuerpoMensaje= view.findViewById(R.id.txtCuerpoMensaje);
        ImageView Icono= view.findViewById(R.id.imageViewIcono);
        NombreRemitente.setText(email.getNombreRemitente());
        AsuntoMensaje.setText(email.getAsuntoMensaje());
        CuerpoMensaje.setText(email.getCuerpoMensaje());
        Picasso.get().load("http://i.imgur.com/DvpvklR.png" + email.getId()).into(Icono);
    /*
        CuerpoMensaje.setTag(position);
        CuerpoMensaje.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                Intent VisorCuerpoMensaje= new Intent(convertView.VisorCuerpoMensaje.class);
                VisorCuerpoMensaje.putExtra()

            }
        });
        
     */
        return view;
    }
}

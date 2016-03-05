package edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.adapter;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.R;
import edittextlistenerapp.ifpb.edu.br.edittextlistenerapp.entidade.Pessoa;

public class PessoasCustomAdapter extends BaseAdapter {

    Context context;

    List<Pessoa> pessoas;
     
    public PessoasCustomAdapter(Context context, List<Pessoa> pessoas) {
        this.context = context;
        this.pessoas = pessoas;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
         
        LayoutInflater mInflater = (LayoutInflater)  context.getSystemService(
                Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.list_item, null);

            holder = new ViewHolder();
            holder.txtInscription = (TextView) convertView.findViewById(R.id.inscription);
            holder.txtFullName = (TextView) convertView.findViewById(R.id.fullName);

            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();
        }

        Pessoa pessoaItem = (Pessoa) getItem(position);

        holder.txtFullName.setText(pessoaItem.getNome());
        holder.txtInscription.setText(pessoaItem.getDescricao());
         
        return convertView;
    }
 
    @Override
    public int getCount() {     
        return pessoas.size();
    }
 
    @Override
    public Object getItem(int position) {
        return pessoas.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return pessoas.indexOf(getItem(position));
    }

    /*private view holder class*/
    private class ViewHolder {

        TextView txtFullName;
        TextView txtInscription;
    }
}
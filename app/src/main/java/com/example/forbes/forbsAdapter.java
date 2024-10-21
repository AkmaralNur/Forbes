package com.example.forbes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class forbsAdapter extends ArrayAdapter<person> {
    public forbsAdapter(@NonNull Context context, List<person> resource) {
        super(context, R.layout.activity_forbs_item, resource);
    }

    ImageView imageView;
    TextView tvName, tvMoney;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Проверяем, есть ли уже view для повторного использования
        if (convertView == null) {
            // Если нет, надуваем (inflating) новый макет
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_forbs_item, parent, false);
        }

        // Получаем данные о текущем человеке
        person person = getItem(position);

        // Привязываем виджеты к полям макета
        imageView = convertView.findViewById(R.id.flag);
        tvName = convertView.findViewById(R.id.name);
        tvMoney = convertView.findViewById(R.id.money);

        // Устанавливаем данные
        if (person != null) {
            imageView.setImageResource(person.flag);
            tvName.setText(person.name);
            tvMoney.setText(person.money);
        }

        // Возвращаем измененный вид
        return convertView;
    }
}

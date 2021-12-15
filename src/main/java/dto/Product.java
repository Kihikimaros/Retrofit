package dto;

import lombok.*;

@Data//данные//
@NoArgsConstructor//при компиляции конструктор без аргументов//
@AllArgsConstructor//конструктор со всеми аргументами//
@With//через точку модифицировать продукт//
@ToString//метод//
public class Product {
    Integer id;
    String title;
    Integer price;
    String categoryTitle;
}

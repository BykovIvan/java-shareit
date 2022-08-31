package ru.practicum.shareit.item;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDtoForById {

    private Long id;
    private String name;
    private String description;
    private Boolean available;
    private Long request;
    private Comment comment;

}

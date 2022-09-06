package ru.practicum.shareit.requests;

import ru.practicum.shareit.item.ItemDtoForRequest;

import java.util.List;

public interface ItemRequestService {
    ItemRequestDto safe(Long userId, ItemRequestDto itemRequestDto);
    List<ItemDtoForRequest> findRequestByUserId(Long userId);
}
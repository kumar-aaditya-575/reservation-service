package com.hotel.reservationsystem.service.model;

import com.hotel.reservationsystem.controller.dtos.BedReq;
import com.hotel.reservationsystem.data.entity.Reservation;
import com.hotel.reservationsystem.data.entity.Room;

import java.util.Optional;

public interface HotelRoomService {
    Optional<Room> getRoomByRoomId(long roomNumber);
    Iterable<Reservation> getAllRoomReservations(long roomId);
    Iterable<Room> getAllRooms();

    Optional<Room> updateBed(BedReq bedReq, long roomId);
}

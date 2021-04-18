package com.udemy.flichcheckin.integration;

import com.udemy.flichcheckin.integration.dto.Reservation;
import com.udemy.flichcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);

}

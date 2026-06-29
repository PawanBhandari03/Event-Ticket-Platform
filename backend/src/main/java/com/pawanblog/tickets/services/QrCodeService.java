package com.pawanblog.tickets.services;

import com.pawanblog.tickets.domain.entities.QrCode;
import com.pawanblog.tickets.domain.entities.Ticket;
import java.util.UUID;

public interface QrCodeService {

  QrCode generateQrCode(Ticket ticket);

  byte[] getQrCodeImageForUserAndTicket(UUID userId, UUID ticketId);
}

package com.project.movieshark.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.project.movieshark.domain.Show;
import com.project.movieshark.domain.ShowSeat;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class TicketMessage {

    private String  userName;
    private String  mobile;
    private String email;
    private Show show;
    private List<ShowSeat> seats;
}

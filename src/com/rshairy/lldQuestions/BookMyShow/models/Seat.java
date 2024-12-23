package com.rshairy.lldQuestions.BookMyShow.models;

import com.rshairy.lldQuestions.BookMyShow.enums.SeatCategory;

public class Seat {
    int seatId;
    int row;
    SeatCategory category;
    int price;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatCategory getCategory() {
        return category;
    }

    public void setCategory(SeatCategory category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


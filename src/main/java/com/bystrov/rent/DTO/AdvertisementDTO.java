package com.bystrov.rent.DTO;

import com.bystrov.rent.domain.Address.Address;
import com.bystrov.rent.domain.Review;
import com.bystrov.rent.domain.advertisement.Image;
import com.bystrov.rent.domain.reservation.Reservation;
import com.bystrov.rent.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdvertisementDTO {

    private Long idAdvertisement;

    private AddressDTO address = new AddressDTO();

    @NotBlank(message = "Description cannot be empty")
    private String description;

    private List<Review> reviewList;

    private String data;

    /*@NotBlank(message = "Price cannot be empty")*/
    private Double price;

    private List<Image> images;

    private User user;

    private Reservation reservation;
}

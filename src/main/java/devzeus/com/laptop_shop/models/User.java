package devzeus.com.laptop_shop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User extends TrackingDate{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number", nullable = false, length = 10)
    private String phoneNumber;

    @Column(name = "full_name", length = 100)
    private String fullName;

    private String address;

    private String password;

    @Column(name = "day_of_birth")
    private LocalDate dayOfBirth;

    @Column(name = "active")
    private boolean isActive;

}

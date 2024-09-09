package devzeus.com.laptop_shop.models;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackingDate {
    private LocalDate createdAt;

    private LocalDate updatedAt;

    // Hàm sẽ đuoc gọi khi doi tuong duoc tao ra lan dau tien, chưa lưu xuoong cơ sở dữ liệu
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
    }

    // Ham se duoc goi khi doi tuong duoc chinh sua, chua duoc luu xuong csdl
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDate.now();
    }
}

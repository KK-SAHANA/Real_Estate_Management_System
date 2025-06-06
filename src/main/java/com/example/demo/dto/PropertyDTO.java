package com.example.demo.dto;

import com.example.demo.model.enums.PropertyStatus;
import com.example.demo.model.enums.PropertyType;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set; // <-- Import Set
import java.util.List; // <-- Or Import List if using List in entity

// DTO without Lombok - Manual Getters/Setters Needed
public class PropertyDTO {

    private Long id;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private BigDecimal price;
    private Integer bedrooms;
    private Integer bathrooms;
    private BigDecimal areaSqft;
    private String description;
    private PropertyType type;
    private PropertyStatus status;
    private String imageUrls; // Added imageUrls if needed in DTO responses

    // Ensure these are declared ONLY ONCE
    private Long ownerId;
    private String ownerName; // Can use owner.name
    private String ownerEmail; // Added owner email

    // --- VVV ADDED AMENITIES FIELD VVV ---
    private Set<String> amenities; // Or List<String> if using List in entity
    // --- ^^^ END ADDED AMENITIES FIELD ^^^ ---

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // --- Manual No-Argument Constructor ---
    public PropertyDTO() {
    }

    // --- Manual All-Argument Constructor (Optional but convenient - ADD amenities) ---
    public PropertyDTO(Long id, String address, String city, String state, String postalCode,
                       BigDecimal price, Integer bedrooms, Integer bathrooms, BigDecimal areaSqft,
                       String description, PropertyType type, PropertyStatus status, String imageUrls,
                       Long ownerId, String ownerName, String ownerEmail,
                       Set<String> amenities, // <-- Added amenities
                       LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.price = price;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.areaSqft = areaSqft;
        this.description = description;
        this.type = type;
        this.status = status;
        this.imageUrls = imageUrls; // Initialize imageUrls
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail; // Initialize ownerEmail
        this.amenities = amenities; // <-- Initialize amenities
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    // --- Manual Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Integer getBedrooms() { return bedrooms; }
    public void setBedrooms(Integer bedrooms) { this.bedrooms = bedrooms; }

    public Integer getBathrooms() { return bathrooms; }
    public void setBathrooms(Integer bathrooms) { this.bathrooms = bathrooms; }

    public BigDecimal getAreaSqft() { return areaSqft; }
    public void setAreaSqft(BigDecimal areaSqft) { this.areaSqft = areaSqft; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public PropertyType getType() { return type; }
    public void setType(PropertyType type) { this.type = type; }

    public PropertyStatus getStatus() { return status; }
    public void setStatus(PropertyStatus status) { this.status = status; }

    public String getImageUrls() { return imageUrls; } // Added getter/setter for imageUrls
    public void setImageUrls(String imageUrls) { this.imageUrls = imageUrls; }

    public Long getOwnerId() { return ownerId; }
    public void setOwnerId(Long ownerId) { this.ownerId = ownerId; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getOwnerEmail() { return ownerEmail; } // Added getter/setter for ownerEmail
    public void setOwnerEmail(String ownerEmail) { this.ownerEmail = ownerEmail; }

    // --- VVV ADDED GETTER/SETTER FOR AMENITIES VVV ---
    public Set<String> getAmenities() { return amenities; }
    public void setAmenities(Set<String> amenities) { this.amenities = amenities; }
    // --- ^^^ END ADDED GETTER/SETTER ^^^ ---

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
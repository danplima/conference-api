package br.com.events.conference.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_subscription")
public class Subscription {

    @Id
    private SubscriptionID id;
    @Column(name = "created_at")
    private LocalDateTime createAt;
    @Column(name = "level")
    private int level;
    @Column(name = "unique_id", length = 45, nullable = false)
    private String uniqueId;

    public SubscriptionID getId() {
        return id;
    }

    public void setId(SubscriptionID id) {
        this.id = id;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}

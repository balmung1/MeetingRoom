package RoomSystem;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="MeetingRoom_table")
public class MeetingRoom {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long roomId;
    private String roomName;
    private String location;

    @PostPersist
    public void onPostPersist(){
        RoomRegistered roomRegistered = new RoomRegistered();
        BeanUtils.copyProperties(this, roomRegistered);
        roomRegistered.publish();


    }

    @PostRemove
    public void onPostRemove(){
        RoomDelete roomDelete = new RoomDelete();
        BeanUtils.copyProperties(this, roomDelete);
        roomDelete.publish();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }




}

package RoomSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class MeetingRoomController {

    @Autowired
    MeetingRoomRepository meetingRoomRepository;

    @PostMapping("/register")
    MeetingRoom roomInsert(@RequestBody MeetingRoom meetingRoom) {

        System.out.println("##### Meeting Room Registered #####");
        return meetingRoomRepository.save(meetingRoom);
    }

    @RequestMapping(method = RequestMethod.DELETE, path="/delete")
    public void roomDelete(@RequestBody MeetingRoom meetingRoom) {

        System.out.println("##### Meeting Room Delete #####");
        meetingRoomRepository.delete(meetingRoom);
    }

}

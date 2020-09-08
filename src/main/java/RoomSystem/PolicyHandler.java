package RoomSystem;

import RoomSystem.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{

    @Autowired
    MeetingRoomRepository meetingRoomRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRoom_Room(@Payload MeetingRoom meetingRoom){

    }

}

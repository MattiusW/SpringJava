package pl.bykowski.videoapp;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi {

    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi(){
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L,"Titanic", LocalDate.of(1995, 1, 2)));
        videoCassettes.add(new VideoCassette(2L,"Pulp Fiction", LocalDate.of(1990, 2, 3)));
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll(){
        return videoCassettes;
    }

    @GetMapping
    public VideoCassette getById(@RequestParam int index){
        Optional<VideoCassette> first = videoCassettes.stream()
                .filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.add(videoCassette);
    }

    @PutMapping
    public boolean updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.add(videoCassette);
    }

    @DeleteMapping
    public boolean deleteVideo(@RequestParam int index){
        return videoCassettes.removeIf(element -> element.getId() == index);
    }


}

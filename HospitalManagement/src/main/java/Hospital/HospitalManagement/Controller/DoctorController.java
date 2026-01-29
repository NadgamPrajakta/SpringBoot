package Hospital.HospitalManagement.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hospital.HospitalManagement.DTO.DoctorDTO;
import Hospital.HospitalManagement.Entity.Doctor;

@RestController
@RequestMapping("/doctorController")
public class DoctorController {

    List<Doctor> list = new ArrayList<Doctor>();

    @PostMapping("/add-doctor")
    public Doctor addDoctor(@RequestBody Doctor doctor) {

        if (doctor != null) {
            list.add(doctor);
            System.out.println("Size of DB:" + list.size());

            System.out.println(
                doctor.getName()
                + " added in Hospital : "
                + doctor.getHospital().getHospitalName()
            );
        }

        return doctor;
    }

    @GetMapping("/get-all")
    public List<DoctorDTO> getall() {

        return list.stream().map((i) -> {
            DoctorDTO dto = new DoctorDTO();
            dto.setDid(i.getDid());
            dto.setName(i.getName());
            dto.setHospitalName(i.getHospital().getHospitalName());
            dto.setRegNo(i.getHospital().getRegNo());
            return dto;
        }).collect(Collectors.toList());
    }
}

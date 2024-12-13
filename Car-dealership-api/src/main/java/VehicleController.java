import Dao.VehicleDaoMySqlImpli;
import com.pluralsight.dealership.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/vehicle")
public class VehicleController {
    private VehicleDaoMySqlImpli vdao;

    @Autowired
    public VehicleController(VehicleDaoMySqlImpli vdao) {
        this.vdao = vdao; // Constructor
    }

    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        vdao.adddVehicle(vehicle);
        return vehicle; //Create

    }

    @GetMapping
    public List<Vehicle> getAll() {
        return vdao.findAllVehicle(); // Read
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteByID(@PathVariable(name = "id") Integer vin) {
        vdao.removeVehicle(vin); //Delete
    }
}




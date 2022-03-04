package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Address;
import ma.cigma.pfe.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AddressController {

    @Autowired
    private IAddressService addressService;

    public void create(Address address) {
        addressService.create(address);
    }
}
package ma.cigma.pfe.presentation;

import lombok.Getter;
import lombok.Setter;
import ma.cigma.pfe.models.Address;
import ma.cigma.pfe.service.IAddressService;

@Getter
@Setter
public class AddressController {
    private IAddressService addressService;


    public void create(Address address) {
        addressService.create(address);
    }
}

package ma.cigma.pfe.service;

import lombok.Getter;
import lombok.Setter;
import ma.cigma.pfe.dao.IAddressDao;
import ma.cigma.pfe.models.Address;

@Getter
@Setter
public class AddressServiceImpl implements IAddressService {
    private IAddressDao addressDao;

    @Override
    public Address create(Address address) {
        return addressDao.save(address);
    }
}
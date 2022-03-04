package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IAddressDao;
import ma.cigma.pfe.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private IAddressDao addressDao;

    @Override
    @Transactional
    public Address create(Address address) {
        return addressDao.save(address);
    }
}

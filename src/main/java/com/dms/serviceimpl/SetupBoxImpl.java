package com.dms.serviceimpl;

import com.dms.entity.SetupBox;
import com.dms.repository.SetupBoxRepo;
import com.dms.service.ISetupBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SetupBoxImpl implements ISetupBox {
    @Autowired
    private SetupBoxRepo setupBoxRepo;

    @Override
    public SetupBox save(SetupBox setupBox) {
        return setupBoxRepo.save(setupBox);
    }

    @Override
    public List<SetupBox> getAll() {
        return setupBoxRepo.findAll();
    }

    @Override
    public SetupBox getById(String id) {
        Optional<SetupBox> result = setupBoxRepo.findById(id);
        return result.orElse(null);
    }

    @Override
    public void deleteById(String id) {
        setupBoxRepo.deleteById(id);

    }
}

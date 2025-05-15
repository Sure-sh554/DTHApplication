package com.dms.service;

import com.dms.entity.SetupBox;

import java.util.List;

public interface ISetupBox {
    SetupBox save(SetupBox setupBox);
    List<SetupBox> getAll();
    SetupBox getById(String id);
    void deleteById(String id);
}

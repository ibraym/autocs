/*
 * Title:        Backend Server
 * Description:  Backend server of Auto Cloud Simulator (AutoCS)
 * License:      MIT
 *
 * Copyright (C) 2022 Ibrahem Mouhamad
 * Email: ibrahem.y.mouhamad@gmail.com
 */

package org.autocs.backend.service;

import org.autocs.backend.model.Broker;
import org.springframework.stereotype.Service;

/**
 * Broker service
 *
 * @author Ibrahem Mouhamad
 * @since Backend Server 1.0.0
 */

@Service
public class BrokerService extends EntityService<Broker> {
    public BrokerService() {
        super.setType(Broker.class);
    }
}

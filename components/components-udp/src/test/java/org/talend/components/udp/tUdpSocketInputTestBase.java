// ============================================================================
//
// Copyright (C) 2006-2016 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.components.udp;

import javax.inject.Inject;

import org.junit.Test;
import org.talend.components.api.service.ComponentService;
import org.talend.components.api.test.AbstractComponentTest;

public class tUdpSocketInputTestBase extends AbstractComponentTest {

    @Inject
    private ComponentService componentService;

    public ComponentService getComponentService(){
        return componentService;
    }
    
    @Test
    public void componentHasBeenRegistered(){
        assertComponentIsRegistered("tUdpSocketInput");
    }
}
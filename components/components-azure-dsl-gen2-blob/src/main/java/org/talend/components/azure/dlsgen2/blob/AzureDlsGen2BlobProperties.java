// ============================================================================
//
// Copyright (C) 2006-2017 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.components.azure.dlsgen2.blob;

import org.talend.components.azure.dlsgen2.blob.helpers.RemoteBlobsTable;
import org.talend.daikon.properties.property.Property;
import org.talend.daikon.properties.property.PropertyFactory;

public abstract class AzureDlsGen2BlobProperties extends AzureDlsGen2ContainerProperties {

    private static final long serialVersionUID = 8943576970325194236L;

    public RemoteBlobsTable remoteBlobs = new RemoteBlobsTable("remoteBlobs"); //$NON-NLS-1$

    public Property<Boolean> dieOnError = PropertyFactory.newBoolean("dieOnError");

    public AzureDlsGen2BlobProperties(String name) {
        super(name);
    }

}

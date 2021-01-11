package org.talend.components.dpag.salesforce.runtime.dataprep;

import org.talend.components.dpag.salesforce.datastore.SalesforceDatastoreProperties;

public class CommonTestUtils {

    public static void setValueForDatastoreProperties(SalesforceDatastoreProperties datastore) {
        datastore.userId.setValue(System.getProperty("salesforce.user"));
        datastore.password.setValue(System.getProperty("salesforce.password"));
        datastore.securityKey.setValue(System.getProperty("salesforce.key"));
    }
    
}

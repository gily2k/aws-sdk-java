/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * The database details of an Amazon RDS database.
 * </p>
 */
public class RDSDatabase implements Serializable, Cloneable {

    /**
     * The ID of an RDS DB instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     */
    private String instanceIdentifier;

    /**
     * The name of a database hosted on an RDS DB instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String databaseName;

    /**
     * The ID of an RDS DB instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     *
     * @return The ID of an RDS DB instance.
     */
    public String getInstanceIdentifier() {
        return instanceIdentifier;
    }
    
    /**
     * The ID of an RDS DB instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     *
     * @param instanceIdentifier The ID of an RDS DB instance.
     */
    public void setInstanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
    }
    
    /**
     * The ID of an RDS DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>[a-z0-9-]+<br/>
     *
     * @param instanceIdentifier The ID of an RDS DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDatabase withInstanceIdentifier(String instanceIdentifier) {
        this.instanceIdentifier = instanceIdentifier;
        return this;
    }

    /**
     * The name of a database hosted on an RDS DB instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of a database hosted on an RDS DB instance.
     */
    public String getDatabaseName() {
        return databaseName;
    }
    
    /**
     * The name of a database hosted on an RDS DB instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param databaseName The name of a database hosted on an RDS DB instance.
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    
    /**
     * The name of a database hosted on an RDS DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param databaseName The name of a database hosted on an RDS DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RDSDatabase withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceIdentifier() != null) sb.append("InstanceIdentifier: " + getInstanceIdentifier() + ",");
        if (getDatabaseName() != null) sb.append("DatabaseName: " + getDatabaseName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIdentifier() == null) ? 0 : getInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RDSDatabase == false) return false;
        RDSDatabase other = (RDSDatabase)obj;
        
        if (other.getInstanceIdentifier() == null ^ this.getInstanceIdentifier() == null) return false;
        if (other.getInstanceIdentifier() != null && other.getInstanceIdentifier().equals(this.getInstanceIdentifier()) == false) return false; 
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null) return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false) return false; 
        return true;
    }
    
    @Override
    public RDSDatabase clone() {
        try {
            return (RDSDatabase) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
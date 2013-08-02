/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs.model;
import java.io.Serializable;

/**
 * Delete Message Batch Result
 */
public class DeleteMessageBatchResult  implements Serializable  {

    private com.amazonaws.internal.ListWithAutoConstructFlag<DeleteMessageBatchResultEntry> successful;

    private com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failed;

    /**
     * Returns the value of the Successful property for this object.
     *
     * @return The value of the Successful property for this object.
     */
    public java.util.List<DeleteMessageBatchResultEntry> getSuccessful() {
        
        if (successful == null) {
              successful = new com.amazonaws.internal.ListWithAutoConstructFlag<DeleteMessageBatchResultEntry>();
              successful.setAutoConstruct(true);
        }
        return successful;
    }
    
    /**
     * Sets the value of the Successful property for this object.
     *
     * @param successful The new value for the Successful property for this object.
     */
    public void setSuccessful(java.util.Collection<DeleteMessageBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DeleteMessageBatchResultEntry> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeleteMessageBatchResultEntry>(successful.size());
        successfulCopy.addAll(successful);
        this.successful = successfulCopy;
    }
    
    /**
     * Sets the value of the Successful property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful The new value for the Successful property for this object.
     */
    public DeleteMessageBatchResult withSuccessful(DeleteMessageBatchResultEntry... successful) {
        if (getSuccessful() == null) setSuccessful(new java.util.ArrayList<DeleteMessageBatchResultEntry>(successful.length));
        for (DeleteMessageBatchResultEntry value : successful) {
            getSuccessful().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Successful property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful The new value for the Successful property for this object.
     */
    public DeleteMessageBatchResult withSuccessful(java.util.Collection<DeleteMessageBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DeleteMessageBatchResultEntry> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeleteMessageBatchResultEntry>(successful.size());
            successfulCopy.addAll(successful);
            this.successful = successfulCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the Failed property for this object.
     *
     * @return The value of the Failed property for this object.
     */
    public java.util.List<BatchResultErrorEntry> getFailed() {
        
        if (failed == null) {
              failed = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>();
              failed.setAutoConstruct(true);
        }
        return failed;
    }
    
    /**
     * Sets the value of the Failed property for this object.
     *
     * @param failed The new value for the Failed property for this object.
     */
    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>(failed.size());
        failedCopy.addAll(failed);
        this.failed = failedCopy;
    }
    
    /**
     * Sets the value of the Failed property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed The new value for the Failed property for this object.
     */
    public DeleteMessageBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (getFailed() == null) setFailed(new java.util.ArrayList<BatchResultErrorEntry>(failed.length));
        for (BatchResultErrorEntry value : failed) {
            getFailed().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Failed property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed The new value for the Failed property for this object.
     */
    public DeleteMessageBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>(failed.size());
            failedCopy.addAll(failed);
            this.failed = failedCopy;
        }

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
        if (getSuccessful() != null) sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null) sb.append("Failed: " + getFailed() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode()); 
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteMessageBatchResult == false) return false;
        DeleteMessageBatchResult other = (DeleteMessageBatchResult)obj;
        
        if (other.getSuccessful() == null ^ this.getSuccessful() == null) return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false) return false; 
        if (other.getFailed() == null ^ this.getFailed() == null) return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false) return false; 
        return true;
    }
    
}
    
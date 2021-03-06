/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.flink.batch.connectors.pulsar;

import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.util.Preconditions;

/**
 * Pulsar Output Format to write Flink DataSets into a Pulsar topic in user-defined format.
 */
public class PulsarOutputFormat<T> extends BasePulsarOutputFormat<T> {

    private static final long serialVersionUID = 2997027580167793000L;

    public PulsarOutputFormat(String serviceUrl, String topicName, final SerializationSchema<T> serializationSchema) {
        super(serviceUrl, topicName);
        Preconditions.checkNotNull(serializationSchema, "serializationSchema cannot be null.");
        this.serializationSchema = serializationSchema;
    }

}

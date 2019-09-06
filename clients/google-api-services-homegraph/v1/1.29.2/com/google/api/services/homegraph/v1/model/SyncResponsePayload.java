/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.homegraph.v1.model;

/**
 * Payload containing device information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SyncResponsePayload extends com.google.api.client.json.GenericJson {

  /**
   * Third-party user ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentUserId;

  /**
   * Devices associated with the third-party user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Device> devices;

  static {
    // hack to force ProGuard to consider Device used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Device.class);
  }

  /**
   * Third-party user ID
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentUserId() {
    return agentUserId;
  }

  /**
   * Third-party user ID
   * @param agentUserId agentUserId or {@code null} for none
   */
  public SyncResponsePayload setAgentUserId(java.lang.String agentUserId) {
    this.agentUserId = agentUserId;
    return this;
  }

  /**
   * Devices associated with the third-party user.
   * @return value or {@code null} for none
   */
  public java.util.List<Device> getDevices() {
    return devices;
  }

  /**
   * Devices associated with the third-party user.
   * @param devices devices or {@code null} for none
   */
  public SyncResponsePayload setDevices(java.util.List<Device> devices) {
    this.devices = devices;
    return this;
  }

  @Override
  public SyncResponsePayload set(String fieldName, Object value) {
    return (SyncResponsePayload) super.set(fieldName, value);
  }

  @Override
  public SyncResponsePayload clone() {
    return (SyncResponsePayload) super.clone();
  }

}

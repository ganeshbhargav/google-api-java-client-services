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
 * Request type for the [`ReportStateAndNotification`](#google.home.graph.v1.HomeGraphApiService.Rep
 * ortStateAndNotification) call. It may include States, Notifications, or both. This request uses
 * globally unique flattened state names instead of namespaces based on traits to align with the
 * existing QUERY and EXECUTE APIs implemented by 90+ Smart Home partners. States and notifications
 * are defined per `device_id` (for example, "123" and "456" in the following example). # Example
 * ```json {   "requestId": "ff36a3cc-ec34-11e6-b1a0-64510650abcf",   "agentUserId": "1234",
 * "payload": {     "devices": {       "states": {         "123": {           "on": true         },
 * "456": {           "on": true,           "brightness": 10         }       },     }   } } ```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportStateAndNotificationRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Third-party user ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentUserId;

  /**
   * Unique identifier per event (for example, a doorbell press).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventId;

  /**
   * Token to maintain state in the follow up notification response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String followUpToken;

  /**
   * State of devices to update and notification metadata for devices. For example, if a user turns
   * a light on manually, a state update should be sent so that the information is always the
   * current status of the device. Notifications are independent from the state and its piece of the
   * payload should contain everything necessary to notify the user. Although it may be related to a
   * state change, it does not need to be. For example, if a device can turn on/off and change
   * temperature, the states reported would include both "on" and "70 degrees" but the 3p may choose
   * not to send any notification for that, or to only say that the "the room is heating up",
   * keeping state and notification independent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StateAndNotificationPayload payload;

  /**
   * Request ID used for debugging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required. Third-party user ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentUserId() {
    return agentUserId;
  }

  /**
   * Required. Third-party user ID.
   * @param agentUserId agentUserId or {@code null} for none
   */
  public ReportStateAndNotificationRequest setAgentUserId(java.lang.String agentUserId) {
    this.agentUserId = agentUserId;
    return this;
  }

  /**
   * Unique identifier per event (for example, a doorbell press).
   * @return value or {@code null} for none
   */
  public java.lang.String getEventId() {
    return eventId;
  }

  /**
   * Unique identifier per event (for example, a doorbell press).
   * @param eventId eventId or {@code null} for none
   */
  public ReportStateAndNotificationRequest setEventId(java.lang.String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Token to maintain state in the follow up notification response.
   * @return value or {@code null} for none
   */
  public java.lang.String getFollowUpToken() {
    return followUpToken;
  }

  /**
   * Token to maintain state in the follow up notification response.
   * @param followUpToken followUpToken or {@code null} for none
   */
  public ReportStateAndNotificationRequest setFollowUpToken(java.lang.String followUpToken) {
    this.followUpToken = followUpToken;
    return this;
  }

  /**
   * State of devices to update and notification metadata for devices. For example, if a user turns
   * a light on manually, a state update should be sent so that the information is always the
   * current status of the device. Notifications are independent from the state and its piece of the
   * payload should contain everything necessary to notify the user. Although it may be related to a
   * state change, it does not need to be. For example, if a device can turn on/off and change
   * temperature, the states reported would include both "on" and "70 degrees" but the 3p may choose
   * not to send any notification for that, or to only say that the "the room is heating up",
   * keeping state and notification independent.
   * @return value or {@code null} for none
   */
  public StateAndNotificationPayload getPayload() {
    return payload;
  }

  /**
   * State of devices to update and notification metadata for devices. For example, if a user turns
   * a light on manually, a state update should be sent so that the information is always the
   * current status of the device. Notifications are independent from the state and its piece of the
   * payload should contain everything necessary to notify the user. Although it may be related to a
   * state change, it does not need to be. For example, if a device can turn on/off and change
   * temperature, the states reported would include both "on" and "70 degrees" but the 3p may choose
   * not to send any notification for that, or to only say that the "the room is heating up",
   * keeping state and notification independent.
   * @param payload payload or {@code null} for none
   */
  public ReportStateAndNotificationRequest setPayload(StateAndNotificationPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Request ID used for debugging.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Request ID used for debugging.
   * @param requestId requestId or {@code null} for none
   */
  public ReportStateAndNotificationRequest setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public ReportStateAndNotificationRequest set(String fieldName, Object value) {
    return (ReportStateAndNotificationRequest) super.set(fieldName, value);
  }

  @Override
  public ReportStateAndNotificationRequest clone() {
    return (ReportStateAndNotificationRequest) super.clone();
  }

}

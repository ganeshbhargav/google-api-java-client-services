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
 * Third-party partner's device definition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * Attributes for the traits supported by the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> attributes;

  /**
   * Custom JSON data provided by the manufacturer and attached to QUERY and EXECUTE requests in
   * AoG.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customData;

  /**
   * Device manufacturer, model, hardware version, and software version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceInfo deviceInfo;

  /**
   * Third-party partner's device ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Name of the device given by the third party. This includes names given to the device via third
   * party device manufacturer's app, model names for the device, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceNames name;

  /**
   * IDs of other devices associated with this device. This is used to represent a device group
   * (e.g. bonded zone) or "facets" synced through different flows (e.g. Google Nest Hub Max with a
   * Nest Camera).
   *
   * This may also be used to pass in alternate IDs used to identify a cloud synced device for local
   * execution (i.e. local verification). If used for local verification, this field is synced from
   * the cloud.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AgentOtherDeviceId> otherDeviceIds;

  static {
    // hack to force ProGuard to consider AgentOtherDeviceId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AgentOtherDeviceId.class);
  }

  /**
   * If the third-party partner's cloud configuration includes placing devices in rooms, the name of
   * the room can be provided here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roomHint;

  /**
   * As in roomHint, for structures that users set up in the partner's system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String structureHint;

  /**
   * Traits supported by the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> traits;

  /**
   * Hardware type of the device (e.g. light, outlet, etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Indicates whether the state of this device is being reported to Google through
   * ReportStateAndNotification call.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean willReportState;

  /**
   * Attributes for the traits supported by the device.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getAttributes() {
    return attributes;
  }

  /**
   * Attributes for the traits supported by the device.
   * @param attributes attributes or {@code null} for none
   */
  public Device setAttributes(java.util.Map<String, java.lang.Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Custom JSON data provided by the manufacturer and attached to QUERY and EXECUTE requests in
   * AoG.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomData() {
    return customData;
  }

  /**
   * Custom JSON data provided by the manufacturer and attached to QUERY and EXECUTE requests in
   * AoG.
   * @param customData customData or {@code null} for none
   */
  public Device setCustomData(java.lang.String customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Device manufacturer, model, hardware version, and software version.
   * @return value or {@code null} for none
   */
  public DeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  /**
   * Device manufacturer, model, hardware version, and software version.
   * @param deviceInfo deviceInfo or {@code null} for none
   */
  public Device setDeviceInfo(DeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Third-party partner's device ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Third-party partner's device ID.
   * @param id id or {@code null} for none
   */
  public Device setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Name of the device given by the third party. This includes names given to the device via third
   * party device manufacturer's app, model names for the device, etc.
   * @return value or {@code null} for none
   */
  public DeviceNames getName() {
    return name;
  }

  /**
   * Name of the device given by the third party. This includes names given to the device via third
   * party device manufacturer's app, model names for the device, etc.
   * @param name name or {@code null} for none
   */
  public Device setName(DeviceNames name) {
    this.name = name;
    return this;
  }

  /**
   * IDs of other devices associated with this device. This is used to represent a device group
   * (e.g. bonded zone) or "facets" synced through different flows (e.g. Google Nest Hub Max with a
   * Nest Camera).
   *
   * This may also be used to pass in alternate IDs used to identify a cloud synced device for local
   * execution (i.e. local verification). If used for local verification, this field is synced from
   * the cloud.
   * @return value or {@code null} for none
   */
  public java.util.List<AgentOtherDeviceId> getOtherDeviceIds() {
    return otherDeviceIds;
  }

  /**
   * IDs of other devices associated with this device. This is used to represent a device group
   * (e.g. bonded zone) or "facets" synced through different flows (e.g. Google Nest Hub Max with a
   * Nest Camera).
   *
   * This may also be used to pass in alternate IDs used to identify a cloud synced device for local
   * execution (i.e. local verification). If used for local verification, this field is synced from
   * the cloud.
   * @param otherDeviceIds otherDeviceIds or {@code null} for none
   */
  public Device setOtherDeviceIds(java.util.List<AgentOtherDeviceId> otherDeviceIds) {
    this.otherDeviceIds = otherDeviceIds;
    return this;
  }

  /**
   * If the third-party partner's cloud configuration includes placing devices in rooms, the name of
   * the room can be provided here.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoomHint() {
    return roomHint;
  }

  /**
   * If the third-party partner's cloud configuration includes placing devices in rooms, the name of
   * the room can be provided here.
   * @param roomHint roomHint or {@code null} for none
   */
  public Device setRoomHint(java.lang.String roomHint) {
    this.roomHint = roomHint;
    return this;
  }

  /**
   * As in roomHint, for structures that users set up in the partner's system.
   * @return value or {@code null} for none
   */
  public java.lang.String getStructureHint() {
    return structureHint;
  }

  /**
   * As in roomHint, for structures that users set up in the partner's system.
   * @param structureHint structureHint or {@code null} for none
   */
  public Device setStructureHint(java.lang.String structureHint) {
    this.structureHint = structureHint;
    return this;
  }

  /**
   * Traits supported by the device.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTraits() {
    return traits;
  }

  /**
   * Traits supported by the device.
   * @param traits traits or {@code null} for none
   */
  public Device setTraits(java.util.List<java.lang.String> traits) {
    this.traits = traits;
    return this;
  }

  /**
   * Hardware type of the device (e.g. light, outlet, etc).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Hardware type of the device (e.g. light, outlet, etc).
   * @param type type or {@code null} for none
   */
  public Device setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates whether the state of this device is being reported to Google through
   * ReportStateAndNotification call.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWillReportState() {
    return willReportState;
  }

  /**
   * Indicates whether the state of this device is being reported to Google through
   * ReportStateAndNotification call.
   * @param willReportState willReportState or {@code null} for none
   */
  public Device setWillReportState(java.lang.Boolean willReportState) {
    this.willReportState = willReportState;
    return this;
  }

  @Override
  public Device set(String fieldName, Object value) {
    return (Device) super.set(fieldName, value);
  }

  @Override
  public Device clone() {
    return (Device) super.clone();
  }

}

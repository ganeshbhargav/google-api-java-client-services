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

package com.google.api.services.cloudtrace.v2;

/**
 * Service definition for CloudTrace (v2).
 *
 * <p>
 * Sends application trace data to Cloud Trace for viewing. Trace data is collected for all App Engine applications by default. Trace data from other applications can be provided using this API. This library is used to interact with the Cloud Trace API directly. If you are looking to instrument your application for Cloud Trace, we recommend using OpenCensus.

 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/trace" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudTraceRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudTrace extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.10 of the Cloud Trace API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudtrace.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudTrace(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudTrace(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Projects collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudTrace cloudtrace = new CloudTrace(...);}
   *   {@code CloudTrace.Projects.List request = cloudtrace.projects().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Projects projects() {
    return new Projects();
  }

  /**
   * The "projects" collection of methods.
   */
  public class Projects {

    /**
     * An accessor for creating requests from the Traces collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code CloudTrace cloudtrace = new CloudTrace(...);}
     *   {@code CloudTrace.Traces.List request = cloudtrace.traces().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Traces traces() {
      return new Traces();
    }

    /**
     * The "traces" collection of methods.
     */
    public class Traces {

      /**
       * Sends new spans to new or existing traces. You cannot update existing spans. In this case,
       * writing traces is not considered an active developer method since traces are machine generated.
       *
       * Create a request for the method "traces.batchWrite".
       *
       * This request holds the parameters needed by the cloudtrace server.  After setting any optional
       * parameters, call the {@link BatchWrite#execute()} method to invoke the remote operation.
       *
       * @param name Required. The name of the project where the spans belong. The format is
      `projects/[PROJECT_ID]`.
       * @param content the {@link com.google.api.services.cloudtrace.v2.model.BatchWriteSpansRequest}
       * @return the request
       */
      public BatchWrite batchWrite(java.lang.String name, com.google.api.services.cloudtrace.v2.model.BatchWriteSpansRequest content) throws java.io.IOException {
        BatchWrite result = new BatchWrite(name, content);
        initialize(result);
        return result;
      }

      public class BatchWrite extends CloudTraceRequest<com.google.api.services.cloudtrace.v2.model.Empty> {

        private static final String REST_PATH = "v2/{+name}/traces:batchWrite";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+$");

        /**
         * Sends new spans to new or existing traces. You cannot update existing spans. In this case,
         * writing traces is not considered an active developer method since traces are machine generated.
         *
         * Create a request for the method "traces.batchWrite".
         *
         * This request holds the parameters needed by the the cloudtrace server.  After setting any
         * optional parameters, call the {@link BatchWrite#execute()} method to invoke the remote
         * operation. <p> {@link
         * BatchWrite#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name Required. The name of the project where the spans belong. The format is
      `projects/[PROJECT_ID]`.
         * @param content the {@link com.google.api.services.cloudtrace.v2.model.BatchWriteSpansRequest}
         * @since 1.13
         */
        protected BatchWrite(java.lang.String name, com.google.api.services.cloudtrace.v2.model.BatchWriteSpansRequest content) {
          super(CloudTrace.this, "POST", REST_PATH, content, com.google.api.services.cloudtrace.v2.model.Empty.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+$");
          }
        }

        @Override
        public BatchWrite set$Xgafv(java.lang.String $Xgafv) {
          return (BatchWrite) super.set$Xgafv($Xgafv);
        }

        @Override
        public BatchWrite setAccessToken(java.lang.String accessToken) {
          return (BatchWrite) super.setAccessToken(accessToken);
        }

        @Override
        public BatchWrite setAlt(java.lang.String alt) {
          return (BatchWrite) super.setAlt(alt);
        }

        @Override
        public BatchWrite setCallback(java.lang.String callback) {
          return (BatchWrite) super.setCallback(callback);
        }

        @Override
        public BatchWrite setFields(java.lang.String fields) {
          return (BatchWrite) super.setFields(fields);
        }

        @Override
        public BatchWrite setKey(java.lang.String key) {
          return (BatchWrite) super.setKey(key);
        }

        @Override
        public BatchWrite setOauthToken(java.lang.String oauthToken) {
          return (BatchWrite) super.setOauthToken(oauthToken);
        }

        @Override
        public BatchWrite setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (BatchWrite) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public BatchWrite setQuotaUser(java.lang.String quotaUser) {
          return (BatchWrite) super.setQuotaUser(quotaUser);
        }

        @Override
        public BatchWrite setUploadType(java.lang.String uploadType) {
          return (BatchWrite) super.setUploadType(uploadType);
        }

        @Override
        public BatchWrite setUploadProtocol(java.lang.String uploadProtocol) {
          return (BatchWrite) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Required. The name of the project where the spans belong. The format is
         * `projects/[PROJECT_ID]`.
         */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Required. The name of the project where the spans belong. The format is `projects/[PROJECT_ID]`.
         */
        public java.lang.String getName() {
          return name;
        }

        /**
         * Required. The name of the project where the spans belong. The format is
         * `projects/[PROJECT_ID]`.
         */
        public BatchWrite setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+$");
          }
          this.name = name;
          return this;
        }

        @Override
        public BatchWrite set(String parameterName, Object value) {
          return (BatchWrite) super.set(parameterName, value);
        }
      }

      /**
       * An accessor for creating requests from the Spans collection.
       *
       * <p>The typical use is:</p>
       * <pre>
       *   {@code CloudTrace cloudtrace = new CloudTrace(...);}
       *   {@code CloudTrace.Spans.List request = cloudtrace.spans().list(parameters ...)}
       * </pre>
       *
       * @return the resource collection
       */
      public Spans spans() {
        return new Spans();
      }

      /**
       * The "spans" collection of methods.
       */
      public class Spans {

        /**
         * Creates a new span. In this case, writing traces is not considered an active developer method
         * since traces are machine generated.
         *
         * Create a request for the method "spans.createSpan".
         *
         * This request holds the parameters needed by the cloudtrace server.  After setting any optional
         * parameters, call the {@link CreateSpan#execute()} method to invoke the remote operation.
         *
         * @param name The resource name of the span in the following format:
         *        projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace
         *        within a project;
        it is a 32-character hexadecimal encoding of a 16-byte array.
        [SPAN_ID]
         *        is a unique identifier for a span within a trace; it
        is a 16-character hexadecimal
         *        encoding of an 8-byte array.
         * @param content the {@link com.google.api.services.cloudtrace.v2.model.Span}
         * @return the request
         */
        public CreateSpan createSpan(java.lang.String name, com.google.api.services.cloudtrace.v2.model.Span content) throws java.io.IOException {
          CreateSpan result = new CreateSpan(name, content);
          initialize(result);
          return result;
        }

        public class CreateSpan extends CloudTraceRequest<com.google.api.services.cloudtrace.v2.model.Span> {

          private static final String REST_PATH = "v2/{+name}";

          private final java.util.regex.Pattern NAME_PATTERN =
              java.util.regex.Pattern.compile("^projects/[^/]+/traces/[^/]+/spans/[^/]+$");

          /**
           * Creates a new span. In this case, writing traces is not considered an active developer method
           * since traces are machine generated.
           *
           * Create a request for the method "spans.createSpan".
           *
           * This request holds the parameters needed by the the cloudtrace server.  After setting any
           * optional parameters, call the {@link CreateSpan#execute()} method to invoke the remote
           * operation. <p> {@link
           * CreateSpan#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
           * must be called to initialize this instance immediately after invoking the constructor. </p>
           *
           * @param name The resource name of the span in the following format:
         *        projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace
         *        within a project;
        it is a 32-character hexadecimal encoding of a 16-byte array.
        [SPAN_ID]
         *        is a unique identifier for a span within a trace; it
        is a 16-character hexadecimal
         *        encoding of an 8-byte array.
           * @param content the {@link com.google.api.services.cloudtrace.v2.model.Span}
           * @since 1.13
           */
          protected CreateSpan(java.lang.String name, com.google.api.services.cloudtrace.v2.model.Span content) {
            super(CloudTrace.this, "POST", REST_PATH, content, com.google.api.services.cloudtrace.v2.model.Span.class);
            this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
            if (!getSuppressPatternChecks()) {
              com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                  "Parameter name must conform to the pattern " +
                  "^projects/[^/]+/traces/[^/]+/spans/[^/]+$");
            }
          }

          @Override
          public CreateSpan set$Xgafv(java.lang.String $Xgafv) {
            return (CreateSpan) super.set$Xgafv($Xgafv);
          }

          @Override
          public CreateSpan setAccessToken(java.lang.String accessToken) {
            return (CreateSpan) super.setAccessToken(accessToken);
          }

          @Override
          public CreateSpan setAlt(java.lang.String alt) {
            return (CreateSpan) super.setAlt(alt);
          }

          @Override
          public CreateSpan setCallback(java.lang.String callback) {
            return (CreateSpan) super.setCallback(callback);
          }

          @Override
          public CreateSpan setFields(java.lang.String fields) {
            return (CreateSpan) super.setFields(fields);
          }

          @Override
          public CreateSpan setKey(java.lang.String key) {
            return (CreateSpan) super.setKey(key);
          }

          @Override
          public CreateSpan setOauthToken(java.lang.String oauthToken) {
            return (CreateSpan) super.setOauthToken(oauthToken);
          }

          @Override
          public CreateSpan setPrettyPrint(java.lang.Boolean prettyPrint) {
            return (CreateSpan) super.setPrettyPrint(prettyPrint);
          }

          @Override
          public CreateSpan setQuotaUser(java.lang.String quotaUser) {
            return (CreateSpan) super.setQuotaUser(quotaUser);
          }

          @Override
          public CreateSpan setUploadType(java.lang.String uploadType) {
            return (CreateSpan) super.setUploadType(uploadType);
          }

          @Override
          public CreateSpan setUploadProtocol(java.lang.String uploadProtocol) {
            return (CreateSpan) super.setUploadProtocol(uploadProtocol);
          }

          /**
           * The resource name of the span in the following format:
           *
           * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a
           * trace within a project; it is a 32-character hexadecimal encoding of a 16-byte array.
           *
           * [SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character
           * hexadecimal encoding of an 8-byte array.
           */
          @com.google.api.client.util.Key
          private java.lang.String name;

          /** The resource name of the span in the following format:

         projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a trace within a
         project; it is a 32-character hexadecimal encoding of a 16-byte array.

         [SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character hexadecimal
         encoding of an 8-byte array.
           */
          public java.lang.String getName() {
            return name;
          }

          /**
           * The resource name of the span in the following format:
           *
           * projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/SPAN_ID is a unique identifier for a
           * trace within a project; it is a 32-character hexadecimal encoding of a 16-byte array.
           *
           * [SPAN_ID] is a unique identifier for a span within a trace; it is a 16-character
           * hexadecimal encoding of an 8-byte array.
           */
          public CreateSpan setName(java.lang.String name) {
            if (!getSuppressPatternChecks()) {
              com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                  "Parameter name must conform to the pattern " +
                  "^projects/[^/]+/traces/[^/]+/spans/[^/]+$");
            }
            this.name = name;
            return this;
          }

          @Override
          public CreateSpan set(String parameterName, Object value) {
            return (CreateSpan) super.set(parameterName, value);
          }
        }

      }
    }
  }

  /**
   * Builder for {@link CloudTrace}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudTrace}. */
    @Override
    public CloudTrace build() {
      return new CloudTrace(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudTraceRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudTraceRequestInitializer(
        CloudTraceRequestInitializer cloudtraceRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudtraceRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

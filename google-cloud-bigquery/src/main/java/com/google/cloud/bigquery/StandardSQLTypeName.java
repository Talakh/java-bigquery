/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery;

/**
 * A type used in standard SQL contexts. For example, these types are used in queries with query
 * parameters, which requires usage of standard SQL.
 *
 * @see <a
 *     href="https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types">https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types</a>
 */
public enum StandardSQLTypeName {
  /** A Boolean value (true or false). */
  BOOL,
  /** A 64-bit signed integer value. */
  INT64,
  /** A 64-bit IEEE binary floating-point value. */
  FLOAT64,
  /** A decimal value with 38 digits of precision and 9 digits of scale. */
  NUMERIC,
  /**
   * A decimal value with 76+ digits of precision (the 77th digit is partial) and 38 digits of scale
   */
  BIGNUMERIC,
  /** Variable-length character (Unicode) data. */
  STRING,
  /** Variable-length binary data. */
  BYTES,
  /** Container of ordered fields each with a type (required) and field name (optional). */
  STRUCT,
  /** Ordered list of zero or more elements of any non-array type. */
  ARRAY,
  /**
   * Represents an absolute point in time, with microsecond precision. Values range between the
   * years 1 and 9999, inclusive.
   */
  TIMESTAMP,
  /** Represents a logical calendar date. Values range between the years 1 and 9999, inclusive. */
  DATE,
  /** Represents a time, independent of a specific date, to microsecond precision. */
  TIME,
  /** Represents a year, month, day, hour, minute, second, and subsecond (microsecond precision). */
  DATETIME,
  /** Represents a set of geographic points, represented as a Well Known Text (WKT) string. */
  GEOGRAPHY,
  /** Represents JSON data. */
  JSON,
  /** Represents duration or amount of time. */
  INTERVAL,
  /** Represents a contiguous range of values. */
  RANGE
}

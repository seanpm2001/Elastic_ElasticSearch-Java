/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;

// typedef: _types.aggregations.MinBucketAggregation
@JsonpDeserializable
public class MinBucketAggregation extends PipelineAggregationBase implements AggregationVariant {
	// ---------------------------------------------------------------------------------------------

	private MinBucketAggregation(Builder builder) {
		super(builder);

	}

	public static MinBucketAggregation of(Function<Builder, ObjectBuilder<MinBucketAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "min_bucket";
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MinBucketAggregation}.
	 */
	public static class Builder extends PipelineAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MinBucketAggregation> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MinBucketAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MinBucketAggregation build() {
			_checkSingleUse();

			return new MinBucketAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MinBucketAggregation}
	 */
	public static final JsonpDeserializer<MinBucketAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MinBucketAggregation::setupMinBucketAggregationDeserializer, Builder::build);

	protected static void setupMinBucketAggregationDeserializer(
			DelegatingDeserializer<MinBucketAggregation.Builder> op) {
		PipelineAggregationBase.setupPipelineAggregationBaseDeserializer(op);

	}

}

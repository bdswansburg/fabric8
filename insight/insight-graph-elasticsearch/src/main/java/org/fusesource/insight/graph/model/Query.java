/**
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.insight.graph.model;

import java.util.Set;

public class Query {

    private final String name;
    private final Set<Request> requests;
    private final String url;
    private final String template;
    private final int period;
    private final int minPeriod;

    public Query(String name, Set<Request> requests, String url, String template, int period, int minPeriod) {
        this.name = name;
        this.requests = requests;
        this.url = url;
        this.template = template;
        this.period = period;
        this.minPeriod = minPeriod;
    }

    public String getName() {
        return name;
    }

    public Set<Request> getRequests() {
        return requests;
    }

    public String getUrl() {
        return url;
    }

    public String getTemplate() {
        return template;
    }

    public int getPeriod() {
        return period;
    }

    public int getMinPeriod() {
        return minPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Query query = (Query) o;

        if (period != query.period) return false;
        if (requests != null ? !requests.equals(query.requests) : query.requests != null) return false;
        if (name != null ? !name.equals(query.name) : query.name != null) return false;
        if (template != null ? !template.equals(query.template) : query.template != null) return false;
        if (url != null ? !url.equals(query.url) : query.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (requests != null ? requests.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        result = 31 * result + period;
        return result;
    }
}
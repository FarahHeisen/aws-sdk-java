/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeLoadBalancersRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoadBalancersRequestMarshaller implements Marshaller<Request<DescribeLoadBalancersRequest>, DescribeLoadBalancersRequest> {

    public Request<DescribeLoadBalancersRequest> marshall(DescribeLoadBalancersRequest describeLoadBalancersRequest) {

        if (describeLoadBalancersRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeLoadBalancersRequest> request = new DefaultRequest<DescribeLoadBalancersRequest>(describeLoadBalancersRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "DescribeLoadBalancers");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!describeLoadBalancersRequest.getLoadBalancerNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) describeLoadBalancersRequest.getLoadBalancerNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> loadBalancerNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeLoadBalancersRequest
                    .getLoadBalancerNames();
            int loadBalancerNamesListIndex = 1;

            for (String loadBalancerNamesListValue : loadBalancerNamesList) {
                if (loadBalancerNamesListValue != null) {
                    request.addParameter("LoadBalancerNames.member." + loadBalancerNamesListIndex, StringUtils.fromString(loadBalancerNamesListValue));
                }
                loadBalancerNamesListIndex++;
            }
        }

        if (describeLoadBalancersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeLoadBalancersRequest.getMarker()));
        }

        if (describeLoadBalancersRequest.getPageSize() != null) {
            request.addParameter("PageSize", StringUtils.fromInteger(describeLoadBalancersRequest.getPageSize()));
        }

        return request;
    }

}

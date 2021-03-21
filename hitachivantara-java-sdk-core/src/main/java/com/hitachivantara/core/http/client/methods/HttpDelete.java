/*                                                                             
 * Copyright (C) 2019 Rison Han                                     
 *                                                                             
 * Licensed under the Apache License, Version 2.0 (the "License");           
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 *                                                                             
 *      http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,         
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License.                                              
 */                                                                            
package com.hitachivantara.core.http.client.methods;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import com.hitachivantara.core.http.Method;

public class HttpDelete extends HttpRequestBase {

	public HttpDelete(URL url) throws URISyntaxException {
		super(Method.DELETE, url);
	}

	public HttpDelete(URI uri) {
		super(Method.DELETE, uri);
	}

	public HttpDelete(String url) throws MalformedURLException {
		super(Method.DELETE, url);
	}

}

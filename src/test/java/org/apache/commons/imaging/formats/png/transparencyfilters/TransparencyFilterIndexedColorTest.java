/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.formats.png.transparencyfilters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TransparencyFilterIndexedColorTest{

    @Test
    public void testFilterWithNegativeAndNegative() {
        final byte[] byteArray = new byte[0];
        final TransparencyFilterIndexedColor transparencyFilterIndexedColor = new TransparencyFilterIndexedColor(byteArray);

        try {
            transparencyFilterIndexedColor.filter((-416), (-398));
            fail("Expecting exception: Exception");
        } catch(final Exception e) {
            assertEquals("TransparencyFilterIndexedColor index: -398, bytes.length: 0",e.getMessage());
            assertEquals(TransparencyFilterIndexedColor.class.getName(), e.getStackTrace()[0].getClassName());
        }
    }

}
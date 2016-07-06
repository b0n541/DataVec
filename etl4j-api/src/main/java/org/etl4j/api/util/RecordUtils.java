/*
 *
 *  *
 *  *  * Copyright 2015 Skymind,Inc.
 *  *  *
 *  *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *  *    you may not use this file except in compliance with the License.
 *  *  *    You may obtain a copy of the License at
 *  *  *
 *  *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *  *
 *  *  *    Unless required by applicable law or agreed to in writing, software
 *  *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  *    See the License for the specific language governing permissions and
 *  *  *    limitations under the License.
 *  *
 *
 */

package org.etl4j.api.util;

import org.etl4j.api.io.data.DoubleWritable;
import org.etl4j.api.io.data.FloatWritable;
import org.etl4j.api.writable.Writable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Create records from the specified input
 *
 * @author Adam Gibson
 */
public class RecordUtils {

    public static Collection<Writable> toRecord(double[] record) {
        List<Writable> ret = new ArrayList<>(record.length);
        for(int i = 0; i < record.length; i++)
           ret.add(new DoubleWritable(record[i]));

        return ret;
    }


    public static Collection<Writable> toRecord(float[] record) {
        List<Writable> ret = new ArrayList<>(record.length);
        for(int i = 0; i < record.length; i++)
            ret.add(new FloatWritable(record[i]));

        return ret;
    }

}
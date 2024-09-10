/*
 * Copyright 2024 Jo Rabin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.linguafranca.pwdb.kdbx.simple;

import org.linguafranca.pwdb.Database;
import org.linguafranca.pwdb.checks.PropertyValueChecks;

import java.io.IOException;

public class SimplePropertyValueTest extends PropertyValueChecks {

    public SimplePropertyValueTest() throws IOException {
        super(false);
    }


    @Override
    public Database createDatabase() throws IOException {
        return new SimpleDatabase();
    }
    
}

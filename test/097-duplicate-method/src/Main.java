/*
 * Copyright (C) 2012 The Android Open Source Project
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

/**
 * Certain class files generated by smali can have encoded methods with an
 * identical method_idx. In these cases, the behavior should be to only use the
 * first one, and to ignore all following duplicates.
 */
public class Main {
    public static void main(String args[]) {
        if (Test.run() != null) {
          System.out.println("Success!");
        }
    }
}

// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.skylarkbuildapi.cpp;

import com.google.devtools.build.lib.skylarkinterface.SkylarkModule;
import com.google.devtools.build.lib.skylarkinterface.SkylarkModuleCategory;

/** Skylark interface for CcLinkParamsStore. */
@SkylarkModule(
    name = "CcLinkParamsStore",
    documented = false,
    doc =
        "Store for all possible combinations of CcLinkParams that may be passed to the linker "
            + "depending on whether we have static linking mode and whether we are building a "
            + "dynamic library",
    category = SkylarkModuleCategory.BUILTIN)
public interface CcLinkParamsStoreApi {}
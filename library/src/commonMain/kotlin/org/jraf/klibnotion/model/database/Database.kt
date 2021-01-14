/*
 * This source is part of the
 *      _____  ___   ____
 *  __ / / _ \/ _ | / __/___  _______ _
 * / // / , _/ __ |/ _/_/ _ \/ __/ _ `/
 * \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *                              /___/
 * repository.
 *
 * Copyright (C) 2021-present Benoit 'BoD' Lubek (BoD@JRAF.org)
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

package org.jraf.klibnotion.model.database

import org.jraf.klibnotion.model.base.UuidString
import org.jraf.klibnotion.model.property.Property

/**
 * See [https://www.notion.so/Database-object-9c9a6ab536bd43c58e87b52c4594116f].
 */
interface Database {
    val id: UuidString

    /**
     * TODO: For now this is exposed a simple String but in future versions this will be a
     * list of rich text elements, reflecting the [Notion API](https://www.notion.so/Database-object-9c9a6ab536bd43c58e87b52c4594116f).
     */
    val title: String
    val properties: List<Property>
}
/* This file is part of sql-schema-spec.
 *
 * Foobar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later
 * version.

 * sql-schema-spec is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with sql-schema-spec.  If not, see <https://www.gnu.org/licenses/>.
 *
 * Copyright 2019 zouroboros@zoho.eu
 */

package me.murks.sqlschemaspec;

/**
 * Enum of the supported sql data types
 */
public enum Type {
    String("text"),
    Integer("integer"),
    Boolean("boolean"),
    Float("double");

    private final String type;

    Type(String nType) {
        type = nType;
    }

    public String toString() {
        return type;
    }
}

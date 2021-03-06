/*
 * This file is generated by jOOQ.
*/
package com.oneops.user.tables;


import com.oneops.user.Keys;
import com.oneops.user.Public;
import com.oneops.user.tables.records.OrganizationsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Organizations extends TableImpl<OrganizationsRecord> {

    private static final long serialVersionUID = -854476622;

    /**
     * The reference instance of <code>public.organizations</code>
     */
    public static final Organizations ORGANIZATIONS = new Organizations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationsRecord> getRecordType() {
        return OrganizationsRecord.class;
    }

    /**
     * The column <code>public.organizations.id</code>.
     */
    public final TableField<OrganizationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('organizations_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.organizations.name</code>.
     */
    public final TableField<OrganizationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>public.organizations.created_at</code>.
     */
    public final TableField<OrganizationsRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.organizations.updated_at</code>.
     */
    public final TableField<OrganizationsRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.organizations.cms_id</code>.
     */
    public final TableField<OrganizationsRecord, Integer> CMS_ID = createField("cms_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.organizations.assemblies</code>.
     */
    public final TableField<OrganizationsRecord, Boolean> ASSEMBLIES = createField("assemblies", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.organizations.catalogs</code>.
     */
    public final TableField<OrganizationsRecord, Boolean> CATALOGS = createField("catalogs", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.organizations.services</code>.
     */
    public final TableField<OrganizationsRecord, Boolean> SERVICES = createField("services", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.organizations.announcement</code>.
     */
    public final TableField<OrganizationsRecord, String> ANNOUNCEMENT = createField("announcement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.organizations.full_name</code>.
     */
    public final TableField<OrganizationsRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>public.organizations</code> table reference
     */
    public Organizations() {
        this("organizations", null);
    }

    /**
     * Create an aliased <code>public.organizations</code> table reference
     */
    public Organizations(String alias) {
        this(alias, ORGANIZATIONS);
    }

    private Organizations(String alias, Table<OrganizationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organizations(String alias, Table<OrganizationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrganizationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORGANIZATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrganizationsRecord> getPrimaryKey() {
        return Keys.ORGANIZATIONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrganizationsRecord>> getKeys() {
        return Arrays.<UniqueKey<OrganizationsRecord>>asList(Keys.ORGANIZATIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Organizations as(String alias) {
        return new Organizations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Organizations rename(String name) {
        return new Organizations(name, null);
    }
}

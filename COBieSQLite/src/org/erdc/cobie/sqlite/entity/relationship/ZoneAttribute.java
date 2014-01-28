package org.erdc.cobie.sqlite.entity.relationship;

import org.erdc.cobie.sqlite.CobieSQLiteException;
import org.erdc.cobie.sqlite.Column;
import org.erdc.cobie.sqlite.Row;

public final class ZoneAttribute extends Relationship
{
    public enum ColumnName
    {        
        RefAttribute("RefAttribute"),
        RefZone("RefZone");

        private String columName;

        private ColumnName(final String columnName)
        {
            columName = columnName;
        }

        @Override
        public final String toString()
        {
            return columName;
        }
    }
    
	public ZoneAttribute() throws CobieSQLiteException
	{
		super();
	}
	
    public ZoneAttribute(Row row) throws CobieSQLiteException
    {
    	super(row);
    }
    
	@Override
	public Long getChildKey() throws CobieSQLiteException 
	{
		return (Long)getColumn(ColumnName.RefAttribute.toString()).getValue();
	}

	@Override
	public Long getParentKey() throws CobieSQLiteException 
	{
		return (Long)getColumn(ColumnName.RefZone.toString()).getValue();
	}
	
	@Override
	public String getTableName() 
	{
		return "ZoneAttribute";
	}
	
	@Override
	protected Row makeRow() throws CobieSQLiteException
	{
    	return new Row(    			
			new Column<>(Integer.class, ColumnName.RefAttribute.toString(), null, true),
			new Column<>(Integer.class, ColumnName.RefZone.toString(), null, true));
	}
	
	@Override
	public void setChildKey(Long key) throws CobieSQLiteException 
	{
		getColumn(ColumnName.RefAttribute.toString()).update(key);
	}

	@Override
	public void setParentKey(Long key) throws CobieSQLiteException 
	{
		getColumn(ColumnName.RefZone.toString()).update(key);
	}
}
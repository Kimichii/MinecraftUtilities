package minecraftutilities.datasets;

import minecraftutilities.input.DataColumnConstructor;
import minecraftutilities.input.DataIndicator;
import minecraftutilities.input.DataSet;
import minecraftutilities.input.DataStorageType;
import minecraftutilities.output.ResponseDataRow;

import java.util.ArrayList;

public class MysqlDataSet extends DataSet {

    public MysqlDataSet(ArrayList<DataColumnConstructor> columns, String[] types) {
        super(DataStorageType.MYSQL, columns, types);
    }
    

    @Override
    public void save(Object[] data) {

    }

    @Override
    public boolean contains(String row, String value) {
        return false;
    }

    @Override
    public ArrayList<ResponseDataRow> get(DataIndicator dataIndicator) {
        return null;
    }

    @Override
    public void init() {

    }
}

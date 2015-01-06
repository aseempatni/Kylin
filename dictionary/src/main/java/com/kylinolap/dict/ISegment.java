package com.kylinolap.dict;

import com.kylinolap.metadata.model.TblColRef;

/**
 * Created by Hongbin Ma(Binmahone) on 12/17/14.
 */
public interface ISegment {

    public abstract int getColumnLength(TblColRef col);

    public abstract Dictionary<?> getDictionary(TblColRef col);
}
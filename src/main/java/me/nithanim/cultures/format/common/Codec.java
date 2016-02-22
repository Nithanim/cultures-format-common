package me.nithanim.cultures.format.common;

import io.netty.buffer.ByteBuf;
import java.io.IOException;

public interface Codec<T> {
    T unpack(ByteBuf buf) throws IOException;
    //void pack(T element, ByteBuf buf);
}

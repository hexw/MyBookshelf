package com.monke.monkeybook.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.monke.monkeybook.bean.BookmarkBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOKMARK_BEAN".
*/
public class BookmarkBeanDao extends AbstractDao<BookmarkBean, String> {

    public static final String TABLENAME = "BOOKMARK_BEAN";

    /**
     * Properties of entity BookmarkBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property NoteUrl = new Property(0, String.class, "noteUrl", true, "NOTE_URL");
        public final static Property ChapterName = new Property(1, String.class, "chapterName", false, "CHAPTER_NAME");
        public final static Property ChapterIndex = new Property(2, Integer.class, "chapterIndex", false, "CHAPTER_INDEX");
        public final static Property Content = new Property(3, String.class, "content", false, "CONTENT");
    }


    public BookmarkBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookmarkBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOKMARK_BEAN\" (" + //
                "\"NOTE_URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: noteUrl
                "\"CHAPTER_NAME\" TEXT," + // 1: chapterName
                "\"CHAPTER_INDEX\" INTEGER," + // 2: chapterIndex
                "\"CONTENT\" TEXT);"); // 3: content
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOKMARK_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookmarkBean entity) {
        stmt.clearBindings();
 
        String noteUrl = entity.getNoteUrl();
        if (noteUrl != null) {
            stmt.bindString(1, noteUrl);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(2, chapterName);
        }
 
        Integer chapterIndex = entity.getChapterIndex();
        if (chapterIndex != null) {
            stmt.bindLong(3, chapterIndex);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookmarkBean entity) {
        stmt.clearBindings();
 
        String noteUrl = entity.getNoteUrl();
        if (noteUrl != null) {
            stmt.bindString(1, noteUrl);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(2, chapterName);
        }
 
        Integer chapterIndex = entity.getChapterIndex();
        if (chapterIndex != null) {
            stmt.bindLong(3, chapterIndex);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookmarkBean readEntity(Cursor cursor, int offset) {
        BookmarkBean entity = new BookmarkBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // noteUrl
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // chapterName
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // chapterIndex
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // content
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookmarkBean entity, int offset) {
        entity.setNoteUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setChapterName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setChapterIndex(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setContent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookmarkBean entity, long rowId) {
        return entity.getNoteUrl();
    }
    
    @Override
    public String getKey(BookmarkBean entity) {
        if(entity != null) {
            return entity.getNoteUrl();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookmarkBean entity) {
        return entity.getNoteUrl() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

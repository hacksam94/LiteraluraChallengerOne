package com.aluracursos.LiteraluraChallenger.model;

import java.util.ArrayList;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Entity;

@Entity

public class Book {
    long id;
    String title;
    ArrayList<Author> authors;
    ArrayList<Translator> translators;
    ArrayList<String> subjects;
    ArrayList<String> bookshelves;
    ArrayList<String> languages;
    boolean copyright;
    @JsonAlias({"media_type"})
    String mediaType;
    Map<String, String> formats;
    @JsonAlias({"download_count"})
    int downloadCount;

    public Book() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return this.authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public ArrayList<Translator> getTranslators() {
        return this.translators;
    }

    public void setTranslators(ArrayList<Translator> translators) {
        this.translators = translators;
    }

    public ArrayList<String> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<String> getBookshelves() {
        return this.bookshelves;
    }

    public void setBookshelves(ArrayList<String> bookshelves) {
        this.bookshelves = bookshelves;
    }

    public ArrayList<String> getLanguages() {
        return this.languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public boolean isCopyright() {
        return this.copyright;
    }

    public void setCopyright(boolean copyright) {
        this.copyright = copyright;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Map<String, String> getFormats() {
        return this.formats;
    }

    public void setFormats(Map<String, String> formats) {
        this.formats = formats;
    }

    public int getDownloadCount() {
        return this.downloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        this.downloadCount = downloadCount;
    }
}


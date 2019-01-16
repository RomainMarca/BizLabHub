package fr.wildcodeschool.hackbus.models;

import java.util.ArrayList;

import fr.wildcodeschool.hackbus.TagsModel;

public class CompetenceModel {

    private TagsModel tag;
    private int niveau;
    private TypeModel typeCompetence;

    public CompetenceModel() {
    }

    public TagsModel getTag() {
        return tag;
    }

    public void setNom(TagsModel tag) {
        this.tag = tag;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public TypeModel getTypeCompetence() {
        return typeCompetence;
    }

    public void setTypeCompetence(TypeModel typeCompetence) {
        this.typeCompetence = typeCompetence;
    }
}

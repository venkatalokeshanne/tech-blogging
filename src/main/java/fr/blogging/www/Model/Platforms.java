package fr.blogging.www.Model;

public class Platforms {
    private Platform platform;
    private String released_at;
    private Requirements_en requirements_en;
    private Requirements_ru requirements_ru;



    public Platform getPlatform() {
        return this.platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getReleased_at() {
        return this.released_at;
    }

    public void setReleased_at(String released_at) {
        this.released_at = released_at;
    }

    public Requirements_en getRequirements_en() {
        return this.requirements_en;
    }

    public void setRequirements_en(Requirements_en requirements_en) {
        this.requirements_en = requirements_en;
    }

    public Requirements_ru getRequirements_ru() {
        return this.requirements_ru;
    }

    public void setRequirement_ru(Requirements_ru requirements_ru) {
        this.requirements_ru = requirements_ru;
    }

}
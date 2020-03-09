/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dssmoles;

/**
 *
 * @author ainhoarey
 */
public class Patient {

    public Patient(String name, Integer age, String gender, String symmetry, String sharp_borders, String diameter, String polychrome, String soft_texture, String bleeding, String itchiness, String pain, String bulky, Integer number_moles, String skin_tone, String family_history, Integer final_score, String new_patient, String message) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.symmetry = symmetry;
        this.sharp_borders = sharp_borders;
        this.diameter = diameter;
        this.polychrome = polychrome;
        this.soft_texture = soft_texture;
        this.bleeding = bleeding;
        this.itchiness = itchiness;
        this.pain = pain;
        this.bulky = bulky;
        this.number_moles = number_moles;
        this.skin_tone = skin_tone;
        this.family_history = family_history;
        this.final_score = final_score;
        this.new_patient = new_patient;
        this.message = message;
    }

    public Patient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSymmetry() {
        return symmetry;
    }

    public void setSymmetry(String symmetry) {
        this.symmetry = symmetry;
    }

    public String getSharp_borders() {
        return sharp_borders;
    }

    public void setSharp_borders(String sharp_borders) {
        this.sharp_borders = sharp_borders;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getPolychrome() {
        return polychrome;
    }

    public void setPolychrome(String polychrome) {
        this.polychrome = polychrome;
    }

    public String getSoft_texture() {
        return soft_texture;
    }

    public void setSoft_texture(String soft_texture) {
        this.soft_texture = soft_texture;
    }

    public String getBleeding() {
        return bleeding;
    }

    public void setBleeding(String bleeding) {
        this.bleeding = bleeding;
    }

    public String getItchiness() {
        return itchiness;
    }

    public void setItchiness(String itchiness) {
        this.itchiness = itchiness;
    }

    public String getPain() {
        return pain;
    }

    public void setPain(String pain) {
        this.pain = pain;
    }

    public String getBulky() {
        return bulky;
    }

    public void setBulky(String bulky) {
        this.bulky = bulky;
    }

    public Integer getNumber_moles() {
        return number_moles;
    }

    public void setNumber_moles(Integer number_moles) {
        this.number_moles = number_moles;
    }

    public String getSkin_tone() {
        return skin_tone;
    }

    public void setSkin_tone(String skin_tone) {
        this.skin_tone = skin_tone;
    }

    public String getFamily_history() {
        return family_history;
    }

    public void setFamily_history(String family_history) {
        this.family_history = family_history;
    }

    public Integer getFinal_score() {
        return final_score;
    }

    public void setFinal_score(Integer final_score) {
        this.final_score = final_score;
    }

    public String getNew_patient() {
        return new_patient;
    }

    public void setNew_patient(String new_patient) {
        this.new_patient = new_patient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    String name;
    Integer age;
    String gender;
    String symmetry;
    String sharp_borders;
    String diameter;
    String polychrome;
    String soft_texture;
    String bleeding;
    String itchiness;
    String pain;
    String bulky;
    Integer number_moles;
    String skin_tone;
    String family_history;
    Integer final_score;
    enum diagnosis {LOW, MEDIUM, HIGH};
    String new_patient;
    String message;
}

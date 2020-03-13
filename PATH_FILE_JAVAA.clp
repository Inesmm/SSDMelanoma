(deftemplate patient "A patient"
(slot username)
(slot symmetry)
(slot symmetry_check (default FALSE))
(slot sharp_borders)
(slot sharp_borders_check (default FALSE))
(slot diameter)
(slot diameter_check (default FALSE))
(slot polychrome)
(slot polychrome_check (default FALSE))
(slot soft_texture)
(slot soft_texture_check (default FALSE))
(slot bleeding)
(slot bleeding_check (default FALSE))
(slot itching)
(slot itching_check (default FALSE))
(slot pain)
(slot pain_check (default FALSE))
(slot bulky)
(slot bulky_check (default FALSE))
(slot age)
(slot age_check (default FALSE))
(slot n_moles)
(slot n_moles_check (default FALSE))
(multislot skin_tone)
(slot skin_tone_check (default FALSE))
(slot gender)
(slot gender_check (default FALSE))
(slot family_history)
(slot family_history_check (default FALSE))
(slot answer)
(slot answer_check (default FALSE))
(slot decision_check (default FALSE))
(slot score (default 0))
(slot message)
(slot diagnosis))

(defrule symmetry_yes
(declare (salience 15))
?index <-(patient (symmetry yes) (score ?score) (symmetry_check FALSE))
=>
(modify ?index(score (+ ?score 0))(symmetry_check TRUE)))

(defrule symmetry_no
(declare (salience 15))
?index <-(patient (symmetry no) (score ?score) (symmetry_check FALSE))
=>
(modify ?index(score (+ ?score 2)) (symmetry_check TRUE)))


(defrule sharpborder_yes
(declare (salience 15))
?index <-(patient (sharp_borders yes) (score ?score) (sharp_borders_check FALSE))
=>
(modify ?index(score (+ ?score 0))(sharp_borders_check TRUE)))

(defrule sharp_borders_no
(declare (salience 15))
?index <-(patient (sharp_borders no) (score ?score) (sharp_borders_check FALSE))
=>
(modify ?index(score (+ ?score 2)) (sharp_borders_check TRUE)))



(defrule diameter_yes
(declare (salience 15))
?index <-(patient (diameter yes) (score ?score) (diameter_check FALSE))
=>
(modify ?index(score (+ ?score 1))(diameter_check TRUE)))

(defrule diameter_no
(declare (salience 15))
?index <-(patient (diameter no) (score ?score) (diameter_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (diameter_check TRUE)))



(defrule polychrome_yes
(declare (salience 15))
?index <-(patient (polychrome yes) (score ?score) (polychrome_check FALSE))
=>
(modify ?index(score (+ ?score 2))(polychrome_check TRUE)))

(defrule polychrome_no
(declare (salience 15))
?index <-(patient (polychrome no) (score ?score) (polychrome_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (polychrome_check TRUE)))

(defrule soft_texture_yes
(declare (salience 15))
?index <-(patient (soft_texture yes) (score ?score) (soft_texture_check FALSE))
=>
(modify ?index(score (+ ?score 0))(soft_texture_check TRUE)))


(defrule soft_texture_no
(declare (salience 15))
?index <-(patient (soft_texture no) (score ?score) (soft_texture_check FALSE))
=>
(modify ?index(score (+ ?score 1)) (soft_texture_check TRUE)))


(defrule bleeding_yes
(declare (salience 15))
?index <-(patient (bleeding yes) (score ?score) (bleeding_check FALSE))
=>
(modify ?index(score (+ ?score 2))(bleeding_check TRUE)))


(defrule bleeding_no
(declare (salience 15))
?index <-(patient (bleeding no) (score ?score) (bleeding_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (bleeding_check TRUE)))



(defrule itching_yes
(declare (salience 15))
?index <-(patient (itching yes) (score ?score) (itching_check FALSE))
=>
(modify ?index(score (+ ?score 1))(itching_check TRUE)))


(defrule itching_no
(declare (salience 15))
?index <-(patient (itching no) (score ?score) (itching_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (itching_check TRUE)))



((defrule n_moles_less
(declare (salience 15))
?index <-(patient (n_moles less) (score ?score) (n_moles_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (n_moles_check TRUE)))

((defrule n_moles_more
(declare (salience 15))
?index <-(patient (n_moles more) (score ?score) (n_moles_check FALSE))
=>
(modify ?index(score (+ ?score 1)) (n_moles_check TRUE)))

((defrule skin_tone_fair
(declare (salience 15))
?index <-(patient (skin_tone fair) (score ?score) (skin_tone_check FALSE))
=>
(modify ?index(score (+ ?score 2)) (skin_tone_check TRUE))) 

((defrule skin_tone_light
(declare (salience 15))
?index <-(patient (skin_tone light) (score ?score) (skin_tone_check FALSE))
=>
(modify ?index(score (+ ?score 1)) (skin_tone_check TRUE))) 

((defrule skin_tone_dark
(declare (salience 15))
?index <-(patient (skin_tone dark) (score ?score) (skin_tone_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (skin_tone_check TRUE))) 

((defrule gender_male
(declare (salience 15))
?index <-(patient (gender male) (score ?score) (gender_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (gender_check TRUE))) 

((defrule gender_female
(declare (salience 15))
?index <-(patient (gender female) (score ?score) (gender_check FALSE))
=>
(modify ?index(score (+ ?score 1)) (gender_check TRUE))) 

((defrule family_history_yes
(declare (salience 15))
?index <-(patient (family_history yes) (score ?score) (family_history_check FALSE))
=>
(modify ?index(score (+ ?score 1)) (family_history_check TRUE))) 

((defrule family_history_no
(declare (salience 15))
?index <-(patient (family_history no) (score ?score) (family_history_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (family_history_check TRUE))) 


(defrule pain_yes
(declare (salience 15))
?index <-(patient (pain yes) (score ?score) (pain_check FALSE))
=>
(modify ?index(score (+ ?score 2))(pain_check TRUE)))


(defrule pain_no
(declare (salience 15))
?index <-(patient (pain no) (score ?score) (pain_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (pain_check TRUE)))

(defrule bulky_yes
(declare (salience 15))
?index <-(patient (bulky yes) (score ?score) (bulky_check FALSE))
=>
(modify ?index(score (+ ?score 1))(bulky_check TRUE)))


(defrule bulky_no
(declare (salience 15))
?index <-(patient (bulky no) (score ?score) (bulky_check FALSE))
=>
(modify ?index(score (+ ?score 0)) (bulky_check TRUE)))

(defrule age0-20
(declare (salience 15))
?index <-(patient (age ?age)(score ?score) (age_check FALSE))
(test (numberp ?age))
(test(and (> ?age 0)(< ?age 21)))
=>
(modify ?index(score (+ ?score 0)) (age_check TRUE)))

(defrule age21-40
(declare (salience 15))
?index <-(patient (age ?age)(score ?score) (age_check FALSE))
(test (numberp ?age))
(test(and (> ?age 20)(< ?age 41)))
=>
(modify ?index(score (+ ?score 1)) (age_check TRUE)))

(defrule age41-60
(declare (salience 15))
?index <-(patient (age ?age)(score ?score) (age_check FALSE))
(test (numberp ?age))
(test(and (> ?age 40)(< ?age 61)))
=>
(modify ?index(score (+ ?score 2)) (age_check TRUE)))

(defrule age60
(declare (salience 15))
?index <-(patient (age ?age)(score ?score) (age_check FALSE))
(test (numberp ?age))
(test(> ?age 60))
=>
(modify ?index(score (+ ?score 1)) (age_check TRUE)))


(defrule decision_low
(declare (salience 10))
?index <- (patient(username ?username)(score ?score)(decision_check FALSE)(diagnosis nil))
(test(< ?score 8)) 
=>
(modify ?index(decision_check TRUE)(diagnosis low)(message "Low risk. Pay attention to any change in the characteristics explained after and if there are any doubts ask to dermatologist. ")))

(defrule decision_medium
(declare (salience 10))
?index <- (patient(username ?username)(score ?score)(decision_check FALSE)(diagnosis nil))
(test (and(< ?score 14)(> ?score 7))) 
=>
(modify ?index(decision_check TRUE)(diagnosis medium)(message "Medium risk. Should go to the dermatologist to review it and continue paying attention to any change in size, shape or color.")))

(defrule decision_high
(declare (salience 10))
?index <- (patient(username ?username)(score ?score)(decision_check FALSE)(diagnosis nil))
(test (> ?score 13)) 
=>
(modify ?index(decision_check TRUE)(diagnosis high)(message "High risk. It is urgent to go to the dermatologist and review the mole.")))






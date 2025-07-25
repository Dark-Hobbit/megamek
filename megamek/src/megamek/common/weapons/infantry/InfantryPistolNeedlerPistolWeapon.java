/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Ben Grills
 */
public class InfantryPistolNeedlerPistolWeapon extends InfantryWeapon {

	/**
	 *
	 */
	private static final long serialVersionUID = -3164871600230559641L;

	public InfantryPistolNeedlerPistolWeapon() {
		super();

		name = "Needler Pistol";
		setInternalName(name);
		addLookupName("InfantryNeedlerpistol");
		ammoType = AmmoType.AmmoTypeEnum.INFANTRY;
		cost = 50;
		bv = 0.21;
		tonnage = .0003;
		flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_INF_NONPENETRATING).or(F_BALLISTIC);
		infantryDamage = 0.23;
		infantryRange = 0;
		ammoWeight = 0.00007;
		ammoCost = 1;
		shots = 10;
		rulesRefs = " 273, TM";
		techAdvancement.setTechBase(TechBase.ALL).setISAdvancement(1950, 1950, 1950, DATE_NONE, DATE_NONE)
				.setISApproximate(false, false, false, false, false)
				.setClanAdvancement(1950, 1950, 1950, DATE_NONE, DATE_NONE)
				.setClanApproximate(false, false, false, false, false).setTechRating(TechRating.D)
				.setAvailability(AvailabilityValue.A, AvailabilityValue.A, AvailabilityValue.A, AvailabilityValue.A);

	}
}

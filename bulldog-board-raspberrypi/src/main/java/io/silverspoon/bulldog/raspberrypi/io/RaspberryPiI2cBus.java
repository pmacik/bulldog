/*******************************************************************************
 * Copyright (c) 2016 Silverspoon.io (silverspoon@silverware.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.silverspoon.bulldog.raspberrypi.io;

import io.silverspoon.bulldog.core.io.bus.i2c.I2cSignalType;
import io.silverspoon.bulldog.core.pin.Pin;
import io.silverspoon.bulldog.linux.io.LinuxI2cBus;

public class RaspberryPiI2cBus extends LinuxI2cBus {

   private Pin sdaPin;
   private Pin sclPin;

   public RaspberryPiI2cBus(String name, Pin sdaPin, Pin sclPin) {
      super(name);
      this.sdaPin = sdaPin;
      this.sclPin = sclPin;
      sdaPin.addFeature(new RaspberryPiI2cPinFeature(this, sdaPin, I2cSignalType.SDA));
      sclPin.addFeature(new RaspberryPiI2cPinFeature(this, sclPin, I2cSignalType.SCL));
   }

   @Override
   public Pin getSCL() {
      return sclPin;
   }

   public Pin getSDA() {
      return sdaPin;
   }
}

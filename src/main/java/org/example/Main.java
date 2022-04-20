package org.example;

public class Main
{
  public static void main(String[] args) {
    Optional<Bulb> optionalBulb = BulbDiscoveryService.discoverBulbByName("Kitchen Tiles");
    optionalBulb.ifPresent(b -> {
      new BlinkCommand().blinkBulbs(3, b);
      b.disconnect();
    });
  }
}

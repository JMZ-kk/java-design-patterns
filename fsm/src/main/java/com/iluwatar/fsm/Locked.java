package com.iluwatar.fsm;

/**
 * Locked state.
 */
public class Locked extends Astate {

  public Locked(CoinMachine entity) {
    super(entity, "Locked");
  }

  @Override
  public void pass() {

  }

  @Override
  public void coin() {
    setEntityState(new Unlocked(entity));
  }

  @Override
  public void failed() {
    setEntityState(new Broken(entity));
  }

  @Override
  public void fixed() {

  }
}

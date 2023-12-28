package dev.temez.springlify.commander.commons.sender;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

/**
 * Interface representing a sender of commands or messages within a Commander plugin.
 *
 * @param <T> The type of the platform-specific sender.
 * @since 0.5.8.9dev
 */
public interface Sender<T> {

  /**
   * Gets the platform-specific sender.
   *
   * @return The platform-specific sender.
   */
  @NotNull T getPlatformSender();

  /**
   * Checks if the sender is a console sender.
   *
   * @return {@code true} if the sender is a console sender, {@code false} otherwise.
   */
  boolean isConsoleSender();

  /**
   * Checks if the sender has the specified permission.
   *
   * @param permission The permission to check.
   * @return {@code true} if the sender has the permission, {@code false} otherwise.
   */
  boolean hasPermission(@NotNull String permission);

  /**
   * Sends a message to the sender.
   *
   * @param component The component representing the message.
   */
  void sendMessage(@NotNull Component component);
}

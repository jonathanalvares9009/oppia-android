package org.oppia.android.util.parser

/** Fetcher for image assets from the app's local asset repository. */
interface ImageAssetFetcher {
  /** Fetches an image asset. Must be called on a background thread. */
  fun fetchImage(): ByteArray

  /** Returns the identifier corresponding to this image. */
  fun getImageIdentifier(): String
}

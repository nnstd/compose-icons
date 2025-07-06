package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Spotify: ImageVector
    get() {
        if (_Spotify != null) {
            return _Spotify!!
        }
        _Spotify = ImageVector.Builder(
            name = "Spotify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.9f, 10.9f)
                curveTo(14.7f, 9f, 9.35f, 8.8f, 6.3f, 9.75f)
                curveTo(5.8f, 9.9f, 5.3f, 9.6f, 5.15f, 9.15f)
                curveTo(5f, 8.65f, 5.3f, 8.15f, 5.75f, 8f)
                curveTo(9.3f, 6.95f, 15.15f, 7.15f, 18.85f, 9.35f)
                curveTo(19.3f, 9.6f, 19.45f, 10.2f, 19.2f, 10.65f)
                curveTo(18.95f, 11f, 18.35f, 11.15f, 17.9f, 10.9f)
                moveTo(17.8f, 13.7f)
                curveTo(17.55f, 14.05f, 17.1f, 14.2f, 16.75f, 13.95f)
                curveTo(14.05f, 12.3f, 9.95f, 11.8f, 6.8f, 12.8f)
                curveTo(6.4f, 12.9f, 5.95f, 12.7f, 5.85f, 12.3f)
                curveTo(5.75f, 11.9f, 5.95f, 11.45f, 6.35f, 11.35f)
                curveTo(10f, 10.25f, 14.5f, 10.8f, 17.6f, 12.7f)
                curveTo(17.9f, 12.85f, 18.05f, 13.35f, 17.8f, 13.7f)
                moveTo(16.6f, 16.45f)
                curveTo(16.4f, 16.75f, 16.05f, 16.85f, 15.75f, 16.65f)
                curveTo(13.4f, 15.2f, 10.45f, 14.9f, 6.95f, 15.7f)
                curveTo(6.6f, 15.8f, 6.3f, 15.55f, 6.2f, 15.25f)
                curveTo(6.1f, 14.9f, 6.35f, 14.6f, 6.65f, 14.5f)
                curveTo(10.45f, 13.65f, 13.75f, 14f, 16.35f, 15.6f)
                curveTo(16.7f, 15.75f, 16.75f, 16.15f, 16.6f, 16.45f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _Spotify!!
    }

@Suppress("ObjectPropertyName")
private var _Spotify: ImageVector? = null

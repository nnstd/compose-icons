package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingSpadeOutline: ImageVector
    get() {
        if (_CardsPlayingSpadeOutline != null) {
            return _CardsPlayingSpadeOutline!!
        }
        _CardsPlayingSpadeOutline = ImageVector.Builder(
            name = "CardsPlayingSpadeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 21.1f, 5.9f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(18.1f, 22f, 19f, 21.1f, 19f, 20f)
                verticalLineTo(4f)
                curveTo(19f, 2.9f, 18.1f, 2f, 17f, 2f)
                moveTo(17f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                moveTo(12f, 7.7f)
                lineTo(11.4f, 8.2f)
                curveTo(9.4f, 10.1f, 8f, 11.3f, 8f, 12.8f)
                curveTo(8f, 14f, 9f, 15f, 10.2f, 15f)
                curveTo(10.6f, 15f, 11f, 14.9f, 11.4f, 14.7f)
                lineTo(10.5f, 17f)
                horizontalLineTo(13.5f)
                lineTo(12.6f, 14.7f)
                curveTo(12.9f, 14.9f, 13.4f, 15f, 13.8f, 15f)
                curveTo(15f, 15f, 16f, 14.1f, 16f, 12.8f)
                curveTo(16f, 11.3f, 14.6f, 10.1f, 12.6f, 8.2f)
                lineTo(12f, 7.7f)
                close()
            }
        }.build()

        return _CardsPlayingSpadeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingSpadeOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingSpade: ImageVector
    get() {
        if (_CardsPlayingSpade != null) {
            return _CardsPlayingSpade!!
        }
        _CardsPlayingSpade = ImageVector.Builder(
            name = "CardsPlayingSpade",
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
                moveTo(13.8f, 15f)
                curveTo(13.4f, 15f, 13f, 14.9f, 12.6f, 14.7f)
                lineTo(13.5f, 17f)
                horizontalLineTo(10.5f)
                lineTo(11.4f, 14.7f)
                curveTo(11f, 14.9f, 10.6f, 15f, 10.2f, 15f)
                curveTo(9f, 15f, 8f, 14f, 8f, 12.8f)
                curveTo(8f, 11.3f, 9.4f, 10.1f, 11.4f, 8.2f)
                lineTo(12f, 7.7f)
                lineTo(12.6f, 8.2f)
                curveTo(14.6f, 10.1f, 16f, 11.3f, 16f, 12.8f)
                curveTo(16f, 14.1f, 15f, 15f, 13.8f, 15f)
                close()
            }
        }.build()

        return _CardsPlayingSpade!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingSpade: ImageVector? = null

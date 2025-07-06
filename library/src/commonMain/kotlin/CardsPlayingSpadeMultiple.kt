package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingSpadeMultiple: ImageVector
    get() {
        if (_CardsPlayingSpadeMultiple != null) {
            return _CardsPlayingSpadeMultiple!!
        }
        _CardsPlayingSpadeMultiple = ImageVector.Builder(
            name = "CardsPlayingSpadeMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(22f)
                curveTo(3f, 23.1f, 3.9f, 24f, 5f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(19f, 0f)
                horizontalLineTo(9f)
                curveTo(7.9f, 0f, 7f, 0.9f, 7f, 2f)
                verticalLineTo(18f)
                curveTo(7f, 19.1f, 7.9f, 20f, 9f, 20f)
                horizontalLineTo(19f)
                curveTo(20.1f, 20f, 21f, 19.1f, 21f, 18f)
                verticalLineTo(2f)
                curveTo(21f, 0.9f, 20.1f, 0f, 19f, 0f)
                moveTo(15.8f, 13f)
                curveTo(15.4f, 13f, 15f, 12.9f, 14.6f, 12.7f)
                lineTo(15.5f, 15f)
                horizontalLineTo(12.5f)
                lineTo(13.4f, 12.7f)
                curveTo(13f, 12.9f, 12.6f, 13f, 12.2f, 13f)
                curveTo(11f, 13f, 10f, 12f, 10f, 10.8f)
                curveTo(10f, 9.3f, 11.4f, 8.1f, 13.4f, 6.2f)
                lineTo(14f, 5.7f)
                lineTo(14.6f, 6.2f)
                curveTo(16.6f, 8.1f, 18f, 9.3f, 18f, 10.8f)
                curveTo(18f, 12.1f, 17f, 13f, 15.8f, 13f)
                close()
            }
        }.build()

        return _CardsPlayingSpadeMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingSpadeMultiple: ImageVector? = null

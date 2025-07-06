package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlaying: ImageVector
    get() {
        if (_CardsPlaying != null) {
            return _CardsPlaying!!
        }
        _CardsPlaying = ImageVector.Builder(
            name = "CardsPlaying",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.7f, 2.2f)
                horizontalLineTo(16.2f)
                curveTo(17.3f, 2.2f, 18.2f, 3.1f, 18.2f, 4.2f)
                verticalLineTo(10.6f)
                lineTo(14.7f, 2.2f)
                moveTo(20.1f, 3.8f)
                lineTo(21.4f, 4.4f)
                curveTo(22.4f, 4.8f, 22.9f, 6f, 22.5f, 7f)
                lineTo(20.1f, 12.9f)
                verticalLineTo(3.8f)
                moveTo(18f, 15.5f)
                lineTo(13f, 3.5f)
                curveTo(12.7f, 2.7f, 12f, 2.3f, 11.2f, 2.3f)
                curveTo(10.9f, 2.3f, 10.7f, 2.4f, 10.4f, 2.5f)
                lineTo(3f, 5.5f)
                curveTo(2f, 5.9f, 1.5f, 7f, 2f, 8f)
                lineTo(7f, 20f)
                curveTo(7.3f, 20.8f, 8f, 21.2f, 8.8f, 21.2f)
                curveTo(9.1f, 21.2f, 9.3f, 21.2f, 9.6f, 21f)
                lineTo(17f, 18f)
                curveTo(17.8f, 17.7f, 18.2f, 17f, 18.2f, 16.2f)
                curveTo(18.1f, 16f, 18.1f, 15.7f, 18f, 15.5f)
                moveTo(11.4f, 15f)
                lineTo(8.2f, 12.6f)
                lineTo(8.6f, 8.6f)
                lineTo(11.8f, 11f)
                lineTo(11.4f, 15f)
            }
        }.build()

        return _CardsPlaying!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlaying: ImageVector? = null

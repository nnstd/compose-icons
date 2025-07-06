package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RacingHelmet: ImageVector
    get() {
        if (_RacingHelmet != null) {
            return _RacingHelmet!!
        }
        _RacingHelmet = ImageVector.Builder(
            name = "RacingHelmet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.2f, 11.2f)
                curveTo(2f, 13.6f, 2.7f, 15.6f, 4.2f, 17.4f)
                curveTo(5.7f, 19.2f, 7.7f, 20f, 10.1f, 20f)
                horizontalLineTo(20.1f)
                curveTo(20.6f, 20f, 21.1f, 19.8f, 21.5f, 19.4f)
                curveTo(21.9f, 19f, 22.1f, 18.5f, 22.1f, 18f)
                verticalLineTo(17.2f)
                curveTo(22.1f, 16.6f, 22f, 15.9f, 21.9f, 15f)
                horizontalLineTo(13.7f)
                curveTo(12.7f, 15f, 11.9f, 14.6f, 11.2f, 13.9f)
                curveTo(10.5f, 13.2f, 10.1f, 12.3f, 10.1f, 11.4f)
                curveTo(10.1f, 9.8f, 10.8f, 8.7f, 12.3f, 8.1f)
                lineTo(17.1f, 6f)
                curveTo(15.4f, 4.8f, 13.4f, 4.1f, 11.1f, 4f)
                curveTo(8.9f, 3.8f, 6.9f, 4.5f, 5.1f, 5.9f)
                curveTo(3.3f, 7.3f, 2.4f, 9f, 2.2f, 11.2f)
                moveTo(12.1f, 11.4f)
                curveTo(12.1f, 11.8f, 12.3f, 12.2f, 12.6f, 12.5f)
                curveTo(12.9f, 12.8f, 13.3f, 13f, 13.7f, 13f)
                horizontalLineTo(21.5f)
                curveTo(20.9f, 10.8f, 20f, 9f, 18.7f, 7.6f)
                lineTo(13.1f, 9.9f)
                curveTo(12.4f, 10.1f, 12.1f, 10.6f, 12.1f, 11.4f)
                close()
            }
        }.build()

        return _RacingHelmet!!
    }

@Suppress("ObjectPropertyName")
private var _RacingHelmet: ImageVector? = null

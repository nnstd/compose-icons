package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WrenchClock: ImageVector
    get() {
        if (_WrenchClock != null) {
            return _WrenchClock!!
        }
        _WrenchClock = ImageVector.Builder(
            name = "WrenchClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6.2f)
                curveTo(10f, 4.3f, 8.8f, 2.6f, 7f, 2f)
                verticalLineTo(5.7f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                curveTo(2.2f, 2.6f, 1f, 4.3f, 1f, 6.2f)
                curveTo(1f, 8.1f, 2.2f, 9.8f, 4f, 10.4f)
                verticalLineTo(21.4f)
                curveTo(4f, 21.8f, 4.2f, 22f, 4.5f, 22f)
                horizontalLineTo(6.5f)
                curveTo(6.8f, 22f, 7f, 21.8f, 7f, 21.5f)
                verticalLineTo(10.5f)
                curveTo(8.8f, 9.9f, 10f, 8.2f, 10f, 6.2f)
                moveTo(16f, 8f)
                curveTo(16f, 8f, 15.9f, 8f, 16f, 8f)
                curveTo(12.1f, 8.1f, 9f, 11.2f, 9f, 15f)
                curveTo(9f, 18.9f, 12.1f, 22f, 16f, 22f)
                reflectiveCurveTo(23f, 18.9f, 23f, 15f)
                reflectiveCurveTo(19.9f, 8f, 16f, 8f)
                moveTo(16f, 20f)
                curveTo(13.2f, 20f, 11f, 17.8f, 11f, 15f)
                reflectiveCurveTo(13.2f, 10f, 16f, 10f)
                reflectiveCurveTo(21f, 12.2f, 21f, 15f)
                reflectiveCurveTo(18.8f, 20f, 16f, 20f)
                moveTo(15f, 11f)
                verticalLineTo(16f)
                lineTo(18.6f, 18.2f)
                lineTo(19.4f, 17f)
                lineTo(16.5f, 15.3f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _WrenchClock!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchClock: ImageVector? = null

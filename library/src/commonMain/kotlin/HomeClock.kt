package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeClock: ImageVector
    get() {
        if (_HomeClock != null) {
            return _HomeClock!!
        }
        _HomeClock = ImageVector.Builder(
            name = "HomeClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                moveTo(23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(13.62f, 23f, 11.53f, 21.81f, 10.26f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                lineTo(11f, 3f)
                lineTo(18f, 9.29f)
                curveTo(20.89f, 10.15f, 23f, 12.83f, 23f, 16f)
                moveTo(21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                reflectiveCurveTo(11f, 13.24f, 11f, 16f)
                reflectiveCurveTo(13.24f, 21f, 16f, 21f)
                reflectiveCurveTo(21f, 18.76f, 21f, 16f)
                close()
            }
        }.build()

        return _HomeClock!!
    }

@Suppress("ObjectPropertyName")
private var _HomeClock: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardClock: ImageVector
    get() {
        if (_ClipboardClock != null) {
            return _ClipboardClock!!
        }
        _ClipboardClock = ImageVector.Builder(
            name = "ClipboardClock",
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
                curveTo(14.09f, 23f, 12.37f, 22.24f, 11.11f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1f, 12f, 1f)
                reflectiveCurveTo(14.4f, 1.84f, 14.82f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(11.11f)
                curveTo(22.24f, 12.37f, 23f, 14.09f, 23f, 16f)
                moveTo(11f, 4f)
                curveTo(11f, 4.55f, 11.45f, 5f, 12f, 5f)
                reflectiveCurveTo(13f, 4.55f, 13f, 4f)
                reflectiveCurveTo(12.55f, 3f, 12f, 3f)
                reflectiveCurveTo(11f, 3.45f, 11f, 4f)
                moveTo(21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                reflectiveCurveTo(11f, 13.24f, 11f, 16f)
                reflectiveCurveTo(13.24f, 21f, 16f, 21f)
                reflectiveCurveTo(21f, 18.76f, 21f, 16f)
                close()
            }
        }.build()

        return _ClipboardClock!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardClock: ImageVector? = null

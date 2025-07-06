package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardTextClock: ImageVector
    get() {
        if (_ClipboardTextClock != null) {
            return _ClipboardTextClock!!
        }
        _ClipboardTextClock = ImageVector.Builder(
            name = "ClipboardTextClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.11f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(11.11f)
                curveTo(12.37f, 22.24f, 14.09f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 14.09f, 22.24f, 12.37f, 21f, 11.11f)
                moveTo(12f, 3f)
                curveTo(12.55f, 3f, 13f, 3.45f, 13f, 4f)
                reflectiveCurveTo(12.55f, 5f, 12f, 5f)
                reflectiveCurveTo(11f, 4.55f, 11f, 4f)
                reflectiveCurveTo(11.45f, 3f, 12f, 3f)
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(9.08f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(9.08f)
                curveTo(9.03f, 15.33f, 9f, 15.66f, 9f, 16f)
                reflectiveCurveTo(9.03f, 16.67f, 9.08f, 17f)
                moveTo(6f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(11.11f)
                curveTo(10.5f, 11.57f, 10.04f, 12.25f, 9.68f, 13f)
                horizontalLineTo(6f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }.build()

        return _ClipboardTextClock!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardTextClock: ImageVector? = null

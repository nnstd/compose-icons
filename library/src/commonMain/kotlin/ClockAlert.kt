package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockAlert: ImageVector
    get() {
        if (_ClockAlert != null) {
            return _ClockAlert!!
        }
        _ClockAlert = ImageVector.Builder(
            name = "ClockAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                moveTo(20f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                curveTo(14.3f, 22f, 16.3f, 21.2f, 18f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(21.8f)
                curveTo(20.9f, 5.4f, 16.8f, 2f, 12f, 2f)
                moveTo(16.2f, 16.2f)
                lineTo(11f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.2f)
                lineTo(17f, 14.9f)
                lineTo(16.2f, 16.2f)
                close()
            }
        }.build()

        return _ClockAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ClockAlert: ImageVector? = null

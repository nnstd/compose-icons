package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookClockOutline: ImageVector
    get() {
        if (_BookClockOutline != null) {
            return _BookClockOutline!!
        }
        _BookClockOutline = ImageVector.Builder(
            name = "BookClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 11.26f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(11.11f)
                curveTo(12.37f, 23.24f, 14.09f, 24f, 16f, 24f)
                curveTo(19.87f, 24f, 23f, 20.87f, 23f, 17f)
                curveTo(23f, 14.62f, 21.81f, 12.53f, 20f, 11.26f)
                moveTo(18f, 4f)
                verticalLineTo(10.29f)
                curveTo(17.37f, 10.11f, 16.7f, 10f, 16f, 10f)
                curveTo(14.93f, 10f, 13.91f, 10.25f, 13f, 10.68f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(6f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(12.1f, 11.19f)
                curveTo(10.23f, 12.45f, 9f, 14.58f, 9f, 17f)
                curveTo(9f, 18.08f, 9.25f, 19.09f, 9.68f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                moveTo(16f, 22f)
                curveTo(13.24f, 22f, 11f, 19.76f, 11f, 17f)
                reflectiveCurveTo(13.24f, 12f, 16f, 12f)
                reflectiveCurveTo(21f, 14.24f, 21f, 17f)
                reflectiveCurveTo(18.76f, 22f, 16f, 22f)
                moveTo(16.5f, 17.25f)
                lineTo(19.36f, 18.94f)
                lineTo(18.61f, 20.16f)
                lineTo(15f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(16.5f)
                verticalLineTo(17.25f)
                close()
            }
        }.build()

        return _BookClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookClockOutline: ImageVector? = null

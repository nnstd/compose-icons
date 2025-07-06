package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WrenchClockOutline: ImageVector
    get() {
        if (_WrenchClockOutline != null) {
            return _WrenchClockOutline!!
        }
        _WrenchClockOutline = ImageVector.Builder(
            name = "WrenchClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                curveTo(14.8f, 8.03f, 13.67f, 8.35f, 12.68f, 8.89f)
                curveTo(12.88f, 8.29f, 13f, 7.66f, 13f, 7f)
                curveTo(13f, 4.03f, 10.84f, 1.57f, 8f, 1.09f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(1.09f)
                curveTo(3.16f, 1.57f, 1f, 4.03f, 1f, 7f)
                curveTo(1f, 9.22f, 2.21f, 11.15f, 4f, 12.19f)
                verticalLineTo(21f)
                curveTo(4f, 21.55f, 4.45f, 22f, 5f, 22f)
                horizontalLineTo(9f)
                curveTo(9.55f, 22f, 10f, 21.55f, 10f, 21f)
                verticalLineTo(18.62f)
                curveTo(11.22f, 20.65f, 13.43f, 22f, 16f, 22f)
                curveTo(19.9f, 22f, 23f, 18.9f, 23f, 15f)
                reflectiveCurveTo(19.9f, 8f, 16f, 8f)
                moveTo(8f, 11.04f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(11.04f)
                lineTo(5f, 10.46f)
                curveTo(3.77f, 9.74f, 3f, 8.42f, 3f, 7f)
                curveTo(3f, 6f, 3.37f, 5.06f, 4f, 4.35f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(4.35f)
                curveTo(10.63f, 5.06f, 11f, 6f, 11f, 7f)
                curveTo(11f, 8.42f, 10.23f, 9.74f, 9f, 10.46f)
                lineTo(8f, 11.04f)
                moveTo(16f, 20f)
                curveTo(13.2f, 20f, 11f, 17.8f, 11f, 15f)
                reflectiveCurveTo(13.2f, 10f, 16f, 10f)
                reflectiveCurveTo(21f, 12.2f, 21f, 15f)
                reflectiveCurveTo(18.8f, 20f, 16f, 20f)
                moveTo(16.5f, 15.3f)
                lineTo(19.4f, 17f)
                lineTo(18.6f, 18.2f)
                lineTo(15f, 16f)
                verticalLineTo(11f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.3f)
                close()
            }
        }.build()

        return _WrenchClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WrenchClockOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashClock: ImageVector
    get() {
        if (_CashClock != null) {
            return _CashClock!!
        }
        _CashClock = ImageVector.Builder(
            name = "CashClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 16.82f)
                lineTo(19.94f, 18.23f)
                lineTo(19.19f, 19.53f)
                lineTo(16f, 17.69f)
                verticalLineTo(14f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.82f)
                moveTo(24f, 17f)
                curveTo(24f, 20.87f, 20.87f, 24f, 17f, 24f)
                reflectiveCurveTo(10f, 20.87f, 10f, 17f)
                curveTo(10f, 16.66f, 10.03f, 16.33f, 10.08f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(10.68f)
                curveTo(22.36f, 11.81f, 24f, 14.21f, 24f, 17f)
                moveTo(10.68f, 14f)
                curveTo(10.86f, 13.64f, 11.05f, 13.3f, 11.28f, 12.97f)
                curveTo(11.19f, 13f, 11.1f, 13f, 11f, 13f)
                curveTo(9.34f, 13f, 8f, 11.66f, 8f, 10f)
                reflectiveCurveTo(9.34f, 7f, 11f, 7f)
                reflectiveCurveTo(14f, 8.34f, 14f, 10f)
                curveTo(14f, 10.25f, 13.96f, 10.5f, 13.9f, 10.73f)
                curveTo(14.84f, 10.27f, 15.89f, 10f, 17f, 10f)
                curveTo(17.34f, 10f, 17.67f, 10.03f, 18f, 10.08f)
                verticalLineTo(8f)
                curveTo(16.9f, 8f, 16f, 7.11f, 16f, 6f)
                horizontalLineTo(6f)
                curveTo(6f, 7.11f, 5.11f, 8f, 4f, 8f)
                verticalLineTo(12f)
                curveTo(5.11f, 12f, 6f, 12.9f, 6f, 14f)
                horizontalLineTo(10.68f)
                moveTo(22f, 17f)
                curveTo(22f, 14.24f, 19.76f, 12f, 17f, 12f)
                reflectiveCurveTo(12f, 14.24f, 12f, 17f)
                reflectiveCurveTo(14.24f, 22f, 17f, 22f)
                reflectiveCurveTo(22f, 19.76f, 22f, 17f)
                close()
            }
        }.build()

        return _CashClock!!
    }

@Suppress("ObjectPropertyName")
private var _CashClock: ImageVector? = null

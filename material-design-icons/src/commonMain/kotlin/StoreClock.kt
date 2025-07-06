package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreClock: ImageVector
    get() {
        if (_StoreClock != null) {
            return _StoreClock!!
        }
        _StoreClock = ImageVector.Builder(
            name = "StoreClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(17.5f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                lineTo(19.61f, 20.16f)
                lineTo(20.36f, 18.94f)
                lineTo(17.5f, 17.25f)
                verticalLineTo(13f)
                moveTo(24f, 17f)
                curveTo(24f, 20.87f, 20.87f, 24f, 17f, 24f)
                curveTo(13.47f, 24f, 10.57f, 21.39f, 10.08f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                lineTo(2f, 5f)
                horizontalLineTo(18f)
                lineTo(19f, 10f)
                verticalLineTo(10.29f)
                curveTo(21.89f, 11.16f, 24f, 13.83f, 24f, 17f)
                moveTo(4f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                moveTo(22f, 17f)
                curveTo(22f, 14.24f, 19.76f, 12f, 17f, 12f)
                reflectiveCurveTo(12f, 14.24f, 12f, 17f)
                reflectiveCurveTo(14.24f, 22f, 17f, 22f)
                reflectiveCurveTo(22f, 19.76f, 22f, 17f)
                close()
            }
        }.build()

        return _StoreClock!!
    }

@Suppress("ObjectPropertyName")
private var _StoreClock: ImageVector? = null

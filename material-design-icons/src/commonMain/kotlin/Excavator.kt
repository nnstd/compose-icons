package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Excavator: ImageVector
    get() {
        if (_Excavator != null) {
            return _Excavator!!
        }
        _Excavator = ImageVector.Builder(
            name = "Excavator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 18.5f)
                curveTo(19.04f, 18.5f, 19.5f, 18.96f, 19.5f, 19.5f)
                reflectiveCurveTo(19.04f, 20.5f, 18.5f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.96f, 20.5f, 5.5f, 20.04f, 5.5f, 19.5f)
                reflectiveCurveTo(5.96f, 18.5f, 6.5f, 18.5f)
                horizontalLineTo(18.5f)
                moveTo(18.5f, 17f)
                horizontalLineTo(6.5f)
                curveTo(5.13f, 17f, 4f, 18.13f, 4f, 19.5f)
                reflectiveCurveTo(5.13f, 22f, 6.5f, 22f)
                horizontalLineTo(18.5f)
                curveTo(19.88f, 22f, 21f, 20.88f, 21f, 19.5f)
                reflectiveCurveTo(19.88f, 17f, 18.5f, 17f)
                moveTo(21f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                lineTo(10f, 11f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                lineTo(21f, 11f)
                moveTo(11.54f, 11f)
                lineTo(13.5f, 8.5f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(11.54f)
                moveTo(9.76f, 3.41f)
                lineTo(4.76f, 2f)
                lineTo(2f, 11.83f)
                curveTo(1.66f, 13.11f, 2.41f, 14.44f, 3.7f, 14.8f)
                lineTo(4.86f, 15.12f)
                lineTo(8.15f, 12.29f)
                lineTo(4.27f, 11.21f)
                lineTo(6.15f, 4.46f)
                lineTo(8.94f, 5.24f)
                curveTo(9.5f, 5.53f, 10.71f, 6.34f, 11.47f, 7.37f)
                lineTo(12.5f, 6f)
                horizontalLineTo(12.94f)
                curveTo(11.68f, 4.41f, 9.85f, 3.46f, 9.76f, 3.41f)
                close()
            }
        }.build()

        return _Excavator!!
    }

@Suppress("ObjectPropertyName")
private var _Excavator: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Antenna: ImageVector
    get() {
        if (_Antenna != null) {
            return _Antenna!!
        }
        _Antenna = ImageVector.Builder(
            name = "Antenna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                curveTo(12.69f, 7.5f, 13.27f, 7.73f, 13.76f, 8.2f)
                reflectiveCurveTo(14.5f, 9.27f, 14.5f, 10f)
                curveTo(14.5f, 11.05f, 14f, 11.81f, 13f, 12.28f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(12.28f)
                curveTo(10f, 11.81f, 9.5f, 11.05f, 9.5f, 10f)
                curveTo(9.5f, 9.27f, 9.76f, 8.67f, 10.24f, 8.2f)
                reflectiveCurveTo(11.31f, 7.5f, 12f, 7.5f)
                moveTo(16.69f, 5.3f)
                curveTo(17.94f, 6.55f, 18.61f, 8.11f, 18.7f, 10f)
                curveTo(18.7f, 11.8f, 18.03f, 13.38f, 16.69f, 14.72f)
                lineTo(15.5f, 13.5f)
                curveTo(16.5f, 12.59f, 17f, 11.42f, 17f, 10f)
                curveTo(17f, 8.67f, 16.5f, 7.5f, 15.5f, 6.5f)
                lineTo(16.69f, 5.3f)
                moveTo(6.09f, 4.08f)
                curveTo(4.5f, 5.67f, 3.7f, 7.64f, 3.7f, 10f)
                reflectiveCurveTo(4.5f, 14.3f, 6.09f, 15.89f)
                lineTo(4.92f, 17.11f)
                curveTo(3f, 15.08f, 2f, 12.7f, 2f, 10f)
                curveTo(2f, 7.3f, 3f, 4.94f, 4.92f, 2.91f)
                lineTo(6.09f, 4.08f)
                moveTo(19.08f, 2.91f)
                curveTo(21f, 4.94f, 22f, 7.3f, 22f, 10f)
                curveTo(22f, 12.8f, 21f, 15.17f, 19.08f, 17.11f)
                lineTo(17.91f, 15.89f)
                curveTo(19.5f, 14.3f, 20.3f, 12.33f, 20.3f, 10f)
                reflectiveCurveTo(19.5f, 5.67f, 17.91f, 4.08f)
                lineTo(19.08f, 2.91f)
                moveTo(7.31f, 5.3f)
                lineTo(8.5f, 6.5f)
                curveTo(7.5f, 7.42f, 7f, 8.58f, 7f, 10f)
                curveTo(7f, 11.33f, 7.5f, 12.5f, 8.5f, 13.5f)
                lineTo(7.31f, 14.72f)
                curveTo(5.97f, 13.38f, 5.3f, 11.8f, 5.3f, 10f)
                curveTo(5.3f, 8.2f, 5.97f, 6.64f, 7.31f, 5.3f)
                close()
            }
        }.build()

        return _Antenna!!
    }

@Suppress("ObjectPropertyName")
private var _Antenna: ImageVector? = null

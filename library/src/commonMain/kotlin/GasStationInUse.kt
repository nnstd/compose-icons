package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GasStationInUse: ImageVector
    get() {
        if (_GasStationInUse != null) {
            return _GasStationInUse!!
        }
        _GasStationInUse = ImageVector.Builder(
            name = "GasStationInUse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18.5f)
                verticalLineTo(8.5f)
                curveTo(17f, 7.81f, 17.28f, 7.18f, 17.73f, 6.73f)
                lineTo(17.72f, 6.72f)
                lineTo(21.44f, 3f)
                lineTo(22.5f, 4.06f)
                lineTo(20.39f, 6.17f)
                curveTo(21.33f, 6.5f, 22f, 7.43f, 22f, 8.5f)
                curveTo(22f, 8.83f, 21.94f, 9.15f, 21.81f, 9.46f)
                curveTo(21.68f, 9.76f, 21.5f, 10.04f, 21.27f, 10.27f)
                curveTo(20.8f, 10.74f, 20.16f, 11f, 19.5f, 11f)
                curveTo(19.14f, 11f, 18.81f, 10.92f, 18.5f, 10.79f)
                verticalLineTo(18.5f)
                curveTo(18.5f, 18.83f, 18.43f, 19.15f, 18.31f, 19.46f)
                curveTo(18.18f, 19.76f, 18f, 20.04f, 17.77f, 20.27f)
                curveTo(17.54f, 20.5f, 17.26f, 20.69f, 16.96f, 20.81f)
                curveTo(16.65f, 20.94f, 16.33f, 21f, 16f, 21f)
                curveTo(15.34f, 21f, 14.7f, 20.74f, 14.23f, 20.27f)
                curveTo(13.76f, 19.8f, 13.5f, 19.16f, 13.5f, 18.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                curveTo(2f, 3.89f, 2.89f, 3f, 4f, 3f)
                horizontalLineTo(10f)
                curveTo(11.1f, 3f, 12f, 3.89f, 12f, 5f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                curveTo(14.1f, 12f, 15f, 12.89f, 15f, 14f)
                verticalLineTo(18.5f)
                curveTo(15f, 18.77f, 15.11f, 19f, 15.29f, 19.21f)
                curveTo(15.5f, 19.4f, 15.74f, 19.5f, 16f, 19.5f)
                curveTo(16.27f, 19.5f, 16.5f, 19.4f, 16.71f, 19.21f)
                curveTo(16.9f, 19f, 17f, 18.77f, 17f, 18.5f)
                moveTo(10f, 10f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                moveTo(19.5f, 9.5f)
                curveTo(19.77f, 9.5f, 20f, 9.4f, 20.21f, 9.21f)
                curveTo(20.4f, 9f, 20.5f, 8.77f, 20.5f, 8.5f)
                curveTo(20.5f, 8.24f, 20.4f, 8f, 20.21f, 7.79f)
                curveTo(20f, 7.61f, 19.77f, 7.5f, 19.5f, 7.5f)
                curveTo(19.24f, 7.5f, 19f, 7.61f, 18.79f, 7.79f)
                curveTo(18.61f, 8f, 18.5f, 8.24f, 18.5f, 8.5f)
                curveTo(18.5f, 8.77f, 18.61f, 9f, 18.79f, 9.21f)
                curveTo(19f, 9.4f, 19.24f, 9.5f, 19.5f, 9.5f)
                close()
            }
        }.build()

        return _GasStationInUse!!
    }

@Suppress("ObjectPropertyName")
private var _GasStationInUse: ImageVector? = null

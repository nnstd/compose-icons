package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GasStationOffOutline: ImageVector
    get() {
        if (_GasStationOffOutline != null) {
            return _GasStationOffOutline!!
        }
        _GasStationOffOutline = ImageVector.Builder(
            name = "GasStationOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(6f, 6.72f)
                lineTo(21f, 21.72f)
                lineTo(19.73f, 23f)
                lineTo(17.72f, 21f)
                curveTo(16.56f, 20.85f, 15.65f, 19.94f, 15.5f, 18.78f)
                lineTo(14f, 17.27f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(7.27f)
                lineTo(1f, 4.27f)
                moveTo(19.77f, 7.23f)
                curveTo(20.22f, 7.68f, 20.5f, 8.31f, 20.5f, 9f)
                lineTo(20.5f, 18.67f)
                lineTo(19f, 17.18f)
                verticalLineTo(11.29f)
                curveTo(18.69f, 11.42f, 18.36f, 11.5f, 18f, 11.5f)
                curveTo(16.62f, 11.5f, 15.5f, 10.38f, 15.5f, 9f)
                curveTo(15.5f, 7.93f, 16.17f, 7.03f, 17.11f, 6.67f)
                lineTo(15f, 4.56f)
                lineTo(16.06f, 3.5f)
                lineTo(19.78f, 7.22f)
                lineTo(19.77f, 7.23f)
                moveTo(11.82f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(6.82f)
                lineTo(5.06f, 3.24f)
                curveTo(5.34f, 3.09f, 5.66f, 3f, 6f, 3f)
                horizontalLineTo(12f)
                curveTo(13.1f, 3f, 14f, 3.9f, 14f, 5f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                curveTo(16.1f, 12f, 17f, 12.9f, 17f, 14f)
                verticalLineTo(15.18f)
                lineTo(11.82f, 10f)
                moveTo(6f, 10f)
                horizontalLineTo(6.73f)
                lineTo(6f, 9.27f)
                verticalLineTo(10f)
                moveTo(6f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(15.27f)
                lineTo(8.73f, 12f)
                horizontalLineTo(6f)
                moveTo(18f, 10f)
                curveTo(18.55f, 10f, 19f, 9.55f, 19f, 9f)
                curveTo(19f, 8.45f, 18.55f, 8f, 18f, 8f)
                curveTo(17.45f, 8f, 17f, 8.45f, 17f, 9f)
                curveTo(17f, 9.55f, 17.45f, 10f, 18f, 10f)
                close()
            }
        }.build()

        return _GasStationOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GasStationOffOutline: ImageVector? = null

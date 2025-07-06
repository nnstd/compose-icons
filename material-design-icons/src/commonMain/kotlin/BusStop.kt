package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusStop: ImageVector
    get() {
        if (_BusStop != null) {
            return _BusStop!!
        }
        _BusStop = ImageVector.Builder(
            name = "BusStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 7f)
                verticalLineTo(16f)
                curveTo(22f, 16.71f, 21.62f, 17.36f, 21f, 17.72f)
                verticalLineTo(19.25f)
                curveTo(21f, 19.66f, 20.66f, 20f, 20.25f, 20f)
                horizontalLineTo(19.75f)
                curveTo(19.34f, 20f, 19f, 19.66f, 19f, 19.25f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(19.25f)
                curveTo(12f, 19.66f, 11.66f, 20f, 11.25f, 20f)
                horizontalLineTo(10.75f)
                curveTo(10.34f, 20f, 10f, 19.66f, 10f, 19.25f)
                verticalLineTo(17.72f)
                curveTo(9.39f, 17.36f, 9f, 16.71f, 9f, 16f)
                verticalLineTo(7f)
                curveTo(9f, 4f, 12f, 4f, 15.5f, 4f)
                reflectiveCurveTo(22f, 4f, 22f, 7f)
                moveTo(13f, 15f)
                curveTo(13f, 14.45f, 12.55f, 14f, 12f, 14f)
                reflectiveCurveTo(11f, 14.45f, 11f, 15f)
                reflectiveCurveTo(11.45f, 16f, 12f, 16f)
                reflectiveCurveTo(13f, 15.55f, 13f, 15f)
                moveTo(20f, 15f)
                curveTo(20f, 14.45f, 19.55f, 14f, 19f, 14f)
                reflectiveCurveTo(18f, 14.45f, 18f, 15f)
                reflectiveCurveTo(18.45f, 16f, 19f, 16f)
                reflectiveCurveTo(20f, 15.55f, 20f, 15f)
                moveTo(20f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                moveTo(7f, 9.5f)
                curveTo(6.97f, 8.12f, 5.83f, 7f, 4.45f, 7.05f)
                curveTo(3.07f, 7.08f, 1.97f, 8.22f, 2f, 9.6f)
                curveTo(2.03f, 10.77f, 2.86f, 11.77f, 4f, 12f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                curveTo(6.18f, 11.76f, 7f, 10.71f, 7f, 9.5f)
                close()
            }
        }.build()

        return _BusStop!!
    }

@Suppress("ObjectPropertyName")
private var _BusStop: ImageVector? = null

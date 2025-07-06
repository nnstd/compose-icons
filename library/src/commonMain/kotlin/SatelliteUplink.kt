package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SatelliteUplink: ImageVector
    get() {
        if (_SatelliteUplink != null) {
            return _SatelliteUplink!!
        }
        _SatelliteUplink = ImageVector.Builder(
            name = "SatelliteUplink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.86f, 2f)
                lineTo(11.34f, 3.93f)
                curveTo(15.75f, 4.78f, 19.2f, 8.23f, 20.05f, 12.65f)
                lineTo(22f, 12.13f)
                curveTo(20.95f, 7.03f, 16.96f, 3.04f, 11.86f, 2f)
                moveTo(10.82f, 5.86f)
                lineTo(10.3f, 7.81f)
                curveTo(13.34f, 8.27f, 15.72f, 10.65f, 16.18f, 13.68f)
                lineTo(18.12f, 13.16f)
                curveTo(17.46f, 9.44f, 14.55f, 6.5f, 10.82f, 5.86f)
                moveTo(3.72f, 9.69f)
                curveTo(3.25f, 10.73f, 3f, 11.86f, 3f, 13f)
                curveTo(3f, 14.95f, 3.71f, 16.82f, 5f, 18.28f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20.41f)
                curveTo(8.95f, 20.8f, 9.97f, 21f, 11f, 21f)
                curveTo(12.14f, 21f, 13.27f, 20.75f, 14.3f, 20.28f)
                lineTo(3.72f, 9.69f)
                moveTo(9.79f, 9.76f)
                lineTo(9.26f, 11.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.26f, 14.72f)
                lineTo(14.23f, 14.2f)
                curveTo(14f, 11.86f, 12.13f, 10f, 9.79f, 9.76f)
                close()
            }
        }.build()

        return _SatelliteUplink!!
    }

@Suppress("ObjectPropertyName")
private var _SatelliteUplink: ImageVector? = null

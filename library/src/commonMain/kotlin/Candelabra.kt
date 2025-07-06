package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Candelabra: ImageVector
    get() {
        if (_Candelabra != null) {
            return _Candelabra!!
        }
        _Candelabra = ImageVector.Builder(
            name = "Candelabra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 11f)
                curveTo(20.5f, 11.55f, 20.05f, 12f, 19.5f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                curveTo(19f, 15.11f, 18.11f, 16f, 17f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                curveTo(15.11f, 20f, 16f, 20.9f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(8f, 20.9f, 8.9f, 20f, 10f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                curveTo(5.9f, 16f, 5f, 15.11f, 5f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(4.5f)
                curveTo(3.95f, 12f, 3.5f, 11.55f, 3.5f, 11f)
                reflectiveCurveTo(3.95f, 10f, 4.5f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                lineTo(7f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(7.5f)
                curveTo(8.05f, 10f, 8.5f, 10.45f, 8.5f, 11f)
                reflectiveCurveTo(8.05f, 12f, 7.5f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(10.5f)
                curveTo(9.95f, 12f, 9.5f, 11.55f, 9.5f, 11f)
                reflectiveCurveTo(9.95f, 10f, 10.5f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                lineTo(13f, 3f)
                verticalLineTo(10f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 10f, 14.5f, 10.45f, 14.5f, 11f)
                reflectiveCurveTo(14.05f, 12f, 13.5f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                curveTo(15.95f, 12f, 15.5f, 11.55f, 15.5f, 11f)
                reflectiveCurveTo(15.95f, 10f, 16.5f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                lineTo(19f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(19.5f)
                curveTo(20.05f, 10f, 20.5f, 10.45f, 20.5f, 11f)
                close()
            }
        }.build()

        return _Candelabra!!
    }

@Suppress("ObjectPropertyName")
private var _Candelabra: ImageVector? = null

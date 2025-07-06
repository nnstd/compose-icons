package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedDoubleOutline: ImageVector
    get() {
        if (_BedDoubleOutline != null) {
            return _BedDoubleOutline!!
        }
        _BedDoubleOutline = ImageVector.Builder(
            name = "BedDoubleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                curveTo(7.5f, 5f, 7f, 5.21f, 6.61f, 5.6f)
                reflectiveCurveTo(6f, 6.45f, 6f, 7f)
                verticalLineTo(10f)
                curveTo(5.47f, 10f, 5f, 10.19f, 4.59f, 10.59f)
                reflectiveCurveTo(4f, 11.47f, 4f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(5.34f)
                lineTo(6f, 19f)
                horizontalLineTo(7f)
                lineTo(7.69f, 17f)
                horizontalLineTo(16.36f)
                lineTo(17f, 19f)
                horizontalLineTo(18f)
                lineTo(18.66f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                curveTo(20f, 11.47f, 19.81f, 11f, 19.41f, 10.59f)
                reflectiveCurveTo(18.53f, 10f, 18f, 10f)
                verticalLineTo(7f)
                curveTo(18f, 6.45f, 17.8f, 6f, 17.39f, 5.6f)
                reflectiveCurveTo(16.5f, 5f, 16f, 5f)
                moveTo(8f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(13f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                moveTo(6f, 12f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _BedDoubleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BedDoubleOutline: ImageVector? = null

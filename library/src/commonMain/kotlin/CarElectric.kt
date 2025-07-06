package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarElectric: ImageVector
    get() {
        if (_CarElectric != null) {
            return _CarElectric!!
        }
        _CarElectric = ImageVector.Builder(
            name = "CarElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 2f)
                curveTo(18.72f, 1.42f, 18.16f, 1f, 17.5f, 1f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 1f, 5.29f, 1.42f, 5.08f, 2f)
                lineTo(3f, 8f)
                verticalLineTo(16f)
                curveTo(3f, 16.55f, 3.45f, 17f, 4f, 17f)
                horizontalLineTo(5f)
                curveTo(5.55f, 17f, 6f, 16.55f, 6f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                curveTo(18f, 16.55f, 18.45f, 17f, 19f, 17f)
                horizontalLineTo(20f)
                curveTo(20.55f, 17f, 21f, 16.55f, 21f, 16f)
                verticalLineTo(8f)
                lineTo(18.92f, 2f)
                moveTo(6.5f, 12f)
                curveTo(5.67f, 12f, 5f, 11.33f, 5f, 10.5f)
                reflectiveCurveTo(5.67f, 9f, 6.5f, 9f)
                reflectiveCurveTo(8f, 9.67f, 8f, 10.5f)
                reflectiveCurveTo(7.33f, 12f, 6.5f, 12f)
                moveTo(17.5f, 12f)
                curveTo(16.67f, 12f, 16f, 11.33f, 16f, 10.5f)
                reflectiveCurveTo(16.67f, 9f, 17.5f, 9f)
                reflectiveCurveTo(19f, 9.67f, 19f, 10.5f)
                reflectiveCurveTo(18.33f, 12f, 17.5f, 12f)
                moveTo(5f, 7f)
                lineTo(6.5f, 2.5f)
                horizontalLineTo(17.5f)
                lineTo(19f, 7f)
                horizontalLineTo(5f)
                moveTo(7f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                lineTo(17f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                lineTo(7f, 20f)
                close()
            }
        }.build()

        return _CarElectric!!
    }

@Suppress("ObjectPropertyName")
private var _CarElectric: ImageVector? = null

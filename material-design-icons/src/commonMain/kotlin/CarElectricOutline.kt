package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarElectricOutline: ImageVector
    get() {
        if (_CarElectricOutline != null) {
            return _CarElectricOutline!!
        }
        _CarElectricOutline = ImageVector.Builder(
            name = "CarElectricOutline",
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
                moveTo(6.85f, 3f)
                horizontalLineTo(17.14f)
                lineTo(18.22f, 6.11f)
                horizontalLineTo(5.77f)
                lineTo(6.85f, 3f)
                moveTo(19f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(7.5f, 9f)
                curveTo(8.33f, 9f, 9f, 9.67f, 9f, 10.5f)
                reflectiveCurveTo(8.33f, 12f, 7.5f, 12f)
                reflectiveCurveTo(6f, 11.33f, 6f, 10.5f)
                reflectiveCurveTo(6.67f, 9f, 7.5f, 9f)
                moveTo(16.5f, 9f)
                curveTo(17.33f, 9f, 18f, 9.67f, 18f, 10.5f)
                reflectiveCurveTo(17.33f, 12f, 16.5f, 12f)
                curveTo(15.67f, 12f, 15f, 11.33f, 15f, 10.5f)
                reflectiveCurveTo(15.67f, 9f, 16.5f, 9f)
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

        return _CarElectricOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CarElectricOutline: ImageVector? = null

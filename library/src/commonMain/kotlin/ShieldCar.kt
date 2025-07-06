package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldCar: ImageVector
    get() {
        if (_ShieldCar != null) {
            return _ShieldCar!!
        }
        _ShieldCar = ImageVector.Builder(
            name = "ShieldCar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.42f, 7.5f)
                lineTo(16f, 11f)
                horizontalLineTo(8f)
                lineTo(9.42f, 7.5f)
                horizontalLineTo(14.42f)
                moveTo(9f, 12f)
                curveTo(8.45f, 12f, 8f, 12.45f, 8f, 13f)
                reflectiveCurveTo(8.45f, 14f, 9f, 14f)
                reflectiveCurveTo(10f, 13.55f, 10f, 13f)
                reflectiveCurveTo(9.55f, 12f, 9f, 12f)
                moveTo(15f, 12f)
                curveTo(14.45f, 12f, 14f, 12.45f, 14f, 13f)
                reflectiveCurveTo(14.45f, 14f, 15f, 14f)
                reflectiveCurveTo(16f, 13.55f, 16f, 13f)
                reflectiveCurveTo(15.55f, 12f, 15f, 12f)
                moveTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                moveTo(18f, 12f)
                lineTo(15.84f, 7f)
                curveTo(15.64f, 6.42f, 15.08f, 6f, 14.42f, 6f)
                horizontalLineTo(9.42f)
                curveTo(8.76f, 6f, 8.2f, 6.42f, 8f, 7f)
                lineTo(6f, 12f)
                verticalLineTo(16f)
                curveTo(6f, 16.55f, 6.45f, 17f, 7f, 17f)
                horizontalLineTo(8f)
                curveTo(8.55f, 17f, 9f, 16.55f, 9f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                curveTo(15f, 16.55f, 15.45f, 17f, 16f, 17f)
                horizontalLineTo(17f)
                curveTo(17.55f, 17f, 18f, 16.55f, 18f, 16f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ShieldCar!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCar: ImageVector? = null

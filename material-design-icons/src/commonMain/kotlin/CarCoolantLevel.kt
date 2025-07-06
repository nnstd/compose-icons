package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarCoolantLevel: ImageVector
    get() {
        if (_CarCoolantLevel != null) {
            return _CarCoolantLevel!!
        }
        _CarCoolantLevel = ImageVector.Builder(
            name = "CarCoolantLevel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(21f, 14.42f)
                curveTo(20.71f, 14.13f, 20.5f, 14f, 20f, 14f)
                curveTo(19.33f, 14f, 19.21f, 14.21f, 18.71f, 14.71f)
                reflectiveCurveTo(17.33f, 16f, 16f, 16f)
                reflectiveCurveTo(13.79f, 15.21f, 13.29f, 14.71f)
                reflectiveCurveTo(12.67f, 14f, 12f, 14f)
                curveTo(11.78f, 14f, 11.63f, 14.03f, 11.5f, 14.08f)
                curveTo(11.22f, 14.18f, 11.05f, 14.37f, 10.71f, 14.71f)
                curveTo(10.21f, 15.21f, 9.33f, 16f, 8f, 16f)
                reflectiveCurveTo(5.79f, 15.21f, 5.29f, 14.71f)
                reflectiveCurveTo(4.67f, 14f, 4f, 14f)
                curveTo(3.5f, 14f, 3.29f, 14.13f, 3f, 14.42f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(14.42f)
                close()
            }
        }.build()

        return _CarCoolantLevel!!
    }

@Suppress("ObjectPropertyName")
private var _CarCoolantLevel: ImageVector? = null

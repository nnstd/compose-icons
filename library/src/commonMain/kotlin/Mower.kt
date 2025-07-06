package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mower: ImageVector
    get() {
        if (_Mower != null) {
            return _Mower!!
        }
        _Mower = ImageVector.Builder(
            name = "Mower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 14f)
                curveTo(17.55f, 14f, 16.69f, 14.38f, 16.06f, 15f)
                horizontalLineTo(9.39f)
                lineTo(5.74f, 3f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(4.26f)
                lineTo(7f, 14.05f)
                curveTo(6.85f, 14.03f, 6.68f, 14f, 6.5f, 14f)
                curveTo(4.57f, 14f, 3f, 15.57f, 3f, 17.5f)
                reflectiveCurveTo(4.57f, 21f, 6.5f, 21f)
                curveTo(7.89f, 21f, 9.09f, 20.18f, 9.65f, 19f)
                horizontalLineTo(15.35f)
                curveTo(15.91f, 20.18f, 17.11f, 21f, 18.5f, 21f)
                curveTo(20.43f, 21f, 22f, 19.43f, 22f, 17.5f)
                reflectiveCurveTo(20.43f, 14f, 18.5f, 14f)
                moveTo(6.5f, 19f)
                curveTo(5.67f, 19f, 5f, 18.33f, 5f, 17.5f)
                reflectiveCurveTo(5.67f, 16f, 6.5f, 16f)
                reflectiveCurveTo(8f, 16.67f, 8f, 17.5f)
                reflectiveCurveTo(7.33f, 19f, 6.5f, 19f)
                moveTo(18.5f, 19f)
                curveTo(17.67f, 19f, 17f, 18.33f, 17f, 17.5f)
                reflectiveCurveTo(17.67f, 16f, 18.5f, 16f)
                reflectiveCurveTo(20f, 16.67f, 20f, 17.5f)
                reflectiveCurveTo(19.33f, 19f, 18.5f, 19f)
                moveTo(10.13f, 14f)
                lineTo(9.53f, 12f)
                horizontalLineTo(12.76f)
                curveTo(13.5f, 12f, 14.21f, 12.43f, 14.55f, 13.11f)
                lineTo(15f, 14f)
                horizontalLineTo(10.13f)
                close()
            }
        }.build()

        return _Mower!!
    }

@Suppress("ObjectPropertyName")
private var _Mower: ImageVector? = null

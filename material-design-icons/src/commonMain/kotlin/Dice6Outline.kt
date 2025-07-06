package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dice6Outline: ImageVector
    get() {
        if (_Dice6Outline != null) {
            return _Dice6Outline!!
        }
        _Dice6Outline = ImageVector.Builder(
            name = "Dice6Outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(7.5f, 6f)
                curveTo(6.7f, 6f, 6f, 6.7f, 6f, 7.5f)
                reflectiveCurveTo(6.7f, 9f, 7.5f, 9f)
                reflectiveCurveTo(9f, 8.3f, 9f, 7.5f)
                reflectiveCurveTo(8.3f, 6f, 7.5f, 6f)
                moveTo(16.5f, 15f)
                curveTo(15.7f, 15f, 15f, 15.7f, 15f, 16.5f)
                curveTo(15f, 17.3f, 15.7f, 18f, 16.5f, 18f)
                curveTo(17.3f, 18f, 18f, 17.3f, 18f, 16.5f)
                curveTo(18f, 15.7f, 17.3f, 15f, 16.5f, 15f)
                moveTo(16.5f, 10.5f)
                curveTo(15.7f, 10.5f, 15f, 11.2f, 15f, 12f)
                reflectiveCurveTo(15.7f, 13.5f, 16.5f, 13.5f)
                curveTo(17.3f, 13.5f, 18f, 12.8f, 18f, 12f)
                reflectiveCurveTo(17.3f, 10.5f, 16.5f, 10.5f)
                moveTo(16.5f, 6f)
                curveTo(15.7f, 6f, 15f, 6.7f, 15f, 7.5f)
                reflectiveCurveTo(15.7f, 9f, 16.5f, 9f)
                curveTo(17.3f, 9f, 18f, 8.3f, 18f, 7.5f)
                reflectiveCurveTo(17.3f, 6f, 16.5f, 6f)
                moveTo(7.5f, 10.5f)
                curveTo(6.7f, 10.5f, 6f, 11.2f, 6f, 12f)
                reflectiveCurveTo(6.7f, 13.5f, 7.5f, 13.5f)
                reflectiveCurveTo(9f, 12.8f, 9f, 12f)
                reflectiveCurveTo(8.3f, 10.5f, 7.5f, 10.5f)
                moveTo(7.5f, 15f)
                curveTo(6.7f, 15f, 6f, 15.7f, 6f, 16.5f)
                curveTo(6f, 17.3f, 6.7f, 18f, 7.5f, 18f)
                reflectiveCurveTo(9f, 17.3f, 9f, 16.5f)
                curveTo(9f, 15.7f, 8.3f, 15f, 7.5f, 15f)
                close()
            }
        }.build()

        return _Dice6Outline!!
    }

@Suppress("ObjectPropertyName")
private var _Dice6Outline: ImageVector? = null

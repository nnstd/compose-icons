package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dice2Outline: ImageVector
    get() {
        if (_Dice2Outline != null) {
            return _Dice2Outline!!
        }
        _Dice2Outline = ImageVector.Builder(
            name = "Dice2Outline",
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
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(7.5f, 6f)
                curveTo(6.67f, 6f, 6f, 6.67f, 6f, 7.5f)
                reflectiveCurveTo(6.67f, 9f, 7.5f, 9f)
                reflectiveCurveTo(9f, 8.33f, 9f, 7.5f)
                reflectiveCurveTo(8.33f, 6f, 7.5f, 6f)
                moveTo(16.5f, 15f)
                curveTo(15.67f, 15f, 15f, 15.67f, 15f, 16.5f)
                curveTo(15f, 17.33f, 15.67f, 18f, 16.5f, 18f)
                curveTo(17.33f, 18f, 18f, 17.33f, 18f, 16.5f)
                curveTo(18f, 15.67f, 17.33f, 15f, 16.5f, 15f)
                close()
            }
        }.build()

        return _Dice2Outline!!
    }

@Suppress("ObjectPropertyName")
private var _Dice2Outline: ImageVector? = null

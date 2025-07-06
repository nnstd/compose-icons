package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dice1Outline: ImageVector
    get() {
        if (_Dice1Outline != null) {
            return _Dice1Outline!!
        }
        _Dice1Outline = ImageVector.Builder(
            name = "Dice1Outline",
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
                moveTo(12f, 10.5f)
                curveTo(11.17f, 10.5f, 10.5f, 11.17f, 10.5f, 12f)
                reflectiveCurveTo(11.17f, 13.5f, 12f, 13.5f)
                reflectiveCurveTo(13.5f, 12.83f, 13.5f, 12f)
                reflectiveCurveTo(12.83f, 10.5f, 12f, 10.5f)
            }
        }.build()

        return _Dice1Outline!!
    }

@Suppress("ObjectPropertyName")
private var _Dice1Outline: ImageVector? = null

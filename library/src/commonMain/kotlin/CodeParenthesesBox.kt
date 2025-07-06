package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeParenthesesBox: ImageVector
    get() {
        if (_CodeParenthesesBox != null) {
            return _CodeParenthesesBox!!
        }
        _CodeParenthesesBox = ImageVector.Builder(
            name = "CodeParenthesesBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(10f, 17.3f)
                lineTo(8.4f, 18f)
                curveTo(6.9f, 16.5f, 6f, 14.3f, 6f, 12f)
                reflectiveCurveTo(6.9f, 7.5f, 8.4f, 6f)
                lineTo(10f, 6.7f)
                curveTo(8.7f, 7.9f, 8f, 9.9f, 8f, 12f)
                reflectiveCurveTo(8.7f, 16.1f, 10f, 17.3f)
                moveTo(15.6f, 18f)
                lineTo(14f, 17.3f)
                curveTo(15.3f, 16f, 16f, 14.1f, 16f, 12f)
                reflectiveCurveTo(15.3f, 7.9f, 14f, 6.7f)
                lineTo(15.6f, 6f)
                curveTo(17.1f, 7.5f, 18f, 9.7f, 18f, 12f)
                curveTo(18f, 14.3f, 17.1f, 16.5f, 15.6f, 18f)
                close()
            }
        }.build()

        return _CodeParenthesesBox!!
    }

@Suppress("ObjectPropertyName")
private var _CodeParenthesesBox: ImageVector? = null

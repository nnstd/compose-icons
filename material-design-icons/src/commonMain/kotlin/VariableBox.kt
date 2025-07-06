package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VariableBox: ImageVector
    get() {
        if (_VariableBox != null) {
            return _VariableBox!!
        }
        _VariableBox = ImageVector.Builder(
            name = "VariableBox",
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
                moveTo(7.4f, 18f)
                curveTo(5.9f, 16.5f, 5f, 14.3f, 5f, 12f)
                reflectiveCurveTo(5.9f, 7.5f, 7.4f, 6f)
                lineTo(9f, 6.7f)
                curveTo(7.7f, 7.9f, 7f, 9.9f, 7f, 12f)
                reflectiveCurveTo(7.7f, 16.1f, 9f, 17.3f)
                lineTo(7.4f, 18f)
                moveTo(12.7f, 15f)
                lineTo(11.9f, 13f)
                lineTo(10.5f, 15f)
                horizontalLineTo(9f)
                lineTo(11.3f, 11.9f)
                lineTo(10f, 9f)
                horizontalLineTo(11.3f)
                lineTo(12.1f, 11f)
                lineTo(13.5f, 9f)
                horizontalLineTo(15f)
                lineTo(12.8f, 12f)
                lineTo(14.1f, 15f)
                horizontalLineTo(12.7f)
                moveTo(16.6f, 18f)
                lineTo(15f, 17.3f)
                curveTo(16.3f, 16f, 17f, 14.1f, 17f, 12f)
                reflectiveCurveTo(16.3f, 7.9f, 15f, 6.7f)
                lineTo(16.6f, 6f)
                curveTo(18.1f, 7.5f, 19f, 9.7f, 19f, 12f)
                reflectiveCurveTo(18.1f, 16.5f, 16.6f, 18f)
                close()
            }
        }.build()

        return _VariableBox!!
    }

@Suppress("ObjectPropertyName")
private var _VariableBox: ImageVector? = null

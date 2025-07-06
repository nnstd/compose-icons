package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeBlockParentheses: ImageVector
    get() {
        if (_CodeBlockParentheses != null) {
            return _CodeBlockParentheses!!
        }
        _CodeBlockParentheses = ImageVector.Builder(
            name = "CodeBlockParentheses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.6f, 3f)
                curveTo(13.1f, 4.3f, 14f, 6.1f, 14f, 8f)
                reflectiveCurveTo(13.1f, 11.7f, 11.6f, 13f)
                lineTo(10f, 12.4f)
                curveTo(11.3f, 11.4f, 12f, 9.7f, 12f, 8f)
                reflectiveCurveTo(11.3f, 4.6f, 10f, 3.6f)
                lineTo(11.6f, 3f)
                moveTo(4.4f, 3f)
                lineTo(6f, 3.6f)
                curveTo(4.7f, 4.6f, 4f, 6.3f, 4f, 8f)
                reflectiveCurveTo(4.7f, 11.4f, 6f, 12.4f)
                lineTo(4.4f, 13f)
                curveTo(2.9f, 11.7f, 2f, 9.9f, 2f, 8f)
                reflectiveCurveTo(2.9f, 4.3f, 4.4f, 3f)
                moveTo(22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(16.03f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                close()
            }
        }.build()

        return _CodeBlockParentheses!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBlockParentheses: ImageVector? = null

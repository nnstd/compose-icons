package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeBlockBraces: ImageVector
    get() {
        if (_CodeBlockBraces != null) {
            return _CodeBlockBraces!!
        }
        _CodeBlockBraces = ImageVector.Builder(
            name = "CodeBlockBraces",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                reflectiveCurveTo(2.1f, 7f, 1f, 7f)
                verticalLineTo(9f)
                curveTo(2.1f, 9f, 3f, 9.9f, 3f, 11f)
                reflectiveCurveTo(3.9f, 13f, 5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                curveTo(5f, 8.9f, 4.1f, 8f, 3f, 8f)
                curveTo(4.1f, 8f, 5f, 7.1f, 5f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                moveTo(11f, 3f)
                curveTo(12.1f, 3f, 13f, 3.9f, 13f, 5f)
                reflectiveCurveTo(13.9f, 7f, 15f, 7f)
                verticalLineTo(9f)
                curveTo(13.9f, 9f, 13f, 9.9f, 13f, 11f)
                reflectiveCurveTo(12.1f, 13f, 11f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                curveTo(11f, 8.9f, 11.9f, 8f, 13f, 8f)
                curveTo(11.9f, 8f, 11f, 7.1f, 11f, 6f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(11f)
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
                horizontalLineTo(17.03f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                close()
            }
        }.build()

        return _CodeBlockBraces!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBlockBraces: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeBlockBrackets: ImageVector
    get() {
        if (_CodeBlockBrackets != null) {
            return _CodeBlockBrackets!!
        }
        _CodeBlockBrackets = ImageVector.Builder(
            name = "CodeBlockBrackets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 3f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                moveTo(12f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
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

        return _CodeBlockBrackets!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBlockBrackets: ImageVector? = null

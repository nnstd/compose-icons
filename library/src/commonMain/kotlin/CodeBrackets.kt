package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeBrackets: ImageVector
    get() {
        if (_CodeBrackets != null) {
            return _CodeBrackets!!
        }
        _CodeBrackets = ImageVector.Builder(
            name = "CodeBrackets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(4f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _CodeBrackets!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBrackets: ImageVector? = null

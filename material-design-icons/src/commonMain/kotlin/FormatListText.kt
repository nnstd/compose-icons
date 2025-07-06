package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListText: ImageVector
    get() {
        if (_FormatListText != null) {
            return _FormatListText!!
        }
        _FormatListText = ImageVector.Builder(
            name = "FormatListText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                moveTo(16f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                moveTo(2f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                moveTo(10f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                moveTo(10f, 20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(10f, 16f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
            }
        }.build()

        return _FormatListText!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListText: ImageVector? = null

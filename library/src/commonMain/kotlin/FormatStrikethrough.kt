package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatStrikethrough: ImageVector
    get() {
        if (_FormatStrikethrough != null) {
            return _FormatStrikethrough!!
        }
        _FormatStrikethrough = ImageVector.Builder(
            name = "FormatStrikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                moveTo(5f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                moveTo(10f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatStrikethrough!!
    }

@Suppress("ObjectPropertyName")
private var _FormatStrikethrough: ImageVector? = null

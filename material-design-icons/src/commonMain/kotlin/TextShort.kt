package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextShort: ImageVector
    get() {
        if (_TextShort != null) {
            return _TextShort!!
        }
        _TextShort = ImageVector.Builder(
            name = "TextShort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(4f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _TextShort!!
    }

@Suppress("ObjectPropertyName")
private var _TextShort: ImageVector? = null

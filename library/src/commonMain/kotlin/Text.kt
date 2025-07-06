package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Text: ImageVector
    get() {
        if (_Text != null) {
            return _Text!!
        }
        _Text = ImageVector.Builder(
            name = "Text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                moveTo(3f, 18f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                moveTo(3f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Text!!
    }

@Suppress("ObjectPropertyName")
private var _Text: ImageVector? = null

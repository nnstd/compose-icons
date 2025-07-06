package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlayOutline: ImageVector
    get() {
        if (_PlayOutline != null) {
            return _PlayOutline!!
        }
        _PlayOutline = ImageVector.Builder(
            name = "PlayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 8.64f)
                lineTo(13.77f, 12f)
                lineTo(8.5f, 15.36f)
                verticalLineTo(8.64f)
                moveTo(6.5f, 5f)
                verticalLineTo(19f)
                lineTo(17.5f, 12f)
            }
        }.build()

        return _PlayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PlayOutline: ImageVector? = null

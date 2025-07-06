package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeTags: ImageVector
    get() {
        if (_CodeTags != null) {
            return _CodeTags!!
        }
        _CodeTags = ImageVector.Builder(
            name = "CodeTags",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.6f, 16.6f)
                lineTo(19.2f, 12f)
                lineTo(14.6f, 7.4f)
                lineTo(16f, 6f)
                lineTo(22f, 12f)
                lineTo(16f, 18f)
                lineTo(14.6f, 16.6f)
                moveTo(9.4f, 16.6f)
                lineTo(4.8f, 12f)
                lineTo(9.4f, 7.4f)
                lineTo(8f, 6f)
                lineTo(2f, 12f)
                lineTo(8f, 18f)
                lineTo(9.4f, 16.6f)
                close()
            }
        }.build()

        return _CodeTags!!
    }

@Suppress("ObjectPropertyName")
private var _CodeTags: ImageVector? = null

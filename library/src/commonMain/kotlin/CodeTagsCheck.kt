package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeTagsCheck: ImageVector
    get() {
        if (_CodeTagsCheck != null) {
            return _CodeTagsCheck!!
        }
        _CodeTagsCheck = ImageVector.Builder(
            name = "CodeTagsCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.59f, 3.41f)
                lineTo(2f, 8f)
                lineTo(6.59f, 12.6f)
                lineTo(8f, 11.18f)
                lineTo(4.82f, 8f)
                lineTo(8f, 4.82f)
                lineTo(6.59f, 3.41f)
                moveTo(12.41f, 3.41f)
                lineTo(11f, 4.82f)
                lineTo(14.18f, 8f)
                lineTo(11f, 11.18f)
                lineTo(12.41f, 12.6f)
                lineTo(17f, 8f)
                lineTo(12.41f, 3.41f)
                moveTo(21.59f, 11.59f)
                lineTo(13.5f, 19.68f)
                lineTo(9.83f, 16f)
                lineTo(8.42f, 17.41f)
                lineTo(13.5f, 22.5f)
                lineTo(23f, 13f)
                lineTo(21.59f, 11.59f)
                close()
            }
        }.build()

        return _CodeTagsCheck!!
    }

@Suppress("ObjectPropertyName")
private var _CodeTagsCheck: ImageVector? = null

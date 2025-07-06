package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UnfoldMoreVertical: ImageVector
    get() {
        if (_UnfoldMoreVertical != null) {
            return _UnfoldMoreVertical!!
        }
        _UnfoldMoreVertical = ImageVector.Builder(
            name = "UnfoldMoreVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.17f, 12f)
                lineTo(15f, 8.83f)
                lineTo(16.41f, 7.41f)
                lineTo(21f, 12f)
                lineTo(16.41f, 16.58f)
                lineTo(15f, 15.17f)
                lineTo(18.17f, 12f)
                moveTo(5.83f, 12f)
                lineTo(9f, 15.17f)
                lineTo(7.59f, 16.59f)
                lineTo(3f, 12f)
                lineTo(7.59f, 7.42f)
                lineTo(9f, 8.83f)
                lineTo(5.83f, 12f)
                close()
            }
        }.build()

        return _UnfoldMoreVertical!!
    }

@Suppress("ObjectPropertyName")
private var _UnfoldMoreVertical: ImageVector? = null

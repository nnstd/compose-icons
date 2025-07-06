package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UnfoldLessVertical: ImageVector
    get() {
        if (_UnfoldLessVertical != null) {
            return _UnfoldLessVertical!!
        }
        _UnfoldLessVertical = ImageVector.Builder(
            name = "UnfoldLessVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.41f, 7.41f)
                lineTo(10f, 12f)
                lineTo(5.41f, 16.59f)
                lineTo(4f, 15.17f)
                lineTo(7.17f, 12f)
                lineTo(4f, 8.83f)
                lineTo(5.41f, 7.41f)
                moveTo(18.59f, 16.59f)
                lineTo(14f, 12f)
                lineTo(18.59f, 7.42f)
                lineTo(20f, 8.83f)
                lineTo(16.83f, 12f)
                lineTo(20f, 15.17f)
                lineTo(18.59f, 16.59f)
                close()
            }
        }.build()

        return _UnfoldLessVertical!!
    }

@Suppress("ObjectPropertyName")
private var _UnfoldLessVertical: ImageVector? = null

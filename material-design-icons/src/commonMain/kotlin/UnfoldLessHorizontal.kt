package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UnfoldLessHorizontal: ImageVector
    get() {
        if (_UnfoldLessHorizontal != null) {
            return _UnfoldLessHorizontal!!
        }
        _UnfoldLessHorizontal = ImageVector.Builder(
            name = "UnfoldLessHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.59f, 5.41f)
                lineTo(15.17f, 4f)
                lineTo(12f, 7.17f)
                lineTo(8.83f, 4f)
                lineTo(7.41f, 5.41f)
                lineTo(12f, 10f)
                moveTo(7.41f, 18.59f)
                lineTo(8.83f, 20f)
                lineTo(12f, 16.83f)
                lineTo(15.17f, 20f)
                lineTo(16.58f, 18.59f)
                lineTo(12f, 14f)
                lineTo(7.41f, 18.59f)
                close()
            }
        }.build()

        return _UnfoldLessHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _UnfoldLessHorizontal: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UnfoldMoreHorizontal: ImageVector
    get() {
        if (_UnfoldMoreHorizontal != null) {
            return _UnfoldMoreHorizontal!!
        }
        _UnfoldMoreHorizontal = ImageVector.Builder(
            name = "UnfoldMoreHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.17f)
                lineTo(8.83f, 15f)
                lineTo(7.42f, 16.41f)
                lineTo(12f, 21f)
                lineTo(16.59f, 16.41f)
                lineTo(15.17f, 15f)
                moveTo(12f, 5.83f)
                lineTo(15.17f, 9f)
                lineTo(16.58f, 7.59f)
                lineTo(12f, 3f)
                lineTo(7.41f, 7.59f)
                lineTo(8.83f, 9f)
                lineTo(12f, 5.83f)
                close()
            }
        }.build()

        return _UnfoldMoreHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _UnfoldMoreHorizontal: ImageVector? = null

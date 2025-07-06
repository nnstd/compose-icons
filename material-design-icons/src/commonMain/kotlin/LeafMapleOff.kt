package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeafMapleOff: ImageVector
    get() {
        if (_LeafMapleOff != null) {
            return _LeafMapleOff!!
        }
        _LeafMapleOff = ImageVector.Builder(
            name = "LeafMapleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.11f, 14.91f)
                lineTo(8.2f, 5f)
                horizontalLineTo(10f)
                lineTo(12f, 2f)
                lineTo(14f, 5f)
                horizontalLineTo(16f)
                lineTo(14.37f, 9.9f)
                lineTo(17.79f, 6f)
                lineTo(18.79f, 7.73f)
                lineTo(22.39f, 7.96f)
                lineTo(20.79f, 11.19f)
                lineTo(21.79f, 13f)
                lineTo(18.11f, 14.91f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.45f, 7.34f)
                lineTo(5.21f, 7.77f)
                lineTo(1.61f, 8f)
                lineTo(3.21f, 11.27f)
                lineTo(2.21f, 13f)
                lineTo(8f, 16f)
                lineTo(7f, 18f)
                lineTo(11f, 17.25f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(17.25f)
                lineTo(15.91f, 17.8f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }.build()

        return _LeafMapleOff!!
    }

@Suppress("ObjectPropertyName")
private var _LeafMapleOff: ImageVector? = null

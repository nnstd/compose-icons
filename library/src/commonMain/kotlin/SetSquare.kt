package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SetSquare: ImageVector
    get() {
        if (_SetSquare != null) {
            return _SetSquare!!
        }
        _SetSquare = ImageVector.Builder(
            name = "SetSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.7f, 17.7f)
                lineTo(16.6f, 18.8f)
                lineTo(15.9f, 18f)
                lineTo(17f, 17f)
                lineTo(15f, 15f)
                lineTo(14f, 16.1f)
                lineTo(13.3f, 15.4f)
                lineTo(14.4f, 14.3f)
                lineTo(12.5f, 12.4f)
                lineTo(11.4f, 13.5f)
                lineTo(10.7f, 12.8f)
                lineTo(11.8f, 11.7f)
                lineTo(9.8f, 9.8f)
                lineTo(8.7f, 10.9f)
                lineTo(8f, 10.2f)
                lineTo(9f, 9f)
                lineTo(7.1f, 7.1f)
                lineTo(6f, 8.1f)
                lineTo(5.3f, 7.4f)
                lineTo(6.4f, 6.3f)
                lineTo(4f, 4f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                lineTo(17.7f, 17.7f)
                moveTo(7f, 17f)
                verticalLineTo(11.2f)
                lineTo(12.8f, 17f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _SetSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SetSquare: ImageVector? = null

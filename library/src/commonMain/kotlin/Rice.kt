package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rice: ImageVector
    get() {
        if (_Rice != null) {
            return _Rice!!
        }
        _Rice = ImageVector.Builder(
            name = "Rice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineTo(19.7f)
                curveTo(19.4f, 9.9f, 18.9f, 8.8f, 18.2f, 8f)
                lineTo(21.6f, 2.6f)
                lineTo(19.9f, 1.5f)
                lineTo(16.7f, 6.6f)
                curveTo(16.3f, 6.3f, 16f, 6.1f, 15.5f, 5.9f)
                lineTo(16.4f, 2.3f)
                lineTo(14.5f, 1.8f)
                lineTo(13.7f, 5.2f)
                curveTo(13.1f, 5.1f, 12.6f, 5f, 12f, 5f)
                curveTo(8.3f, 5f, 5.2f, 7.6f, 4.3f, 11f)
                horizontalLineTo(2f)
                curveTo(2f, 15.1f, 4.5f, 18.6f, 8f, 20.2f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20.2f)
                curveTo(19.5f, 18.6f, 22f, 15.1f, 22f, 11f)
                moveTo(12f, 7f)
                curveTo(14.6f, 7f, 16.8f, 8.7f, 17.6f, 11f)
                horizontalLineTo(6.4f)
                curveTo(7.2f, 8.7f, 9.4f, 7f, 12f, 7f)
                close()
            }
        }.build()

        return _Rice!!
    }

@Suppress("ObjectPropertyName")
private var _Rice: ImageVector? = null

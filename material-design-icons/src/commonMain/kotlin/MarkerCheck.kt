package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MarkerCheck: ImageVector
    get() {
        if (_MarkerCheck != null) {
            return _MarkerCheck!!
        }
        _MarkerCheck = ImageVector.Builder(
            name = "MarkerCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 16f)
                lineTo(5f, 11f)
                lineTo(6.41f, 9.58f)
                lineTo(10f, 13.17f)
                lineTo(17.59f, 5.58f)
                lineTo(19f, 7f)
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                curveTo(3.89f, 1f, 3f, 1.89f, 3f, 3f)
                verticalLineTo(15.93f)
                curveTo(3f, 16.62f, 3.35f, 17.23f, 3.88f, 17.59f)
                lineTo(12f, 23f)
                lineTo(20.11f, 17.59f)
                curveTo(20.64f, 17.23f, 21f, 16.62f, 21f, 15.93f)
                verticalLineTo(3f)
                curveTo(21f, 1.89f, 20.1f, 1f, 19f, 1f)
                close()
            }
        }.build()

        return _MarkerCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MarkerCheck: ImageVector? = null

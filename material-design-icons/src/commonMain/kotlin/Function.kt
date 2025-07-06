package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Function: ImageVector
    get() {
        if (_Function != null) {
            return _Function!!
        }
        _Function = ImageVector.Builder(
            name = "Function",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.6f, 5.29f)
                curveTo(14.5f, 5.19f, 13.53f, 6f, 13.43f, 7.11f)
                lineTo(13.18f, 10f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                lineTo(12.56f, 17.07f)
                curveTo(12.37f, 19.27f, 10.43f, 20.9f, 8.23f, 20.7f)
                curveTo(6.92f, 20.59f, 5.82f, 19.86f, 5.17f, 18.83f)
                lineTo(6.67f, 17.33f)
                curveTo(6.91f, 18.07f, 7.57f, 18.64f, 8.4f, 18.71f)
                curveTo(9.5f, 18.81f, 10.47f, 18f, 10.57f, 16.89f)
                lineTo(11f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(11.17f)
                lineTo(11.44f, 6.93f)
                curveTo(11.63f, 4.73f, 13.57f, 3.1f, 15.77f, 3.3f)
                curveTo(17.08f, 3.41f, 18.18f, 4.14f, 18.83f, 5.17f)
                lineTo(17.33f, 6.67f)
                curveTo(17.09f, 5.93f, 16.43f, 5.36f, 15.6f, 5.29f)
                close()
            }
        }.build()

        return _Function!!
    }

@Suppress("ObjectPropertyName")
private var _Function: ImageVector? = null

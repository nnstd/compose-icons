package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DecagramOutline: ImageVector
    get() {
        if (_DecagramOutline != null) {
            return _DecagramOutline!!
        }
        _DecagramOutline = ImageVector.Builder(
            name = "DecagramOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(20.56f, 14.78f)
                lineTo(20.9f, 18.46f)
                lineTo(17.29f, 19.28f)
                lineTo(15.4f, 22.46f)
                lineTo(12f, 21f)
                lineTo(8.6f, 22.47f)
                lineTo(6.71f, 19.29f)
                lineTo(3.1f, 18.47f)
                lineTo(3.44f, 14.78f)
                lineTo(1f, 12f)
                lineTo(3.44f, 9.21f)
                lineTo(3.1f, 5.53f)
                lineTo(6.71f, 4.72f)
                lineTo(8.6f, 1.54f)
                lineTo(12f, 3f)
                lineTo(15.4f, 1.54f)
                lineTo(17.29f, 4.72f)
                lineTo(20.9f, 5.54f)
                lineTo(20.56f, 9.22f)
                lineTo(23f, 12f)
                moveTo(20.33f, 12f)
                lineTo(18.5f, 9.89f)
                lineTo(18.74f, 7.1f)
                lineTo(16f, 6.5f)
                lineTo(14.58f, 4.07f)
                lineTo(12f, 5.18f)
                lineTo(9.42f, 4.07f)
                lineTo(8f, 6.5f)
                lineTo(5.26f, 7.09f)
                lineTo(5.5f, 9.88f)
                lineTo(3.67f, 12f)
                lineTo(5.5f, 14.1f)
                lineTo(5.26f, 16.9f)
                lineTo(8f, 17.5f)
                lineTo(9.42f, 19.93f)
                lineTo(12f, 18.81f)
                lineTo(14.58f, 19.92f)
                lineTo(16f, 17.5f)
                lineTo(18.74f, 16.89f)
                lineTo(18.5f, 14.1f)
                lineTo(20.33f, 12f)
                close()
            }
        }.build()

        return _DecagramOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DecagramOutline: ImageVector? = null

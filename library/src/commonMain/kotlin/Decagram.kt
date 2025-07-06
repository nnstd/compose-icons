package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Decagram: ImageVector
    get() {
        if (_Decagram != null) {
            return _Decagram!!
        }
        _Decagram = ImageVector.Builder(
            name = "Decagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(20.56f, 9.22f)
                lineTo(20.9f, 5.54f)
                lineTo(17.29f, 4.72f)
                lineTo(15.4f, 1.54f)
                lineTo(12f, 3f)
                lineTo(8.6f, 1.54f)
                lineTo(6.71f, 4.72f)
                lineTo(3.1f, 5.53f)
                lineTo(3.44f, 9.21f)
                lineTo(1f, 12f)
                lineTo(3.44f, 14.78f)
                lineTo(3.1f, 18.47f)
                lineTo(6.71f, 19.29f)
                lineTo(8.6f, 22.47f)
                lineTo(12f, 21f)
                lineTo(15.4f, 22.46f)
                lineTo(17.29f, 19.28f)
                lineTo(20.9f, 18.46f)
                lineTo(20.56f, 14.78f)
                lineTo(23f, 12f)
                close()
            }
        }.build()

        return _Decagram!!
    }

@Suppress("ObjectPropertyName")
private var _Decagram: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Variable: ImageVector
    get() {
        if (_Variable != null) {
            return _Variable!!
        }
        _Variable = ImageVector.Builder(
            name = "Variable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.41f, 3f)
                curveTo(21.8f, 5.71f, 22.35f, 8.84f, 22f, 12f)
                curveTo(21.8f, 15.16f, 20.7f, 18.29f, 18.83f, 21f)
                lineTo(17.3f, 20f)
                curveTo(18.91f, 17.57f, 19.85f, 14.8f, 20f, 12f)
                curveTo(20.34f, 9.2f, 19.89f, 6.43f, 18.7f, 4f)
                lineTo(20.41f, 3f)
                moveTo(5.17f, 3f)
                lineTo(6.7f, 4f)
                curveTo(5.09f, 6.43f, 4.15f, 9.2f, 4f, 12f)
                curveTo(3.66f, 14.8f, 4.12f, 17.57f, 5.3f, 20f)
                lineTo(3.61f, 21f)
                curveTo(2.21f, 18.29f, 1.65f, 15.17f, 2f, 12f)
                curveTo(2.2f, 8.84f, 3.3f, 5.71f, 5.17f, 3f)
                moveTo(12.08f, 10.68f)
                lineTo(14.4f, 7.45f)
                horizontalLineTo(16.93f)
                lineTo(13.15f, 12.45f)
                lineTo(15.35f, 17.37f)
                horizontalLineTo(13.09f)
                lineTo(11.71f, 14f)
                lineTo(9.28f, 17.33f)
                horizontalLineTo(6.76f)
                lineTo(10.66f, 12.21f)
                lineTo(8.53f, 7.45f)
                horizontalLineTo(10.8f)
                lineTo(12.08f, 10.68f)
                close()
            }
        }.build()

        return _Variable!!
    }

@Suppress("ObjectPropertyName")
private var _Variable: ImageVector? = null

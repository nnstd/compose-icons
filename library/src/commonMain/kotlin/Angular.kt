package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Angular: ImageVector
    get() {
        if (_Angular != null) {
            return _Angular!!
        }
        _Angular = ImageVector.Builder(
            name = "Angular",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                lineTo(20.84f, 5.65f)
                lineTo(19.5f, 17.35f)
                lineTo(12f, 21.5f)
                lineTo(4.5f, 17.35f)
                lineTo(3.16f, 5.65f)
                lineTo(12f, 2.5f)
                moveTo(12f, 4.6f)
                lineTo(6.47f, 17f)
                horizontalLineTo(8.53f)
                lineTo(9.64f, 14.22f)
                horizontalLineTo(14.34f)
                lineTo(15.45f, 17f)
                horizontalLineTo(17.5f)
                lineTo(12f, 4.6f)
                moveTo(13.62f, 12.5f)
                horizontalLineTo(10.39f)
                lineTo(12f, 8.63f)
                lineTo(13.62f, 12.5f)
                close()
            }
        }.build()

        return _Angular!!
    }

@Suppress("ObjectPropertyName")
private var _Angular: ImageVector? = null

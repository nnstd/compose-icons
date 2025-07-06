package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Signature: ImageVector
    get() {
        if (_Signature != null) {
            return _Signature!!
        }
        _Signature = ImageVector.Builder(
            name = "Signature",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(2.26f, 16.83f)
                lineTo(5.09f, 14f)
                lineTo(2.26f, 11.17f)
                lineTo(3.67f, 9.76f)
                lineTo(6.5f, 12.59f)
                lineTo(9.33f, 9.76f)
                lineTo(10.74f, 11.17f)
                lineTo(7.91f, 14f)
                lineTo(10.74f, 16.83f)
                lineTo(9.33f, 18.24f)
                lineTo(6.5f, 15.41f)
                lineTo(3.67f, 18.24f)
                lineTo(2.26f, 16.83f)
                close()
            }
        }.build()

        return _Signature!!
    }

@Suppress("ObjectPropertyName")
private var _Signature: ImageVector? = null

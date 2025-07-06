package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bucket: ImageVector
    get() {
        if (_Bucket != null) {
            return _Bucket!!
        }
        _Bucket = ImageVector.Builder(
            name = "Bucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                lineTo(17.5f, 21f)
                horizontalLineTo(6.5f)
                lineTo(4f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Bucket!!
    }

@Suppress("ObjectPropertyName")
private var _Bucket: ImageVector? = null

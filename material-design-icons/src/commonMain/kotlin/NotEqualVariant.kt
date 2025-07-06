package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotEqualVariant: ImageVector
    get() {
        if (_NotEqualVariant != null) {
            return _NotEqualVariant!!
        }
        _NotEqualVariant = ImageVector.Builder(
            name = "NotEqualVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.08f, 4.61f)
                lineTo(15.92f, 5.4f)
                lineTo(14.8f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(13.95f)
                lineTo(12.23f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(11.38f)
                lineTo(9.92f, 19.4f)
                lineTo(8.08f, 18.61f)
                lineTo(9.2f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(10.06f)
                lineTo(11.77f, 10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(12.63f)
                lineTo(14.08f, 4.61f)
                close()
            }
        }.build()

        return _NotEqualVariant!!
    }

@Suppress("ObjectPropertyName")
private var _NotEqualVariant: ImageVector? = null

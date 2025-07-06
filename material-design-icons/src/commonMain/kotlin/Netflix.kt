package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Netflix: ImageVector
    get() {
        if (_Netflix != null) {
            return _Netflix!!
        }
        _Netflix = ImageVector.Builder(
            name = "Netflix",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 2f)
                horizontalLineTo(10.5f)
                lineTo(13.44f, 10.83f)
                lineTo(13.5f, 2f)
                horizontalLineTo(17.5f)
                verticalLineTo(22f)
                curveTo(16.25f, 21.78f, 14.87f, 21.64f, 13.41f, 21.58f)
                lineTo(10.5f, 13f)
                lineTo(10.43f, 21.59f)
                curveTo(9.03f, 21.65f, 7.7f, 21.79f, 6.5f, 22f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Netflix!!
    }

@Suppress("ObjectPropertyName")
private var _Netflix: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightBoldOutline: ImageVector
    get() {
        if (_ArrowTopRightBoldOutline != null) {
            return _ArrowTopRightBoldOutline!!
        }
        _ArrowTopRightBoldOutline = ImageVector.Builder(
            name = "ArrowTopRightBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.64f, 4.22f)
                horizontalLineTo(19.78f)
                verticalLineTo(18.36f)
                lineTo(15.54f, 14.12f)
                lineTo(9.88f, 19.78f)
                lineTo(4.22f, 14.12f)
                lineTo(9.88f, 8.46f)
                lineTo(5.64f, 4.22f)
                moveTo(17.66f, 6.34f)
                horizontalLineTo(10.59f)
                lineTo(12.71f, 8.46f)
                lineTo(7.05f, 14.12f)
                lineTo(9.88f, 16.95f)
                lineTo(15.54f, 11.29f)
                lineTo(17.66f, 13.41f)
                verticalLineTo(6.34f)
                horizontalLineTo(17.66f)
                close()
            }
        }.build()

        return _ArrowTopRightBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightBoldOutline: ImageVector? = null

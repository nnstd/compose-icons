package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBoldOutline: ImageVector
    get() {
        if (_ArrowRightBoldOutline != null) {
            return _ArrowRightBoldOutline!!
        }
        _ArrowRightBoldOutline = ImageVector.Builder(
            name = "ArrowRightBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                lineTo(21f, 12f)
                lineTo(11f, 22f)
                verticalLineTo(16f)
                moveTo(13f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                lineTo(18f, 12f)
                lineTo(13f, 7f)
                close()
            }
        }.build()

        return _ArrowRightBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBoldOutline: ImageVector? = null

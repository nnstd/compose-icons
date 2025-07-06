package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageArrowRightOutline: ImageVector
    get() {
        if (_MessageArrowRightOutline != null) {
            return _MessageArrowRightOutline!!
        }
        _MessageArrowRightOutline = ImageVector.Builder(
            name = "MessageArrowRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(5.2f)
                lineTo(4f, 17.2f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(12.5f)
                lineTo(10.7f, 12.8f)
                lineTo(12f, 14f)
                lineTo(16f, 10f)
                lineTo(12f, 6f)
                lineTo(10.8f, 7.2f)
                lineTo(12.5f, 9f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _MessageArrowRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageArrowRightOutline: ImageVector? = null

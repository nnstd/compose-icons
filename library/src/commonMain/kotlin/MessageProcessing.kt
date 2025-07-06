package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageProcessing: ImageVector
    get() {
        if (_MessageProcessing != null) {
            return _MessageProcessing!!
        }
        _MessageProcessing = ImageVector.Builder(
            name = "MessageProcessing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(13f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.1f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _MessageProcessing!!
    }

@Suppress("ObjectPropertyName")
private var _MessageProcessing: ImageVector? = null

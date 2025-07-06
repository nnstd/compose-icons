package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageVideo: ImageVector
    get() {
        if (_MessageVideo != null) {
            return _MessageVideo!!
        }
        _MessageVideo = ImageVector.Builder(
            name = "MessageVideo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                lineTo(14f, 10.8f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(9.2f)
                lineTo(18f, 6f)
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

        return _MessageVideo!!
    }

@Suppress("ObjectPropertyName")
private var _MessageVideo: ImageVector? = null

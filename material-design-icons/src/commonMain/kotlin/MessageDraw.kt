package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageDraw: ImageVector
    get() {
        if (_MessageDraw != null) {
            return _MessageDraw!!
        }
        _MessageDraw = ImageVector.Builder(
            name = "MessageDraw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                horizontalLineTo(10.5f)
                lineTo(12.5f, 12f)
                horizontalLineTo(18f)
                moveTo(6f, 14f)
                verticalLineTo(11.5f)
                lineTo(12.88f, 4.64f)
                curveTo(13.07f, 4.45f, 13.39f, 4.45f, 13.59f, 4.64f)
                lineTo(15.35f, 6.41f)
                curveTo(15.55f, 6.61f, 15.55f, 6.92f, 15.35f, 7.12f)
                lineTo(8.47f, 14f)
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

        return _MessageDraw!!
    }

@Suppress("ObjectPropertyName")
private var _MessageDraw: ImageVector? = null

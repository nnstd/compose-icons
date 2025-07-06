package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageTextOutline: ImageVector
    get() {
        if (_MessageTextOutline != null) {
            return _MessageTextOutline!!
        }
        _MessageTextOutline = ImageVector.Builder(
            name = "MessageTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                moveTo(4f, 4f)
                verticalLineTo(17.17f)
                lineTo(5.17f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(6f, 7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(6f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _MessageTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTextOutline: ImageVector? = null

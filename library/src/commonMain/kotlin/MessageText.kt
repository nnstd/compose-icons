package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageText: ImageVector
    get() {
        if (_MessageText != null) {
            return _MessageText!!
        }
        _MessageText = ImageVector.Builder(
            name = "MessageText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                moveTo(6f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                moveTo(14f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
            }
        }.build()

        return _MessageText!!
    }

@Suppress("ObjectPropertyName")
private var _MessageText: ImageVector? = null

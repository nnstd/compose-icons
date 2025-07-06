package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageBulleted: ImageVector
    get() {
        if (_MessageBulleted != null) {
            return _MessageBulleted!!
        }
        _MessageBulleted = ImageVector.Builder(
            name = "MessageBulleted",
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
                moveTo(8f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                moveTo(8f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                moveTo(8f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                moveTo(15f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                moveTo(18f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(18f, 8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _MessageBulleted!!
    }

@Suppress("ObjectPropertyName")
private var _MessageBulleted: ImageVector? = null

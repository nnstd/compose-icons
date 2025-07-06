package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageTextLock: ImageVector
    get() {
        if (_MessageTextLock != null) {
            return _MessageTextLock!!
        }
        _MessageTextLock = ImageVector.Builder(
            name = "MessageTextLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2.5f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 8f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 3f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
                moveTo(20.5f, 1f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 1f)
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                curveTo(15.89f, 11f, 15f, 10.11f, 15f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(6f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(6f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                moveTo(6f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _MessageTextLock!!
    }

@Suppress("ObjectPropertyName")
private var _MessageTextLock: ImageVector? = null

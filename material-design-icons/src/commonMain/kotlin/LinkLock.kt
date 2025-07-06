package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LinkLock: ImageVector
    get() {
        if (_LinkLock != null) {
            return _LinkLock!!
        }
        _LinkLock = ImageVector.Builder(
            name = "LinkLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 15.5f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 17f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 22f)
                horizontalLineTo(23f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                moveTo(22f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 15.5f)
                moveTo(7f, 8.9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15.1f)
                horizontalLineTo(7f)
                arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8.9f)
                moveTo(8f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                moveTo(13f, 15.1f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15.1f)
                moveTo(17f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(8.9f)
                horizontalLineTo(17f)
                arcTo(3.09f, 3.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.94f, 11f)
                arcTo(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 11f)
                horizontalLineTo(21.9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 7f)
                close()
            }
        }.build()

        return _LinkLock!!
    }

@Suppress("ObjectPropertyName")
private var _LinkLock: ImageVector? = null

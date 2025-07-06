package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadLock: ImageVector
    get() {
        if (_DownloadLock != null) {
            return _DownloadLock!!
        }
        _DownloadLock = ImageVector.Builder(
            name = "DownloadLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                moveTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                lineTo(12f, 16f)
                moveTo(22f, 16f)
                arcTo(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 17f)
                verticalLineTo(21f)
                arcTo(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 22f)
                horizontalLineTo(17f)
                arcTo(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                verticalLineTo(17f)
                arcTo(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 16f)
                verticalLineTo(14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 14.5f)
                verticalLineTo(16f)
                moveTo(21f, 16f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
            }
        }.build()

        return _DownloadLock!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadLock: ImageVector? = null

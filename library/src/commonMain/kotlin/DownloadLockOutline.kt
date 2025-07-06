package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadLockOutline: ImageVector
    get() {
        if (_DownloadLockOutline != null) {
            return _DownloadLockOutline!!
        }
        _DownloadLockOutline = ImageVector.Builder(
            name = "DownloadLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(13f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(14.17f)
                lineTo(12f, 13.17f)
                lineTo(9.83f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(15f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                lineTo(12f, 16f)
                lineTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(14f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _DownloadLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadLockOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderDownloadOutline: ImageVector
    get() {
        if (_FolderDownloadOutline != null) {
            return _FolderDownloadOutline!!
        }
        _FolderDownloadOutline = ImageVector.Builder(
            name = "FolderDownloadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
                moveTo(14f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                lineTo(15f, 17f)
                lineTo(11f, 13f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _FolderDownloadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderDownloadOutline: ImageVector? = null
